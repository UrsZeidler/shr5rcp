/**
 * 
 */
package de.urszeidler.shr5.ecp.util;

import de.urszeidler.eclipse.shr5.GeldWert;

/**
 * @author urs
 */
public class MoneyLabelProvider extends DefaultLabelProvider {

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(Object element) {
        if (element instanceof GeldWert) {
            GeldWert gw = (GeldWert)element;
            return String.format("%s : %,.0f %s", super.getText(element), gw.getWert(), "¥");// store.getString(PreferenceConstants.CURRENCY_SYMBOL));
        }

        return super.getText(element);
    }

}
