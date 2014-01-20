/**
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Magazin Typ</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagazinTyp()
 * @model
 * @generated
 */
public enum MagazinTyp implements Enumerator {
	/**
     * The '<em><b>Clip</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CLIP_VALUE
     * @generated
     * @ordered
     */
	CLIP(0, "Clip", "Clip"),

	/**
     * The '<em><b>Trommel</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #TROMMEL_VALUE
     * @generated
     * @ordered
     */
	TROMMEL(1, "Trommel", "Trommel"),

	/**
     * The '<em><b>Gurt</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #GURT_VALUE
     * @generated
     * @ordered
     */
	GURT(2, "Gurt", "Gurt"),

	/**
     * The '<em><b>Streifen</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STREIFEN_VALUE
     * @generated
     * @ordered
     */
	STREIFEN(3, "Streifen", "Streifen");

	/**
     * The '<em><b>Clip</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CLIP
     * @model name="Clip"
     * @generated
     * @ordered
     */
	public static final int CLIP_VALUE = 0;

	/**
     * The '<em><b>Trommel</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trommel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #TROMMEL
     * @model name="Trommel"
     * @generated
     * @ordered
     */
	public static final int TROMMEL_VALUE = 1;

	/**
     * The '<em><b>Gurt</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gurt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #GURT
     * @model name="Gurt"
     * @generated
     * @ordered
     */
	public static final int GURT_VALUE = 2;

	/**
     * The '<em><b>Streifen</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Streifen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #STREIFEN
     * @model name="Streifen"
     * @generated
     * @ordered
     */
	public static final int STREIFEN_VALUE = 3;

	/**
     * An array of all the '<em><b>Magazin Typ</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final MagazinTyp[] VALUES_ARRAY =
		new MagazinTyp[] {
            CLIP,
            TROMMEL,
            GURT,
            STREIFEN,
        };

	/**
     * A public read-only list of all the '<em><b>Magazin Typ</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<MagazinTyp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Magazin Typ</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MagazinTyp get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MagazinTyp result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Magazin Typ</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MagazinTyp getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MagazinTyp result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Magazin Typ</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static MagazinTyp get(int value) {
        switch (value) {
            case CLIP_VALUE: return CLIP;
            case TROMMEL_VALUE: return TROMMEL;
            case GURT_VALUE: return GURT;
            case STREIFEN_VALUE: return STREIFEN;
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
	private MagazinTyp(int value, String name, String literal) {
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
	
} //MagazinTyp
