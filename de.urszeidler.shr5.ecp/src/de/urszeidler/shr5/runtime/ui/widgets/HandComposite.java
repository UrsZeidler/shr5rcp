package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolItem;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

public class HandComposite extends ActionPhaseComposite {

    private WritableValue character = new WritableValue();
    private EReference references;
    private InitativePass initativePass;

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
    protected void updateToolbar() {

        ToolItem toolItem = new ToolItem(actionBar, SWT.NONE);
        toolItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Object value = nameable.getValue();
                if (value instanceof Nahkampfwaffe) {
                    Nahkampfwaffe nk = (Nahkampfwaffe)value;
                    
                    ComplexAction complexAction = GameplayFactory.eINSTANCE.createComplexAction();
                    MeeleAttackCmd meeleAttackCmd = GameplayFactory.eINSTANCE.createMeeleAttackCmd();
                    meeleAttackCmd.setWeapon(nk);
                   
                    
                    //complexAction.setSubject((RuntimeCharacter)character.getValue());
                    complexAction.getSubCommands().add(meeleAttackCmd);                   
                    initativePass.setAction(complexAction);
                    initativePass.redo();

                } else if (value instanceof AbstaktFernKampfwaffe) {
                    AbstaktFernKampfwaffe afk = (AbstaktFernKampfwaffe)value;

                }
            }
        });
        toolItem.setText("a");
        actionBar.getParent().layout(true);
        // actionBar = new ToolBar(parent, style)

       // super.updateToolbar();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    public void setCharacter(InitativePass pass, EReference ref) {
        this.initativePass = pass;
        
        final  RuntimeCharacter character2 = pass.getSubject();
        character.setValue(character2);
        references = ref;
        setNameable((Beschreibbar)character2.eGet(references));
        //updateToolbar();

        IObservableValue observeDetailValue = EMFObservables.observeDetailValue(Realm.getDefault(), character, ref);
        observeDetailValue.addChangeListener(new IChangeListener() {

            @Override
            public void handleChange(ChangeEvent event) {
                setNameable((Beschreibbar)character2.eGet(references));
                //updateToolbar();
            }
        });
    }

}
