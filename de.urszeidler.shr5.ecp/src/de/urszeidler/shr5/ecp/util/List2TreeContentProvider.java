package de.urszeidler.shr5.ecp.util;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;


public class List2TreeContentProvider implements ITreeContentProvider {

     private static final Object[] EMPTY_ARRAY = new Object[0];

     //Called just for the first-level objects.
     //Here we provide a list of objects
     @Override
     public Object[] getElements(Object inputElement) {
       if (inputElement instanceof List<?>)
         return ((List) inputElement).toArray();
       else
         return EMPTY_ARRAY;
     }

     //Queried to know if the current node has children
     @Override
     public boolean hasChildren(Object element) {
       return false;
     }

     //Queried to load the children of a given node
     @Override
     public Object[] getChildren(Object parentElement) {
       if (parentElement instanceof List) {
         return getChildren(parentElement);
       }
       return EMPTY_ARRAY;
     }

     @Override
     public void dispose() {
     }

     @Override
     public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
     }

     @Override
     public Object getParent(Object element) {
       return null;
     }

   }