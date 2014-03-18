/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


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

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.ShrMgmtList;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.ShrMgmtList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShrMgmtListItemProvider
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
    public ShrMgmtListItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES);
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
     * This returns ShrMgmtList.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ShrMgmtList"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ShrMgmtList)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ShrMgmtList_type") :
            getString("_UI_ShrMgmtList_type") + " " + label;
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

        switch (notification.getFeatureID(ShrMgmtList.class)) {
            case Shr5managementPackage.SHR_MGMT_LIST__BESCHREIBUNG:
            case Shr5managementPackage.SHR_MGMT_LIST__IMAGE:
            case Shr5managementPackage.SHR_MGMT_LIST__NAME:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5managementPackage.SHR_MGMT_LIST__ENTRIES:
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
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createNonPlayerCharacter()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createKarmaGaint()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createFreeStyle()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createShr5System()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createMetaType()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createAttributes()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createSkill()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createResourcen()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createTechnomancer()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createAdept()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createSpellcaster()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createFreeStyleGenerator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createShr5Generator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createAttributeChange()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createPlayerCharacter()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createMudan()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createCharacterGroup()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createPersonaChange()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.create(Shr5managementPackage.Literals.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY)));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createLifestyleToStartMoney()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createShrMgmtList()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createGruntGroup()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createGruntMembers()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createPlayerManagement()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createGamemasterManagement()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5managementFactory.eINSTANCE.createShr5KarmaGenerator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSourceBook()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createGegenstand()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createReichweite()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createAttributModifikatorWert()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createNahkampfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFeuerwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createWurfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createShrList()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createProjektilwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFertigkeitsGruppe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaFertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCyberware()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createBioWare()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMudanPersona()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createKiKraft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSpezies()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createKiAdept()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createKleidung()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFernkampfwaffeModifikator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaEigenschaft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMagier()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMysticAdept()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaZauber()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createZauber()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createAspektMagier()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSchutzgeist()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createInitation()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMetaMagie()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCritterKraft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPassagierFahrzeug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createBodenfahrzeug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createDrohne()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFahrzeugModifikation()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createTechnomancer()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createKomplexeForm()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaKomplexForm()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSprite()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createEcho()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createVertrag()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createLifestyle()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createWissensfertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSprachfertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCritter()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createLizenz()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.SHR_MGMT_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCredstick()));
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
