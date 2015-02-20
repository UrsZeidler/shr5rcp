/**
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
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.ShrList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShrListItemProvider
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
	public ShrListItemProvider(AdapterFactory adapterFactory) {
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
        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(Shr5Package.Literals.SHR_LIST__ENTRIES);
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
	 * This returns ShrList.gif.
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

		return overlayImage(object, getResourceLocator().getImage("full/obj16/ShrList"));
	}

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated not
     */
	@Override
	public String getText(Object object) {
        String label = ((ShrList)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ShrList_type") :
            label;
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

        switch (notification.getFeatureID(ShrList.class)) {
            case Shr5Package.SHR_LIST__BESCHREIBUNG:
            case Shr5Package.SHR_LIST__IMAGE:
            case Shr5Package.SHR_LIST__NAME:
            case Shr5Package.SHR_LIST__PARENT_ID:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.SHR_LIST__LOCALIZATIONS:
            case Shr5Package.SHR_LIST__ENTRIES:
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
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSourceBook()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createGegenstand()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createReichweite()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createAttributModifikatorWert()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createNahkampfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFeuerwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createWurfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createShrList()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createProjektilwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFertigkeitsGruppe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaFertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCyberware()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createBioWare()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMudanPersona()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createKiKraft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSpezies()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createKiAdept()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createKleidung()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFernkampfwaffeModifikator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaEigenschaft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMagier()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMysticAdept()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaZauber()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createZauber()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createAspektMagier()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSchutzgeist()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createInitation()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMetaMagie()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCritterKraft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPassagierFahrzeug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createBodenfahrzeug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createDrohne()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createTechnomancer()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createKomplexeForm()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonaKomplexForm()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSprite()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createEcho()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createVertrag()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createIntervallVertrag()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createLifestyle()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createWissensfertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSprachfertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCritter()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createLizenz()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCredstick()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMunition()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createGebundenerGeist()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createGeist()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCredstickTransaction()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSpezialisierung()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCommlink()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCyberdeck()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSoftwareAgent()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createHost()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createRiggerCommandConsole()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createAutoSoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createTutorsoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSkillSoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPersonalAreaNetwork()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createDatasoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createConsumerSoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCommonProgram()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createWeaponMount()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createLifestyleOption()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createPercentLifestyleOption()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createLocalization()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createQiFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createWaffenFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMagieFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createFokusBinding()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createToxin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createDrug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMagazin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createDefaultWifi()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createSubstanceContainer()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCyberwareEnhancement()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createCyberImplantWeapon()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createMagischeTradition()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createShoppingTransaction()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.SHR_LIST__ENTRIES,
                 Shr5Factory.eINSTANCE.createTransferAmount()));
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
            childFeature == Shr5Package.Literals.IDENTIFIABLE__LOCALIZATIONS ||
            childFeature == Shr5Package.Literals.SHR_LIST__ENTRIES;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
