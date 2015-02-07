/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RangedAttackCmdItemProvider
    extends OpposedSkillTestCmdItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangedAttackCmdItemProvider(AdapterFactory adapterFactory) {
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

            addModusPropertyDescriptor(object);
            addRangePropertyDescriptor(object);
            addWeaponPropertyDescriptor(object);
            addNumberOfShootsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Modus feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModusPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RangedAttackCmd_modus_feature"),
                 getString("_UI_RangedAttackCmd_modus_description"),
                 GameplayPackage.Literals.RANGED_ATTACK_CMD__MODUS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Range feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRangePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RangedAttackCmd_range_feature"),
                 getString("_UI_RangedAttackCmd_range_description"),
                 GameplayPackage.Literals.RANGED_ATTACK_CMD__RANGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Weapon feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addWeaponPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RangedAttackCmd_weapon_feature"),
                 getString("_UI_RangedAttackCmd_weapon_description"),
                 GameplayPackage.Literals.RANGED_ATTACK_CMD__WEAPON,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    if (object instanceof RangedAttackCmd) {
                        RangedAttackCmd rac = (RangedAttackCmd)object;
                        RuntimeCharacter subject = rac.getSubject();
                        if(subject!=null){
                            EList<AbstraktGegenstand> inUse = subject.getInUse();                            
                            return new ArrayList<Object>(Collections2.filter(inUse, Predicates.instanceOf(AbstaktFernKampfwaffe.class)));
                        }
                    }                    
                    return super.getComboBoxObjects(object);
                }
                
            });
    }

    /**
     * This adds a property descriptor for the Number Of Shoots feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumberOfShootsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RangedAttackCmd_numberOfShoots_feature"),
                 getString("_UI_RangedAttackCmd_numberOfShoots_description"),
                 GameplayPackage.Literals.RANGED_ATTACK_CMD__NUMBER_OF_SHOOTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns RangedAttackCmd.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RangedAttackCmd"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        RangedAttackCmd rangedAttackCmd = (RangedAttackCmd)object;

        String defaultVaule = getString("_UI_unset");
        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String label_subject = GamplayEditingTools.getLabelForEObject(factory, defaultVaule, rangedAttackCmd.getSubject());
        String label_opponent = GamplayEditingTools.getLabelForEObject(factory, defaultVaule, rangedAttackCmd.getObject());
        String weapon = GamplayEditingTools.getLabelForEObject(factory, defaultVaule, rangedAttackCmd.getWeapon());

        return getString("_UI_RangedAttackCmd_type_text", new Object[]{ label_subject, label_opponent, weapon, rangedAttackCmd.getRange(),
                rangedAttackCmd.getNumberOfShoots() });
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

        switch (notification.getFeatureID(RangedAttackCmd.class)) {
            case GameplayPackage.RANGED_ATTACK_CMD__MODUS:
            case GameplayPackage.RANGED_ATTACK_CMD__RANGE:
            case GameplayPackage.RANGED_ATTACK_CMD__NUMBER_OF_SHOOTS:
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
