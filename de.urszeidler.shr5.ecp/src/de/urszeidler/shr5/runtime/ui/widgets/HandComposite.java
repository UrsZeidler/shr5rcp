package de.urszeidler.shr5.runtime.ui.widgets;

import java.util.List;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;

public class HandComposite extends NameableComposite {

    private WritableValue character = new WritableValue();
    private EReference references;
    private InitativePass initativePass;
    private IChangeListener listener;
    private IObservableValue observeDetailValue;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     * @param grouname
     */
    public HandComposite(Composite parent, int style, String grouname) {
        super(parent, style, grouname);

    }

    @Override
    public void dispose() {
        character.dispose();
        observeDetailValue.removeChangeListener(listener);
        observeDetailValue.dispose();
        super.dispose();
    }

    @Override
    protected void updateToolbar() {

        ToolItem toolItem = new ToolItem(actionBar, SWT.NONE);
        toolItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        toolItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Object value = nameable.getValue();
                if (value instanceof Nahkampfwaffe) {
                    Nahkampfwaffe nk = (Nahkampfwaffe)value;

                    ComplexAction complexAction = GameplayFactory.eINSTANCE.createComplexAction();
                    MeeleAttackCmd meeleAttackCmd = GameplayFactory.eINSTANCE.createMeeleAttackCmd();
                    meeleAttackCmd.setWeapon(nk);

                    // complexAction.setSubject((RuntimeCharacter)character.getValue());
                    complexAction.getSubCommands().add(meeleAttackCmd);
                    initativePass.setAction(complexAction);
                    // initativePass.redo();

                } else if (value instanceof AbstaktFernKampfwaffe) {
                    AbstaktFernKampfwaffe afk = (AbstaktFernKampfwaffe)value;
                    // Simple action case
                    //if(initativePass.getAction()==null)
                    SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
                    if(simpleAction==null)
                        return;

                    RangedAttackCmd meeleAttackCmd = GameplayFactory.eINSTANCE.createRangedAttackCmd();
                    meeleAttackCmd.setWeapon(afk);

                    simpleAction.getSubCommands().add(meeleAttackCmd);
//                    simpleActions.setAction1(simpleAction);
//                    // complexAction.setSubject((RuntimeCharacter)character.getValue());
//                    // simpleAction.getSubCommands().add(meeleAttackCmd);
//                    initativePass.setAction(simpleActions);
                    // initativePass.redo();

                }
            }
        });
        //toolItem.setText("a");
        toolItem.setToolTipText("Use item");
        actionBar.getParent().layout(true);
        // actionBar = new ToolBar(parent, style)
        ToolItem toolItem1 = new ToolItem(actionBar, SWT.NONE);
        toolItem1.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        toolItem1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
              if(initativePass.getFreeAction()==null){
                  FreeAction action = GameplayFactory.eINSTANCE.createFreeAction();
                  SetFeatureCommand setFeatureCommand = GameplayFactory.eINSTANCE.createSetFeatureCommand();
                  action.getSubCommands().add(setFeatureCommand);
                  setFeatureCommand.setObject(initativePass.getSubject());
                  setFeatureCommand.setFeature(references);
                  setFeatureCommand.setObject(null);
                  initativePass.setFreeAction(action);
              }
            }
        });
        toolItem1.setToolTipText("drop item");
        
        ToolItem tltmNewItem = new ToolItem(actionBar, SWT.NONE);
        tltmNewItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        tltmNewItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
                if(simpleAction==null)
                    return;
                EObject object = null;
                IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(initativePass.getSubject(), references);
                List<?> values = (List<?>) propertyDescriptor.getChoiceOfValues(initativePass.getSubject());
                OwnChooseDialog dialog = new OwnChooseDialog(getShell(), values.toArray(new Object[]{}),
                        "Change item", "Select the item you want to choose.");
                
                dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
                int open = dialog.open();
                if (open == Dialog.OK) {
                    Object[] result = dialog.getResult();
                    if (result.length > 0) {
                        object = (EObject)result[0];
                     }
                    else
                        return;
                }
                
                SetFeatureCommand setFeatureCommand = GameplayFactory.eINSTANCE.createSetFeatureCommand();
                simpleAction.getSubCommands().add(setFeatureCommand);
                setFeatureCommand.setObject(initativePass.getSubject());
                setFeatureCommand.setFeature(references);
                setFeatureCommand.setObject(object);
                //initativePass.setFreeAction(action);

                
            }
        });
        tltmNewItem.setToolTipText("change item");
        // super.updateToolbar();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    public void setCharacter(InitativePass pass, EReference ref) {
        this.initativePass = pass;

        final RuntimeCharacter character2 = pass.getSubject();
        character.setValue(character2);
        references = ref;
        setNameable((Beschreibbar)character2.eGet(references));
        // updateToolbar();
        if (observeDetailValue != null) {
            observeDetailValue.removeChangeListener(listener);
            observeDetailValue.dispose();
        }

        observeDetailValue = EMFObservables.observeDetailValue(Realm.getDefault(), character, ref);
        listener = new IChangeListener() {

            @Override
            public void handleChange(ChangeEvent event) {
                setNameable((Beschreibbar)character2.eGet(references));
                // updateToolbar();
            }
        };
        observeDetailValue.addChangeListener(listener);
    }

}
