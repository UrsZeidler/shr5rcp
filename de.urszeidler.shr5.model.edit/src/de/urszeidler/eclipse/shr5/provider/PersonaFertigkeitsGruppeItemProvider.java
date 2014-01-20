/**
 */
package de.urszeidler.eclipse.shr5.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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

import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * This is the item provider adapter for a
 * {@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PersonaFertigkeitsGruppeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PersonaFertigkeitsGruppeItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addGruppePropertyDescriptor(object);
            addStufePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
	 * This adds a property descriptor for the Gruppe feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addGruppePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PersonaFertigkeitsGruppe_gruppe_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PersonaFertigkeitsGruppe_gruppe_feature", "_UI_PersonaFertigkeitsGruppe_type"),
                 Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
	 * This adds a property descriptor for the Stufe feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStufePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PersonaFertigkeitsGruppe_stufe_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PersonaFertigkeitsGruppe_stufe_feature", "_UI_PersonaFertigkeitsGruppe_type"),
                 Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE__STUFE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
	 * This returns PersonaFertigkeitsGruppe.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public Object getImage(Object object) {
		PersonaFertigkeitsGruppe personaFertigkeitsGruppe = (PersonaFertigkeitsGruppe) object;

		ComposeableAdapterFactory factory = ((Shr5ItemProviderAdapterFactory) this.adapterFactory).getRootAdapterFactory();
		if (factory != null && personaFertigkeitsGruppe.getGruppe() != null) {
			IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(personaFertigkeitsGruppe.getGruppe(),
					IItemLabelProvider.class);
			if (labelprovider != null)
				return labelprovider.getImage(personaFertigkeitsGruppe.getGruppe());
		}

		return overlayImage(object, getResourceLocator().getImage("full/obj16/PersonaFertigkeitsGruppe"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		PersonaFertigkeitsGruppe personaFertigkeitsGruppe = (PersonaFertigkeitsGruppe) object;

		ComposeableAdapterFactory factory = ((Shr5ItemProviderAdapterFactory) this.adapterFactory).getRootAdapterFactory();
		String fertigkeitName = "";
		if (factory != null && personaFertigkeitsGruppe.getGruppe() != null) {
			IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(personaFertigkeitsGruppe.getGruppe(),
					IItemLabelProvider.class);
			if (labelprovider != null)
				fertigkeitName = labelprovider.getText(personaFertigkeitsGruppe.getGruppe()) + " : ";
		}
		return fertigkeitName + personaFertigkeitsGruppe.getStufe();
	}

	/**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	@Override
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(PersonaFertigkeitsGruppe.class)) {
            case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__STUFE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
        return Shr5EditPlugin.INSTANCE;
    }

}
