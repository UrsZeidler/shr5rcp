/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.gameplay.CombatSpellCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combat Spell Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CombatSpellCmdImpl extends SpellCommandImpl implements CombatSpellCmd {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombatSpellCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.COMBAT_SPELL_CMD;
    }

} //CombatSpellCmdImpl
