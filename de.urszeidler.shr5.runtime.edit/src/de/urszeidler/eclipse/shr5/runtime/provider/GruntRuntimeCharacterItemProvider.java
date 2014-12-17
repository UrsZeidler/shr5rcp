/**
 */
package de.urszeidler.eclipse.shr5.runtime.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GruntRuntimeCharacterItemProvider
    extends RuntimeCharacterItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntRuntimeCharacterItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
    }

    /**
     * This returns GruntRuntimeCharacter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public Object getImage(Object object) {
        
        GruntRuntimeCharacter character = (GruntRuntimeCharacter)object;
        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory();
        if (factory != null && character.getCharacter() != null) {
            IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(character.getCharacter(),
                    IItemLabelProvider.class);
            if (labelprovider != null)
                return labelprovider.getImage(character.getCharacter());
        }

        
        return overlayImage(object, getResourceLocator().getImage("full/obj16/GruntRuntimeCharacter"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        GruntRuntimeCharacter character = (GruntRuntimeCharacter)object;
        ComposeableAdapterFactory factory = ((RuntimeItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String labelValue = "";
        if (factory != null && character.getCharacter() != null) {
            IItemLabelProvider labelprovider = (IItemLabelProvider)factory.adapt(character.getCharacter(), IItemLabelProvider.class);
            if (labelprovider != null)
                labelValue = labelprovider.getText(character.getCharacter());
        }
        String label = null;
        if(character!=null&&character.getCharacter()!=null&&character.getCharacter().getGeneratorSrc()!=null)
            label = labelValue == null ? null : character.getCharacter().getGeneratorSrc().getCharacterName();

        return label == null || label.length() == 0 ?
            getString("_UI_GruntRuntimeCharacter_type") :
            getString("_UI_GruntRuntimeCharacter_type") + " " + label;
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
