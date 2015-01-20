/**
 */
package de.urszeidler.shr5.scripting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Handout Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getHandoutType()
 * @model
 * @generated
 */
public enum HandoutType implements Enumerator {
    /**
     * The '<em><b>Webpage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WEBPAGE_VALUE
     * @generated
     * @ordered
     */
    WEBPAGE(0, "webpage", "webpage"),

    /**
     * The '<em><b>Image</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMAGE_VALUE
     * @generated
     * @ordered
     */
    IMAGE(0, "image", "image"),

    /**
     * The '<em><b>Document</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOCUMENT_VALUE
     * @generated
     * @ordered
     */
    DOCUMENT(0, "document", "document");

    /**
     * The '<em><b>Webpage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Webpage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WEBPAGE
     * @model name="webpage"
     * @generated
     * @ordered
     */
    public static final int WEBPAGE_VALUE = 0;

    /**
     * The '<em><b>Image</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Image</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IMAGE
     * @model name="image"
     * @generated
     * @ordered
     */
    public static final int IMAGE_VALUE = 0;

    /**
     * The '<em><b>Document</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Document</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DOCUMENT
     * @model name="document"
     * @generated
     * @ordered
     */
    public static final int DOCUMENT_VALUE = 0;

    /**
     * An array of all the '<em><b>Handout Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final HandoutType[] VALUES_ARRAY =
        new HandoutType[] {
            WEBPAGE,
            IMAGE,
            DOCUMENT,
        };

    /**
     * A public read-only list of all the '<em><b>Handout Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<HandoutType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Handout Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static HandoutType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            HandoutType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Handout Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static HandoutType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            HandoutType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Handout Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static HandoutType get(int value) {
        switch (value) {
            case WEBPAGE_VALUE: return WEBPAGE;
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
    private HandoutType(int value, String name, String literal) {
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
    
} //HandoutType
