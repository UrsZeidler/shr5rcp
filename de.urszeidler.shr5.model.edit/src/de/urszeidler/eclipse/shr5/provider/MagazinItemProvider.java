/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;

import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.MagazinTyp;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Magazin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MagazinItemProvider extends AbstraktGegenstandItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public MagazinItemProvider(AdapterFactory adapterFactory) {
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

            addCapacityFeaturePropertyDescriptor(object);
            addCapacityPropertyDescriptor(object);
            addCapacityRemainsPropertyDescriptor(object);
            addTypePropertyDescriptor(object);
            addBulletsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Capacity Feature feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addCapacityFeaturePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Capacity_capacityFeature_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Capacity_capacityFeature_feature", "_UI_Capacity_type"),
                Shr5Package.Literals.CAPACITY__CAPACITY_FEATURE, false, false, false, null, null, null));
    }

    /**
     * This adds a property descriptor for the Capacity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addCapacityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Capacity_capacity_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Capacity_capacity_feature", "_UI_Capacity_type"),
                Shr5Package.Literals.CAPACITY__CAPACITY, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Capacity Remains feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addCapacityRemainsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Capacity_capacityRemains_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Capacity_capacityRemains_feature", "_UI_Capacity_type"),
                Shr5Package.Literals.CAPACITY__CAPACITY_REMAINS, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor// createItemPropertyDescriptor//
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Magazin_type_feature"),
                        getString("_UI_Magazin_type_description", "_UI_Magazin_type_feature", "_UI_Magazin_type"),
                        Shr5Package.Literals.MAGAZIN__TYPE, true, false, true, null, null, null) {
                    @SuppressWarnings("unchecked")
                    @Override
                    protected Collection<?> getComboBoxObjects(Object object) {
                        if (object instanceof EObject) {
                            return FluentIterable.from((Collection<EObject>)super.getComboBoxObjects(object)).filter(Predicates.notNull())
                                    .filter(ShadowrunTools.eclassPredicate(Shr5Package.Literals.FEUERWAFFE)).toList();
                            //
                            // EObject eo = (EObject)object;
                            // try {
                            // EObject eContainer = eo.eContainer();
                            // EReference eContainmentFeature = eo.eContainmentFeature();
                            // List<EObject> eGet = (List<EObject>)eContainer.eGet(eContainmentFeature);
                            // return new ArrayList<Object>(Collections2.filter(eGet,
                            // ShadowrunTools.eclassPredicate(Shr5Package.Literals.FEUERWAFFE)));
                            //
                            // } catch (Exception e) {
                            // }
                        }
                        return super.getComboBoxObjects(object);
                    }

                });
    }

    /**
     * This adds a property descriptor for the Bullets feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addBulletsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor// createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_Magazin_bullets_feature"),
                        getString("_UI_Magazin_bullets_description", "_UI_Magazin_bullets_feature", "_UI_Magazin_type"),
                        Shr5Package.Literals.MAGAZIN__BULLETS, true, false, true, null, null, null) {
                    @SuppressWarnings("unchecked")
                    @Override
                    protected Collection<?> getComboBoxObjects(Object object) {
                        if (object instanceof EObject) {
                            final EObject eo = (EObject)object;
                            try {
                                EObject eContainer = eo.eContainer();
                                if (eContainer instanceof Feuerwaffe) {
                                    Feuerwaffe fw = (Feuerwaffe)eContainer;
                                    eContainer = fw.eContainer();
                                    EReference eContainmentFeature = fw.eContainmentFeature();
                                    List<EObject> eGet = (List<EObject>)eContainer.eGet(eContainmentFeature);
                                    return FluentIterable.from(eGet).filter(ShadowrunTools.eclassPredicate(Shr5Package.Literals.MUNITION))
                                            .filter(ShadowrunTools.muniForMagazinPredicate((Magazin)eo)).toList();
                                }
                                EReference eContainmentFeature = eo.eContainmentFeature();
                                List<EObject> eGet = (List<EObject>)eo.eContainer().eGet(eContainmentFeature);
                                return FluentIterable.from(eGet).filter(ShadowrunTools.eclassPredicate(Shr5Package.Literals.MUNITION))
                                        .filter(ShadowrunTools.muniForMagazinPredicate((Magazin)eo)).toList();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        return super.getComboBoxObjects(object);
                    }
                });
    }

    /**
     * This returns Magazin.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    @Override
    public Object getImage(Object object) {
        Beschreibbar beschreibbar = (Beschreibbar)object;
        if (beschreibbar.getImage() != null) {
            Image image = AdapterFactoryUtil.getInstance().getImageScaledBy(16, beschreibbar.getImage());
            if (image != null)
                return image;
        }

        return overlayImage(object, getResourceLocator().getImage("full/obj16/Magazin"));
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
        Magazin magazin = (Magazin)object;
        if (magazin.getType() != null) {             
            Feuerwaffe feuerwaffe = magazin.getType();
            MagazinTyp munitionstyp = feuerwaffe.getMunitionstyp();
            String type = getString("_UI_Magazin_type");
            IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(feuerwaffe, Shr5Package.Literals.FEUERWAFFE__MUNITIONSTYP);
            if (propertyDescriptor != null)
                type = propertyDescriptor.getLabelProvider(feuerwaffe).getText(munitionstyp);
            
            
            String name = String.format("%s %s (%d/%d)", type, feuerwaffe.getName(), magazin.getBullets().size(),
                    feuerwaffe.getKapazitaet());
            return name;
        }

        String label = magazin.getName();
        return label == null || label.length() == 0 ? getString("_UI_Magazin_type") : getString("_UI_Magazin_type") + " " + label;
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

        switch (notification.getFeatureID(Magazin.class)) {
            case Shr5Package.MAGAZIN__CAPACITY:
            case Shr5Package.MAGAZIN__CAPACITY_REMAINS:
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
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
