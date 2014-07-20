package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.FillLayout;

public class CharacterMonitor extends Composite {

    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    private WritableValue character1 = new WritableValue();
    private RuntimeCharacter character = RuntimeFactory.eINSTANCE.createRuntimeCharacter();

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public CharacterMonitor(Composite parent, int style) {
        super(parent, style);
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        setLayout(new FillLayout(SWT.HORIZONTAL));
        
        Composite composite = new Composite(this, SWT.NONE);
        toolkit.adapt(composite);
        toolkit.paintBordersFor(composite);
        NonPlayerCharacter nonPlayerCharacter = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        nonPlayerCharacter.setPersona(Shr5Factory.eINSTANCE.createMudanPersona());
        character.setCharacter(nonPlayerCharacter);
        init(composite);
    }

    private void init(Composite composite) {
        int col = character.getPhysicalDamage() / 3;
        for (int i = 1; i < col; i++) {
            new SimpleSingleState(composite, SWT.BORDER);
            new SimpleSingleState(composite, SWT.BORDER);
            SimpleSingleState simpleSingleState = new SimpleSingleState(composite, SWT.BORDER);
            simpleSingleState.setSuffixLabel("-"+i);
        }
       int rest= character.getPhysicalDamage() % 3;
       for (int i = 1; i < rest; i++) {
           new SimpleSingleState(composite, SWT.BORDER);
         }

    }

}
