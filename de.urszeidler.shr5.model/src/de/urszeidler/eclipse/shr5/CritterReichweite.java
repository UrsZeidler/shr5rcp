/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Critter Reichweite</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritterReichweite()
 * @model
 * @generated
 */
public enum CritterReichweite implements Enumerator {
	/**
	 * The '<em><b>Blickfeld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLICKFELD_VALUE
	 * @generated
	 * @ordered
	 */
	BLICKFELD(0, "blickfeld", "blickfeld"),

	/**
	 * The '<em><b>Beruehrung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BERUEHRUNG_VALUE
	 * @generated
	 * @ordered
	 */
	BERUEHRUNG(1, "beruehrung", "beruehrung"),

	/**
	 * The '<em><b>Selbst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELBST_VALUE
	 * @generated
	 * @ordered
	 */
	SELBST(2, "selbst", "selbst"),

	/**
	 * The '<em><b>Speziell</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEZIELL_VALUE
	 * @generated
	 * @ordered
	 */
	SPEZIELL(3, "speziell", "speziell");

	/**
	 * The '<em><b>Blickfeld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blickfeld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLICKFELD
	 * @model name="blickfeld"
	 * @generated
	 * @ordered
	 */
	public static final int BLICKFELD_VALUE = 0;

	/**
	 * The '<em><b>Beruehrung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beruehrung</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BERUEHRUNG
	 * @model name="beruehrung"
	 * @generated
	 * @ordered
	 */
	public static final int BERUEHRUNG_VALUE = 1;

	/**
	 * The '<em><b>Selbst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Selbst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELBST
	 * @model name="selbst"
	 * @generated
	 * @ordered
	 */
	public static final int SELBST_VALUE = 2;

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
	public static final int SPEZIELL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Critter Reichweite</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CritterReichweite[] VALUES_ARRAY =
		new CritterReichweite[] {
			BLICKFELD,
			BERUEHRUNG,
			SELBST,
			SPEZIELL,
		};

	/**
	 * A public read-only list of all the '<em><b>Critter Reichweite</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CritterReichweite> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Critter Reichweite</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CritterReichweite get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CritterReichweite result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Critter Reichweite</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CritterReichweite getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CritterReichweite result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Critter Reichweite</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CritterReichweite get(int value) {
		switch (value) {
			case BLICKFELD_VALUE: return BLICKFELD;
			case BERUEHRUNG_VALUE: return BERUEHRUNG;
			case SELBST_VALUE: return SELBST;
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
	private CritterReichweite(int value, String name, String literal) {
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
	
} //CritterReichweite
