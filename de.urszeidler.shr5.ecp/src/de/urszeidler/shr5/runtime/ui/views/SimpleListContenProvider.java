package de.urszeidler.shr5.runtime.ui.views;

import java.util.Collection;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class SimpleListContenProvider implements IContentProvider, ITreeContentProvider {
    private AdapterFactoryContentProvider delegateContentProvider;

    public SimpleListContenProvider(AdapterFactoryContentProvider delegateContentProvider) {
        super();
        this.delegateContentProvider = delegateContentProvider;
    }

    @Override
    public void dispose() {
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

        delegateContentProvider.inputChanged(viewer, oldInput, newInput);

    }

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof Collection<?>) {
            Collection<?> list = (Collection<?>)parentElement;
            return list.toArray();
        }
        return delegateContentProvider.getChildren(parentElement);
    }

    @Override
    public Object getParent(Object element) {
        return delegateContentProvider.getParent(element);
    }

    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof Collection<?>) {
            Collection<?> list = (Collection<?>)element;
            return list.size() > 0;

        }
        return delegateContentProvider.hasChildren(element);
    }

    @Override
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

}