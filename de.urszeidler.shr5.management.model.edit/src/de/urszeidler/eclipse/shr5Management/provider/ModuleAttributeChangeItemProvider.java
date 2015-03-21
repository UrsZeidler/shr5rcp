/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;
import de.urszeidler.eclipse.shr5Management.ModuleAttributeChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.ModuleAttributeChange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleAttributeChangeItemProvider extends ModuleTypeChangeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleAttributeChangeItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addAttributePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addAttributePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ModuleAttributeChange_attribute_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ModuleAttributeChange_attribute_feature", "_UI_ModuleAttributeChange_type"),
                 Shr5managementPackage.Literals.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    return    FluentIterable.from(super.getComboBoxObjects(object)).filter(
                                   Predicates.in((Collection<?>)Shr5Package.Literals.MUDAN_PERSONA.getEAllAttributes())
                           ).toList();
                }
            });
    }

    /**
     * This returns ModuleAttributeChange.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleAttributeChange"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        ModuleAttributeChange moduleAttributeChange = (ModuleAttributeChange)object;
        ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String unset = getString("_UI_Unset_text");
        String text = "";
        if (moduleAttributeChange.getAttribute() != null) {
            text = Shr5EditingTools.getLabelForEObject(factory, unset, moduleAttributeChange.getAttribute());
        }else if(!moduleAttributeChange.getSelectOne().isEmpty()){
            text = " on of:";
        }

        return getString("_UI_ModuleAttributeChange_type")+" "+text + " " + moduleAttributeChange.getGrade();
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
