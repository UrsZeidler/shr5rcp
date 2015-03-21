/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleSkillChangeItemProvider extends ModuleTypeChangeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleSkillChangeItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ModuleSkillChange.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ModuleSkillChange"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    @Override
    public String getText(Object object) {
        ModuleSkillChange msc = (ModuleSkillChange)object;
        ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String unset = getString("_UI_Unset_text");
        String text = "";
        int stufe = msc.getGrade();
        if (msc.getSkill() != null) {
            text = Shr5EditingTools.getLabelForEObject(factory, unset, msc.getSkill());
        }else if(!msc.getSelectOne().isEmpty()){
            text = " on of:";
        }

        return String.format("%s %d", text,stufe);//getString("_UI_ModuleSkillChange_type");
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

        switch (notification.getFeatureID(ModuleSkillChange.class)) {
            case Shr5managementPackage.MODULE_SKILL_CHANGE__SKILL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL,
                 Shr5Factory.eINSTANCE.createFertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL,
                 Shr5Factory.eINSTANCE.createWissensfertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL,
                 Shr5Factory.eINSTANCE.createSprachfertigkeit()));
    }

}
