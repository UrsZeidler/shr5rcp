/**
 * 
 */
package de.urszeidler.shr5.ecp.util;

import org.eclipse.ui.forms.events.HyperlinkAdapter;

/**
 * @author urs
 *
 */
public class GenericHyperlinkAdapter<A> extends HyperlinkAdapter {
    protected A object;

    public GenericHyperlinkAdapter(A object) {
        super();
        this.object = object;
    }
   
}
