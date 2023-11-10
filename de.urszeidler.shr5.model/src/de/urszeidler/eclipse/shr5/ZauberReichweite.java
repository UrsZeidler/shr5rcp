/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Zauber Reichweite</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauberReichweite()
 * @model
 * @generated
 */
public enum ZauberReichweite implements Enumerator {
	/**
     * The '<em><b>Blickfeld</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BLICKFELD_VALUE
     * @generated
     * @ordered
     */
	BLICKFELD(0, "Blickfeld", "Blickfeld"),

	/**
     * The '<em><b>Begrenzt</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BEGRENZT_VALUE
     * @generated
     * @ordered
     */
	BEGRENZT(1, "Begrenzt", "Begrenzt"),

	/**
     * The '<em><b>Selbst</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SELBST_VALUE
     * @generated
     * @ordered
     */
	SELBST(2, "Selbst", "Selbst"),

	/**
     * The '<em><b>Beruehrung</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BERUEHRUNG_VALUE
     * @generated
     * @ordered
     */
	BERUEHRUNG(3, "Beruehrung", "Beruehrung");

	/**
     * The '<em><b>Blickfeld</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blickfeld</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #BLICKFELD
     * @model name="Blickfeld"
     * @generated
     * @ordered
     */
	public static final int BLICKFELD_VALUE = 0;

	/**
     * The '<em><b>Begrenzt</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Begrenzt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #BEGRENZT
     * @model name="Begrenzt"
     * @generated
     * @ordered
     */
	public static final int BEGRENZT_VALUE = 1;

	/**
     * The '<em><b>Selbst</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Selbst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SELBST
     * @model name="Selbst"
     * @generated
     * @ordered
     */
	public static final int SELBST_VALUE = 2;

	/**
     * The '<em><b>Beruehrung</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beruehrung</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #BERUEHRUNG
     * @model name="Beruehrung"
     * @generated
     * @ordered
     */
	public static final int BERUEHRUNG_VALUE = 3;

	/**
     * An array of all the '<em><b>Zauber Reichweite</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ZauberReichweite[] VALUES_ARRAY =
		new ZauberReichweite[] {
            BLICKFELD,
            BEGRENZT,
            SELBST,
            BERUEHRUNG,
        };

	/**
     * A public read-only list of all the '<em><b>Zauber Reichweite</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ZauberReichweite> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Zauber Reichweite</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ZauberReichweite get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ZauberReichweite result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Zauber Reichweite</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ZauberReichweite getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ZauberReichweite result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Zauber Reichweite</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ZauberReichweite get(int value) {
        switch (value) {
            case BLICKFELD_VALUE: return BLICKFELD;
            case BEGRENZT_VALUE: return BEGRENZT;
            case SELBST_VALUE: return SELBST;
            case BERUEHRUNG_VALUE: return BERUEHRUNG;
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
	private ZauberReichweite(int value, String name, String literal) {
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
	
} //ZauberReichweite
