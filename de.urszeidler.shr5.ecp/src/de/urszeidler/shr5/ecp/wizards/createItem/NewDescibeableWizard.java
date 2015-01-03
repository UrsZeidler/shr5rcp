/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards.createItem;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.shr5.ecp.wizards.Messages;

/**
 * @author urs
 */
public class NewDescibeableWizard extends AbstractNewItemWizard {

    public NewDescibeableWizard() {
        super();
        setWindowTitle(Messages.NewDescibeableWizard_titel);
//        setDefaultPageImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp","images/newSoftwareWizard.png"));//$NON-NLS-1$//$NON-NLS-2$
    }

    
    @Override
    protected Collection<EClass> provideClasses() {
        return FluentIterable.from(super.provideClasses())
                .filter(ShadowrunTools.esupertypePredicate(Shr5Package.Literals.BESCHREIBBAR)).toList();
     }
}
