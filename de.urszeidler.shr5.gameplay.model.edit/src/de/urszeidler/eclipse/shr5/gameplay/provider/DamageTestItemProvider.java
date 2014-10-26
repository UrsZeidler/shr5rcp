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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.DamageTest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DamageTestItemProvider extends ProbeCommandItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DamageTestItemProvider(AdapterFactory adapterFactory) {
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

            addDamagePropertyDescriptor(object);
            addDvPropertyDescriptor(object);
            addEffectiveDamagePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Damage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDamagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DamageTest_damage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DamageTest_damage_feature", "_UI_DamageTest_type"),
                 GameplayPackage.Literals.DAMAGE_TEST__DAMAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Dv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDvPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DamageTest_dv_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DamageTest_dv_feature", "_UI_DamageTest_type"),
                 GameplayPackage.Literals.DAMAGE_TEST__DV,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Effective Damage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEffectiveDamagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DamageTest_effectiveDamage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DamageTest_effectiveDamage_feature", "_UI_DamageTest_type"),
                 GameplayPackage.Literals.DAMAGE_TEST__EFFECTIVE_DAMAGE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns DamageTest.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DamageTest"));
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
        DamageTest damageTest = (DamageTest)object;

        String label = getString("_UI_unset");
        ComposeableAdapterFactory factory = ((GameplayItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        IItemLabelProvider labelprovider = (IItemLabelProvider)factory.adapt(damageTest.getSubject(), IItemLabelProvider.class);
        if (labelprovider != null)
            label = labelprovider.getText(damageTest.getSubject());

        if(damageTest.isExecuting())
            return getString("_UI_DamageTest_type_text_prepare", new Object[]{ label, damageTest.getDamage(),
                    damageTest.getEffectiveDamage() == null ? getString("_UI_none"): damageTest.getEffectiveDamage() });           
        else
        return getString("_UI_DamageTest_type_text", new Object[]{ label, damageTest.getDamage(),
                damageTest.getEffectiveDamage() == null ? getString("_UI_none"): damageTest.getEffectiveDamage() });
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

        switch (notification.getFeatureID(DamageTest.class)) {
            case GameplayPackage.DAMAGE_TEST__DAMAGE:
            case GameplayPackage.DAMAGE_TEST__DV:
            case GameplayPackage.DAMAGE_TEST__EFFECTIVE_DAMAGE:
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
