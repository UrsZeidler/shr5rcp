/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modifikator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getModifikatorType()
 * @model
 * @generated
 */
public enum ModifikatorType implements Enumerator {
	/**
     * The '<em><b>Natural</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NATURAL_VALUE
     * @generated
     * @ordered
     */
	NATURAL(0, "Natural", "Natural"),

	/**
     * The '<em><b>Cyber</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CYBER_VALUE
     * @generated
     * @ordered
     */
	CYBER(1, "Cyber", "Cyber"),

	/**
     * The '<em><b>Bio</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BIO_VALUE
     * @generated
     * @ordered
     */
	BIO(2, "Bio", "Bio");

	/**
     * The '<em><b>Natural</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Natural</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #NATURAL
     * @model name="Natural"
     * @generated
     * @ordered
     */
	public static final int NATURAL_VALUE = 0;

	/**
     * The '<em><b>Cyber</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cyber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CYBER
     * @model name="Cyber"
     * @generated
     * @ordered
     */
	public static final int CYBER_VALUE = 1;

	/**
     * The '<em><b>Bio</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bio</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #BIO
     * @model name="Bio"
     * @generated
     * @ordered
     */
	public static final int BIO_VALUE = 2;

	/**
     * An array of all the '<em><b>Modifikator Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ModifikatorType[] VALUES_ARRAY =
		new ModifikatorType[] {
            NATURAL,
            CYBER,
            BIO,
        };

	/**
     * A public read-only list of all the '<em><b>Modifikator Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ModifikatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Modifikator Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ModifikatorType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ModifikatorType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Modifikator Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ModifikatorType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ModifikatorType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Modifikator Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ModifikatorType get(int value) {
        switch (value) {
            case NATURAL_VALUE: return NATURAL;
            case CYBER_VALUE: return CYBER;
            case BIO_VALUE: return BIO;
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
	private ModifikatorType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
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
	
} //ModifikatorType
