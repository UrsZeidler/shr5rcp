/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.SkillSoft;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Skill Soft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SkillSoftTest extends TestCase {

    /**
     * The fixture for this Skill Soft test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SkillSoft fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SkillSoftTest.class);
    }

    /**
     * Constructs a new Skill Soft test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SkillSoftTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Skill Soft test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(SkillSoft fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Skill Soft test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SkillSoft getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createSkillSoft());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }


    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert() {
        getFixture().setWertValue(new BigDecimal(10));   
        getFixture().setRating(2);
        assertEquals(20,getFixture().getWert().intValue());

    }

} //SkillSoftTest
