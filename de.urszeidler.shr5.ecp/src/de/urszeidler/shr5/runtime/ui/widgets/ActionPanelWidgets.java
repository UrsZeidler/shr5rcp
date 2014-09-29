package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.shr5.runtime.ui.views.CombatTurnView.ComplexActionDropdownSelectionListener;
import de.urszeidler.shr5.runtime.ui.views.CombatTurnView.SimpleActionDropdownSelectionListener;
import org.eclipse.swt.layout.FillLayout;

public class ActionPanelWidgets extends Composite {

    
    public class ComplexActionDropdownSelectionListener extends SelectionAdapter {
        protected ToolItem dropdown;

        protected Menu menu;

        public ComplexActionDropdownSelectionListener(ToolItem dropdown) {
            this.dropdown = dropdown;
            menu = new Menu(dropdown.getParent().getShell());
        }

        public void add(String item, final ComplexAction complexAction) {
            MenuItem menuItem = new MenuItem(menu, SWT.NONE);
            menuItem.setText(item);
            if(complexAction==null)
                menuItem.setEnabled(false);
            
            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent event) {
                    // MenuItem selected = (MenuItem) event.widget;
//                    InitativePass initativePass = combatTurn.getCurrentTurn();
                    complexAction.setSubject(initativPass.getSubject());
                    initativPass.setAction(complexAction);
                    // dropdown.setText(selected.getText());
                }
            });
        }

        public void widgetSelected(SelectionEvent event) {
            if (event.detail == SWT.ARROW) {
                ToolItem item = (ToolItem)event.widget;
                Rectangle rect = item.getBounds();
                Point pt = item.getParent().toDisplay(new Point(rect.x, rect.y));
                menu.setLocation(pt.x, pt.y + rect.height);
                menu.setVisible(true);
            } else {
                System.out.println(dropdown.getText() + " Pressed");
            }
        }

     }


    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    private Composite composite = null;
    private Tree tree_actions = null;
    private TreeViewer treeViewer = null;
    private HandComposite rechte_Hand;
    private HandComposite linke_Hand;

    private WritableValue character = new WritableValue();
    private ToolBar toolBar;

    private InitativePass initativPass;
    private Composite composite_toolbar;

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
        gridLayout1.marginWidth = 1;
        gridLayout1.marginHeight = 1;
        gridLayout1.verticalSpacing = 1;
        gridLayout1.horizontalSpacing = 1;
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

    public void setCharacter(InitativePass initativePass) {
        this.character.setValue(initativePass.getSubject());
        this.initativPass = initativePass;
        rechte_Hand.setCharacter(initativePass, RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND);
        linke_Hand.setCharacter(initativePass, RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND);
        //TODO : add the dynamic menu here 
//        if(toolBar!=null)
//            toolBar.dispose();
//        
//        createToolbar();
     }

    @Override
    public void dispose() {
        character.dispose();
        super.dispose();
    }
    
    /**
     * This method initializes composite
     */
    private void createComposite() {
        new Label(this, SWT.NONE);
        
        composite_toolbar = new Composite(this, SWT.NONE);
        composite_toolbar.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite_toolbar.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        toolkit.adapt(composite_toolbar);
        toolkit.paintBordersFor(composite_toolbar);
//        toolBar = new ToolBar(composite_toolbar, SWT.BORDER | SWT.FLAT | SWT.RIGHT);
//        toolkit.adapt(toolBar);
//        toolkit.paintBordersFor(toolBar);
//        new Label(this, SWT.NONE);
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
         
        createToolbar();
//        new Label(composite, SWT.NONE);
//        new Label(composite, SWT.NONE);
        
        tree_actions = new Tree(composite, SWT.BORDER);
        tree_actions.setLayoutData(gridData10);
        treeViewer = new TreeViewer(tree_actions);
    }

    /**
     * 
     */
    protected void createToolbar() {
        toolBar = new ToolBar(composite_toolbar, SWT.BORDER | SWT.FLAT | SWT.RIGHT);
        toolkit.adapt(toolBar);
        toolkit.paintBordersFor(toolBar);

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

    public void refreshToolbar() {
        if(toolBar!=null)
            toolBar.dispose();
        
        createToolbar();        
    }
} 
