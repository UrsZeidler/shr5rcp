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
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Magier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MagierItemProvider
	extends MagischePersonaItemProvider {
	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MagierItemProvider(AdapterFactory adapterFactory) {
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

            addEnzugPropertyDescriptor(object);
            addTraditionPropertyDescriptor(object);
            addAstralesLimitPropertyDescriptor(object);
            addAstraleKonstitutionPropertyDescriptor(object);
            addAstraleGeschicklichkeitPropertyDescriptor(object);
            addAstraleReaktionPropertyDescriptor(object);
            addAstraleStaerkePropertyDescriptor(object);
            addAstraleInitativePropertyDescriptor(object);
            addAstraleInitativWuerfelPropertyDescriptor(object);
            addAstralePanzerungPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Enzug feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addEnzugPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Zauberer_enzug_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Zauberer_enzug_feature", "_UI_Zauberer_type"),
                 Shr5Package.Literals.ZAUBERER__ENZUG,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Tradition feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addTraditionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Zauberer_tradition_feature"),
                 getString("_UI_Zauberer_tradition_description"),
                 Shr5Package.Literals.ZAUBERER__TRADITION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Astrales Limit feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAstralesLimitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AstraleProjektion_astralesLimit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AstraleProjektion_astralesLimit_feature", "_UI_AstraleProjektion_type"),
                 Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALES_LIMIT,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Astrale Konstitution feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAstraleKonstitutionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AstraleProjektion_astraleKonstitution_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AstraleProjektion_astraleKonstitution_feature", "_UI_AstraleProjektion_type"),
                 Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Astrale Geschicklichkeit feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAstraleGeschicklichkeitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AstraleProjektion_astraleGeschicklichkeit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AstraleProjektion_astraleGeschicklichkeit_feature", "_UI_AstraleProjektion_type"),
                 Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Astrale Reaktion feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAstraleReaktionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AstraleProjektion_astraleReaktion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AstraleProjektion_astraleReaktion_feature", "_UI_AstraleProjektion_type"),
                 Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_REAKTION,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Astrale Staerke feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAstraleStaerkePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AstraleProjektion_astraleStaerke_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AstraleProjektion_astraleStaerke_feature", "_UI_AstraleProjektion_type"),
                 Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_STAERKE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Astrale Initative feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAstraleInitativePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AstraleProjektion_astraleInitative_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AstraleProjektion_astraleInitative_feature", "_UI_AstraleProjektion_type"),
                 Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_INITATIVE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Astrale Initativ Wuerfel feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAstraleInitativWuerfelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AstraleProjektion_astraleInitativWuerfel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AstraleProjektion_astraleInitativWuerfel_feature", "_UI_AstraleProjektion_type"),
                 Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Astrale Panzerung feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAstralePanzerungPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AstraleProjektion_astralePanzerung_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AstraleProjektion_astralePanzerung_feature", "_UI_AstraleProjektion_type"),
                 Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
            childrenFeatures.add(Shr5Package.Literals.ZAUBERER__ZAUBER);
            childrenFeatures.add(Shr5Package.Literals.ZAUBERER__GEBUNDENE_GEISTER);
            childrenFeatures.add(Shr5Package.Literals.ZAUBERER__UNGEBUNDENER_GEIST);
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
	 * This returns Magier.gif.
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

		return overlayImage(object, getResourceLocator().getImage("full/obj16/Magier"));
	}

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((Magier)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Magier_type") :
            getString("_UI_Magier_type") + " " + label;
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

        switch (notification.getFeatureID(Magier.class)) {
            case Shr5Package.MAGIER__ENZUG:
            case Shr5Package.MAGIER__TRADITION:
            case Shr5Package.MAGIER__ASTRALES_LIMIT:
            case Shr5Package.MAGIER__ASTRALE_KONSTITUTION:
            case Shr5Package.MAGIER__ASTRALE_GESCHICKLICHKEIT:
            case Shr5Package.MAGIER__ASTRALE_REAKTION:
            case Shr5Package.MAGIER__ASTRALE_STAERKE:
            case Shr5Package.MAGIER__ASTRALE_INITATIVE:
            case Shr5Package.MAGIER__ASTRALE_INITATIV_WUERFEL:
            case Shr5Package.MAGIER__ASTRALE_PANZERUNG:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.MAGIER__ZAUBER:
            case Shr5Package.MAGIER__GEBUNDENE_GEISTER:
            case Shr5Package.MAGIER__UNGEBUNDENER_GEIST:
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
                (Shr5Package.Literals.ZAUBERER__ZAUBER,
                 Shr5Factory.eINSTANCE.createPersonaZauber()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.ZAUBERER__GEBUNDENE_GEISTER,
                 Shr5Factory.eINSTANCE.createGebundenerGeist()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.ZAUBERER__UNGEBUNDENER_GEIST,
                 Shr5Factory.eINSTANCE.createGebundenerGeist()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == Shr5Package.Literals.ZAUBERER__GEBUNDENE_GEISTER ||
            childFeature == Shr5Package.Literals.ZAUBERER__UNGEBUNDENER_GEIST;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
