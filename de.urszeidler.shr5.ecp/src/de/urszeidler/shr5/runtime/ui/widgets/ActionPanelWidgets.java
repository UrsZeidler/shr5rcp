package de.urszeidler.shr5.runtime.ui.widgets;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;

import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

public class ActionPanelWidgets extends Composite {

	private Composite composite = null;
	private Composite composite1 = null;
	private Composite composite_default_Action = null;
	private Composite composite_obove = null;
	private Tree tree_actions = null;
	private Composite composite_btns = null;
	private TreeViewer treeViewer = null;
	private Button button_do = null;
	private HandComposite rechte_Hand;
	private HandComposite linke_Hand;
	
    private WritableValue character = new WritableValue();

	public ActionPanelWidgets(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	private void initialize() {
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 1;
		this.setLayout(gridLayout1);
		createComposite1();
		createComposite();
		
	}

	public void setCharacter(InitativePass character) {
        this.character.setValue(character.getSubject());
        rechte_Hand.setCharacter(character, RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND);
        linke_Hand.setCharacter(character, RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND);
        populateActions();
    }
	
	private void populateActions() {
        // TODO Auto-generated method stub
        
    }

    /**
	 * This method initializes composite	
	 *
	 */
	private void createComposite() {
		GridData gridData10 = new GridData();
		gridData10.horizontalSpan = 3;
		gridData10.verticalAlignment = GridData.FILL;
		gridData10.horizontalAlignment = GridData.FILL;
		gridData10.grabExcessVerticalSpace = true;
		gridData10.grabExcessHorizontalSpace = true;
		GridLayout gridLayout3 = new GridLayout();
		gridLayout3.numColumns = 4;
		gridLayout3.verticalSpacing = 0;
		gridLayout3.marginWidth = 0;
		gridLayout3.marginHeight = 0;
		gridLayout3.horizontalSpacing = 0;
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = GridData.FILL;
		gridData3.grabExcessHorizontalSpace = true;
		gridData3.horizontalSpan = 2;
		gridData3.verticalSpan = 2;
		gridData3.grabExcessVerticalSpace = true;
		gridData3.verticalAlignment = GridData.FILL;
		composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(gridData3);
		composite.setLayout(gridLayout3);
		tree_actions = new Tree(composite, SWT.NONE);
		tree_actions.setLayoutData(gridData10);
		treeViewer = new TreeViewer(tree_actions);
		createComposite_btns();
	}

	/**
	 * This method initializes composite1	
	 *
	 */
	private void createComposite1() {
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = GridData.FILL;
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.verticalAlignment = GridData.CENTER;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.horizontalSpacing = 0;
		composite1 = new Composite(this, SWT.NONE);
		composite1.setLayout(gridLayout);
		composite1.setLayoutData(gridData2);
		createComposite_default_Action();
	}

	/**
	 * This method initializes composite_default_Action	
	 *
	 */
	private void createComposite_default_Action() {
		
		GridLayout gridLayout2 = new GridLayout();
		gridLayout2.horizontalSpacing = 0 ;
		gridLayout2.verticalSpacing = 0;
		gridLayout2.marginWidth = 0;
		gridLayout2.marginHeight = 0;
		gridLayout2.numColumns = 1;
		GridData gridData5 = new GridData();
		gridData5.verticalSpan = 3;
		gridData5.horizontalAlignment = GridData.FILL;
		gridData5.verticalAlignment = GridData.FILL;
		gridData5.grabExcessVerticalSpace = true;
		gridData5.grabExcessHorizontalSpace = true;
		composite_default_Action = new Composite(composite1, SWT.NONE);
		composite_default_Action.setLayoutData(gridData5);
		composite_default_Action.setLayout(gridLayout2);
//		createComposite_obove();	
		
		rechte_Hand = new HandComposite(composite_default_Action, SWT.NONE,"Rechte Hand");
		GridData gridData6 = new GridData();
		gridData6.horizontalAlignment = GridData.FILL;
		gridData6.grabExcessHorizontalSpace = true;
		rechte_Hand.setLayoutData(gridData6);
		
		linke_Hand = new HandComposite(composite_default_Action, SWT.NONE,"Linke Hand");
		gridData6 = new GridData();
		gridData6.horizontalAlignment = GridData.FILL;
		gridData6.grabExcessHorizontalSpace = true;
		linke_Hand.setLayoutData(gridData6);
		
	}

	/**
	 * This method initializes composite_obove	
	 *
	 */
	private void createComposite_obove() {
		GridData gridData8 = new GridData();
		gridData8.horizontalSpan = 6;
		gridData8.grabExcessVerticalSpace = false;
		gridData8.horizontalAlignment = GridData.FILL;
		gridData8.verticalAlignment = GridData.FILL;
		gridData8.grabExcessHorizontalSpace = true;
		composite_obove = new Composite(composite_default_Action, SWT.NONE);
		composite_obove.setLayout(new GridLayout());
		composite_obove.setLayoutData(gridData8);
	}

	/**
	 * This method initializes composite_btns	
	 *
	 */
	private void createComposite_btns() {
		GridData gridData9 = new GridData();
		gridData9.horizontalAlignment = GridData.BEGINNING;
		gridData9.verticalAlignment = GridData.FILL;
		composite_btns = new Composite(composite, SWT.NONE);
		composite_btns.setLayout(new GridLayout());
		composite_btns.setLayoutData(gridData9);
		button_do = new Button(composite_btns, SWT.NONE);
		button_do.setText("do");
	}

	public Label getLabel_image_rh() {
		return rechte_Hand.getLabel_image();
	}

	public Label getLabel_image_lh() {
		return linke_Hand.getLabel_image();
	}

	public Label getLabel_text_rh() {
		return rechte_Hand.getLabel_name();
	}

	public Label getLabel_text_lh() {
		return linke_Hand.getLabel_name();
	}

	public Tree getTree_actions() {
		return tree_actions;
	}

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	public Button getButton_change_rh() {
		return rechte_Hand.getButton_change();
	}

	public Button getButton_change_lh() {
		return linke_Hand.getButton_change();
	}

	public Button getButton_do() {
		return button_do;
	}

	public Button getButton_drop_rh() {
		return rechte_Hand.getButton_use1();
	}

	public Button getButton_drop_lh() {
		return linke_Hand.getButton_use1();
	}

	public Button getButton_use_rh() {
		return rechte_Hand.getButton_use();
	}

	public Button getButton_use_lh() {
		return linke_Hand.getButton_use();
	}

}  //  @jve:decl-index=0:visual-constraint="0,0"
