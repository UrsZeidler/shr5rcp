/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feuwerwaffen Erweiterung</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFeuwerwaffenErweiterung()
 * @model
 * @generated
 */
public enum FeuwerwaffenErweiterung implements Enumerator {
	/**
     * The '<em><b>Lauf</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #LAUF_VALUE
     * @generated
     * @ordered
     */
	LAUF(0, "Lauf", "Lauf"),

	/**
     * The '<em><b>Unten</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #UNTEN_VALUE
     * @generated
     * @ordered
     */
	UNTEN(1, "Unten", "Unten"),

	/**
     * The '<em><b>Oben</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OBEN_VALUE
     * @generated
     * @ordered
     */
	OBEN(2, "Oben", "Oben");

	/**
     * The '<em><b>Lauf</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lauf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #LAUF
     * @model name="Lauf"
     * @generated
     * @ordered
     */
	public static final int LAUF_VALUE = 0;

	/**
     * The '<em><b>Unten</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unten</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #UNTEN
     * @model name="Unten"
     * @generated
     * @ordered
     */
	public static final int UNTEN_VALUE = 1;

	/**
     * The '<em><b>Oben</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oben</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OBEN
     * @model name="Oben"
     * @generated
     * @ordered
     */
	public static final int OBEN_VALUE = 2;

	/**
     * An array of all the '<em><b>Feuwerwaffen Erweiterung</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final FeuwerwaffenErweiterung[] VALUES_ARRAY =
		new FeuwerwaffenErweiterung[] {
            LAUF,
            UNTEN,
            OBEN,
        };

	/**
     * A public read-only list of all the '<em><b>Feuwerwaffen Erweiterung</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<FeuwerwaffenErweiterung> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Feuwerwaffen Erweiterung</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FeuwerwaffenErweiterung get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FeuwerwaffenErweiterung result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Feuwerwaffen Erweiterung</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FeuwerwaffenErweiterung getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FeuwerwaffenErweiterung result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Feuwerwaffen Erweiterung</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FeuwerwaffenErweiterung get(int value) {
        switch (value) {
            case LAUF_VALUE: return LAUF;
            case UNTEN_VALUE: return UNTEN;
            case OBEN_VALUE: return OBEN;
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
	private FeuwerwaffenErweiterung(int value, String name, String literal) {
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
	
} //FeuwerwaffenErweiterung
