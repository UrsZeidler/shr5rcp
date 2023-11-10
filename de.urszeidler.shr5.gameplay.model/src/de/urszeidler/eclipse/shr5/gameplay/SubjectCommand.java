/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * THis is the base for command involving subjects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SubjectCommand#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSubjectCommand()
 * @model abstract="true"
 * @generated
 */
public interface SubjectCommand extends Command {
    /**
     * Returns the value of the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subject</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subject</em>' reference.
     * @see #setSubject(RuntimeCharacter)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSubjectCommand_Subject()
     * @model required="true"
     * @generated
     */
    RuntimeCharacter getSubject();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SubjectCommand#getSubject <em>Subject</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subject</em>' reference.
     * @see #getSubject()
     * @generated
     */
    void setSubject(RuntimeCharacter value);

} // SubjectCommand
