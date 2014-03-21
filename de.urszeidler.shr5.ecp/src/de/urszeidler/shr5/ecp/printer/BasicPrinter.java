package de.urszeidler.shr5.ecp.printer;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.nebula.paperclips.core.Print;
import org.eclipse.nebula.paperclips.core.page.PageNumberPageDecoration;
import org.eclipse.nebula.paperclips.core.page.PagePrint;
import org.eclipse.swt.graphics.FontData;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.provider.Shr5managementItemProviderAdapterFactory;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;

/**
 * Collects the basic print functionality.
 * 
 * @author urs
 */
public class BasicPrinter implements IPropertyChangeListener {

    protected static final String EOL = "\n";//$NON-NLS-1$
    protected static final int BIG_SCALE = 80;
    protected static final int SMALL_SCALE = 32;
    protected static final String ONE_SPACE = " ";//$NON-NLS-1$
    protected static final String EMPTY = "";//$NON-NLS-1$

    /**
     * Simple factory interface.
     * 
     * @author urs
     */
    public interface PrintFactory {
        String getPrintTitel();

        Print createPrinter();
    }

    protected IPreferenceStore store;
    protected FontData boldFontData;
    protected FontData attributeFont;
    protected AdapterFactoryItemDelegator itemDelegator;
    protected FontData italicFontData;

    /**
     * Returns the localized feature name.
     * 
     * @param object
     * @param eAttribute
     * @return
     */
    public static String toFeatureName(EObject object, EStructuralFeature eAttribute) {
        IItemPropertyDescriptor descriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(object, eAttribute);
        return descriptor.getDisplayName(eAttribute);
    }

    public BasicPrinter() {
        super();
    }

    /**
     * Creates some style objects.
     */
    protected void initalizePrinter() {

        initalizeFontData();

        itemDelegator = AdapterFactoryUtil.getInstance().getItemDelegator();
        Shr5managementItemProviderAdapterFactory shr5managementItemProviderAdapterFactory = new de.urszeidler.eclipse.shr5Management.provider.Shr5managementItemProviderAdapterFactory();
        AdapterFactoryUtil.getInstance().getAdapterFactory().insertAdapterFactory(shr5managementItemProviderAdapterFactory);
    }

    /**
     * 
     */
    private void initalizeFontData() {
        boldFontData = PreferenceConverter.getFontDataArray(store, PreferenceConstants.FONT_MAIN_HEADER)[0];
        italicFontData = PreferenceConverter.getFontDataArray(store, PreferenceConstants.FONT_TABLE_HEADER)[0];
        attributeFont = PreferenceConverter.getFontDataArray(store, PreferenceConstants.FONT_NORMAL_TEXT)[0];
        //
        // boldFontData = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight(), SWT.BOLD);
        // italicFontData = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight() - 2, SWT.ITALIC);
        // attributeFont = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight() - 2, defaultFont[0].getStyle());
    }

    /**
     * Creates the page, with header and footer, for the given body.
     * 
     * @param body the document to print on pages
     * @return the page print.
     */
    protected PagePrint createPagePrint(Print body) {
        // DefaultGridLook look = new DefaultGridLook(5, 5);
        // look.setHeaderGap(5);
        //        GridPrint grid = new GridPrint("d,d:g", look);//$NON-NLS-1$
        //
        // grid.addFooter(new EmptyPrint(), GridPrint.REMAINDER);
        // grid.addFooter(new EmptyPrint(), GridPrint.REMAINDER);
        // grid.addFooter(new TextPrint(Messages.Printer_footer_1, italicFontData), 2);
        // grid.addFooter(new TextPrint(Messages.Printer_footer_2, italicFontData), 2);

        PagePrint pagePrint = new PagePrint(body);

        PageNumberPageDecoration footer2 = new PageNumberPageDecoration();
        footer2.setFontData(italicFontData);

        // pagePrint.setHeader(new SimplePageDecoration(grid));
        pagePrint.setFooter(footer2);
        return pagePrint;
    }

    /**
     * Simply checks for null and returns empty for it.
     * 
     * @param message
     * @return
     */
    protected String printString(String message) {
        if (message == null)
            return EMPTY;
        return message;
    }

    /**
     * @param ge
     * @return
     */
    protected String toSource(Quelle ge) {
        if (ge.getSrcBook() == null)
            return EMPTY;

        StringBuffer buffer = new StringBuffer();
        buffer.append(toSimpleName(ge.getSrcBook()));
        buffer.append(Messages.Printer_page);
        buffer.append(ge.getPage());
        return buffer.toString();
    }

    /**
     * Simple prints a date.
     * 
     * @param date
     * @return
     */
    protected String printDate(Date date) {
        String format = String.format("%tF", date);
        return format;
    }

    /**
     * To name for the enum literals.
     * 
     * @param literal
     * @param eobject
     * @param feature
     * @return
     */
    protected String toName(Object literal, EObject eobject, EAttribute feature) {
        if (literal == null)
            return EMPTY;

        String text2 = literal.toString();
        IItemPropertyDescriptor propertyDescriptor = itemDelegator.getPropertyDescriptor(eobject, feature);
        if (propertyDescriptor != null)
            text2 = propertyDescriptor.getLabelProvider(eobject).getText(literal);

        return text2;

    }

    protected String toName(Object fw) {
        if (fw == null)
            return EMPTY;

        if (fw instanceof EObject) {
            return itemDelegator.getText(fw);
        }

        return itemDelegator.getText(fw);
    }

    /**
     * Delegates the the name feature instead of the itemdelegator.getText.
     * 
     * @param be a {@link Beschreibbar}
     * @return
     */
    protected String toSimpleName(Beschreibbar be) {
        if (be == null)
            return EMPTY;

        return be.getName();
    }

    /**
     * Prints the ini.
     * 
     * @param persona
     * @return
     */
    protected String printInteger(int value) {
        return String.format("%d", value);//$NON-NLS-1$
    }

    /**
     * Prints the money.
     * 
     * @param persona
     * @return
     */
    protected String printIntegerMoney(BigDecimal bigDecimal) {
        return String.format("%,.0f" + store.getString(PreferenceConstants.CURRENCY_SYMBOL), bigDecimal);//$NON-NLS-1$
    }


    @Override
    public void propertyChange(PropertyChangeEvent event) {
        initalizeFontData();
    }

}