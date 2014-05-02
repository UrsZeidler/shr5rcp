/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.provider;


import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.Shr5Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Geist} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeistItemProvider
    extends StufenPersonaItemProvider
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeistItemProvider(AdapterFactory adapterFactory) {
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

            addAstralesLimitPropertyDescriptor(object);
            addAstraleKonstitutionPropertyDescriptor(object);
            addAstraleGeschicklichkeitPropertyDescriptor(object);
            addAstraleReaktionPropertyDescriptor(object);
            addAstraleStaerkePropertyDescriptor(object);
            addAstraleInitativePropertyDescriptor(object);
            addAstraleInitativWuerfelPropertyDescriptor(object);
            addAstralePanzerungPropertyDescriptor(object);
            addSpeziesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
     * This adds a property descriptor for the Spezies feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpeziesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Geist_spezies_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_spezies_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__SPEZIES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns Geist.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Geist"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Geist)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Geist_type") :
            getString("_UI_Geist_type") + " " + label;
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

        switch (notification.getFeatureID(Geist.class)) {
            case Shr5Package.GEIST__ASTRALES_LIMIT:
            case Shr5Package.GEIST__ASTRALE_KONSTITUTION:
            case Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT:
            case Shr5Package.GEIST__ASTRALE_REAKTION:
            case Shr5Package.GEIST__ASTRALE_STAERKE:
            case Shr5Package.GEIST__ASTRALE_INITATIVE:
            case Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL:
            case Shr5Package.GEIST__ASTRALE_PANZERUNG:
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
