package de.urszeidler.shr5.runtime.ui.dialogs;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class SelectionComposite1 extends Composite {
	private TreeViewer treeViewer;
	private TreeViewer treeViewer_1;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public SelectionComposite1(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, false));
		
		SashForm sashForm = new SashForm(this, SWT.NONE);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		treeViewer = new TreeViewer(sashForm, SWT.BORDER | SWT.MULTI);
		Tree tree = treeViewer.getTree();
		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				handleAdd(null);
			}
		});
		
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1));
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		
		Button btnNewButton = new Button(composite_1, SWT.NONE);
		btnNewButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleAdd(e);
			}
		});
		btnNewButton.setText("add");
		
		Button btnAddall = new Button(composite_1, SWT.NONE);
		btnAddall.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleAddAll();
			}
		});
		btnAddall.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnAddall.setText("addAll");
		
		Button btnNewButton_1 = new Button(composite_1, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleRemove(e);
			}
		});
		btnNewButton_1.setText("remove");
		
		treeViewer_1 = new TreeViewer(composite, SWT.BORDER | SWT.MULTI);
		Tree tree_1 = treeViewer_1.getTree();
		tree_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sashForm.setWeights(new int[] {183, 254});

	}

	public void handleAddAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	

	public void handleRemove(SelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void handleAdd(SelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public TreeViewer getInputTreeViewer() {
		return treeViewer;
	}
	public TreeViewer getOutTreeViewer() {
		return treeViewer_1;
	}
}
