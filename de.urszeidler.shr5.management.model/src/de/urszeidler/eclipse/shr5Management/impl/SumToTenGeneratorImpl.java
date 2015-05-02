/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.ModelPlugin;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.SumToTenGenerator;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum To Ten Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SumToTenGeneratorImpl extends Shr5GeneratorImpl implements SumToTenGenerator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SumToTenGeneratorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.SUM_TO_TEN_GENERATOR;
    }

    @Override
    public boolean hasCategoryOnlyOnce(DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasSumToTen(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (state == GeneratorState.COMMITED)
            return true;
        int val = 0;
        if (getMetaType() != null)
            val = val + getMetaType().getCost();
        if (getAttribute() != null)
            val = val + getAttribute().getCost();
        if (getMagic() != null)
            val = val + getMagic().getCost();
        if (getSkills() != null)
            val = val + getSkills().getCost();
        if (getResourcen() != null)
            val = val + getResourcen().getCost();
        
        int sumToTenValue = 10;
        if(getGenerator()!=null)
            sumToTenValue = getGenerator().getSumToTenValue();
        
        if (val != sumToTenValue) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SUM_TO_TEN_GENERATOR__HAS_SUM_TO_TEN, ModelPlugin.INSTANCE.getString("_UI_NoSumToTen", new Object[]{
                                EObjectValidator.getObjectLabel(this, context), val,sumToTenValue }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.SUM_TO_TEN_GENERATOR___HAS_SUM_TO_TEN__DIAGNOSTICCHAIN_MAP:
                return hasSumToTen((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
    }

} // SumToTenGeneratorImpl
