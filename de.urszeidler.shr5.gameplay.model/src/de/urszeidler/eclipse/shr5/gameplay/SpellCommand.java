/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.Zauber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spell Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SpellCommand#getSpell <em>Spell</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSpellCommand()
 * @model abstract="true"
 * @generated
 */
public interface SpellCommand extends ProbeCommand {
    /**
     * Returns the value of the '<em><b>Spell</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spell</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spell</em>' reference.
     * @see #setSpell(Zauber)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSpellCommand_Spell()
     * @model required="true"
     * @generated
     */
    Zauber getSpell();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SpellCommand#getSpell <em>Spell</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spell</em>' reference.
     * @see #getSpell()
     * @generated
     */
    void setSpell(Zauber value);

} // SpellCommand
