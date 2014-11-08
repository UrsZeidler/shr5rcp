/**
 * 
 */
package de.urszeidler.shr5.webserver;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.MultipartConfigElement;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jetty.server.Request;

import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.GamemasterManagement;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.scripting.Script;

/**
 * @author urs
 *
 */
@MultipartConfig(maxFileSize = 3145728,fileSizeThreshold=3145728)
public class CharacterUploadServlet extends HttpServlet implements Servlet {
    private static final long serialVersionUID = 2038846225859990462L;
    private static final MultipartConfigElement MULTI_PART_CONFIG = new MultipartConfigElement(System.getProperty("java.io.tmpdir"));


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getContentType() != null && request.getContentType().startsWith("multipart/form-data")) {
            request.setAttribute(Request.__MULTIPART_CONFIG_ELEMENT, MULTI_PART_CONFIG);
          }
        
        //        String description = request.getParameter("description"); // Retrieves <input type="text" name="description">
        Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
//        String filename = getFilename(filePart);
        InputStream filecontent = filePart.getInputStream();
         
        ResourceFactoryImpl resourceFactoryImpl = new XMIResourceFactoryImpl();
        URI uri = URI.createPlatformResourceURI("shr5Resource/temp.xmi",true);
       
        Resource resource = resourceFactoryImpl.createResource(uri);
        Map<?, ?> options = new HashMap<Object, Object>();
        resource.load(filecontent, options);
        
        EObject eObject = resource.getContents().get(0);
        if (eObject instanceof ManagedCharacter) {
            ManagedCharacter mc = (ManagedCharacter)eObject;
            Script script = Activator.getDefault().getScriptService().getCurrentScript();
            if(script!=null){
                GamemasterManagement management = script.getManagement();
                if(management==null){
                    management = Shr5managementFactory.eINSTANCE.createGamemasterManagement();
                    script.setManagement(management);
                }
                EList<CharacterGroup> groups = management.getGroups();
                if(groups.size()==0){
                    CharacterGroup characterGroup = Shr5managementFactory.eINSTANCE.createCharacterGroup();
                    characterGroup.setName("import");
                    groups.add(characterGroup);
                }
                CharacterGroup characterGroup = groups.get(0);
                characterGroup.getMembers().add(mc);
                script.getPlayer().getMembers().add(ShadowrunEditingTools.managedCharacter2RuntimeFunction().apply(mc));
            }
        }
      
        response.sendRedirect("main.jsp");
    }

//    private static String getFilename(Part part) {
//        for (String cd : part.getHeader("content-disposition").split(";")) {
//            if (cd.trim().startsWith("filename")) {
//                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
//                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
//            }
//        }
//        return null;
//    }
}
