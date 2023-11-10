/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendet Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd#getIntervall <em>Intervall</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getExtendetSkillTestCmd()
 * @model
 * @generated
 */
public interface ExtendetSkillTestCmd extends SkillTestCmd {

    /**
     * Returns the value of the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Date</em>' attribute.
     * @see #setStartDate(Date)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getExtendetSkillTestCmd_StartDate()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate" required="true"
     * @generated
     */
    Date getStartDate();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @see #getStartDate()
     * @generated
     */
    void setStartDate(Date value);

    /**
     * Returns the value of the '<em><b>Intervall</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Intervall</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Intervall</em>' containment reference.
     * @see #setIntervall(Intervall)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getExtendetSkillTestCmd_Intervall()
     * @model containment="true" required="true"
     * @generated
     */
    Intervall getIntervall();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd#getIntervall <em>Intervall</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Intervall</em>' containment reference.
     * @see #getIntervall()
     * @generated
     */
    void setIntervall(Intervall value);
} // ExtendetSkillTestCmd
