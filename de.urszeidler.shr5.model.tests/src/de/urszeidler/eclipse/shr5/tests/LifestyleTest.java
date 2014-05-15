/**
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.LifestyleOption;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lifestyle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifestyleTest extends IntervallVertragTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(LifestyleTest.class);
    }

	/**
     * Constructs a new Lifestyle test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LifestyleTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Lifestyle test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Lifestyle getFixture() {
        return (Lifestyle)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createLifestyle());
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
     * 
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWertPlusOption() {
        getFixture().setWertValue(new BigDecimal(100));

        assertEquals(100, getFixture().getWert().intValue());
        LifestyleOption lifestyleOption = Shr5Factory.eINSTANCE.createLifestyleOption();
        lifestyleOption.setWertValue(new BigDecimal(10));
        
       getFixture().getOptions().add(lifestyleOption);
        
       assertEquals(110, getFixture().getWert().intValue());
        
    }
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWertPlusPercentOption() {
        getFixture().setWertValue(new BigDecimal(200));

        assertEquals(200, getFixture().getWert().intValue());
        LifestyleOption lifestyleOption = Shr5Factory.eINSTANCE.createPercentLifestyleOption();
        lifestyleOption.setWertValue(new BigDecimal(5));
        
       getFixture().getOptions().add(lifestyleOption);
        
       assertEquals(210, getFixture().getWert().intValue());
        
    }


} //LifestyleTest
