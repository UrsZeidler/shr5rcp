package de.urszeidler.shr5.ecp.editor.pages;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.nebula.jface.cdatetime.CDateTimeObservableValue;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.ResourceManager;

import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry.EntryFactory;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.ecp.util.ValidationLabelProvider;

/**
 * This is a basic generic page to display eObjects in an form with an emfformbilder.
 */
public abstract class AbstractShr5Page<A extends EObject> extends FormPage implements IDoubleClickListener, ISelectionChangedListener {

    public final class LabelEntry implements EntryFactory {
        @Override
        public void createEntry(Composite container, FormbuilderEntry entry, EObject object, DataBindingContext dbc, EmfFormBuilder emfFormBuilder) {
            emfFormBuilder.createConfiguredLable(container, entry, object);
            Label label = emfFormBuilder.createLabel(container);
            label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
            IObservableValue widgetObserver = WidgetProperties.text().observe(label);
            IObservableValue objectObserver = EMFEditObservables.observeValue(getEditingDomain(), object, entry.getFeature());
            entry.setUiObservable(widgetObserver);
            entry.setObservable(objectObserver);
            UpdateValueStrategy strategy = new EMFUpdateValueStrategy();
            dbc.bindValue(widgetObserver, objectObserver, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
        }
    }

    public final class LabelEnumEntry implements EntryFactory {
        @Override
        public void createEntry(Composite container, FormbuilderEntry entry, EObject object, DataBindingContext dbc, EmfFormBuilder emfFormBuilder) {
            emfFormBuilder.createConfiguredLable(container, entry, object);
            final LabelProvider provider = emfFormBuilder.createLabelProvider(entry, object);
            Label label = emfFormBuilder.createLabel(container);
            label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
            IObservableValue widgetObserver = WidgetProperties.text().observe(label);
            IObservableValue objectObserver = EMFEditObservables.observeValue(getEditingDomain(), object, entry.getFeature());
            entry.setUiObservable(widgetObserver);
            entry.setObservable(objectObserver);
            UpdateValueStrategy strategy = new EMFUpdateValueStrategy();
            strategy.setConverter(new Converter(EObject.class, String.class) {
                @Override
                public Object convert(Object fromObject) {
                    return provider.getText(fromObject);
                }
            });
            dbc.bindValue(widgetObserver, objectObserver, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
        }
    }

    public final class LabelMoneyEntry implements EntryFactory {
        @Override
        public void createEntry(Composite container, FormbuilderEntry entry, EObject object, DataBindingContext dbc, EmfFormBuilder emfFormBuilder) {
            emfFormBuilder.createConfiguredLable(container, entry, object);
            Label label = emfFormBuilder.createLabel(container);
            label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
            IObservableValue widgetObserver = WidgetProperties.text().observe(label);
            IObservableValue objectObserver = EMFEditObservables.observeValue(getEditingDomain(), object, entry.getFeature());
            entry.setUiObservable(widgetObserver);
            entry.setObservable(objectObserver);
            UpdateValueStrategy strategy = new EMFUpdateValueStrategy();
            strategy.setConverter(new Converter(EObject.class, String.class) {
                @Override
                public Object convert(Object fromObject) {
                    return String.format("%,.0f %s", fromObject, store.getString(PreferenceConstants.CURRENCY_SYMBOL));
                }
            });
            dbc.bindValue(widgetObserver, objectObserver, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
        }
    }

    /**
     * A emf form factory to create and bind a date widget.
     */
    public class DateEntryFactory implements EntryFactory {

        private final FormToolkit formToolkit;

        public DateEntryFactory(FormToolkit formToolkit) {
            super();
            this.formToolkit = formToolkit;
        }

        @Override
        public void createEntry(Composite container, FormbuilderEntry entry, EObject object, DataBindingContext dbc, EmfFormBuilder emfFormBuilder) {
            Label label = emfFormBuilder.createConfiguredLable(container, entry, object);

            CDateTime dateTime = new CDateTime(container, CDT.DROP_DOWN | CDT.DATE_SHORT);
            dateTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
            formToolkit.adapt(dateTime);
            formToolkit.paintBordersFor(dateTime);
            emfFormBuilder.layoutRow(entry, label, dateTime);

            IObservableValue widgetObserver = new CDateTimeObservableValue(dateTime);
            IObservableValue objectObserver = EMFEditObservables.observeValue(getEditingDomain(), object, entry.getFeature());
            // entry.setUiObservable(widgetObserver);
            entry.setObservable(objectObserver);
            dbc.bindValue(widgetObserver, objectObserver, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        }

    }

