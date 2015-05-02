/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.util.Collections;
import java.util.Map;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.SumToTenGenerator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sum To Ten Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.SumToTenGenerator#hasSumToTen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Sum To Ten</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SumToTenGeneratorTest extends Shr5GeneratorTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SumToTenGeneratorTest.class);
    }

    /**
     * Constructs a new Sum To Ten Generator test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SumToTenGeneratorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Sum To Ten Generator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected SumToTenGenerator getFixture() {
        return (SumToTenGenerator)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createSumToTenGenerator());
        Shr5System system = Shr5managementFactory.eINSTANCE.createShr5System();
        system.setKarmaPoints(20);
        getFixture().setGenerator(system);

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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.SumToTenGenerator#hasSumToTen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Sum To Ten</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.SumToTenGenerator#hasSumToTen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasSumToTen__DiagnosticChain_Map() {
        createBasicCategories();
        attributes.setCost(4);
        metaType.setCost(3);
        mudan.setCost(2);
        skill.setCost(1);
        resourcen.setCost(0);
        

        Map<Object, Object> context = Collections.emptyMap();
        DiagnosticChain diagnostics = new BasicDiagnostic();
        assertEquals("is true", true, getFixture().hasSumToTen(diagnostics, context));

        resourcen.setCost(2);
        assertEquals("is true", false, getFixture().hasSumToTen(diagnostics, context));
    }
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.SumToTenGenerator#hasSumToTen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Sum To Ten</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.SumToTenGenerator#hasSumToTen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasSumToTen__DiagnosticChain_Map_1() {
        createBasicCategories();
        attributes.setCost(4);
        metaType.setCost(3);
        mudan.setCost(2);
        skill.setCost(1);
        resourcen.setCost(0);
        

        Map<Object, Object> context = Collections.emptyMap();
        DiagnosticChain diagnostics = new BasicDiagnostic();
        assertEquals("is true", true, getFixture().hasSumToTen(diagnostics, context));

        resourcen.setCost(2);
        assertEquals("is false", false, getFixture().hasSumToTen(diagnostics, context));
        shr5System.setSumToTenValue(12);
        
        assertEquals("is true", true, getFixture().hasSumToTen(diagnostics, context));
        resourcen.setCost(3);
        assertEquals("is false", false, getFixture().hasSumToTen(diagnostics, context));
    }
    @Override
    public void testHasCategoryOnlyOnce__DiagnosticChain_Map() {
    }
} //SumToTenGeneratorTest
