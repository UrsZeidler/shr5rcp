/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
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

import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.ManagedCharacter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagedCharacterItemProvider
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
	public ManagedCharacterItemProvider(AdapterFactory adapterFactory) {
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

            addChracterSourcePropertyDescriptor(object);
            addChoosenLifestylePropertyDescriptor(object);
            addNativeLanguagePropertyDescriptor(object);
            addSexPropertyDescriptor(object);
            addStreetCredPropertyDescriptor(object);
            addNotorietyPropertyDescriptor(object);
            addNotorietyBasicPropertyDescriptor(object);
            addPublicAwarenessPropertyDescriptor(object);
            addKarmaGaintPropertyDescriptor(object);
            addCurrentKarmaPropertyDescriptor(object);
            addHeightPropertyDescriptor(object);
            addDateofbirthPropertyDescriptor(object);
            addWeightPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Chracter Source feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addChracterSourcePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_chracterSource_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ManagedCharacter_chracterSource_feature", "_UI_ManagedCharacter_type"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__CHRACTER_SOURCE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Sex feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addSexPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_sex_feature"),
                 getString("_UI_ManagedCharacter_sex_description"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__SEX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Choosen Lifestyle feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated not
     */
	protected void addChoosenLifestylePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (//createItemPropertyDescriptor
                    new ItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_choosenLifestyle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ManagedCharacter_choosenLifestyle_feature", "_UI_ManagedCharacter_type"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                        public Collection<?> getChoiceOfValues(Object object) {
                            ArrayList<Lifestyle> list = new ArrayList<Lifestyle>();
                            EList<Vertrag> contracts = ((ManagedCharacter)object).getContracts();
                            for (Vertrag vertrag : contracts) {
                                if (vertrag instanceof Lifestyle) {
                                    list.add((Lifestyle)vertrag);
                                }
                            }                            
                            return list;
                        }
                    });
                  
    }

	/**
     * This adds a property descriptor for the Native Language feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addNativeLanguagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_nativeLanguage_feature"),
                 getString("_UI_ManagedCharacter_nativeLanguage_description"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__NATIVE_LANGUAGE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Street Cred feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addStreetCredPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_streetCred_feature"),
                 getString("_UI_ManagedCharacter_streetCred_description"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__STREET_CRED,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Notoriety feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addNotorietyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_notoriety_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ManagedCharacter_notoriety_feature", "_UI_ManagedCharacter_type"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__NOTORIETY,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Notoriety Basic feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addNotorietyBasicPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_notorietyBasic_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ManagedCharacter_notorietyBasic_feature", "_UI_ManagedCharacter_type"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__NOTORIETY_BASIC,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Public Awareness feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addPublicAwarenessPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_publicAwareness_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ManagedCharacter_publicAwareness_feature", "_UI_ManagedCharacter_type"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__PUBLIC_AWARENESS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Karma Gaint feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKarmaGaintPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_karmaGaint_feature"),
                 getString("_UI_ManagedCharacter_karmaGaint_description"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__KARMA_GAINT,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Current Karma feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentKarmaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_currentKarma_feature"),
                 getString("_UI_ManagedCharacter_currentKarma_description"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__CURRENT_KARMA,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Height feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeightPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_height_feature"),
                 getString("_UI_ManagedCharacter_height_description"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__HEIGHT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Dateofbirth feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDateofbirthPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_dateofbirth_feature"),
                 getString("_UI_ManagedCharacter_dateofbirth_description"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__DATEOFBIRTH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Weight feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWeightPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ManagedCharacter_weight_feature"),
                 getString("_UI_ManagedCharacter_weight_description"),
                 Shr5managementPackage.Literals.MANAGED_CHARACTER__WEIGHT,
                 true,
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
            childrenFeatures.add(Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA);
            childrenFeatures.add(Shr5managementPackage.Literals.MANAGED_CHARACTER__CHANGES);
            childrenFeatures.add(Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR);
            childrenFeatures.add(Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS);
            childrenFeatures.add(Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS);
            childrenFeatures.add(Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS);
            childrenFeatures.add(Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC);
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
        Sex labelValue = ((ManagedCharacter)object).getSex();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
            getString("_UI_ManagedCharacter_type") :
            getString("_UI_ManagedCharacter_type") + " " + label;
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

        switch (notification.getFeatureID(ManagedCharacter.class)) {
            case Shr5managementPackage.MANAGED_CHARACTER__SEX:
            case Shr5managementPackage.MANAGED_CHARACTER__STREET_CRED:
            case Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY:
            case Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY_BASIC:
            case Shr5managementPackage.MANAGED_CHARACTER__PUBLIC_AWARENESS:
            case Shr5managementPackage.MANAGED_CHARACTER__KARMA_GAINT:
            case Shr5managementPackage.MANAGED_CHARACTER__CURRENT_KARMA:
            case Shr5managementPackage.MANAGED_CHARACTER__HEIGHT:
            case Shr5managementPackage.MANAGED_CHARACTER__DATEOFBIRTH:
            case Shr5managementPackage.MANAGED_CHARACTER__WEIGHT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__PERSONA:
            case Shr5managementPackage.MANAGED_CHARACTER__CHANGES:
            case Shr5managementPackage.MANAGED_CHARACTER__INVENTAR:
            case Shr5managementPackage.MANAGED_CHARACTER__CONTRACTS:
            case Shr5managementPackage.MANAGED_CHARACTER__CONNECTIONS:
            case Shr5managementPackage.MANAGED_CHARACTER__VEHICELS:
            case Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC:
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
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                 Shr5Factory.eINSTANCE.createMudanPersona()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                 Shr5Factory.eINSTANCE.createKiAdept()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                 Shr5Factory.eINSTANCE.createMagier()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                 Shr5Factory.eINSTANCE.createMysticAdept()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                 Shr5Factory.eINSTANCE.createAspektMagier()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                 Shr5Factory.eINSTANCE.createTechnomancer()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CHANGES,
                 Shr5managementFactory.eINSTANCE.createKarmaGaint()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CHANGES,
                 Shr5managementFactory.eINSTANCE.createAttributeChange()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CHANGES,
                 Shr5managementFactory.eINSTANCE.createPersonaChange()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createGegenstand()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createNahkampfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createFeuerwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createWurfwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createProjektilwaffe()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createKleidung()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createCredstick()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createMunition()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createCommlink()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createCyberdeck()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createRiggerCommandConsole()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createQiFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createWaffenFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createMagieFokus()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createMagazin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createDefaultWifi()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR,
                 Shr5Factory.eINSTANCE.createSubstanceContainer()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS,
                 Shr5Factory.eINSTANCE.createVertrag()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS,
                 Shr5Factory.eINSTANCE.createIntervallVertrag()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS,
                 Shr5Factory.eINSTANCE.createLifestyle()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS,
                 Shr5Factory.eINSTANCE.createSin()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS,
                 Shr5Factory.eINSTANCE.createLizenz()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS,
                 Shr5managementFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS,
                 Shr5Factory.eINSTANCE.createPassagierFahrzeug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS,
                 Shr5Factory.eINSTANCE.createBodenfahrzeug()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS,
                 Shr5Factory.eINSTANCE.createDrohne()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC,
                 Shr5managementFactory.eINSTANCE.createFreeStyleGenerator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC,
                 Shr5managementFactory.eINSTANCE.createShr5Generator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC,
                 Shr5managementFactory.eINSTANCE.createSumToTenGenerator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC,
                 Shr5managementFactory.eINSTANCE.createLifeModulesGenerator()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.MANAGED_CHARACTER__GENERATOR_SRC,
                 Shr5managementFactory.eINSTANCE.createShr5KarmaGenerator()));
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
