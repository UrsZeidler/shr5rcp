/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getCharacter <em>Character</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getRightHand <em>Right Hand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getLeftHand <em>Left Hand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getInUse <em>In Use</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getArmor <em>Armor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getUsedEdge <em>Used Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getRuntimeCharacter()
 * @model
 * @generated
 */
public interface RuntimeCharacter extends AbstractExtendetDataAware, PhyicalState {
    /**
     * Returns the value of the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character</em>' reference.
     * @see #setCharacter(ManagedCharacter)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getRuntimeCharacter_Character()
     * @model required="true"
     * @generated
     */
    ManagedCharacter getCharacter();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getCharacter <em>Character</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character</em>' reference.
     * @see #getCharacter()
     * @generated
     */
    void setCharacter(ManagedCharacter value);

    /**
     * Returns the value of the '<em><b>Right Hand</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right Hand</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The item in the right hand of the character.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Right Hand</em>' reference.
     * @see #setRightHand(AbstraktGegenstand)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getRuntimeCharacter_RightHand()
     * @model
     * @generated
     */
    AbstraktGegenstand getRightHand();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getRightHand <em>Right Hand</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right Hand</em>' reference.
     * @see #getRightHand()
     * @generated
     */
    void setRightHand(AbstraktGegenstand value);

    /**
     * Returns the value of the '<em><b>Left Hand</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left Hand</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The item in the left hand of the character.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Left Hand</em>' reference.
     * @see #setLeftHand(AbstraktGegenstand)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getRuntimeCharacter_LeftHand()
     * @model
     * @generated
     */
    AbstraktGegenstand getLeftHand();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getLeftHand <em>Left Hand</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left Hand</em>' reference.
     * @see #getLeftHand()
     * @generated
     */
    void setLeftHand(AbstraktGegenstand value);

    /**
     * Returns the value of the '<em><b>In Use</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.AbstraktGegenstand}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Use</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The items the character carries right know, it is a subset of the characters inventory.
     * <!-- end-model-doc -->
     * @return the value of the '<em>In Use</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getRuntimeCharacter_InUse()
     * @model
     * @generated
     */
    EList<AbstraktGegenstand> getInUse();

    /**
     * Returns the value of the '<em><b>Armor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Armor</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The cloth the character curently uses.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Armor</em>' reference.
     * @see #setArmor(Kleidung)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getRuntimeCharacter_Armor()
     * @model
     * @generated
     */
    Kleidung getArmor();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getArmor <em>Armor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Armor</em>' reference.
     * @see #getArmor()
     * @generated
     */
    void setArmor(Kleidung value);

    /**
     * Returns the value of the '<em><b>Used Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Counts the edge used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Used Edge</em>' attribute.
     * @see #setUsedEdge(int)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getRuntimeCharacter_UsedEdge()
     * @model
     * @generated
     */
    int getUsedEdge();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getUsedEdge <em>Used Edge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Used Edge</em>' attribute.
     * @see #getUsedEdge()
     * @generated
     */
    void setUsedEdge(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Simple method to decide if the character has edge left.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean canUseEdge();

} // RuntimeCharacter
