/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Schadens Typ</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSchadensTyp()
 * @model
 * @generated
 */
public enum SchadensTyp implements Enumerator {
	/**
     * The '<em><b>Koerperlich</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #KOERPERLICH_VALUE
     * @generated
     * @ordered
     */
	KOERPERLICH(0, "koerperlich", "koerperlich"),

	/**
     * The '<em><b>Geistig</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #GEISTIG_VALUE
     * @generated
     * @ordered
     */
	GEISTIG(1, "geistig", "geistig"),

	/**
     * The '<em><b>Speziell</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SPEZIELL_VALUE
     * @generated
     * @ordered
     */
	SPEZIELL(2, "speziell", "speziell");

	/**
     * The '<em><b>Koerperlich</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Koerperlich</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #KOERPERLICH
     * @model name="koerperlich"
     * @generated
     * @ordered
     */
	public static final int KOERPERLICH_VALUE = 0;

	/**
     * The '<em><b>Geistig</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Geistig</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #GEISTIG
     * @model name="geistig"
     * @generated
     * @ordered
     */
	public static final int GEISTIG_VALUE = 1;

	/**
     * The '<em><b>Speziell</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Speziell</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SPEZIELL
     * @model name="speziell"
     * @generated
     * @ordered
     */
	public static final int SPEZIELL_VALUE = 2;

	/**
     * An array of all the '<em><b>Schadens Typ</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final SchadensTyp[] VALUES_ARRAY =
		new SchadensTyp[] {
            KOERPERLICH,
            GEISTIG,
            SPEZIELL,
        };

	/**
     * A public read-only list of all the '<em><b>Schadens Typ</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<SchadensTyp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Schadens Typ</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static SchadensTyp get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SchadensTyp result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Schadens Typ</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static SchadensTyp getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SchadensTyp result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Schadens Typ</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static SchadensTyp get(int value) {
        switch (value) {
            case KOERPERLICH_VALUE: return KOERPERLICH;
            case GEISTIG_VALUE: return GEISTIG;
            case SPEZIELL_VALUE: return SPEZIELL;
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
	private SchadensTyp(int value, String name, String literal) {
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
	
} //SchadensTyp
