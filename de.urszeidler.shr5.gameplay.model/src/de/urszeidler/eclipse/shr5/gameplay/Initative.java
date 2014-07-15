/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Initative#getIni <em>Ini</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Initative#getActualIni <em>Actual Ini</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Initative#isSizeInitative <em>Size Initative</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitative()
 * @model
 * @generated
 */
public interface Initative extends SubjectCommand {
    /**
     * Returns the value of the '<em><b>Ini</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ini</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ini</em>' attribute.
     * @see #setIni(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitative_Ini()
     * @model
     * @generated
     */
    int getIni();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Initative#getIni <em>Ini</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ini</em>' attribute.
     * @see #getIni()
     * @generated
     */
    void setIni(int value);

    /**
     * Returns the value of the '<em><b>Actual Ini</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actual Ini</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actual Ini</em>' attribute.
     * @see #setActualIni(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitative_ActualIni()
     * @model
     * @generated
     */
    int getActualIni();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Initative#getActualIni <em>Actual Ini</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Actual Ini</em>' attribute.
     * @see #getActualIni()
     * @generated
     */
    void setActualIni(int value);

    /**
     * Returns the value of the '<em><b>Size Initative</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size Initative</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size Initative</em>' attribute.
     * @see #setSizeInitative(boolean)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInitative_SizeInitative()
     * @model default="false"
     * @generated
     */
    boolean isSizeInitative();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Initative#isSizeInitative <em>Size Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size Initative</em>' attribute.
     * @see #isSizeInitative()
     * @generated
     */
    void setSizeInitative(boolean value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    int nextPass(int actualPhase);

} // Initative
