/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Matrix Program Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixProgramType()
 * @model
 * @generated
 */
public enum MatrixProgramType implements Enumerator {
    /**
     * The '<em><b>Default Program</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFAULT_PROGRAM_VALUE
     * @generated
     * @ordered
     */
    DEFAULT_PROGRAM(0, "defaultProgram", "defaultProgram"),

    /**
     * The '<em><b>Hacking Program</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HACKING_PROGRAM_VALUE
     * @generated
     * @ordered
     */
    HACKING_PROGRAM(1, "hackingProgram", "hackingProgram");

    /**
     * The '<em><b>Default Program</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Default Program</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEFAULT_PROGRAM
     * @model name="defaultProgram"
     * @generated
     * @ordered
     */
    public static final int DEFAULT_PROGRAM_VALUE = 0;

    /**
     * The '<em><b>Hacking Program</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hacking Program</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HACKING_PROGRAM
     * @model name="hackingProgram"
     * @generated
     * @ordered
     */
    public static final int HACKING_PROGRAM_VALUE = 1;

    /**
     * An array of all the '<em><b>Matrix Program Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MatrixProgramType[] VALUES_ARRAY =
        new MatrixProgramType[] {
            DEFAULT_PROGRAM,
            HACKING_PROGRAM,
        };

    /**
     * A public read-only list of all the '<em><b>Matrix Program Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<MatrixProgramType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Matrix Program Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MatrixProgramType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MatrixProgramType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Matrix Program Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MatrixProgramType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MatrixProgramType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Matrix Program Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static MatrixProgramType get(int value) {
        switch (value) {
            case DEFAULT_PROGRAM_VALUE: return DEFAULT_PROGRAM;
            case HACKING_PROGRAM_VALUE: return HACKING_PROGRAM;
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
    private MatrixProgramType(int value, String name, String literal) {
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
    
} //MatrixProgramType
