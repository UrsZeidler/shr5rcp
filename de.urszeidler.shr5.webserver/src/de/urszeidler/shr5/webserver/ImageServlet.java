/**
 * 
 */
package de.urszeidler.shr5.webserver;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.scripting.Script;

/**
 * A simple servlet to access the imageprivider.
 * 
 * @author urs
 */
public class ImageServlet extends HttpServlet implements Servlet {

    /**
     * 
     */
    private static final long serialVersionUID = 3125249689120452870L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uriFragment = request.getParameter("uriFragment");
        if(uriFragment==null){
            return;
        }
        Script script = Activator.getDefault().getScriptService().getCurrentScript();
        if(script==null)
            return;
        
        EObject eObject = script.eResource().getEObject(uriFragment);
        if(eObject==null)
            return;
        

        Image image = AdapterFactoryUtil.getInstance().getLabelProvider().getImage(eObject);
        if(image==null)
            return;

        ImageLoader imageLoader = new ImageLoader();
        imageLoader.data = new ImageData[] {image.getImageData()};
        OutputStream out = response.getOutputStream();
        response.setContentType("image/png");
        imageLoader.save(out,SWT.IMAGE_PNG);
        out.close();
    }

}
