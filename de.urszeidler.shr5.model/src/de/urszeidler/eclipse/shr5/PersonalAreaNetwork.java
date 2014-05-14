/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Area Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaves <em>Slaves</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getMaster <em>Master</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaveMax <em>Slave Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonalAreaNetwork()
 * @model
 * @generated
 */
public interface PersonalAreaNetwork extends EObject {
    /**
     * Returns the value of the '<em><b>Slaves</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.MatrixDevice}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slaves</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slaves</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonalAreaNetwork_Slaves()
     * @model
     * @generated
     */
    EList<MatrixDevice> getSlaves();

    /**
     * Returns the value of the '<em><b>Master</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getPan <em>Pan</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Master</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Master</em>' container reference.
     * @see #setMaster(MatrixDevice)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonalAreaNetwork_Master()
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getPan
     * @model opposite="pan" required="true" transient="false"
     * @generated
     */
    MatrixDevice getMaster();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getMaster <em>Master</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Master</em>' container reference.
     * @see #getMaster()
     * @generated
     */
    void setMaster(MatrixDevice value);

    /**
     * Returns the value of the '<em><b>Slave Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slave Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slave Max</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonalAreaNetwork_SlaveMax()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getSlaveMax();

} // PersonalAreaNetwork
