/**
 */
package de.urszeidler.shr5.scripting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Placement Options</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacementOptions()
 * @model
 * @generated
 */
public enum PlacementOptions implements Enumerator {
    /**
     * The '<em><b>Combat</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMBAT_VALUE
     * @generated
     * @ordered
     */
    COMBAT(0, "combat", "combat"),

    /**
     * The '<em><b>Leg Work</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LEG_WORK_VALUE
     * @generated
     * @ordered
     */
    LEG_WORK(0, "legWork", "legWork"),

    /**
     * The '<em><b>Home Ground</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HOME_GROUND_VALUE
     * @generated
     * @ordered
     */
    HOME_GROUND(0, "homeGround", "homeGround"),

    /**
     * The '<em><b>Matrix</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MATRIX_VALUE
     * @generated
     * @ordered
     */
    MATRIX(0, "matrix", "matrix"),

    /**
     * The '<em><b>Astral Space</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASTRAL_SPACE_VALUE
     * @generated
     * @ordered
     */
    ASTRAL_SPACE(0, "astralSpace", "astralSpace"), /**
     * The '<em><b>Social Interaction</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOCIAL_INTERACTION_VALUE
     * @generated
     * @ordered
     */
    SOCIAL_INTERACTION(0, "socialInteraction", "socialInteraction");

    /**
     * The '<em><b>Combat</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Combat</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMBAT
     * @model name="combat"
     * @generated
     * @ordered
     */
    public static final int COMBAT_VALUE = 0;

    /**
     * The '<em><b>Leg Work</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Leg Work</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LEG_WORK
     * @model name="legWork"
     * @generated
     * @ordered
     */
    public static final int LEG_WORK_VALUE = 0;

    /**
     * The '<em><b>Home Ground</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Home Ground</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HOME_GROUND
     * @model name="homeGround"
     * @generated
     * @ordered
     */
    public static final int HOME_GROUND_VALUE = 0;

    /**
     * The '<em><b>Matrix</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Matrix</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MATRIX
     * @model name="matrix"
     * @generated
     * @ordered
     */
    public static final int MATRIX_VALUE = 0;

    /**
     * The '<em><b>Astral Space</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Astral Space</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASTRAL_SPACE
     * @model name="astralSpace"
     * @generated
     * @ordered
     */
    public static final int ASTRAL_SPACE_VALUE = 0;

    /**
     * The '<em><b>Social Interaction</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Social Interaction</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOCIAL_INTERACTION
     * @model name="socialInteraction"
     * @generated
     * @ordered
     */
    public static final int SOCIAL_INTERACTION_VALUE = 0;

    /**
     * An array of all the '<em><b>Placement Options</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PlacementOptions[] VALUES_ARRAY =
        new PlacementOptions[] {
            COMBAT,
            LEG_WORK,
            HOME_GROUND,
            MATRIX,
            ASTRAL_SPACE,
            SOCIAL_INTERACTION,
        };

    /**
     * A public read-only list of all the '<em><b>Placement Options</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<PlacementOptions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Placement Options</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PlacementOptions get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PlacementOptions result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Placement Options</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PlacementOptions getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PlacementOptions result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Placement Options</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PlacementOptions get(int value) {
        switch (value) {
            case COMBAT_VALUE: return COMBAT;
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
    private PlacementOptions(int value, String name, String literal) {
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
    
} //PlacementOptions
