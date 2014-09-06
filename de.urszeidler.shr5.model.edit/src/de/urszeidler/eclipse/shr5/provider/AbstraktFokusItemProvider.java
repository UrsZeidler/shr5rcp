/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.AbstraktFokus;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.AbstraktFokus} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstraktFokusItemProvider
    extends ItemProviderAdapter
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
    public AbstraktFokusItemProvider(AdapterFactory adapterFactory) {
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

            addStufePropertyDescriptor(object);
            addBindungskostenPropertyDescriptor(object);
            addParentIdPropertyDescriptor(object);
            addPagePropertyDescriptor(object);
            addSrcBookPropertyDescriptor(object);
            addWertPropertyDescriptor(object);
            addVerfuegbarkeitPropertyDescriptor(object);
            addWertValuePropertyDescriptor(object);
            addBeschreibungPropertyDescriptor(object);
            addImagePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addFertigkeitPropertyDescriptor(object);
            addSpezialisierungPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Stufe feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStufePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MagischeStufe_stufe_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MagischeStufe_stufe_feature", "_UI_MagischeStufe_type"),
                 Shr5Package.Literals.MAGISCHE_STUFE__STUFE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Beschreibung feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBeschreibungPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Beschreibbar_beschreibung_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Beschreibbar_beschreibung_feature", "_UI_Beschreibbar_type"),
                 Shr5Package.Literals.BESCHREIBBAR__BESCHREIBUNG,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Image feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addImagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Beschreibbar_image_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Beschreibbar_image_feature", "_UI_Beschreibbar_type"),
                 Shr5Package.Literals.BESCHREIBBAR__IMAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Beschreibbar_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Beschreibbar_name_feature", "_UI_Beschreibbar_type"),
                 Shr5Package.Literals.BESCHREIBBAR__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Fertigkeit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFertigkeitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Anwendbar_fertigkeit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Anwendbar_fertigkeit_feature", "_UI_Anwendbar_type"),
                 Shr5Package.Literals.ANWENDBAR__FERTIGKEIT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Spezialisierung feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpezialisierungPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Anwendbar_spezialisierung_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Anwendbar_spezialisierung_feature", "_UI_Anwendbar_type"),
                 Shr5Package.Literals.ANWENDBAR__SPEZIALISIERUNG,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Parent Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParentIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Identifiable_parentId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Identifiable_parentId_feature", "_UI_Identifiable_type"),
                 Shr5Package.Literals.IDENTIFIABLE__PARENT_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Page feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Quelle_page_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Quelle_page_feature", "_UI_Quelle_type"),
                 Shr5Package.Literals.QUELLE__PAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Src Book feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrcBookPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Quelle_srcBook_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Quelle_srcBook_feature", "_UI_Quelle_type"),
                 Shr5Package.Literals.QUELLE__SRC_BOOK,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
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
                 getString("_UI_PropertyDescriptor_description", "_UI_GeldWert_wert_feature", "_UI_GeldWert_type"),
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
                 getString("_UI_PropertyDescriptor_description", "_UI_GeldWert_wertValue_feature", "_UI_GeldWert_type"),
                 Shr5Package.Literals.GELD_WERT__WERT_VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Bindungskosten feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBindungskostenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Fokus_bindungskosten_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Fokus_bindungskosten_feature", "_UI_Fokus_type"),
                 Shr5Package.Literals.FOKUS__BINDUNGSKOSTEN,
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
            childrenFeatures.add(Shr5Package.Literals.IDENTIFIABLE__LOCALIZATIONS);
            childrenFeatures.add(Shr5Package.Literals.MODIFIZIERBAR__MODS);
            childrenFeatures.add(Shr5Package.Literals.ABSTRAKT_GEGENSTAND__WIFI);
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
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((AbstraktFokus)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_AbstraktFokus_type") :
            getString("_UI_AbstraktFokus_type") + " " + label;
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

        switch (notification.getFeatureID(AbstraktFokus.class)) {
            case Shr5Package.ABSTRAKT_FOKUS__STUFE:
            case Shr5Package.ABSTRAKT_FOKUS__BINDUNGSKOSTEN:
            case Shr5Package.ABSTRAKT_FOKUS__PARENT_ID:
            case Shr5Package.ABSTRAKT_FOKUS__PAGE:
            case Shr5Package.ABSTRAKT_FOKUS__WERT:
            case Shr5Package.ABSTRAKT_FOKUS__VERFUEGBARKEIT:
            case Shr5Package.ABSTRAKT_FOKUS__WERT_VALUE:
            case Shr5Package.ABSTRAKT_FOKUS__BESCHREIBUNG:
            case Shr5Package.ABSTRAKT_FOKUS__IMAGE:
            case Shr5Package.ABSTRAKT_FOKUS__NAME:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.ABSTRAKT_FOKUS__LOCALIZATIONS:
            case Shr5Package.ABSTRAKT_FOKUS__MODS:
            case Shr5Package.ABSTRAKT_FOKUS__WIFI:
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
                (Shr5Package.Literals.IDENTIFIABLE__LOCALIZATIONS,
                 Shr5Factory.eINSTANCE.createLocalization()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.MODIFIZIERBAR__MODS,
                 Shr5Factory.eINSTANCE.createAttributModifikatorWert()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.ABSTRAKT_GEGENSTAND__WIFI,
                 Shr5Factory.eINSTANCE.createCommlink()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.ABSTRAKT_GEGENSTAND__WIFI,
                 Shr5Factory.eINSTANCE.createCyberdeck()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.ABSTRAKT_GEGENSTAND__WIFI,
                 Shr5Factory.eINSTANCE.createHost()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.ABSTRAKT_GEGENSTAND__WIFI,
                 Shr5Factory.eINSTANCE.createRiggerCommandConsole()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.ABSTRAKT_GEGENSTAND__WIFI,
                 Shr5Factory.eINSTANCE.createDefaultWifi()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Shr5EditPlugin.INSTANCE;
    }

}
