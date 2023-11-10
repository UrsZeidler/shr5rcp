/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Critter Dauer</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritterDauer()
 * @model
 * @generated
 */
public enum CritterDauer implements Enumerator {
	/**
     * The '<em><b>Immer</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #IMMER_VALUE
     * @generated
     * @ordered
     */
	IMMER(0, "immer", "immer"),

	/**
     * The '<em><b>Sofort</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SOFORT_VALUE
     * @generated
     * @ordered
     */
	SOFORT(1, "sofort", "sofort"),

	/**
     * The '<em><b>Aufrechterhalten</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #AUFRECHTERHALTEN_VALUE
     * @generated
     * @ordered
     */
	AUFRECHTERHALTEN(2, "aufrechterhalten", "aufrechterhalten"),

	/**
     * The '<em><b>Permanent</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PERMANENT_VALUE
     * @generated
     * @ordered
     */
	PERMANENT(3, "permanent", "permanent"),

	/**
     * The '<em><b>Speziell</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SPEZIELL_VALUE
     * @generated
     * @ordered
     */
	SPEZIELL(4, "speziell", "speziell");

	/**
     * The '<em><b>Immer</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Immer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #IMMER
     * @model name="immer"
     * @generated
     * @ordered
     */
	public static final int IMMER_VALUE = 0;

	/**
     * The '<em><b>Sofort</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sofort</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SOFORT
     * @model name="sofort"
     * @generated
     * @ordered
     */
	public static final int SOFORT_VALUE = 1;

	/**
     * The '<em><b>Aufrechterhalten</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aufrechterhalten</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #AUFRECHTERHALTEN
     * @model name="aufrechterhalten"
     * @generated
     * @ordered
     */
	public static final int AUFRECHTERHALTEN_VALUE = 2;

	/**
     * The '<em><b>Permanent</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Permanent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PERMANENT
     * @model name="permanent"
     * @generated
     * @ordered
     */
	public static final int PERMANENT_VALUE = 3;

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
	public static final int SPEZIELL_VALUE = 4;

	/**
     * An array of all the '<em><b>Critter Dauer</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final CritterDauer[] VALUES_ARRAY =
		new CritterDauer[] {
            IMMER,
            SOFORT,
            AUFRECHTERHALTEN,
            PERMANENT,
            SPEZIELL,
        };

	/**
     * A public read-only list of all the '<em><b>Critter Dauer</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<CritterDauer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Critter Dauer</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static CritterDauer get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CritterDauer result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Critter Dauer</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static CritterDauer getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CritterDauer result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Critter Dauer</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static CritterDauer get(int value) {
        switch (value) {
            case IMMER_VALUE: return IMMER;
            case SOFORT_VALUE: return SOFORT;
            case AUFRECHTERHALTEN_VALUE: return AUFRECHTERHALTEN;
            case PERMANENT_VALUE: return PERMANENT;
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
	private CritterDauer(int value, String name, String literal) {
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
	
} //CritterDauer
