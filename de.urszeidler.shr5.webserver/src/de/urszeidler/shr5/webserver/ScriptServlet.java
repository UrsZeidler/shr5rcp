package de.urszeidler.shr5.webserver;

import java.io.IOException;
import java.math.BigDecimal;
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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.common.collect.Collections2;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.InterfaceModus;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.MatrixProgram;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.RiggerProgram;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Software;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.SemanticAction;
import de.urszeidler.eclipse.shr5.gameplay.SemanticType;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.webserver.mgnt.PlayerManager;
import de.urszeidler.shr5.webserver.mgnt.ScriptViewerWrapper;
import de.urszeidler.shr5.webserver.mgnt.WebTools;

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

        if (pm.getCurrentDialog().getCmd() != null) {
            List<EStructuralFeature> features = pm.getCurrentDialog().getFeatures();
            Command cmd = pm.getCurrentDialog().getCmd();
            for (EStructuralFeature eStructuralFeature : features) {
                setValueToFeature(req, cmd, eStructuralFeature);
            }
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
        Activator activator = Activator.getDefault();
        ScriptService scriptService = activator.getScriptService();
        ScriptViewerWrapper scriptViewerWrapper = activator.getScriptViewerWrapper();
        PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");

        String action = (String)req.getParameter("action");
        if (action != null) {
            if (action.equals("logout")) {
                session.invalidate();
                if (pm != null) {
                    scriptViewerWrapper.removePlayer(pm);
                }
                resp.sendRedirect("main.jsp");
            } else if (action.equals("changeCharacter")) {
                applyCharacterChange(req, pm);
                resp.sendRedirect("member.jsp");
            } else if (action.equals("history")) {
                int size = scriptService.getCurrentScript().getHistory().getWrittenProtokol().size();
                if (pm == null || pm.getHistoryLinesReaded() < size) {
                    if (pm != null)
                        pm.setHistoryLinesReaded(size);
                    resp.sendRedirect("include/history.jsp");
                } else
                    sendUnchanged(resp);
            } else if (action.equals("conditionMonitor")) {
                RuntimeCharacter character = pm.getCharacter();
                int w = calcWound(character);
                if (w != pm.getWoundState()) {
                    pm.setWoundState(w);
                    resp.sendRedirect("include/conditionMonitor.jsp");
                } else
                    sendUnchanged(resp);
            } else if (action.equals("doCredstickTransaction")) {
                doCredstickTransaction(pm, req);
                resp.sendRedirect("member.jsp");
            } else if (action.equals("doMagazinRefill")) {
                doMagazinRefill(pm, req);
                resp.sendRedirect("member.jsp");
            } else if (action.equals("doManageFw")) {
                doManageFeuerwaffe(pm, req);
                resp.sendRedirect("member.jsp");
            } else if (action.equals("doManageRcc")) {
                doManageRcc(pm, req);
                resp.sendRedirect("member.jsp");
            } else if (action.equals("doManageCyb")) {
                doManageCyb(pm, req);
                resp.sendRedirect("member.jsp");
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
                scriptViewerWrapper.addSession(pm, req.getSession());
            } else
                resp.sendRedirect("main.jsp");
        }
        if (pm.getCurrentDialog() != null) {
            resp.sendRedirect("dialog.jsp");
        } else
            resp.sendRedirect("member.jsp");

        return;
    }

    private void doManageCyb(PlayerManager pm, HttpServletRequest req) {
        try {
            RuntimeCharacter character = pm.getCharacter();
            String rccId = req.getParameter("cyb");
            Cyberdeck rcc = (Cyberdeck)ShadowrunTools.getFirstObjectById(character.getInUse(), rccId);
                        
            String[] parameterValues = req.getParameterValues("runningPrograms");
            if (parameterValues != null && parameterValues.length != 0) {
                rcc.getRunningPrograms().clear();
                rcc.getRunningPrograms().addAll(
                        (Collection<? extends MatrixProgram>)Collections2.transform(Arrays.asList(parameterValues),
                                ShadowrunTools.xmlId2EObjectTransformer(rcc.getStoredPrograms())));
            }
            String iModus = req.getParameter("mode");
            if(iModus!=null)
                rcc.setCurrentModus(InterfaceModus.getByName(iModus));
            String[] configuration = req.getParameterValues("configuration");
            if(configuration!=null && configuration.length==4){
                for (int i = 0; i < configuration.length; i++) {
                    String string = configuration[i];
                    EAttribute attribute = GameplayTools.getCyberdeckAttribute(string);
                    if(attribute!=null){
                        rcc.getConfiguration().move(i, attribute);      
                    }
                }
            }
            executeChangeMessageAction(pm, character,  String.format("Change %s configuration", WebTools.getText(rcc)));
        } catch (Exception e) {
        }
    }

    private void doManageRcc(PlayerManager pm, HttpServletRequest req) {
        try {
            RuntimeCharacter character = pm.getCharacter();
            String rccId = req.getParameter("rcc");
            RiggerCommandConsole rcc = (RiggerCommandConsole)ShadowrunTools.getFirstObjectById(character.getInUse(), rccId);
                        
            String[] parameterValues = req.getParameterValues("runningPrograms");
            if (parameterValues != null && parameterValues.length != 0) {
                rcc.getRunningPrograms().clear();
                rcc.getRunningPrograms().addAll(
                        (Collection<? extends RiggerProgram>)Collections2.transform(Arrays.asList(parameterValues),
                                ShadowrunTools.xmlId2EObjectTransformer(rcc.getStoredPrograms())));
            }
            String iModus = req.getParameter("mode");
            if(iModus!=null)
                rcc.setCurrentModus(InterfaceModus.getByName(iModus));
            String sharing = req.getParameter("sharing");
            if(sharing!=null)
                rcc.setZugriffBasis(Integer.parseInt(sharing));
            executeChangeMessageAction(pm, character,  String.format("Change %s configuration", WebTools.getText(rcc)));
        } catch (Exception e) {
        }
    }

    private int calcWound(RuntimeCharacter character) {
        return character.getOverDead() + 100 * character.getPhysicalDamage() + 10000 * character.getMentalDamage();
    }

    private void doManageFeuerwaffe(PlayerManager pm, HttpServletRequest req) {
        try {
            RuntimeCharacter character = pm.getCharacter();
            String magazinId = req.getParameter("mag");
            Magazin magazine = (Magazin)ShadowrunTools.getFirstObjectById(character.getInUse(), magazinId);
            String fwId = req.getParameter("fw");
            Feuerwaffe fw = (Feuerwaffe)ShadowrunTools.getFirstObjectById(character.getInUse(), fwId);
            String mod = req.getParameter("modus");
            FeuerModus feuerModus = FeuerModus.get(mod);

            if (magazine != null && fw != null) {
                Magazin oldMagazine = fw.getMagazin();
                fw.setMagazin(magazine);
                character.getInUse().add(oldMagazine);
                character.getInUse().remove(magazine);
                character.getCharacter().getInventar().add(oldMagazine);
            }
            if (mod != null && !mod.isEmpty() && fw != null)
                GameplayTools.setFireModus(character, fw, feuerModus);
        } catch (Exception e) {
        }
    }

    private void doMagazinRefill(PlayerManager pm, HttpServletRequest req) {
        try {
            String magazinId = req.getParameter("magazin");
            String muniId = req.getParameter("muni");
            RuntimeCharacter character = pm.getCharacter();
            Munition muni = (Munition)ShadowrunTools.getFirstObjectById(character.getInUse(), muniId);
            Magazin magazine = (Magazin)ShadowrunTools.getFirstObjectById(character.getInUse(), magazinId);

            if (muni != null && magazine != null) {
                magazine.getBullets().clear();
                while (magazine.getBullets().size() < magazine.getType().getKapazitaet()) {
                    magazine.getBullets().add(muni);
                }
                executeChangeMessageAction(pm, character, "Refill "+WebTools.getText(magazine));
            }
        } catch (Exception e) {
        }
        return;
    }

    private void doCredstickTransaction(PlayerManager pm, HttpServletRequest req) {
        String amount = req.getParameter("amount");
        String id = req.getParameter("id");
        String message = req.getParameter("message");

        try {
            BigDecimal amount2 = new BigDecimal(amount);
            RuntimeCharacter character = pm.getCharacter();
            EObject object = ShadowrunTools.getFirstObjectById(character.getInUse(), id);
            if (object instanceof Credstick) {
                Credstick credstick = (Credstick)object;
                ScriptService scriptService = Activator.getDefault().getScriptService();
                SetFeatureCommand command = GameplayTools.createCredstickTransactionCommand(credstick, message, amount2, scriptService
                        .getCurrentScript().getHistory().getCurrentDate());

                pm.setCommandToIgnore(command);
                scriptService.executeCommand(command);
            }
        } catch (Exception e) {

        }
    }

    private void doDialog(PlayerManager pm, HttpServletResponse resp) throws IOException {
        if (pm.getCurrentDialog() == null) {
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

        String message = "Changed the inventory.";
        executeChangeMessageAction(pm, character, message);
    }

    /**
     * @param pm
     * @param character
     * @param message
     */
    private void executeChangeMessageAction(PlayerManager pm, RuntimeCharacter character, String message) {
        ScriptService scriptService = Activator.getDefault().getScriptService();
        SemanticAction action = GameplayFactory.eINSTANCE.createSemanticAction();
        action.setSubject(character);
        action.setType(SemanticType.DESCRIPTION);
        action.setMessage(String.format(message, AdapterFactoryUtil.getInstance().getLabelProvider().getText(character)));
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
