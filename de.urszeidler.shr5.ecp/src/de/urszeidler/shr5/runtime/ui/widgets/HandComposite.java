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

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

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
        actionBar.dispose();
        createActionbar();

        Object value = nameable.getValue();

        Shr5Switch<Object> shr5Switch = new Shr5Switch<Object>() {
            public Object caseFeuerwaffe(final Feuerwaffe object) {
                final RuntimeCharacter rChar = (RuntimeCharacter)character.getValue();
                FeuerModus modus = GameplayTools.getFireArmModus(rChar, object);
                switch (modus) {
                    case EM:
                        createUseFwSimpleAction(object, modus,1);
                        createChangeFwModeAction(object);
                        break;
                    case HM:
                        createUseFwSimpleAction(object, modus,1);
                        createUseFwComplexAction(object, modus,3);
                        createChangeFwModeAction(object);
                        break;

                    case AM:
                        createUseFwSimpleAction(object, modus,6);
                        createUseFwComplexAction(object, modus,10);
                        createUseFwComplexAction(object, modus,20);
                        createChangeFwModeAction(object);
                        break;
                    case SM:
                        createUseFwSimpleAction(object, modus,3);
                        createUseFwComplexAction(object, modus,6);
                        createChangeFwModeAction(object);
                        break;
                    default:
                        break;
                }

                return object;
            };

            @Override
            public Object caseNahkampfwaffe(final Nahkampfwaffe object) {
                createMeeleComplexAction(object);
                return object;
            }

        };
        if (value != null)
            shr5Switch.doSwitch((EObject)value);

        // ToolItem toolItemUseItem = new ToolItem(actionBar, SWT.NONE);
        // toolItemUseItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        // toolItemUseItem.addSelectionListener(new SelectionAdapter() {
        // @Override
        // public void widgetSelected(SelectionEvent e) {
        // Object value = nameable.getValue();
        // if (value instanceof Nahkampfwaffe) {
        // Nahkampfwaffe nk = (Nahkampfwaffe)value;
        //
        // ComplexAction complexAction = GameplayFactory.eINSTANCE.createComplexAction();
        // MeeleAttackCmd meeleAttackCmd = GameplayFactory.eINSTANCE.createMeeleAttackCmd();
        // meeleAttackCmd.setWeapon(nk);
        //
        // // complexAction.setSubject((RuntimeCharacter)character.getValue());
        // complexAction.getSubCommands().add(meeleAttackCmd);
        // initativePass.setAction(complexAction);
        // // initativePass.redo();
        //
        // } else if (value instanceof AbstaktFernKampfwaffe) {
        // AbstaktFernKampfwaffe afk = (AbstaktFernKampfwaffe)value;
        //
        // SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
        // if (simpleAction == null)
        // return;
        //
        // RangedAttackCmd meeleAttackCmd = GameplayFactory.eINSTANCE.createRangedAttackCmd();
        // meeleAttackCmd.setWeapon(afk);
        //
        // simpleAction.getSubCommands().add(meeleAttackCmd);
        // }
        // }
        // });
        // // toolItem.setText("a");
        // toolItemUseItem.setToolTipText("Use item");

        if (value != null) {
            createDropItemFreeAction();
        } else {
            if (character != null) {
                final RuntimeCharacter rChar = (RuntimeCharacter)character.getValue();
                if (rChar != null && rChar.getCharacter() != null && rChar.getCharacter().getPersona() != null
                        && rChar.getCharacter().getPersona().getSpezies() != null) {
                    Nahkampfwaffe angriff = rChar.getCharacter().getPersona().getSpezies().getAngriff();
                    angriff.setPraezision(rChar.getCharacter().getPersona().getKoerperlich());
                    createMeeleComplexAction(angriff);
                }
            }
        }
        createChangeItemSimpleAction();

        actionBar.getParent().layout(true);
    }

    /**
     * 
     */
    protected void createChangeItemSimpleAction() {
        ToolItem changeItem = new ToolItem(actionBar, SWT.NONE);
        changeItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        changeItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
                if (simpleAction == null)
                    return;
                SetFeatureCommand setFeatureCommand = ShadowrunEditingTools.changeItem(initativePass.getSubject(), references, getShell());

                simpleAction.getSubCommands().add(setFeatureCommand);
            }
        });
        changeItem.setToolTipText("change item");
    }

    protected void createDropItemFreeAction() {
        ToolItem toolItem1 = new ToolItem(actionBar, SWT.NONE);
        toolItem1.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        toolItem1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (initativePass.getFreeAction() == null) {
                    FreeAction action = GameplayFactory.eINSTANCE.createFreeAction();
                    SetFeatureCommand setFeatureCommand = GameplayFactory.eINSTANCE.createSetFeatureCommand();
                    action.getSubCommands().add(setFeatureCommand);
                    setFeatureCommand.setObject(initativePass.getSubject());
                    setFeatureCommand.setFeature(references);
                    setFeatureCommand.setValue(null);
                    initativePass.setFreeAction(action);
                }
            }
        });
        toolItem1.setToolTipText("drop item");
    }

    /**
     * 
     */
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
                // updateToolbarView();
                updateToolbar();
            }
        };
        observeDetailValue.addChangeListener(listener);
        updateToolbar();
    }

    protected SetFeatureCommand changeItem(RuntimeCharacter subject, EReference references2) {
        EObject object = null;

        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(subject, references2);
        List<?> values = (List<?>)propertyDescriptor.getChoiceOfValues(subject);
        OwnChooseDialog dialog = new OwnChooseDialog(getShell(), values.toArray(new Object[]{}), "Change item", "Select the item you want to choose.");

        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0) {
                object = (EObject)result[0];
            }

        }
        if (object == null)
            return null;
        SetFeatureCommand setFeatureCommand = GameplayFactory.eINSTANCE.createSetFeatureCommand();
        setFeatureCommand.setObject(subject);
        setFeatureCommand.setFeature(references2);
        setFeatureCommand.setValue(object);
        return setFeatureCommand;
    }

    /**
     * 
     */
    protected void createUseFwSimpleAction(final Feuerwaffe object,final FeuerModus modus,final int numberOfShoots) {
        ToolItem toolItemUseItem = new ToolItem(actionBar, SWT.NONE);
        toolItemUseItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        toolItemUseItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
                if (simpleAction == null)
                    return;

                RangedAttackCmd rangedAttackCmd = GameplayFactory.eINSTANCE.createRangedAttackCmd();

                rangedAttackCmd.setNumberOfShoots(numberOfShoots);
                rangedAttackCmd.setWeapon(object);
                rangedAttackCmd.setModus(modus);

                simpleAction.getSubCommands().add(rangedAttackCmd);
            }
        });
        toolItemUseItem.setToolTipText("Use " + object.getName() + " in " + modus + " modus.("+numberOfShoots+")");
    }
    
    /**
     * 
     */
    protected void createUseFwComplexAction(final Feuerwaffe object,final FeuerModus modus,final int numberOfShoots) {
        ToolItem toolItemUseItem = new ToolItem(actionBar, SWT.NONE);
        toolItemUseItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        toolItemUseItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                ComplexAction complexAction = GameplayFactory.eINSTANCE.createComplexAction();
                RangedAttackCmd rangedAttackCmd = GameplayFactory.eINSTANCE.createRangedAttackCmd();
                complexAction.getSubCommands().add(rangedAttackCmd);

                rangedAttackCmd.setNumberOfShoots(numberOfShoots);
                rangedAttackCmd.setWeapon(object);
                rangedAttackCmd.setModus(modus);

                initativePass.setAction(complexAction);
            }
        });
        toolItemUseItem.setToolTipText("Use " + object.getName() + " in " + modus + " modus.("+numberOfShoots+")");
    }

    /**
     * @param object
     */
    protected void createChangeFwModeAction(final Feuerwaffe object) {
        ToolItem toolItemChangeFwMode = new ToolItem(actionBar, SWT.NONE);
        toolItemChangeFwMode.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        toolItemChangeFwMode.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
                if (simpleAction == null)
                    return;
                OwnChooseDialog dialog = new OwnChooseDialog(getShell(), object.getModie().toArray(new Object[]{}), "Change item",
                        "Select the item you want to choose.");

                dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
                int open = dialog.open();
                FeuerModus fm = null;
                if (open == Dialog.OK) {
                    Object[] result = dialog.getResult();
                    if (result.length > 0) {
                        fm = (FeuerModus)result[0];
                    }

                }
                if (fm == null)
                    return;

                SetExtendetData cmd = GameplayFactory.eINSTANCE.createSetExtendetData();
                ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
                data.setEObject(object);
                data.setEFeature(Shr5Package.Literals.FEUERWAFFE__MODIE);

                cmd.setDataAware((AbstractExtendetDataAware)character.getValue());
                cmd.setData(data);
                cmd.setValue(fm);

                simpleAction.getSubCommands().add(cmd);
            }
        });
        toolItemChangeFwMode.setToolTipText("change mode");
    }

    /**
     * @param object
     */
    protected void createMeeleComplexAction(final Nahkampfwaffe object) {
        ToolItem toolItemMeeleItem = new ToolItem(actionBar, SWT.NONE);
        toolItemMeeleItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/use.png"));
        toolItemMeeleItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
//                ComplexAction complexAction = GameplayFactory.eINSTANCE.createComplexAction();
//                MeeleAttackCmd meeleAttackCmd = GameplayFactory.eINSTANCE.createMeeleAttackCmd();
//                meeleAttackCmd.setWeapon(object);
//
//                complexAction.getSubCommands().add(meeleAttackCmd);
                ComplexAction complexAction = GameplayTools.createMeleeAction(null,null,object);
                initativePass.setAction(complexAction);
            }
        });
        toolItemMeeleItem.setToolTipText("Use " + object.getName());
    }

}
