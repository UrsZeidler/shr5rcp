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

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.AbstraktPersona} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstraktPersonaItemProvider
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
	public AbstraktPersonaItemProvider(AdapterFactory adapterFactory) {
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
            addKonstitutionPropertyDescriptor(object);
            addGeschicklichkeitPropertyDescriptor(object);
            addReaktionPropertyDescriptor(object);
            addStaerkePropertyDescriptor(object);
            addInitativePropertyDescriptor(object);
            addInitativWuerfelPropertyDescriptor(object);
            addAusweichenPropertyDescriptor(object);
            addEssenzPropertyDescriptor(object);
            addEdgeBasisPropertyDescriptor(object);
            addEdgePropertyDescriptor(object);
            addCharismaPropertyDescriptor(object);
            addWillenskraftPropertyDescriptor(object);
            addIntuitionPropertyDescriptor(object);
            addLogikPropertyDescriptor(object);
            addKoerperlichPropertyDescriptor(object);
            addGeistigPropertyDescriptor(object);
            addSozialPropertyDescriptor(object);
            addKonstitutionBasisPropertyDescriptor(object);
            addGeschicklichkeitBasisPropertyDescriptor(object);
            addReaktionBasisPropertyDescriptor(object);
            addStaerkeBasisPropertyDescriptor(object);
            addCharismaBasisPropertyDescriptor(object);
            addWillenskraftBasisPropertyDescriptor(object);
            addIntuitionBasisPropertyDescriptor(object);
            addLogikBasisPropertyDescriptor(object);
            addSpeziesPropertyDescriptor(object);
            addModManagerPropertyDescriptor(object);
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
     * This adds a property descriptor for the Konstitution feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKonstitutionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KoerperlicheAttribute_konstitution_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KoerperlicheAttribute_konstitution_feature", "_UI_KoerperlicheAttribute_type"),
                 Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Geschicklichkeit feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addGeschicklichkeitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KoerperlicheAttribute_geschicklichkeit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KoerperlicheAttribute_geschicklichkeit_feature", "_UI_KoerperlicheAttribute_type"),
                 Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Reaktion feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addReaktionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KoerperlicheAttribute_reaktion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KoerperlicheAttribute_reaktion_feature", "_UI_KoerperlicheAttribute_type"),
                 Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Staerke feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addStaerkePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KoerperlicheAttribute_staerke_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KoerperlicheAttribute_staerke_feature", "_UI_KoerperlicheAttribute_type"),
                 Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Initative feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addInitativePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SpezielleAttribute_initative_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SpezielleAttribute_initative_feature", "_UI_SpezielleAttribute_type"),
                 Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Initativ Wuerfel feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addInitativWuerfelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SpezielleAttribute_initativWuerfel_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SpezielleAttribute_initativWuerfel_feature", "_UI_SpezielleAttribute_type"),
                 Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Ausweichen feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAusweichenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SpezielleAttribute_ausweichen_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SpezielleAttribute_ausweichen_feature", "_UI_SpezielleAttribute_type"),
                 Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Essenz feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addEssenzPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SpezielleAttribute_essenz_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SpezielleAttribute_essenz_feature", "_UI_SpezielleAttribute_type"),
                 Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Edge Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addEdgeBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SpezielleAttribute_edgeBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SpezielleAttribute_edgeBasis_feature", "_UI_SpezielleAttribute_type"),
                 Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Edge feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addEdgePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SpezielleAttribute_edge_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SpezielleAttribute_edge_feature", "_UI_SpezielleAttribute_type"),
                 Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Charisma feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCharismaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GeistigeAttribute_charisma_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GeistigeAttribute_charisma_feature", "_UI_GeistigeAttribute_type"),
                 Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Willenskraft feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addWillenskraftPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GeistigeAttribute_willenskraft_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GeistigeAttribute_willenskraft_feature", "_UI_GeistigeAttribute_type"),
                 Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Intuition feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addIntuitionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GeistigeAttribute_intuition_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GeistigeAttribute_intuition_feature", "_UI_GeistigeAttribute_type"),
                 Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Logik feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addLogikPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GeistigeAttribute_logik_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GeistigeAttribute_logik_feature", "_UI_GeistigeAttribute_type"),
                 Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Koerperlich feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKoerperlichPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ChrakterLimits_koerperlich_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ChrakterLimits_koerperlich_feature", "_UI_ChrakterLimits_type"),
                 Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Geistig feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addGeistigPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ChrakterLimits_geistig_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ChrakterLimits_geistig_feature", "_UI_ChrakterLimits_type"),
                 Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Sozial feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addSozialPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ChrakterLimits_sozial_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ChrakterLimits_sozial_feature", "_UI_ChrakterLimits_type"),
                 Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Konstitution Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKonstitutionBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_konstitutionBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_konstitutionBasis_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Geschicklichkeit Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addGeschicklichkeitBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_geschicklichkeitBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_geschicklichkeitBasis_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Reaktion Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addReaktionBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_reaktionBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_reaktionBasis_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Staerke Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addStaerkeBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_staerkeBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_staerkeBasis_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__STAERKE_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Charisma Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCharismaBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_charismaBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_charismaBasis_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__CHARISMA_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Willenskraft Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addWillenskraftBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_willenskraftBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_willenskraftBasis_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Intuition Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addIntuitionBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_intuitionBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_intuitionBasis_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__INTUITION_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Logik Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addLogikBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_logikBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_logikBasis_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__LOGIK_BASIS,
                 true,
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
                 getString("_UI_AbstraktPersona_spezies_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_spezies_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__SPEZIES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Mod Manager feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addModManagerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstraktPersona_modManager_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstraktPersona_modManager_feature", "_UI_AbstraktPersona_type"),
                 Shr5Package.Literals.ABSTRAKT_PERSONA__MOD_MANAGER,
                 false,
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
            childrenFeatures.add(Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN);
            childrenFeatures.add(Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN);
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
        String label = ((AbstraktPersona)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_AbstraktPersona_type") :
            getString("_UI_AbstraktPersona_type") + " " + label;
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

        switch (notification.getFeatureID(AbstraktPersona.class)) {
            case Shr5Package.ABSTRAKT_PERSONA__BESCHREIBUNG:
            case Shr5Package.ABSTRAKT_PERSONA__IMAGE:
            case Shr5Package.ABSTRAKT_PERSONA__NAME:
            case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION:
            case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT:
            case Shr5Package.ABSTRAKT_PERSONA__REAKTION:
            case Shr5Package.ABSTRAKT_PERSONA__STAERKE:
            case Shr5Package.ABSTRAKT_PERSONA__INITATIVE:
            case Shr5Package.ABSTRAKT_PERSONA__INITATIV_WUERFEL:
            case Shr5Package.ABSTRAKT_PERSONA__AUSWEICHEN:
            case Shr5Package.ABSTRAKT_PERSONA__ESSENZ:
            case Shr5Package.ABSTRAKT_PERSONA__EDGE_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__EDGE:
            case Shr5Package.ABSTRAKT_PERSONA__CHARISMA:
            case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT:
            case Shr5Package.ABSTRAKT_PERSONA__INTUITION:
            case Shr5Package.ABSTRAKT_PERSONA__LOGIK:
            case Shr5Package.ABSTRAKT_PERSONA__KOERPERLICH:
            case Shr5Package.ABSTRAKT_PERSONA__GEISTIG:
            case Shr5Package.ABSTRAKT_PERSONA__SOZIAL:
            case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__REAKTION_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__STAERKE_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__CHARISMA_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__INTUITION_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__LOGIK_BASIS:
            case Shr5Package.ABSTRAKT_PERSONA__MOD_MANAGER:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITEN:
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN:
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
                (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN,
                 Shr5Factory.eINSTANCE.createPersonaFertigkeit()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN,
                 Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe()));
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
