/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Magische Tradition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagischeTradition()
 * @model
 * @generated
 */
public enum MagischeTradition implements Enumerator {
	/**
     * The '<em><b>Hermetisch</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #HERMETISCH_VALUE
     * @generated
     * @ordered
     */
	HERMETISCH(0, "Hermetisch", "Hermetisch"),

	/**
     * The '<em><b>Schamanisch</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SCHAMANISCH_VALUE
     * @generated
     * @ordered
     */
	SCHAMANISCH(1, "Schamanisch", "Schamanisch");

	/**
     * The '<em><b>Hermetisch</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hermetisch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #HERMETISCH
     * @model name="Hermetisch"
     * @generated
     * @ordered
     */
	public static final int HERMETISCH_VALUE = 0;

	/**
     * The '<em><b>Schamanisch</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Schamanisch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SCHAMANISCH
     * @model name="Schamanisch"
     * @generated
     * @ordered
     */
	public static final int SCHAMANISCH_VALUE = 1;

	/**
     * An array of all the '<em><b>Magische Tradition</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final MagischeTradition[] VALUES_ARRAY =
		new MagischeTradition[] {
            HERMETISCH,
            SCHAMANISCH,
        };

	/**
     * A public read-only list of all the '<em><b>Magische Tradition</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<MagischeTradition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Magische Tradition</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MagischeTradition get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MagischeTradition result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Magische Tradition</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MagischeTradition getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MagischeTradition result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Magische Tradition</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MagischeTradition get(int value) {
        switch (value) {
            case HERMETISCH_VALUE: return HERMETISCH;
            case SCHAMANISCH_VALUE: return SCHAMANISCH;
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
	private MagischeTradition(int value, String name, String literal) {
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
	
} //MagischeTradition
