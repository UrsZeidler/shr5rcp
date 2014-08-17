/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Probe State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbeState()
 * @model
 * @generated
 */
public enum ProbeState implements Enumerator {
    /**
     * The '<em><b>No Glitch</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_GLITCH_VALUE
     * @generated
     * @ordered
     */
    NO_GLITCH(0, "noGlitch", "noGlitch"),

    /**
     * The '<em><b>Glitch</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GLITCH_VALUE
     * @generated
     * @ordered
     */
    GLITCH(1, "glitch", "glitch"),

    /**
     * The '<em><b>Critical Glitch</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CRITICAL_GLITCH_VALUE
     * @generated
     * @ordered
     */
    CRITICAL_GLITCH(2, "criticalGlitch", "criticalGlitch");

    /**
     * The '<em><b>No Glitch</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>No Glitch</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NO_GLITCH
     * @model name="noGlitch"
     * @generated
     * @ordered
     */
    public static final int NO_GLITCH_VALUE = 0;

    /**
     * The '<em><b>Glitch</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Glitch</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GLITCH
     * @model name="glitch"
     * @generated
     * @ordered
     */
    public static final int GLITCH_VALUE = 1;

    /**
     * The '<em><b>Critical Glitch</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Critical Glitch</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CRITICAL_GLITCH
     * @model name="criticalGlitch"
     * @generated
     * @ordered
     */
    public static final int CRITICAL_GLITCH_VALUE = 2;

    /**
     * An array of all the '<em><b>Probe State</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ProbeState[] VALUES_ARRAY =
        new ProbeState[] {
            NO_GLITCH,
            GLITCH,
            CRITICAL_GLITCH,
        };

    /**
     * A public read-only list of all the '<em><b>Probe State</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ProbeState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Probe State</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProbeState get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ProbeState result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Probe State</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProbeState getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ProbeState result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Probe State</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProbeState get(int value) {
        switch (value) {
            case NO_GLITCH_VALUE: return NO_GLITCH;
            case GLITCH_VALUE: return GLITCH;
            case CRITICAL_GLITCH_VALUE: return CRITICAL_GLITCH;
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
    private ProbeState(int value, String name, String literal) {
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
    
} //ProbeState
