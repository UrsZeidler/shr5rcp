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
import de.urszeidler.eclipse.shr5.Sprite;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Sprite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpriteItemProvider
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
	public SpriteItemProvider(AdapterFactory adapterFactory) {
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

            addMatrixZustandMaxPropertyDescriptor(object);
            addGeraetestufePropertyDescriptor(object);
            addFirewallPropertyDescriptor(object);
            addDatenverarbeitungPropertyDescriptor(object);
            addCurrentModusPropertyDescriptor(object);
            addAngriffPropertyDescriptor(object);
            addSchleicherPropertyDescriptor(object);
            addResonanzPropertyDescriptor(object);
            addResonanzBasisPropertyDescriptor(object);
            addBeschreibungPropertyDescriptor(object);
            addImagePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addParentIdPropertyDescriptor(object);
            addPagePropertyDescriptor(object);
            addSrcBookPropertyDescriptor(object);
            addStufePropertyDescriptor(object);
            addAngriffModPropertyDescriptor(object);
            addSchleicherModPropertyDescriptor(object);
            addDatenverarbeitungModPropertyDescriptor(object);
            addFirewallModPropertyDescriptor(object);
            addInitativeModPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Matrix Zustand Max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMatrixZustandMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatixConditionMonitor_matrixZustandMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatixConditionMonitor_matrixZustandMax_feature", "_UI_MatixConditionMonitor_type"),
                 Shr5Package.Literals.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Resonanz feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addResonanzPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResonanzPersona_resonanz_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResonanzPersona_resonanz_feature", "_UI_ResonanzPersona_type"),
                 Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Geraetestufe feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addGeraetestufePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatrixAttributes_geraetestufe_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatrixAttributes_geraetestufe_feature", "_UI_MatrixAttributes_type"),
                 Shr5Package.Literals.MATRIX_ATTRIBUTES__GERAETESTUFE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Angriff feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAngriffPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ActiveMatixDevice_angriff_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ActiveMatixDevice_angriff_feature", "_UI_ActiveMatixDevice_type"),
                 Shr5Package.Literals.ACTIVE_MATIX_DEVICE__ANGRIFF,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Schleicher feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addSchleicherPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ActiveMatixDevice_schleicher_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ActiveMatixDevice_schleicher_feature", "_UI_ActiveMatixDevice_type"),
                 Shr5Package.Literals.ACTIVE_MATIX_DEVICE__SCHLEICHER,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Datenverarbeitung feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addDatenverarbeitungPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatrixAttributes_datenverarbeitung_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatrixAttributes_datenverarbeitung_feature", "_UI_MatrixAttributes_type"),
                 Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Current Modus feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentModusPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatrixAttributes_currentModus_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatrixAttributes_currentModus_feature", "_UI_MatrixAttributes_type"),
                 Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Firewall feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addFirewallPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatrixAttributes_firewall_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatrixAttributes_firewall_feature", "_UI_MatrixAttributes_type"),
                 Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Resonanz Basis feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addResonanzBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ResonanzPersona_resonanzBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ResonanzPersona_resonanzBasis_feature", "_UI_ResonanzPersona_type"),
                 Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS,
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
                 getString("_UI_Sprite_stufe_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_stufe_feature", "_UI_Sprite_type"),
                 Shr5Package.Literals.SPRITE__STUFE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Angriff Mod feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addAngriffModPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Sprite_angriffMod_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_angriffMod_feature", "_UI_Sprite_type"),
                 Shr5Package.Literals.SPRITE__ANGRIFF_MOD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Schleicher Mod feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addSchleicherModPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Sprite_schleicherMod_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_schleicherMod_feature", "_UI_Sprite_type"),
                 Shr5Package.Literals.SPRITE__SCHLEICHER_MOD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Datenverarbeitung Mod feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addDatenverarbeitungModPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Sprite_datenverarbeitungMod_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_datenverarbeitungMod_feature", "_UI_Sprite_type"),
                 Shr5Package.Literals.SPRITE__DATENVERARBEITUNG_MOD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Firewall Mod feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addFirewallModPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Sprite_firewallMod_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_firewallMod_feature", "_UI_Sprite_type"),
                 Shr5Package.Literals.SPRITE__FIREWALL_MOD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Initative Mod feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addInitativeModPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Sprite_initativeMod_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Sprite_initativeMod_feature", "_UI_Sprite_type"),
                 Shr5Package.Literals.SPRITE__INITATIVE_MOD,
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
            childrenFeatures.add(Shr5Package.Literals.IDENTIFIABLE__LOCALIZATIONS);
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
     * This returns Sprite.gif.
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

        return overlayImage(object, getResourceLocator().getImage("full/obj16/Sprite"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((Sprite)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Sprite_type") :
            getString("_UI_Sprite_type") + " " + label;
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

        switch (notification.getFeatureID(Sprite.class)) {
            case Shr5Package.SPRITE__MATRIX_ZUSTAND_MAX:
            case Shr5Package.SPRITE__GERAETESTUFE:
            case Shr5Package.SPRITE__FIREWALL:
            case Shr5Package.SPRITE__DATENVERARBEITUNG:
            case Shr5Package.SPRITE__CURRENT_MODUS:
            case Shr5Package.SPRITE__ANGRIFF:
            case Shr5Package.SPRITE__SCHLEICHER:
            case Shr5Package.SPRITE__RESONANZ:
            case Shr5Package.SPRITE__RESONANZ_BASIS:
            case Shr5Package.SPRITE__BESCHREIBUNG:
            case Shr5Package.SPRITE__IMAGE:
            case Shr5Package.SPRITE__NAME:
            case Shr5Package.SPRITE__PARENT_ID:
            case Shr5Package.SPRITE__PAGE:
            case Shr5Package.SPRITE__STUFE:
            case Shr5Package.SPRITE__ANGRIFF_MOD:
            case Shr5Package.SPRITE__SCHLEICHER_MOD:
            case Shr5Package.SPRITE__DATENVERARBEITUNG_MOD:
            case Shr5Package.SPRITE__FIREWALL_MOD:
            case Shr5Package.SPRITE__INITATIVE_MOD:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.SPRITE__LOCALIZATIONS:
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
