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
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

public class HandComposite extends ActionPhaseComposite {

    private WritableValue character = new WritableValue();
    private EReference references;

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
                Object value = character.getValue();
                if (value instanceof Nahkampfwaffe) {
                    Nahkampfwaffe nk = (Nahkampfwaffe)value;

                } else if (value instanceof AbstaktFernKampfwaffe) {
                    AbstaktFernKampfwaffe afk = (AbstaktFernKampfwaffe)value;

                }
            }
        });
        toolItem.setText("1");

        // actionBar = new ToolBar(parent, style)

        super.updateToolbar();
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    public void setCharacter(final RuntimeCharacter character2, EReference ref) {
        character.setValue(character2);
        references = ref;
        setNameable((Beschreibbar)character2.eGet(references));
        updateToolbar();

        IObservableValue observeDetailValue = EMFObservables.observeDetailValue(Realm.getDefault(), character, ref);
        observeDetailValue.addChangeListener(new IChangeListener() {

            @Override
            public void handleChange(ChangeEvent event) {
                setNameable((Beschreibbar)character2.eGet(references));
                updateToolbar();
            }
        });
    }

}
