/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;

import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.PercentLifestyleOption;
import de.urszeidler.eclipse.shr5.Shr5Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Percent Lifestyle Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PercentLifestyleOptionImpl extends LifestyleOptionImpl implements PercentLifestyleOption {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PercentLifestyleOptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.PERCENT_LIFESTYLE_OPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public BigDecimal getWert() {
        EObject owner = eContainer();
        if (owner instanceof Lifestyle) {
            Lifestyle ls = (Lifestyle)owner;
            BigDecimal wertValue2 = ls.getWertValue();
            if(wertValue2!=null){
                return wertValue2.multiply(getWertValue()).divide(new BigDecimal(100));
            }
        }
        
        return new BigDecimal(0);
    }

} //PercentLifestyleOptionImpl
