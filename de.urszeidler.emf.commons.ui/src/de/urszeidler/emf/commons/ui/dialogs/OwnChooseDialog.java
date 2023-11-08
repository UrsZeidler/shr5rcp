/***********************************************************************
 * Copyright (c) 2007 Anyware Technologies
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Anyware Technologies - initial API and implementation
 * 
 * $Id: ChooseDialog.java,v 1.1 2008/05/26 12:25:13 jlescot Exp $
 **********************************************************************/

package de.urszeidler.emf.commons.ui.dialogs;

import java.util.Collection;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.dialogs.SelectionDialog;

/**
 * The dialog used to choose between the different objects
 * 
 * @author <a href="david.sciamma@anyware-tech.com">David Sciamma</a>
 * @since 1.0
 */
public class OwnChooseDialog extends SelectionDialog {
    private DataBindingContext m_bindingContext;

    /**
     * The default width of a dialog
     */
    private int DEFAULT_DIALOG_WIDTH = 400;

    /**
     * The default height of a dialog
     */
    private int DEFAULT_DIALOG_HEIGHT = 300;

    /**
     * The minimum width of a dialog
     */
    private int MIN_DIALOG_WIDTH = 300;

    /**
     * The minimum height of a dialog
     */
    private int MIN_DIALOG_HEIGHT = 300;
    private WritableValue<String> filterExpression = new WritableValue<>();
    private PatternFilter patternFilter = new PatternFilter();
    private TreeViewer tree;

    private ILabelProvider labelProvider;

    private Object[] objects;
    private Text txtFiltertxt;

    /**
     * Wrapper to adapt the ArrayContentProvider to a TreeViewer
     * 
     * @author <a href="david.sciamma@anyware-tech.com">David Sciamma</a>
     */
    private class TreeArrayContentProvider implements ITreeContentProvider {
        /**
         * Returns the elements in the input, which must be either an array or a
         * <code>Collection</code>.
         */
        @Override
        public Object[] getElements(Object inputElement) {
            if (inputElement instanceof Object[]) {
                return (Object[]) inputElement;
            }
            if (inputElement instanceof Collection) {
                return ((Collection<?>) inputElement).toArray();
            }
            return new Object[0];
        }

        /**
         * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
         */
        public Object[] getChildren(Object parentElement) {
            return new Object[0];
        }

        /**
         * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
         */
        public Object getParent(Object element) {
            return null;
        }

        /**
         * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
         */
        public boolean hasChildren(Object element) {
            return false;
        }

    }

    /**
     * Constructor
     * 
     * @param parentShell
     * the paren shell
     * @param objects
     * The available objects
     */
    public OwnChooseDialog(Shell parentShell, Object[] objects) {
        this(parentShell, objects, "", "");
    }

    /**
     * Constructor
     * 
     * @param parentShell
     * the paren shell
     * @param objects
     * The available objects
     */
    public OwnChooseDialog(Shell parentShell, Object[] objects, String titel, String message) {
        super(parentShell);
        this.objects = objects;

        setTitle(titel);
        setMessage(message);
        setShellStyle(getShellStyle() | SWT.RESIZE);
    }

    /**
     * @see org.eclipse.ui.dialogs.SelectionDialog#configureShell(org.eclipse.swt.widgets.Shell)
     */
    protected void configureShell(Shell shell) {
        shell.setMinimumSize(MIN_DIALOG_WIDTH, MIN_DIALOG_HEIGHT);

        super.configureShell(shell);
    }

    /**
     * Create the Dialog area
     * 
     * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
     */
    protected Control createDialogArea(Composite parent) {
        // Dialog
        Composite dialogComposite = (Composite)super.createDialogArea(parent);

        GridLayout dialogLayout = new GridLayout();
        dialogLayout.marginWidth = 10;
        dialogLayout.marginHeight = 10;
        GridData dialogLayoutData = new GridData(GridData.FILL_BOTH);
        dialogLayoutData.widthHint = DEFAULT_DIALOG_WIDTH;
        dialogLayoutData.heightHint = DEFAULT_DIALOG_HEIGHT;
        dialogComposite.setLayout(dialogLayout);
        dialogComposite.setLayoutData(dialogLayoutData);

        Composite composite = new Composite(dialogComposite, SWT.NONE);
        composite.setLayout(new GridLayout(2, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

        Label lblFilter = new Label(composite, SWT.NONE);
        lblFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblFilter.setText("filter");

        txtFiltertxt = new Text(composite, SWT.BORDER);
        txtFiltertxt.setText("filterTxt");
        txtFiltertxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        tree = new TreeViewer(dialogComposite, SWT.SINGLE);
        Tree tree_1 = tree.getTree();
        tree_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        // tree.setLayoutData(new GridData(GridData.FILL_BOTH));
        tree.setContentProvider(new TreeArrayContentProvider());
        tree.setLabelProvider(this.labelProvider);

        tree.setInput(this.objects);
        final ViewerFilter[] filters = { patternFilter };
        tree.setFilters(filters);
        // tree.getTree().setInitialSelection(new StructuredSelection(getInitialElementSelections()));
        filterExpression.addValueChangeListener(new IValueChangeListener<String>() {

            @Override
            public void handleValueChange(ValueChangeEvent<? extends String> event) {
                patternFilter.setPattern(event.diff.getNewValue());
                tree.setFilters(filters);
            }
        });

        hookListeners();
        m_bindingContext = initDataBindings();

        return dialogComposite;
    }

    /**
     * This method had the UI listeners on the SWT widgets
     */
    private void hookListeners() {
        tree.addOpenListener(new IOpenListener() {

            /**
             * @see org.eclipse.jface.viewers.IOpenListener#open(org.eclipse.jface.viewers.OpenEvent)
             */
            public void open(OpenEvent event) {
                okPressed();
            }
        });
    }

    /**
     * Set the provider that displays the objects
     * 
     * @param provider
     * the LabelProvider
     */
    public void setLabelProvider(ILabelProvider provider) {
        this.labelProvider = provider;
    }

    /**
     * @see org.eclipse.jface.dialogs.Dialog#okPressed()
     */
    protected void okPressed() {
        IStructuredSelection selection = (IStructuredSelection)tree.getSelection();
        setResult(selection.toList());
        super.okPressed();
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue<String> observeTextTxtFiltertxtObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(200, txtFiltertxt);
        bindingContext.bindValue(observeTextTxtFiltertxtObserveWidget, filterExpression, null, null);
        //
        return bindingContext;
    }
}