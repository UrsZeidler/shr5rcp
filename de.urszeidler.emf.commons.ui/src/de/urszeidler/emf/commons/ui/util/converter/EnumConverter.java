/**
 * 
 */
package de.urszeidler.emf.commons.ui.util.converter;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * Converts Enums to listeral and back.
 * 
 * @author urs
 */
public class EnumConverter extends Converter {
    private final EEnum eenum;
    private IItemLabelProvider labelProvider;

    public EnumConverter(EEnum eenum) {
        super(EEnumLiteral.class, EEnumLiteral.class);
        this.eenum = eenum;
    }

    /**
     * @param object
     * @since 1.0
     */
    public EnumConverter(EEnum eenum2, EStructuralFeature feature, AdapterFactoryItemDelegator itemDelegator, EObject object) {
        this(eenum2);
        IItemPropertyDescriptor descriptor = itemDelegator.getPropertyDescriptor(object, feature);
        if (descriptor != null)
            labelProvider = descriptor.getLabelProvider(object);
    }

    public Object convert(Object fromObject) {

        if (fromObject instanceof String) {
            String name = (String)fromObject;
            return eenum.getEEnumLiteral(name);
        }
//        if (labelProvider != null) {
//            String text = labelProvider.getText(fromObject);
//            System.out.println(fromObject.getClass()+"--->"+text);
//            return text;
//        }
        if (fromObject instanceof EEnumLiteral) {
            EEnumLiteral el = (EEnumLiteral)fromObject;
            return el.getInstance();
        }
        if (fromObject instanceof Enumerator) {
            Enumerator en = (Enumerator)fromObject;
            return eenum.getEEnumLiteral(en.getLiteral());
        }
        return null;
    }
}