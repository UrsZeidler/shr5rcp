/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards.createItem;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * @author urs
 */
public class NewByuableWizard extends AbstractNewItemWizard {

    @Override
    protected Collection<EClass> provideClasses() {
        return FluentIterable.from(super.provideClasses())
                .filter(ShadowrunTools.esupertypePredicate(Shr5Package.Literals.GELD_WERT)).toList();
     }
}
