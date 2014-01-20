/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resonanz Ziel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzZiel()
 * @model
 * @generated
 */
public enum ResonanzZiel implements Enumerator {
	/**
     * The '<em><b>Datei</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DATEI_VALUE
     * @generated
     * @ordered
     */
	DATEI(0, "datei", "datei"),

	/**
     * The '<em><b>Geraet</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #GERAET_VALUE
     * @generated
     * @ordered
     */
	GERAET(1, "geraet", "geraet"),

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
     * The '<em><b>Persona</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PERSONA_VALUE
     * @generated
     * @ordered
     */
	PERSONA(3, "persona", "persona"),

	/**
     * The '<em><b>Sprite</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SPRITE_VALUE
     * @generated
     * @ordered
     */
	SPRITE(4, "sprite", "sprite");

	/**
     * The '<em><b>Datei</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Datei</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DATEI
     * @model name="datei"
     * @generated
     * @ordered
     */
	public static final int DATEI_VALUE = 0;

	/**
     * The '<em><b>Geraet</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Geraet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #GERAET
     * @model name="geraet"
     * @generated
     * @ordered
     */
	public static final int GERAET_VALUE = 1;

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
     * The '<em><b>Persona</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Persona</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PERSONA
     * @model name="persona"
     * @generated
     * @ordered
     */
	public static final int PERSONA_VALUE = 3;

	/**
     * The '<em><b>Sprite</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sprite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SPRITE
     * @model name="sprite"
     * @generated
     * @ordered
     */
	public static final int SPRITE_VALUE = 4;

	/**
     * An array of all the '<em><b>Resonanz Ziel</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ResonanzZiel[] VALUES_ARRAY =
		new ResonanzZiel[] {
            DATEI,
            GERAET,
            SELBST,
            PERSONA,
            SPRITE,
        };

	/**
     * A public read-only list of all the '<em><b>Resonanz Ziel</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ResonanzZiel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Resonanz Ziel</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ResonanzZiel get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ResonanzZiel result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Resonanz Ziel</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ResonanzZiel getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ResonanzZiel result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Resonanz Ziel</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ResonanzZiel get(int value) {
        switch (value) {
            case DATEI_VALUE: return DATEI;
            case GERAET_VALUE: return GERAET;
            case SELBST_VALUE: return SELBST;
            case PERSONA_VALUE: return PERSONA;
            case SPRITE_VALUE: return SPRITE;
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
	private ResonanzZiel(int value, String name, String literal) {
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
	
} //ResonanzZiel
