/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

import de.urszeidler.eclipse.shr5Management.Pack;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

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

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.Pack} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackItemProvider 
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
    public PackItemProvider(AdapterFactory adapterFactory) {
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

            addBeschreibungPropertyDescriptor(object);
            addImagePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addParentIdPropertyDescriptor(object);
            addPagePropertyDescriptor(object);
            addSrcBookPropertyDescriptor(object);
            addWertPropertyDescriptor(object);
            addVerfuegbarkeitPropertyDescriptor(object);
            addWertValuePropertyDescriptor(object);
            addItemsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 getString("_UI_Quelle_page_description"),
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
                 getString("_UI_Quelle_srcBook_description"),
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
     * This adds a property descriptor for the Items feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addItemsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Pack_items_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Pack_items_feature", "_UI_Pack_type"),
                 Shr5managementPackage.Literals.PACK__ITEMS,
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
            childrenFeatures.add(Shr5Package.Literals.IDENTIFIABLE__LOCALIZATIONS);
            childrenFeatures.add(Shr5managementPackage.Literals.PACK__ITEMS);
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
     * This returns Pack.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Pack"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Pack)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Pack_type") :
            getString("_UI_Pack_type") + " " + label;
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

        switch (notification.getFeatureID(Pack.class)) {
            case Shr5managementPackage.PACK__BESCHREIBUNG:
            case Shr5managementPackage.PACK__IMAGE:
            case Shr5managementPackage.PACK__NAME:
            case Shr5managementPackage.PACK__PARENT_ID:
            case Shr5managementPackage.PACK__PAGE:
            case Shr5managementPackage.PACK__WERT:
            case Shr5managementPackage.PACK__VERFUEGBARKEIT:
            case Shr5managementPackage.PACK__WERT_VALUE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5managementPackage.PACK__LOCALIZATIONS:
            case Shr5managementPackage.PACK__ITEMS:
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
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5managementFactory.eINSTANCE.createFreeStyle()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5managementFactory.eINSTANCE.createShr5System()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5managementFactory.eINSTANCE.createPack()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5managementFactory.eINSTANCE.createLifeModulesSystem()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5managementFactory.eINSTANCE.createLifeModule()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createGegenstand()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createNahkampfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createFeuerwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createWurfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createProjektilwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createFertigkeitsGruppe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createFertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCyberware()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createBioWare()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createKiKraft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSpezies()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createKleidung()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createFernkampfwaffeModifikator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createPersonaEigenschaft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createZauber()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSchutzgeist()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createMetaMagie()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCritterKraft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createPassagierFahrzeug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createBodenfahrzeug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createDrohne()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createKomplexeForm()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSprite()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createEcho()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createVertrag()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createIntervallVertrag()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createLifestyle()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createWissensfertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSprachfertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCritter()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createLizenz()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCredstick()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createMunition()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createGeist()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSpezialisierung()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCommlink()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCyberdeck()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSoftwareAgent()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createRiggerCommandConsole()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createAutoSoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createTutorsoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSkillSoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createDatasoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createConsumerSoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCommonProgram()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createWeaponMount()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createLifestyleOption()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createPercentLifestyleOption()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createQiFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createWaffenFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createMagieFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createToxin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createDrug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createMagazin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createDefaultWifi()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createSubstanceContainer()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCyberwareEnhancement()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createCyberImplantWeapon()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PACK__ITEMS,
                 Shr5Factory.eINSTANCE.createMagischeTradition()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Shr5ManagementEditPlugin.INSTANCE;
    }

}
