/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


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

import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FreeStyleGeneratorItemProvider
	extends CharacterGeneratorItemProvider
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
	public FreeStyleGeneratorItemProvider(AdapterFactory adapterFactory) {
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

            addFreestyleGeneratorPropertyDescriptor(object);
            addSelectedPersonaPropertyDescriptor(object);
            addSelectedSpeciesPropertyDescriptor(object);
            addSelectedTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Freestyle Generator feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addFreestyleGeneratorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FreeStyleGenerator_freestyleGenerator_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FreeStyleGenerator_freestyleGenerator_feature", "_UI_FreeStyleGenerator_type"),
                 Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__FREESTYLE_GENERATOR,
                 false,
                 false,
                 false,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Selected Persona feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelectedPersonaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FreeStyleGenerator_selectedPersona_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FreeStyleGenerator_selectedPersona_feature", "_UI_FreeStyleGenerator_type"),
                 Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_PERSONA,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Selected Species feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelectedSpeciesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FreeStyleGenerator_selectedSpecies_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FreeStyleGenerator_selectedSpecies_feature", "_UI_FreeStyleGenerator_type"),
                 Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_SPECIES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Selected Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSelectedTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_FreeStyleGenerator_selectedType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_FreeStyleGenerator_selectedType_feature", "_UI_FreeStyleGenerator_type"),
                 Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_TYPE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns FreeStyleGenerator.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated not
     */
	@Override
	public Object getImage(Object object) {
	       FreeStyleGenerator pc = (FreeStyleGenerator) object;

	        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory();
	        if (factory != null && pc.getCharacter() != null) {
	            IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(pc.getCharacter(),
	                    IItemLabelProvider.class);
	            if (labelprovider != null)
	                return labelprovider.getImage(pc.getCharacter());
	        }

        return overlayImage(object, getResourceLocator().getImage("full/obj16/FreeStyleGenerator"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((FreeStyleGenerator)object).getCharacterName();
        return label == null || label.length() == 0 ?
            getString("_UI_FreeStyleGenerator_type") :
            getString("_UI_FreeStyleGenerator_type") + " " + label;
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
