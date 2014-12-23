/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.CommonProgram;
import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cyberdeck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax() <em>Matrix Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe() <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getFirewall() <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getDatenverarbeitung() <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff() <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher() <em>Schleicher</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CyberdeckTest extends AbstraktGegenstandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CyberdeckTest.class);
    }

    /**
     * Constructs a new Cyberdeck test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CyberdeckTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Cyberdeck test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Cyberdeck getFixture() {
        return (Cyberdeck)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createCyberdeck());
        getFixture().setDeviceRating(2);
        
        getFixture().setAttribute1(1);
        getFixture().setAttribute2(2);
        getFixture().setAttribute3(3);
        getFixture().setAttribute4(4);        
 
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax() <em>Matrix Zustand Max</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax()
     * @generated not
     */
    public void testGetMatrixZustandMax() {
        assertEquals(9, getFixture().getMatrixZustandMax());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe() <em>Geraetestufe</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe()
     * @generated not
     */
    public void testGetGeraetestufe() {
        assertEquals(2, getFixture().getGeraetestufe());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff() <em>Angriff</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff()
     * @generated not
     */
    public void testGetAngriff() {
        assertEquals(4, getFixture().getAngriff());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher() <em>Schleicher</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher()
     * @generated not
     */
    public void testGetSchleicher() {
        assertEquals(3, getFixture().getSchleicher());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature()
     * @generated
     */
    public void testGetCapacityFeature() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacity()
     * @generated
     */
    public void testGetCapacity() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains()
     * @generated
     */
    public void testGetCapacityRemains() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall() <em>Firewall</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall()
     * @generated not
     */
    public void testGetFirewall() {
        assertEquals(1, getFixture().getFirewall());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung() <em>Datenverarbeitung</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung()
     * @generated not
     */
    public void testGetDatenverarbeitung() {
        assertEquals(2, getFixture().getDatenverarbeitung());
    }
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung() <em>Datenverarbeitung</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung()
     * @generated not
     */
    public void testCyberdeckReconfigure() {
        assertEquals(1, getFixture().getFirewall());
        assertEquals(2, getFixture().getDatenverarbeitung());        
        assertEquals(3, getFixture().getSchleicher());
        assertEquals(4, getFixture().getAngriff());
        
        getFixture().getConfiguration().move(3, 0);
        assertEquals(2, getFixture().getFirewall());
        assertEquals(3, getFixture().getDatenverarbeitung());        
        assertEquals(4, getFixture().getSchleicher());
        assertEquals(1, getFixture().getAngriff());        
    }

    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung() <em>Datenverarbeitung</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung()
     * @generated not
     */
    public void testGetPricePlusSoftware() {
        getFixture().setWertValue(new BigDecimal(10));
        
        assertEquals(10, getFixture().getWert().intValue());
        
        CommonProgram program = Shr5Factory.eINSTANCE.createCommonProgram();
        getFixture().getStoredPrograms().add(program);

        assertEquals(10, getFixture().getWert().intValue());
        program.setWertValue(new BigDecimal(1));
        assertEquals(11, getFixture().getWert().intValue());
}

} //CyberdeckTest
