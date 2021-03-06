/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Lizenz;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Sin;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Lizenz} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LizenzItemProvider
    extends FakeableItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LizenzItemProvider(AdapterFactory adapterFactory) {
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

            addLizenGegenstandPropertyDescriptor(object);
            addLizenzTraegerPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Lizen Gegenstand feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLizenGegenstandPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Lizenz_lizenGegenstand_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Lizenz_lizenGegenstand_feature", "_UI_Lizenz_type"),
                 Shr5Package.Literals.LIZENZ__LIZEN_GEGENSTAND,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Lizenz Traeger feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addLizenzTraegerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Lizenz_lizenzTraeger_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Lizenz_lizenzTraeger_feature", "_UI_Lizenz_type"),
                 Shr5Package.Literals.LIZENZ__LIZENZ_TRAEGER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                
                @Override
                protected Collection<?> getComboBoxObjects(Object object) {
                    if (object instanceof Lizenz) {
                        Lizenz l = (Lizenz)object;
                        EObject eContainer = l.eContainer();
                        if (! (eContainer instanceof ShrList)) {
                            ArrayList<Sin> list = new ArrayList<Sin>();
                            for (Iterator<EObject> iterator = eContainer.eAllContents(); iterator.hasNext();) {
                                EObject eo = (EObject)iterator.next();
                                if (eo instanceof Sin) {
                                    list.add((Sin)eo);                                    
                                }
                            }
                            return list;
                        }
                    }
                    return super.getComboBoxObjects(object);
                }
                
            });
    }

    /**
     * This returns Lizenz.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public Object getImage(Object object) {
        Beschreibbar beschreibbar = (Beschreibbar) object;
        if (beschreibbar.getImage() != null) {
            Image image = AdapterFactoryUtil.getInstance().getImageScaledBy(16, beschreibbar.getImage());
            if (image != null)
                return image;
        }

        return overlayImage(object, getResourceLocator().getImage("full/obj16/Lizenz"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Lizenz)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Lizenz_type") :
            getString("_UI_Lizenz_type") + " " + label;
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

        switch (notification.getFeatureID(Lizenz.class)) {
            case Shr5Package.LIZENZ__LIZEN_GEGENSTAND:
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
