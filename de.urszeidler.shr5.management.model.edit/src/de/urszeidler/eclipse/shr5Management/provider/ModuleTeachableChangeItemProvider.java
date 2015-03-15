/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Spezialisierung;
import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;
import de.urszeidler.eclipse.shr5Management.ModuleTeachableChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.ModuleTeachableChange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleTeachableChangeItemProvider extends ModuleChangeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleTeachableChangeItemProvider(AdapterFactory adapterFactory) {
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

            addTeachablePropertyDescriptor(object);
            addSelectOnePropertyDescriptor(object);
            addGradePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Teachable feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addTeachablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ModuleTeachableChange_teachable_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ModuleTeachableChange_teachable_feature", "_UI_ModuleTeachableChange_type"),
                 Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE__TEACHABLE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    return    FluentIterable.from(super.getComboBoxObjects(object)).filter(
                            Predicates.or(
                                    Predicates.instanceOf(PersonaEigenschaft.class),
                                    Predicates.instanceOf(Spezialisierung.class)
                            )
                           ).toList();
                }
                
            });
    }

    /**
     * This adds a property descriptor for the Select One feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addSelectOnePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ModuleTeachableChange_selectOne_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ModuleTeachableChange_selectOne_feature", "_UI_ModuleTeachableChange_type"),
                 Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE__SELECT_ONE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    return    FluentIterable.from(super.getComboBoxObjects(object)).filter(
                            Predicates.or(
                                    Predicates.instanceOf(PersonaEigenschaft.class),
                                    Predicates.instanceOf(Spezialisierung.class)
                            )
                           ).toList();
                }
                
            });
    }

    /**
     * This adds a property descriptor for the Grade feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGradePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ModuleTeachableChange_grade_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ModuleTeachableChange_grade_feature", "_UI_ModuleTeachableChange_type"),
                 Shr5managementPackage.Literals.MODULE_TEACHABLE_CHANGE__GRADE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns ModuleTeachableChange.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleTeachableChange"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        ModuleTeachableChange moduleTeachableChange = (ModuleTeachableChange)object;
        ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String unset = getString("_UI_Unset_text");
        String text = "";
        if (moduleTeachableChange.getTeachable() != null) {
            text = Shr5EditingTools.getLabelForEObject(factory, unset, moduleTeachableChange.getTeachable());
        }else if(!moduleTeachableChange.getSelectOne().isEmpty()){
            text = " on of:";
        }
        return getString("_UI_ModuleTeachableChange_type")+" "+text + " " + moduleTeachableChange.getGrade();
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

        switch (notification.getFeatureID(ModuleTeachableChange.class)) {
            case Shr5managementPackage.MODULE_TEACHABLE_CHANGE__GRADE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
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
