/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry.EntryFactory;

/**
 * @author urs
 */
public class WidgetTools {

    public static EntryFactory createLabelExtreyFactory(final EditingDomain editingDomain) {
        return new EntryFactory() {
            @Override
            public void createEntry(Composite container, FormbuilderEntry entry, EObject object, DataBindingContext dbc, EmfFormBuilder emfFormBuilder) {
                emfFormBuilder.createConfiguredLable(container, entry, object);
                Label label = emfFormBuilder.createLabel(container);
                label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
                IObservableValue widgetObserver = WidgetProperties.text().observe(label);
                IObservableValue objectObserver = EMFEditObservables.observeValue(editingDomain, object, entry.getFeature());
                entry.setUiObservable(widgetObserver);
                entry.setObservable(objectObserver);
                UpdateValueStrategy strategy = new EMFUpdateValueStrategy();
                dbc.bindValue(widgetObserver, objectObserver, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
            }
        };
    }

    
    public static GridData createControllGridData(int height) {
        GridData controlGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 3);
        controlGridData.heightHint = height;
        return controlGridData;
    }

}
