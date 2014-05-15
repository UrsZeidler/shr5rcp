/**
 * 
 */
package de.urszeidler.eclipse.shr5.util;

import java.net.URL;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * @author urs
 */
public class AdapterItemProviderDelegator implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource, IChangeNotifier, IDisposable, CreateChildCommand.Helper, ResourceLocator, Adapter.Internal {

    public AdapterItemProviderDelegator(ItemProviderAdapter itemProvider) {
        super();
        this.itemProvider = itemProvider;
    }

    private ItemProviderAdapter itemProvider;

    public Notifier getTarget() {
        return itemProvider.getTarget();
    }

    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        return itemProvider.getPropertyDescriptors(object);
    }

    public boolean isAdapterForType(Object type) {
        return itemProvider.isAdapterForType(type);
    }

    public AdapterFactory getAdapterFactory() {
        return itemProvider.getAdapterFactory();
    }

    public void addListener(INotifyChangedListener listener) {
        itemProvider.addListener(listener);
    }

    public void removeListener(INotifyChangedListener listener) {
        itemProvider.removeListener(listener);
    }

    public void fireNotifyChanged(Notification notification) {
        itemProvider.fireNotifyChanged(notification);
    }

    // public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    // return itemProvider.getChildrenFeatures(object);
    // }

    public Object getEditableValue(Object object) {
        return itemProvider.getEditableValue(object);
    }

    public Object getImage(Object object) {
        return itemProvider.getImage(object);
    }

    public String getText(Object object) {
        return itemProvider.getText(object);
    }

    public IItemPropertyDescriptor getPropertyDescriptor(Object object, Object propertyId) {
        return itemProvider.getPropertyDescriptor(object, propertyId);
    }

    public void notifyChanged(Notification notification) {
        itemProvider.notifyChanged(notification);
    }

    public Object getPropertyValue(Object object, String property) {
        return itemProvider.getPropertyValue(object, property);
    }

    public boolean isPropertySet(Object object, String property) {
        return itemProvider.isPropertySet(object, property);
    }

    public void resetPropertyValue(Object object, String property) {
        itemProvider.resetPropertyValue(object, property);
    }

    public void setPropertyValue(Object object, String property, Object value) {
        itemProvider.setPropertyValue(object, property, value);
    }

    public Collection<?> getElements(Object object) {
        return itemProvider.getElements(object);
    }

    public ResourceLocator getResourceLocator() {
        return itemProvider;
    }

    public Collection<?> getChildren(Object object) {
        return itemProvider.getChildren(object);
    }

    public boolean hasChildren(Object object) {
        return itemProvider.hasChildren(object);
    }

    public Object getParent(Object object) {
        return itemProvider.getParent(object);
    }

    public Object getColumnImage(Object object, int columnIndex) {
        return itemProvider.getColumnImage(object, columnIndex);
    }

    public String getColumnText(Object object, int columnIndex) {
        return itemProvider.getColumnText(object, columnIndex);
    }

    public Object getFont(Object object) {
        return itemProvider.getFont(object);
    }

    public Object getFont(Object object, int columnIndex) {
        return itemProvider.getFont(object, columnIndex);
    }

    public Object getForeground(Object object) {
        return itemProvider.getForeground(object);
    }

    public Object getForeground(Object object, int columnIndex) {
        return itemProvider.getForeground(object, columnIndex);
    }

    public Object getBackground(Object object) {
        return itemProvider.getBackground(object);
    }

    public Object getBackground(Object object, int columnIndex) {
        return itemProvider.getBackground(object, columnIndex);
    }

    public String getUpdateableText(Object object) {
        return itemProvider.getUpdateableText(object);
    }

    public String crop(String text) {
        return itemProvider.crop(text);
    }

    public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain, Object sibling) {
        return itemProvider.getNewChildDescriptors(object, editingDomain, sibling);
    }

    public Command createCommand(Object object, EditingDomain domain, Class<? extends Command> commandClass, CommandParameter commandParameter) {
        return itemProvider.createCommand(object, domain, commandClass, commandParameter);
    }

    public void setTarget(Notifier target) {
        itemProvider.setTarget(target);
    }

    public void unsetTarget(Notifier target) {
        itemProvider.unsetTarget(target);
    }

    public void dispose() {
        itemProvider.dispose();
    }

    public Collection<?> getCreateChildResult(Object child) {
        return itemProvider.getCreateChildResult(child);
    }

    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        return itemProvider.getCreateChildText(owner, feature, child, selection);
    }

    public String getCreateChildDescription(Object owner, Object feature, Object child, Collection<?> selection) {
        return itemProvider.getCreateChildDescription(owner, feature, child, selection);
    }

    public String getCreateChildToolTipText(Object owner, Object feature, Object child, Collection<?> selection) {
        return itemProvider.getCreateChildToolTipText(owner, feature, child, selection);
    }

    public Object getCreateChildImage(Object owner, Object feature, Object child, Collection<?> selection) {
        return itemProvider.getCreateChildImage(owner, feature, child, selection);
    }

    public URL getBaseURL() {
        return itemProvider.getBaseURL();
    }

    public Object getImage(String key) {
        return itemProvider.getImage(key);
    }

    public String getString(String key) {
        return itemProvider.getString(key);
    }

    public String getString(String key, boolean translate) {
        return itemProvider.getString(key, translate);
    }

    public String getString(String key, Object[] substitutions) {
        return itemProvider.getString(key, substitutions);
    }

    public String getString(String key, Object[] substitutions, boolean translate) {
        return itemProvider.getString(key, substitutions, translate);
    }
}
