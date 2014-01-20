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
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Spezies} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpeziesItemProvider
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
	public SpeziesItemProvider(AdapterFactory adapterFactory) {
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
            addPagePropertyDescriptor(object);
            addSrcBookPropertyDescriptor(object);
            addKonstitutionMinPropertyDescriptor(object);
            addGeschicklichkeitMinPropertyDescriptor(object);
            addReaktionMinPropertyDescriptor(object);
            addStaerkeMinPropertyDescriptor(object);
            addCharismaMinPropertyDescriptor(object);
            addWillenskraftMinPropertyDescriptor(object);
            addIntuitionMinPropertyDescriptor(object);
            addLogikMinPropertyDescriptor(object);
            addEdgeMinPropertyDescriptor(object);
            addMagieMinPropertyDescriptor(object);
            addResonanzMinPropertyDescriptor(object);
            addEssenzMinPropertyDescriptor(object);
            addKonstitutionMaxPropertyDescriptor(object);
            addGeschicklichkeitMaxPropertyDescriptor(object);
            addReaktionMaxPropertyDescriptor(object);
            addStaerkeMaxPropertyDescriptor(object);
            addCharismaMaxPropertyDescriptor(object);
            addWillenskraftMaxPropertyDescriptor(object);
            addIntuitionMaxPropertyDescriptor(object);
            addLogikMaxPropertyDescriptor(object);
            addEdgeMaxPropertyDescriptor(object);
            addMagieMaxPropertyDescriptor(object);
            addResonanzMaxPropertyDescriptor(object);
            addEssenzMaxPropertyDescriptor(object);
            addLaufenPropertyDescriptor(object);
            addRennenPropertyDescriptor(object);
            addSprintenPropertyDescriptor(object);
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
     * This adds a property descriptor for the Konstitution Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKonstitutionMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_konstitutionMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_konstitutionMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__KONSTITUTION_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Geschicklichkeit Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addGeschicklichkeitMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_geschicklichkeitMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_geschicklichkeitMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Reaktion Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addReaktionMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_reaktionMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_reaktionMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__REAKTION_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Staerke Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addStaerkeMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_staerkeMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_staerkeMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__STAERKE_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Charisma Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCharismaMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_charismaMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_charismaMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__CHARISMA_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Willenskraft Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addWillenskraftMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_willenskraftMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_willenskraftMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Intuition Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addIntuitionMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_intuitionMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_intuitionMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__INTUITION_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Logik Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addLogikMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_logikMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_logikMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__LOGIK_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Edge Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addEdgeMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_edgeMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_edgeMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__EDGE_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Magie Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addMagieMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_magieMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_magieMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__MAGIE_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Resonanz Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addResonanzMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_resonanzMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_resonanzMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__RESONANZ_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Essenz Min feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addEssenzMinPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_essenzMin_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_essenzMin_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__ESSENZ_MIN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Konstitution Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKonstitutionMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_konstitutionMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_konstitutionMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__KONSTITUTION_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Geschicklichkeit Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addGeschicklichkeitMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_geschicklichkeitMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_geschicklichkeitMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Reaktion Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addReaktionMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_reaktionMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_reaktionMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__REAKTION_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Staerke Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addStaerkeMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_staerkeMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_staerkeMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__STAERKE_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Charisma Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCharismaMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_charismaMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_charismaMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__CHARISMA_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Willenskraft Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addWillenskraftMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_willenskraftMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_willenskraftMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Intuition Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addIntuitionMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_intuitionMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_intuitionMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__INTUITION_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Logik Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addLogikMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_logikMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_logikMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__LOGIK_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Edge Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addEdgeMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_edgeMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_edgeMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__EDGE_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Magie Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addMagieMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_magieMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_magieMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__MAGIE_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Resonanz Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addResonanzMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_resonanzMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_resonanzMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__RESONANZ_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Essenz Max feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addEssenzMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_essenzMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_essenzMax_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__ESSENZ_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Laufen feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addLaufenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_laufen_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_laufen_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__LAUFEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Rennen feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addRennenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_rennen_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_rennen_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__RENNEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Sprinten feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addSprintenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Spezies_sprinten_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Spezies_sprinten_feature", "_UI_Spezies_type"),
                 Shr5Package.Literals.SPEZIES__SPRINTEN,
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
            childrenFeatures.add(Shr5Package.Literals.MODIFIZIERBAR__MODS);
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
	 * This returns Spezies.gif.
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Spezies"));
	}

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((Spezies)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Spezies_type") :
            getString("_UI_Spezies_type") + " " + label;
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

        switch (notification.getFeatureID(Spezies.class)) {
            case Shr5Package.SPEZIES__BESCHREIBUNG:
            case Shr5Package.SPEZIES__IMAGE:
            case Shr5Package.SPEZIES__NAME:
            case Shr5Package.SPEZIES__PAGE:
            case Shr5Package.SPEZIES__KONSTITUTION_MIN:
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MIN:
            case Shr5Package.SPEZIES__REAKTION_MIN:
            case Shr5Package.SPEZIES__STAERKE_MIN:
            case Shr5Package.SPEZIES__CHARISMA_MIN:
            case Shr5Package.SPEZIES__WILLENSKRAFT_MIN:
            case Shr5Package.SPEZIES__INTUITION_MIN:
            case Shr5Package.SPEZIES__LOGIK_MIN:
            case Shr5Package.SPEZIES__EDGE_MIN:
            case Shr5Package.SPEZIES__MAGIE_MIN:
            case Shr5Package.SPEZIES__RESONANZ_MIN:
            case Shr5Package.SPEZIES__ESSENZ_MIN:
            case Shr5Package.SPEZIES__KONSTITUTION_MAX:
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MAX:
            case Shr5Package.SPEZIES__REAKTION_MAX:
            case Shr5Package.SPEZIES__STAERKE_MAX:
            case Shr5Package.SPEZIES__CHARISMA_MAX:
            case Shr5Package.SPEZIES__WILLENSKRAFT_MAX:
            case Shr5Package.SPEZIES__INTUITION_MAX:
            case Shr5Package.SPEZIES__LOGIK_MAX:
            case Shr5Package.SPEZIES__EDGE_MAX:
            case Shr5Package.SPEZIES__MAGIE_MAX:
            case Shr5Package.SPEZIES__RESONANZ_MAX:
            case Shr5Package.SPEZIES__ESSENZ_MAX:
            case Shr5Package.SPEZIES__LAUFEN:
            case Shr5Package.SPEZIES__RENNEN:
            case Shr5Package.SPEZIES__SPRINTEN:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.SPEZIES__MODS:
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
                (Shr5Package.Literals.MODIFIZIERBAR__MODS,
                 Shr5Factory.eINSTANCE.createAttributModifikatorWert()));
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
