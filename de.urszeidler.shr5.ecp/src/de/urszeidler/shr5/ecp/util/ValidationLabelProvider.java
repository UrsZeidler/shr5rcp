package de.urszeidler.shr5.ecp.util;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * Provides the lables for the validation chain.
 */
public class ValidationLabelProvider implements SubstitutionLabelProvider {

    /*
     * (non-Javadoc)
     * @see org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider#getObjectLabel(org.eclipse.emf.ecore.EObject)
     */
    @Override
    public String getObjectLabel(EObject eObject) {
        return AdapterFactoryUtil.getInstance().getLabelProvider().getText(eObject);
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider#getFeatureLabel(org.eclipse.emf.ecore.EStructuralFeature)
     */
    @Override
    public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
        return AdapterFactoryUtil.getInstance().getLabelProvider().getText(eStructuralFeature);
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider#getValueLabel(org.eclipse.emf.ecore.EDataType, java.lang.Object)
     */
    @Override
    public String getValueLabel(EDataType eDataType, Object value) {
        return AdapterFactoryUtil.getInstance().getLabelProvider().getText(value);
    }
}