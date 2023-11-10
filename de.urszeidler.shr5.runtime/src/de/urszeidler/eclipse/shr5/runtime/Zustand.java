/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Zustand</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getZustand()
 * @model
 * @generated
 */
public enum Zustand implements Enumerator {
    /**
     * The '<em><b>Ok</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OK_VALUE
     * @generated
     * @ordered
     */
    OK(0, "ok", "ok"),

    /**
     * The '<em><b>Betaeubt</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BETAEUBT_VALUE
     * @generated
     * @ordered
     */
    BETAEUBT(1, "betaeubt", "betaeubt"),

    /**
     * The '<em><b>Sterbend</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STERBEND_VALUE
     * @generated
     * @ordered
     */
    STERBEND(2, "sterbend", "sterbend"),

    /**
     * The '<em><b>Tot</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOT_VALUE
     * @generated
     * @ordered
     */
    TOT(3, "tot", "tot");

    /**
     * The '<em><b>Ok</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ok</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OK
     * @model name="ok"
     * @generated
     * @ordered
     */
    public static final int OK_VALUE = 0;

    /**
     * The '<em><b>Betaeubt</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Betaeubt</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BETAEUBT
     * @model name="betaeubt"
     * @generated
     * @ordered
     */
    public static final int BETAEUBT_VALUE = 1;

    /**
     * The '<em><b>Sterbend</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sterbend</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STERBEND
     * @model name="sterbend"
     * @generated
     * @ordered
     */
    public static final int STERBEND_VALUE = 2;

    /**
     * The '<em><b>Tot</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tot</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOT
     * @model name="tot"
     * @generated
     * @ordered
     */
    public static final int TOT_VALUE = 3;

    /**
     * An array of all the '<em><b>Zustand</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Zustand[] VALUES_ARRAY =
        new Zustand[] {
            OK,
            BETAEUBT,
            STERBEND,
            TOT,
        };

    /**
     * A public read-only list of all the '<em><b>Zustand</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Zustand> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Zustand</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Zustand get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Zustand result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Zustand</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Zustand getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Zustand result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Zustand</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Zustand get(int value) {
        switch (value) {
            case OK_VALUE: return OK;
            case BETAEUBT_VALUE: return BETAEUBT;
            case STERBEND_VALUE: return STERBEND;
            case TOT_VALUE: return TOT;
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
    private Zustand(int value, String name, String literal) {
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
    
} //Zustand
