/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Commlink;
import de.urszeidler.eclipse.shr5.PersonalAreaNetwork;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Personal Area Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaveMax() <em>Slave Max</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PersonalAreaNetworkTest extends TestCase {

    /**
     * The fixture for this Personal Area Network test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonalAreaNetwork fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PersonalAreaNetworkTest.class);
    }

    /**
     * Constructs a new Personal Area Network test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersonalAreaNetworkTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Personal Area Network test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(PersonalAreaNetwork fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Personal Area Network test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonalAreaNetwork getFixture() {
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
        setFixture(Shr5Factory.eINSTANCE.createPersonalAreaNetwork());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaveMax() <em>Slave Max</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getSlaveMax()
     * @generated not
     */
    public void testGetSlaveMax() {
        Commlink deviceMaster = Shr5Factory.eINSTANCE.createCommlink();
        deviceMaster.setDeviceRating(2);        
        assertEquals(0, getFixture().getSlaveMax());
        
        deviceMaster.setPan(getFixture());
        assertEquals(6, getFixture().getSlaveMax());
    }

} //PersonalAreaNetworkTest
