package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class ActionPanelWidgets extends Composite {
    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    private Composite composite = null;
    private Tree tree_actions = null;
    private TreeViewer treeViewer = null;
    private HandComposite rechte_Hand;
    private HandComposite linke_Hand;

    private WritableValue character = new WritableValue();
    private ToolBar toolBar;
    private ToolItem tltmN;

    public ActionPanelWidgets(Composite parent, int style) {
        super(parent, style);
        initialize();
    }

    private void initialize() {
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        GridLayout gridLayout1 = new GridLayout();
        gridLayout1.numColumns = 2;
        gridLayout1.marginWidth = 2;
        gridLayout1.marginHeight = 2;
        gridLayout1.verticalSpacing = 2;
        gridLayout1.horizontalSpacing = 2;
        this.setLayout(gridLayout1);
        
        rechte_Hand = new HandComposite(this, SWT.NONE, "right Hand");
        GridData gridData6 = new GridData();
        gridData6.horizontalAlignment = GridData.FILL;
        gridData6.grabExcessHorizontalSpace = true;
        rechte_Hand.setLayoutData(gridData6);
        new Label(this, SWT.NONE);

        linke_Hand = new HandComposite(this, SWT.NONE, "left Hand");
        gridData6 = new GridData();
        gridData6.horizontalAlignment = GridData.FILL;
        gridData6.grabExcessHorizontalSpace = true;
        linke_Hand.setLayoutData(gridData6);

        createComposite();

    }

    public void setCharacter(InitativePass character) {
        this.character.setValue(character.getSubject());
        rechte_Hand.setCharacter(character, RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND);
        linke_Hand.setCharacter(character, RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND);
    }

    /**
     * This method initializes composite
     */
    private void createComposite() {
        new Label(this, SWT.NONE);
        GridData gridData10 = new GridData();
        gridData10.horizontalSpan = 3;
        gridData10.verticalAlignment = GridData.FILL;
        gridData10.horizontalAlignment = GridData.FILL;
        gridData10.grabExcessVerticalSpace = true;
        gridData10.grabExcessHorizontalSpace = true;
        GridLayout gridLayout3 = new GridLayout();
        gridLayout3.numColumns = 3;
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
         
        toolBar = new ToolBar(composite, SWT.BORDER | SWT.FLAT | SWT.RIGHT | SWT.VERTICAL);
        toolkit.adapt(toolBar);
        toolkit.paintBordersFor(toolBar);
        
        tree_actions = new Tree(composite, SWT.NONE);
        tree_actions.setLayoutData(gridData10);
        treeViewer = new TreeViewer(tree_actions);
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
    public ToolBar getToolBar() {
        return toolBar;
    }
} 
