/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.provider;


import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

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
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Geist} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeistItemProvider
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

            addParentIdPropertyDescriptor(object);
            addPagePropertyDescriptor(object);
            addSrcBookPropertyDescriptor(object);
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
            addKonstitutionPropertyDescriptor(object);
            addGeschicklichkeitPropertyDescriptor(object);
            addReaktionPropertyDescriptor(object);
            addStaerkePropertyDescriptor(object);
            addBeschreibungPropertyDescriptor(object);
            addImagePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addKoerperlichPropertyDescriptor(object);
            addGeistigPropertyDescriptor(object);
            addSozialPropertyDescriptor(object);
            addPanzerPropertyDescriptor(object);
            addStufePropertyDescriptor(object);
            addSkillGroupsPropertyDescriptor(object);
            addSkillsPropertyDescriptor(object);
            addAstralesLimitPropertyDescriptor(object);
            addAstraleKonstitutionPropertyDescriptor(object);
            addAstraleGeschicklichkeitPropertyDescriptor(object);
            addAstraleReaktionPropertyDescriptor(object);
            addAstraleStaerkePropertyDescriptor(object);
            addAstraleInitativePropertyDescriptor(object);
            addAstraleInitativWuerfelPropertyDescriptor(object);
            addAstralePanzerungPropertyDescriptor(object);
            addKonstitutionBasisPropertyDescriptor(object);
            addGeschicklichkeitBasisPropertyDescriptor(object);
            addReaktionBasisPropertyDescriptor(object);
            addStaerkeBasisPropertyDescriptor(object);
            addCharismaBasisPropertyDescriptor(object);
            addWillenskraftBasisPropertyDescriptor(object);
            addIntuitionBasisPropertyDescriptor(object);
            addLogikBasisPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 true,
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
                 true,
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
                 true,
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
     * This adds a property descriptor for the Panzer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPanzerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Panzerung_panzer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Panzerung_panzer_feature", "_UI_Panzerung_type"),
                 Shr5Package.Literals.PANZERUNG__PANZER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
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
                 getString("_UI_StufenPersona_stufe_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_StufenPersona_stufe_feature", "_UI_StufenPersona_type"),
                 Shr5Package.Literals.STUFEN_PERSONA__STUFE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Skill Groups feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSkillGroupsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_StufenPersona_skillGroups_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_StufenPersona_skillGroups_feature", "_UI_StufenPersona_type"),
                 Shr5Package.Literals.STUFEN_PERSONA__SKILL_GROUPS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Skills feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSkillsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_StufenPersona_skills_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_StufenPersona_skills_feature", "_UI_StufenPersona_type"),
                 Shr5Package.Literals.STUFEN_PERSONA__SKILLS,
                 true,
                 false,
                 true,
                 null,
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
                 getString("_UI_Geist_konstitutionBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_konstitutionBasis_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__KONSTITUTION_BASIS,
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
                 getString("_UI_Geist_geschicklichkeitBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_geschicklichkeitBasis_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__GESCHICKLICHKEIT_BASIS,
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
                 getString("_UI_Geist_reaktionBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_reaktionBasis_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__REAKTION_BASIS,
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
                 getString("_UI_Geist_staerkeBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_staerkeBasis_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__STAERKE_BASIS,
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
                 getString("_UI_Geist_charismaBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_charismaBasis_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__CHARISMA_BASIS,
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
                 getString("_UI_Geist_willenskraftBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_willenskraftBasis_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__WILLENSKRAFT_BASIS,
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
                 getString("_UI_Geist_intuitionBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_intuitionBasis_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__INTUITION_BASIS,
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
                 getString("_UI_Geist_logikBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Geist_logikBasis_feature", "_UI_Geist_type"),
                 Shr5Package.Literals.GEIST__LOGIK_BASIS,
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
            childrenFeatures.add(Shr5Package.Literals.GEIST__POWERS);
            childrenFeatures.add(Shr5Package.Literals.GEIST__OPTIONAL_POWERS);
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
            case Shr5Package.GEIST__PARENT_ID:
            case Shr5Package.GEIST__PAGE:
            case Shr5Package.GEIST__INITATIVE:
            case Shr5Package.GEIST__INITATIV_WUERFEL:
            case Shr5Package.GEIST__AUSWEICHEN:
            case Shr5Package.GEIST__ESSENZ:
            case Shr5Package.GEIST__EDGE_BASIS:
            case Shr5Package.GEIST__EDGE:
            case Shr5Package.GEIST__CHARISMA:
            case Shr5Package.GEIST__WILLENSKRAFT:
            case Shr5Package.GEIST__INTUITION:
            case Shr5Package.GEIST__LOGIK:
            case Shr5Package.GEIST__KONSTITUTION:
            case Shr5Package.GEIST__GESCHICKLICHKEIT:
            case Shr5Package.GEIST__REAKTION:
            case Shr5Package.GEIST__STAERKE:
            case Shr5Package.GEIST__BESCHREIBUNG:
            case Shr5Package.GEIST__IMAGE:
            case Shr5Package.GEIST__NAME:
            case Shr5Package.GEIST__KOERPERLICH:
            case Shr5Package.GEIST__GEISTIG:
            case Shr5Package.GEIST__SOZIAL:
            case Shr5Package.GEIST__PANZER:
            case Shr5Package.GEIST__STUFE:
            case Shr5Package.GEIST__ASTRALES_LIMIT:
            case Shr5Package.GEIST__ASTRALE_KONSTITUTION:
            case Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT:
            case Shr5Package.GEIST__ASTRALE_REAKTION:
            case Shr5Package.GEIST__ASTRALE_STAERKE:
            case Shr5Package.GEIST__ASTRALE_INITATIVE:
            case Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL:
            case Shr5Package.GEIST__ASTRALE_PANZERUNG:
            case Shr5Package.GEIST__KONSTITUTION_BASIS:
            case Shr5Package.GEIST__GESCHICKLICHKEIT_BASIS:
            case Shr5Package.GEIST__REAKTION_BASIS:
            case Shr5Package.GEIST__STAERKE_BASIS:
            case Shr5Package.GEIST__CHARISMA_BASIS:
            case Shr5Package.GEIST__WILLENSKRAFT_BASIS:
            case Shr5Package.GEIST__INTUITION_BASIS:
            case Shr5Package.GEIST__LOGIK_BASIS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.GEIST__POWERS:
            case Shr5Package.GEIST__OPTIONAL_POWERS:
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
                (Shr5Package.Literals.GEIST__POWERS,
                 Shr5Factory.eINSTANCE.createCritterKraft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.GEIST__OPTIONAL_POWERS,
                 Shr5Factory.eINSTANCE.createCritterKraft()));
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
            childFeature == Shr5Package.Literals.GEIST__POWERS ||
            childFeature == Shr5Package.Literals.GEIST__OPTIONAL_POWERS;

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
