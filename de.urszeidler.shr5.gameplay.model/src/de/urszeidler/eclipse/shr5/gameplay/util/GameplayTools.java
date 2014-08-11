/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.util;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * @author urs
 *
 */
public class GameplayTools {

    /**
     * Create a runtime character.
     * 
     * @return
     */
    public static RuntimeCharacter createRuntimeCharacter() {
        ManagedCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        AbstraktPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
        persona.setKonstitutionBasis(4);
        character.setPersona(persona);

        RuntimeCharacter runtimeCharacter = RuntimeFactory.eINSTANCE.createRuntimeCharacter();
        runtimeCharacter.setCharacter(character);

        return runtimeCharacter;
    }
    
    public static void clearDefseMod(RuntimeCharacter subject) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
        subject.getExtendetData().remove(data);
    }

    public static int getDefenceMod(RuntimeCharacter subject) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
        return subject.getIntegerValue(data);
    }
    
    public static void inreaseDefenceMod(RuntimeCharacter subject, int value) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
        //int integerValue = subject.getIntegerValue(data);
        subject.increaseValue(data, value);
        
    }

}
