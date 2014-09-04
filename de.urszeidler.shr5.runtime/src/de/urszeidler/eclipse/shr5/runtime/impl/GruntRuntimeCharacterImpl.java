/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grunt Runtime Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GruntRuntimeCharacterImpl extends RuntimeCharacterImpl implements GruntRuntimeCharacter {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GruntRuntimeCharacterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.GRUNT_RUNTIME_CHARACTER;
    }

    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public void setMentalDamage(int newMentalDamage) {
        int oldMentalDamage = mentalDamage;
        int diff = newMentalDamage-oldMentalDamage ;
        super.setMentalDamage(newMentalDamage);
        
        int physicalDamage1 = physicalDamage + diff;
        setPhysicalDamage(physicalDamage1);        
    }

} //GruntRuntimeCharacterImpl