    protected ReferenceManager mananger;
    protected EmfFormBuilder emfFormBuilder;
    protected ILabelProvider labelprovider = new DefaultLabelProvider();
    protected IPreferenceStore store;

    public AbstractShr5Page(String id, String title) {
        super(id, title);
    }

    public AbstractShr5Page(FormEditor editor, String id, String title) {
        super(editor, id, title);

    }

    /**
     * This is the main constructor usable for the editor.
     * 
     * @param editor
     * @param id
     * @param title
     * @param manager the mananger for refrenece features
     */
    public AbstractShr5Page(FormEditor editor, String id, String title, ReferenceManager manager) {
        this(editor, id, title);
        this.mananger = manager;
        store = Activator.getDefault().getPreferenceStore();
    }

    @Override
    public void dispose() {
        if (emfFormBuilder != null)
            emfFormBuilder.dispose();
        super.dispose();
    }

    /**
     * Adds a validation button when there are error and displays them as tooltip.
     * 
     * @param toolbarManager
     * @param object
     */
    protected void addValidationResult(final IToolBarManager toolbarManager, final EObject object) {
        Diagnostic validate = Diagnostician.INSTANCE.validate(object, createValidationContext());
        if (!validate.getChildren().isEmpty()) {
            final String message = Joiner.on("\n").join(
                    FluentIterable.from(validate.getChildren()).transform(ShadowrunEditingTools.diagnosticToStringTransformer()));
            final ImageDescriptor pluginImageDescriptor = ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/error.gif");
            Action action = new Action() {

                @Override
                public ImageDescriptor getImageDescriptor() {
                    return pluginImageDescriptor;
                }

                @Override
                public void run() {
                    Diagnostic validate = Diagnostician.INSTANCE.validate(object, createValidationContext());
                    if (!validate.getChildren().isEmpty()) {
                        final String message = Joiner.on("\n").join(
                                FluentIterable.from(validate.getChildren()).transform(ShadowrunEditingTools.diagnosticToStringTransformer()));
                        this.setToolTipText(message);
                    }else{
                        toolbarManager.remove("validation");
                    }
                }
            };
            action.setToolTipText(message);
            action.setId("validation");
            toolbarManager.add(action);
        }
    }

    /**
     * Simple Factory method to create the formbuilder.
     * 
     * @param managedForm
     */
    protected void createFormBuilder(IManagedForm managedForm) {
        emfFormBuilder = new EmfFormBuilder(managedForm.getToolkit(), AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), getEditingDomain());
        emfFormBuilder.setManager(mananger);
        emfFormBuilder.setNullString(Messages.EmfFormbuilder_non_selected);
        // emfFormBuilder.setBorderStyle(SWT.NONE);
        emfFormBuilder.setDblListner(this);
        emfFormBuilder.setSelectionChangeListener(this);
    }

    /**
     * Open a new editor for the object in the selection.
     */
    @Override
    public void doubleClick(DoubleClickEvent event) {
        ISelection selection = event.getSelection();
        ShadowrunEditingTools.openEditorForFirstSelection(selection);
    }

    @Override
    public void selectionChanged(SelectionChangedEvent event) {
        getSite().getSelectionProvider().setSelection(event.getSelection());
    }

    protected abstract EditingDomain getEditingDomain();

    /**
     * @param grpWert
     */
    protected void addWertFeatures(Composite grpWert) {
        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT_VALUE, grpWert);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__VERFUEGBARKEIT, grpWert);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT, grpWert, new LabelMoneyEntry());
    }

    /**
     * @param grpQuelle
     */
    protected void addSourceFeature(Group grpQuelle) {
        emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__SRC_BOOK, grpQuelle);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__PAGE, grpQuelle);
    }

    /**
     * Creates the validation context.
     * 
     * @return
     */
    protected Map<Object, Object> createValidationContext() {
        Map<Object, Object> context = new HashMap<Object, Object>();
        context.put(SubstitutionLabelProvider.class, new ValidationLabelProvider());
        return context;
    }

}