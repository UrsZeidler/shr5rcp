/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import de.urszeidler.eclipse.shr5Management.ManagedCharacter;

/**
 * This is the item provider adapter for a
 * {@link de.urszeidler.eclipse.shr5Management.PlayerCharacter} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PlayerCharacterItemProvider extends ManagedCharacterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PlayerCharacterItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
    }

	/**
	 * This returns PlayerCharacter.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public Object getImage(Object object) {
		ManagedCharacter pc = (ManagedCharacter) object;

		ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory) this.adapterFactory).getRootAdapterFactory();
		if (factory != null && pc.getPersona() != null) {
			IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(pc.getPersona(),
					IItemLabelProvider.class);
			if (labelprovider != null)
				return labelprovider.getImage(pc.getPersona());
		}

		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlayerCharacter"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		ManagedCharacter pc = (ManagedCharacter)object;
		if(pc.getPersona()!=null){
			ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory) this.adapterFactory)
					.getRootAdapterFactory();
			IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(pc.getPersona(),
					IItemLabelProvider.class);

			if (labelprovider != null)
				return getString("_UI_PlayerCharacter_type")+" "+ labelprovider.getText(pc.getPersona()) ;

		}
		
		return getString("_UI_PlayerCharacter_type");
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

}
