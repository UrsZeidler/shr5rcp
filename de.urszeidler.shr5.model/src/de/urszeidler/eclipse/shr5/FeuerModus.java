/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feuer Modus</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuerModus()
 * @model
 * @generated
 */
public enum FeuerModus implements Enumerator {
	/**
     * The '<em><b>EM</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #EM_VALUE
     * @generated
     * @ordered
     */
	EM(0, "EM", "EM"),

	/**
     * The '<em><b>HM</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #HM_VALUE
     * @generated
     * @ordered
     */
	HM(1, "HM", "HM"),

	/**
     * The '<em><b>SM</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SM_VALUE
     * @generated
     * @ordered
     */
	SM(2, "SM", "SM"),

	/**
     * The '<em><b>AM</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #AM_VALUE
     * @generated
     * @ordered
     */
	AM(3, "AM", "AM");

	/**
     * The '<em><b>EM</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #EM
     * @model
     * @generated
     * @ordered
     */
	public static final int EM_VALUE = 0;

	/**
     * The '<em><b>HM</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #HM
     * @model
     * @generated
     * @ordered
     */
	public static final int HM_VALUE = 1;

	/**
     * The '<em><b>SM</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SM
     * @model
     * @generated
     * @ordered
     */
	public static final int SM_VALUE = 2;

	/**
     * The '<em><b>AM</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #AM
     * @model
     * @generated
     * @ordered
     */
	public static final int AM_VALUE = 3;

	/**
     * An array of all the '<em><b>Feuer Modus</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final FeuerModus[] VALUES_ARRAY =
		new FeuerModus[] {
            EM,
            HM,
            SM,
            AM,
        };

	/**
     * A public read-only list of all the '<em><b>Feuer Modus</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<FeuerModus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Feuer Modus</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static FeuerModus get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FeuerModus result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Feuer Modus</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static FeuerModus getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FeuerModus result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Feuer Modus</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static FeuerModus get(int value) {
        switch (value) {
            case EM_VALUE: return EM;
            case HM_VALUE: return HM;
            case SM_VALUE: return SM;
            case AM_VALUE: return AM;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private FeuerModus(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }
	
} //FeuerModus
