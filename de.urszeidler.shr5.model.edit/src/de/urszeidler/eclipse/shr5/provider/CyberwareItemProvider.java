/**
 */
package de.urszeidler.eclipse.shr5.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Cyberware} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CyberwareItemProvider
	extends KoerpermodsItemProvider {
	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CyberwareItemProvider(AdapterFactory adapterFactory) {
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

            addWertPropertyDescriptor(object);
            addVerfuegbarkeitPropertyDescriptor(object);
            addWertValuePropertyDescriptor(object);
            addPersonaPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Wert feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addWertPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GeldWert_wert_feature"),
                 getString("_UI_GeldWert_wert_description"),
                 Shr5Package.Literals.GELD_WERT__WERT,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Verfuegbarkeit feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addVerfuegbarkeitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GeldWert_verfuegbarkeit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GeldWert_verfuegbarkeit_feature", "_UI_GeldWert_type"),
                 Shr5Package.Literals.GELD_WERT__VERFUEGBARKEIT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Wert Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWertValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GeldWert_wertValue_feature"),
                 getString("_UI_GeldWert_wertValue_description"),
                 Shr5Package.Literals.GELD_WERT__WERT_VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Persona feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addPersonaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Cyberware_persona_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Cyberware_persona_feature", "_UI_Cyberware_type"),
                 Shr5Package.Literals.CYBERWARE__PERSONA,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
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
            childrenFeatures.add(Shr5Package.Literals.CYBERWARE__EINBAU);
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
	 * This returns Cyberware.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public Object getImage(Object object) {
		Beschreibbar beschreibbar = (Beschreibbar) object;
		if (beschreibbar.getImage() != null) {
			Image image = AdapterFactoryUtil.getInstance().getImageScaledBy(16, beschreibbar.getImage());
			if (image != null)
				return image;
		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Cyberware"));
	}

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((Cyberware)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Cyberware_type") :
            getString("_UI_Cyberware_type") + " " + label;
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

        switch (notification.getFeatureID(Cyberware.class)) {
            case Shr5Package.CYBERWARE__WERT:
            case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
            case Shr5Package.CYBERWARE__WERT_VALUE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.CYBERWARE__EINBAU:
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
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createGegenstand()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createNahkampfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createFeuerwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createWurfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createProjektilwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createKleidung()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createCredstick()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createMunition()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createCommlink()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createCyberdeck()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createRiggerCommandConsole()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createQiFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createWaffenFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createMagieFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createMagazin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createDefaultWifi()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERWARE__EINBAU,
                 Shr5Factory.eINSTANCE.createSubstanceContainer()));
    }

}
