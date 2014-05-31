/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.PercentLifestyleOption;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Percent Lifestyle Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PercentLifestyleOptionTest extends LifestyleOptionTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PercentLifestyleOptionTest.class);
    }

    /**
     * Constructs a new Percent Lifestyle Option test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PercentLifestyleOptionTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Percent Lifestyle Option test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PercentLifestyleOption getFixture() {
        return (PercentLifestyleOption)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createPercentLifestyleOption());
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
        getFixture().setWertValue(new BigDecimal(100));

        assertEquals(0, getFixture().getWert().intValue());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWertWithOwner() {
        
        getFixture().setWertValue(new BigDecimal(10));
        assertEquals(0, getFixture().getWert().intValue());
        
        Lifestyle lifestyle = Shr5Factory.eINSTANCE.createLifestyle();
        lifestyle.setWertValue(new BigDecimal(100) );
        lifestyle.getOptions().add(getFixture());
        
        assertEquals(10, getFixture().getWert().intValue());
    }

} //PercentLifestyleOptionTest
