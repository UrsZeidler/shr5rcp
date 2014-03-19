/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.AttributeChange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AttributeChangeItemProvider extends PersonaValueChangeItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public AttributeChangeItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addAttibutePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Attibute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addAttibutePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(// createItemPropertyDescriptor
                new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                        getString("_UI_AttributeChange_attibute_feature"), getString("_UI_PropertyDescriptor_description",
                                "_UI_AttributeChange_attibute_feature", "_UI_AttributeChange_type"),
                        Shr5managementPackage.Literals.ATTRIBUTE_CHANGE__ATTIBUTE, true, false, true, null, null, null) {

                    @Override
                    public Collection<?> getChoiceOfValues(Object object) {
                        AttributeChange ac = (AttributeChange)object;
                        ManagedCharacter character = ac.getCharacter();
                        if (character != null && character.getPersona() != null) {
                            List<EAttribute> list = new ArrayList<EAttribute>();
                            list.addAll(Shr5Package.Literals.ABSTRAKT_PERSONA.getEAttributes());
                            list.remove(Shr5Package.Literals.ABSTRAKT_PERSONA__MOD_MANAGER);
                            if (character.getPersona() instanceof BaseMagischePersona) {
                                list.add(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS);
                            } else if (character.getPersona() instanceof Technomancer) {
                                list.add(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS);
                            }
                            return list;
                        }
                        return super.getChoiceOfValues(object);
                    }
                });
    }

    /**
     * This returns AttributeChange.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeChange"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    @Override
    public String getText(Object object) {
        AttributeChange attributeChange = (AttributeChange)object;

        ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String labelValue = "";
        if (factory != null && attributeChange.getAttibute() != null) {
            IItemLabelProvider labelprovider = (IItemLabelProvider)factory.adapt(attributeChange.getAttibute(), IItemLabelProvider.class);
            if (labelprovider != null)
                labelValue = labelprovider.getText(attributeChange.getAttibute()) + " " + attributeChange.getFrom() + "->" + attributeChange.getTo();
        }

        // Date labelValue = attributeChange.getDate();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? getString("_UI_AttributeChange_type") : getString("_UI_AttributeChange_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
