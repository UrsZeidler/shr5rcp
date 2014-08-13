/**
 */
package de.urszeidler.eclipse.shr5.runtime.provider;


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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.provider.Shr5managementItemProviderAdapterFactory;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeCharacterItemProvider
    extends AbstractExtendetDataAwareItemProvider
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
    public RuntimeCharacterItemProvider(AdapterFactory adapterFactory) {
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

            addPhysicalDamagePropertyDescriptor(object);
            addMentalDamagePropertyDescriptor(object);
            addZustandPropertyDescriptor(object);
            addOverDeadPropertyDescriptor(object);
            addCharacterPropertyDescriptor(object);
            addRightHandPropertyDescriptor(object);
            addLeftHandPropertyDescriptor(object);
            addInUsePropertyDescriptor(object);
            addArmorPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Physical Damage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhysicalDamagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PhyicalState_physicalDamage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PhyicalState_physicalDamage_feature", "_UI_PhyicalState_type"),
                 RuntimePackage.Literals.PHYICAL_STATE__PHYSICAL_DAMAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Mental Damage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMentalDamagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PhyicalState_mentalDamage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PhyicalState_mentalDamage_feature", "_UI_PhyicalState_type"),
                 RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Zustand feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZustandPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PhyicalState_zustand_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PhyicalState_zustand_feature", "_UI_PhyicalState_type"),
                 RuntimePackage.Literals.PHYICAL_STATE__ZUSTAND,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Over Dead feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOverDeadPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PhyicalState_overDead_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PhyicalState_overDead_feature", "_UI_PhyicalState_type"),
                 RuntimePackage.Literals.PHYICAL_STATE__OVER_DEAD,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Character feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCharacterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RuntimeCharacter_character_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RuntimeCharacter_character_feature", "_UI_RuntimeCharacter_type"),
                 RuntimePackage.Literals.RUNTIME_CHARACTER__CHARACTER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Right Hand feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addRightHandPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor//createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RuntimeCharacter_rightHand_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RuntimeCharacter_rightHand_feature", "_UI_RuntimeCharacter_type"),
                 RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    if (object instanceof RuntimeCharacter) {
                        RuntimeCharacter rc = (RuntimeCharacter)object;
                        return rc.getInUse();
                    }
                    return super.getComboBoxObjects(object);
                }

            }            
                    );
    }

    /**
     * This adds a property descriptor for the Left Hand feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addLeftHandPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor//createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RuntimeCharacter_leftHand_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RuntimeCharacter_leftHand_feature", "_UI_RuntimeCharacter_type"),
                 RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    if (object instanceof RuntimeCharacter) {
                        RuntimeCharacter rc = (RuntimeCharacter)object;
                        return rc.getInUse();
                    }
                    return super.getComboBoxObjects(object);
                }
            });
    }

    /**
     * This adds a property descriptor for the In Use feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addInUsePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor//createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RuntimeCharacter_inUse_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RuntimeCharacter_inUse_feature", "_UI_RuntimeCharacter_type"),
                 RuntimePackage.Literals.RUNTIME_CHARACTER__IN_USE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    if (object instanceof RuntimeCharacter) {
                        RuntimeCharacter rc = (RuntimeCharacter)object;
                        ManagedCharacter character = rc.getCharacter();
                        if(character!=null)
                            return character.getInventar();
                    }                    
                    return super.getComboBoxObjects(object);
                }                
            });
    }

    /**
     * This adds a property descriptor for the Armor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addArmorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor//createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RuntimeCharacter_armor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RuntimeCharacter_armor_feature", "_UI_RuntimeCharacter_type"),
                 RuntimePackage.Literals.RUNTIME_CHARACTER__ARMOR,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    if (object instanceof RuntimeCharacter) {
                        RuntimeCharacter rc = (RuntimeCharacter)object;
                        return rc.getInUse();
                    }
                    return super.getComboBoxObjects(object);
                }
            });
    }

    /**
     * This returns RuntimeCharacter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public Object getImage(Object object) {
        RuntimeCharacter character = (RuntimeCharacter)object;
        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory();
        if (factory != null && character.getCharacter() != null) {
            IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(character.getCharacter(),
                    IItemLabelProvider.class);
            if (labelprovider != null)
                return labelprovider.getImage(character.getCharacter());
        }

        
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RuntimeCharacter"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        RuntimeCharacter character = (RuntimeCharacter)object;
        ComposeableAdapterFactory factory = ((RuntimeItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String labelValue = null;
        if (factory != null && character.getCharacter() != null) {
            IItemLabelProvider labelprovider = (IItemLabelProvider)factory.adapt(character.getCharacter(), IItemLabelProvider.class);
            if (labelprovider != null)
                labelValue = labelprovider.getText(character.getCharacter());
        }
        
        String label = labelValue == null ? null : character.getCharacter().getGeneratorSrc().getCharacterName();
        return label == null || label.length() == 0 ?
            getString("_UI_RuntimeCharacter_type") :
            getString("_UI_RuntimeCharacter_type") + " " + label;
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

        switch (notification.getFeatureID(RuntimeCharacter.class)) {
            case RuntimePackage.RUNTIME_CHARACTER__PHYSICAL_DAMAGE:
            case RuntimePackage.RUNTIME_CHARACTER__MENTAL_DAMAGE:
            case RuntimePackage.RUNTIME_CHARACTER__ZUSTAND:
            case RuntimePackage.RUNTIME_CHARACTER__OVER_DEAD:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

}
