package de.urszeidler.shr5.webserver;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.common.collect.Collections2;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.SemanticAction;
import de.urszeidler.eclipse.shr5.gameplay.SemanticType;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.webserver.mgnt.PlayerManager;
import de.urszeidler.shr5.webserver.mgnt.ScriptViewerWrapper;

/**
 * Simple control flow servlet, handles the redirects and is accessible under the "main" url.
 * 
 * @author urs
 */
public class ScriptServlet extends HttpServlet implements Servlet {
    private static final long serialVersionUID = -3295927936814514418L;

    /**
     * Handles the probe dialog result from the player.
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
        if (pm == null || pm.getCurrentDialog() == null) {
            resp.sendRedirect("main");
            return;
        }
        List<EStructuralFeature> features = pm.getCurrentDialog().getFeatures();
        Command cmd = pm.getCurrentDialog().getCmd();
        for (EStructuralFeature eStructuralFeature : features) {
            setValueToFeature(req, cmd, eStructuralFeature);
        }
        pm.setCurrentDialog(null);
        resp.sendRedirect("member.jsp");
    }

    /**
     * Get the value from the request parameter and set it to the object.
     * 
     * @param req
     * @param cmd
     * @param eStructuralFeature
     */
    private void setValueToFeature(HttpServletRequest req, EObject cmd, EStructuralFeature eStructuralFeature) {
        Object attribute = req.getParameter(eStructuralFeature.getName());
        if (attribute == null)
            return;
        if (eStructuralFeature.getEType() == EcorePackage.Literals.EBOOLEAN) {
            try {
                Boolean value = Boolean.parseBoolean((String)attribute);
                cmd.eSet(eStructuralFeature, value);
            } catch (Exception e) {

            }
        } else if (eStructuralFeature.getEType() == EcorePackage.Literals.EINT) {
            try {
                Integer value = Integer.parseInt((String)attribute);
                cmd.eSet(eStructuralFeature, value);
            } catch (Exception e) {

            }
        } else {
            try {
                cmd.eSet(eStructuralFeature, attribute);
            } catch (Exception e) {

            }

        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ScriptService scriptService = Activator.getDefault().getScriptService();
        ScriptViewerWrapper scriptViewerWrapper = Activator.getDefault().getScriptViewerWrapper();
        PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");

        String action = (String)req.getParameter("action");
        if (action != null) {
            if (action.equals("logout")) {
                session.invalidate();
                if (pm != null)
                    scriptViewerWrapper.getRegisteredPlayers().remove(pm);
                resp.sendRedirect("main.jsp");
            } else if (action.equals("changeCharacter")) {
                applyCharacterChange(req, pm);
                resp.sendRedirect("member.jsp");
            } else if (action.equals("history")) {
                // EList<String> writtenProtokol = scriptService.getCurrentScript().getHistory().getWrittenProtokol();
                resp.sendRedirect("include/history.jsp");
            } else if (action.equals("dialog")) {
                doDialog(pm, resp);
            }
            return;
        }

        Team player = scriptService.getCurrentScript().getPlayer();

        if (pm == null) {
            final String id = req.getParameter("id");
            if (id == null)
                resp.sendRedirect("main.jsp");

            RuntimeCharacter playerById = getRuntimeCharacterById(player, id);
            if (playerById != null) {
                if (Collections2.transform(scriptViewerWrapper.getRegisteredPlayers(),
                        scriptViewerWrapper.createPlayerManager2RuntimeCharacterTransformer()).contains(playerById))
                    resp.sendRedirect("main.jsp");

                pm = new PlayerManager();
                pm.setCharacter(playerById);
                session.setAttribute("playerManager", pm);
                scriptViewerWrapper.getRegisteredPlayers().add(pm);
            } else
                resp.sendRedirect("main.jsp");
        }
        if (pm.getCurrentDialog() != null) {
            resp.sendRedirect("dialog.jsp");
        } else
            resp.sendRedirect("member.jsp");

        return;
    }

    private void doDialog(PlayerManager pm, HttpServletResponse resp) throws IOException {
        if (pm.getCurrentDialog() == null) {
            sendUnchanged(resp);
            return;
        }
        if (pm.getCurrentDialog().getCmd().isExecuted()) {
            sendUnchanged(resp);
            return;
        }

        resp.sendRedirect("include/dialog.jsp");
    }

    /**
     * @param resp
     * @throws IOException
     */
    private void sendUnchanged(HttpServletResponse resp) throws IOException {
        resp.getWriter().write("");
        resp.flushBuffer();
    }

    /**
     * Changes the character with the given parameters.
     * 
     * @param req
     * @param pm
     */
    @SuppressWarnings("unchecked")
    private void applyCharacterChange(HttpServletRequest req, PlayerManager pm) {
        RuntimeCharacter character = pm.getCharacter();
        String aId = (String)req.getParameter("armor");
        EObject firstObjectById = ShadowrunTools.getFirstObjectById(character.getInUse(), aId);
        character.setArmor((Kleidung)firstObjectById);
        aId = (String)req.getParameter("lefthand");
        firstObjectById = ShadowrunTools.getFirstObjectById(character.getInUse(), aId);
        character.setLeftHand((AbstraktGegenstand)firstObjectById);;
        aId = (String)req.getParameter("righthand");
        firstObjectById = ShadowrunTools.getFirstObjectById(character.getInUse(), aId);
        character.setRightHand((AbstraktGegenstand)firstObjectById);;

        String[] parameterValues = req.getParameterValues("inventar");
        character.getInUse().clear();
        character.getInUse().addAll(
                (Collection<? extends AbstraktGegenstand>)Collections2.transform(Arrays.asList(parameterValues),
                        ShadowrunTools.xmlId2EObjectTransformer(character.getCharacter().getInventar())));

        ScriptService scriptService = Activator.getDefault().getScriptService();
        SemanticAction action = GameplayFactory.eINSTANCE.createSemanticAction();
        action.setSubject(character);
        action.setType(SemanticType.DESCRIPTION);
        action.setMessage(String.format("%s changed the inventory.", AdapterFactoryUtil.getInstance().getLabelProvider().getText(character)));
        pm.setCommandToIgnore(action);
        scriptService.executeCommand(action);
    }

    /**
     * @param player
     * @param id
     * @return
     */
    private RuntimeCharacter getRuntimeCharacterById(Team player, final String id) {
        EList<RuntimeCharacter> members = player.getMembers();
        Collection<RuntimeCharacter> filter = Collections2.filter(members, ShadowrunTools.xmlIdPredicate(id));

        Iterator<RuntimeCharacter> iterator = filter.iterator();
        if (!iterator.hasNext())
            return null;

        RuntimeCharacter character = iterator.next();
        return character;
    }

}
