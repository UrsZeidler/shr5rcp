/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.provider;

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

import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeeleAttackCmdItemProvider extends OpposedSkillTestCmdItemProvider implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeeleAttackCmdItemProvider(AdapterFactory adapterFactory) {
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

            addWeaponPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Weapon feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWeaponPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MeeleAttackCmd_weapon_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MeeleAttackCmd_weapon_feature", "_UI_MeeleAttackCmd_type"),
                 GameplayPackage.Literals.MEELE_ATTACK_CMD__WEAPON,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns MeeleAttackCmd.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/MeeleAttackCmd"));
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
        MeeleAttackCmd meeleAttackCmd = (MeeleAttackCmd)object;

        String defaultVaule = getString("_UI_unset");
        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String label_subject = GamplayEditingTools.getLabelForEObject(factory, defaultVaule, meeleAttackCmd.getSubject());
        String label_opponent = GamplayEditingTools.getLabelForEObject(factory, defaultVaule, meeleAttackCmd.getObject());
        String weapon =  GamplayEditingTools.getLabelForEObject(factory, defaultVaule, meeleAttackCmd.getWeapon());

        return getString("_UI_MeeleAttackCmd_type_text",
                new Object[]{ label_subject, label_opponent, weapon});
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
