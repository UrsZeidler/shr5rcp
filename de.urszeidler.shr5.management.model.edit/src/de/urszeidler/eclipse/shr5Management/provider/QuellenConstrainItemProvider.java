/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


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

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;
import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.QuellenConstrainType;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.QuellenConstrain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuellenConstrainItemProvider
    extends ItemProviderAdapter
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
    public QuellenConstrainItemProvider(AdapterFactory adapterFactory) {
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

            addSourcePropertyDescriptor(object);
            addTargetsPropertyDescriptor(object);
            addConstrainTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Source feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourcePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_QuellenConstrain_source_feature"),
                 getString("_UI_QuellenConstrain_source_description"),
                 Shr5managementPackage.Literals.QUELLEN_CONSTRAIN__SOURCE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Targets feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_QuellenConstrain_targets_feature"),
                 getString("_UI_QuellenConstrain_targets_description"),
                 Shr5managementPackage.Literals.QUELLEN_CONSTRAIN__TARGETS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Constrain Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConstrainTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_QuellenConstrain_constrainType_feature"),
                 getString("_UI_QuellenConstrain_constrainType_description"),
                 Shr5managementPackage.Literals.QUELLEN_CONSTRAIN__CONSTRAIN_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns QuellenConstrain.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/QuellenConstrain"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        QuellenConstrain qc = (QuellenConstrain)object;
        final ComposeableAdapterFactory factory = ((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        
        final String unset = getString("_UI_Unset_text");
        String source = Shr5EditingTools.getLabelForEObject(factory, unset, qc.getSource());
        String target = Joiner.on(",").join(FluentIterable.from(qc.getTargets()).transform(new Function<Quelle, String>() {

            @Override
            public String apply(Quelle input) {
                return Shr5EditingTools.getLabelForEObject(factory, unset, input);
            }
        }));
        
        QuellenConstrainType labelValue = qc.getConstrainType();
        String label = labelValue == null ? null : labelValue.toString();
        return source.substring(0,Math.min(50, source.length()))+" "+label+": "+target.substring(0,Math.min(60, target.length()));
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

        switch (notification.getFeatureID(QuellenConstrain.class)) {
            case Shr5managementPackage.QUELLEN_CONSTRAIN__CONSTRAIN_TYPE:
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

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Shr5ManagementEditPlugin.INSTANCE;
    }

}
