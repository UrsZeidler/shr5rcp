/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5Management.LifeModuleType;
import de.urszeidler.eclipse.shr5Management.LifeModulesGenerator;
import de.urszeidler.eclipse.shr5Management.LifeModulesSystem;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LifeModulesGeneratorItemProvider extends KarmaGeneratorItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModulesGeneratorItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addNationalityPropertyDescriptor(object);
            addFormativeYearsPropertyDescriptor(object);
            addTeenYearsPropertyDescriptor(object);
            addFurtherEducationPropertyDescriptor(object);
            addRealLifePropertyDescriptor(object);
            addModuleKarmaCostPropertyDescriptor(object);
            addStartingAgePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Nationality feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addNationalityPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_LifeModulesGenerator_nationality_feature"), getString("_UI_LifeModulesGenerator_nationality_description",
                        "_UI_LifeModulesGenerator_nationality_feature", "_UI_LifeModulesGenerator_type"),
                Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__NATIONALITY, true, false, true, null, null, null) {
            @Override
            protected Collection<?> getComboBoxObjects(Object object) {
                Shr5System generator = ((LifeModulesGenerator)object).getGenerator();
                if (generator instanceof LifeModulesSystem) {
                    LifeModulesSystem lms = (LifeModulesSystem)generator;
                    return FluentIterable.from(lms.getModules()).filter(ShadowrunManagmentTools.moduleTypePredicate(LifeModuleType.NATIONALITY) ).toList();
                } 
                return super.getComboBoxObjects(object);
            }

        });
    }

    /**
     * This adds a property descriptor for the Formative Years feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addFormativeYearsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_LifeModulesGenerator_formativeYears_feature"),
                getString("_UI_LifeModulesGenerator_formativeYears_description", "_UI_LifeModulesGenerator_formativeYears_feature", "_UI_LifeModulesGenerator_type"),
                Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS, true, false, true, null, null, null){
            @Override
            protected Collection<?> getComboBoxObjects(Object object) {
                Shr5System generator = ((LifeModulesGenerator)object).getGenerator();
                if (generator instanceof LifeModulesSystem) {
                    LifeModulesSystem lms = (LifeModulesSystem)generator;
                    return FluentIterable.from(lms.getModules()).filter(ShadowrunManagmentTools.moduleTypePredicate(LifeModuleType.FORMATIVE_YEARS) ).toList();
                } 
                return super.getComboBoxObjects(object);
            }
        });
    }

    /**
     * This adds a property descriptor for the Teen Years feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addTeenYearsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_LifeModulesGenerator_teenYears_feature"),
                getString("_UI_LifeModulesGenerator_teenYears_description", "_UI_LifeModulesGenerator_teenYears_feature", "_UI_LifeModulesGenerator_type"),
                Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__TEEN_YEARS, true, false, true, null, null, null){
            @Override
            protected Collection<?> getComboBoxObjects(Object object) {
                Shr5System generator = ((LifeModulesGenerator)object).getGenerator();
                if (generator instanceof LifeModulesSystem) {
                    LifeModulesSystem lms = (LifeModulesSystem)generator;
                    return FluentIterable.from(lms.getModules()).filter(ShadowrunManagmentTools.moduleTypePredicate(LifeModuleType.TEEN_YEARS) ).toList();
                } 
                return super.getComboBoxObjects(object);
            }
        });
    }

    /**
     * This adds a property descriptor for the Further Education feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addFurtherEducationPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(new ItemPropertyDescriptor(
                        ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_LifeModulesGenerator_furtherEducation_feature"),
                        getString("_UI_LifeModulesGenerator_furtherEducation_description", "_UI_LifeModulesGenerator_furtherEducation_feature",
                                "_UI_LifeModulesGenerator_type"), Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION, true,
                        false, true, null, null, null){
                    @Override
                    protected Collection<?> getComboBoxObjects(Object object) {
                        Shr5System generator = ((LifeModulesGenerator)object).getGenerator();
                        if (generator instanceof LifeModulesSystem) {
                            LifeModulesSystem lms = (LifeModulesSystem)generator;
                            return FluentIterable.from(lms.getModules()).filter(ShadowrunManagmentTools.moduleTypePredicate(LifeModuleType.FURTHER_EDUCATION) ).toList();
                        } 
                        return super.getComboBoxObjects(object);
                    }
                });
    }

    /**
     * This adds a property descriptor for the Real Life feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addRealLifePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_LifeModulesGenerator_realLife_feature"),
                getString("_UI_LifeModulesGenerator_realLife_description", "_UI_LifeModulesGenerator_realLife_feature", "_UI_LifeModulesGenerator_type"),
                Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__REAL_LIFE, true, false, true, null, null, null){
            @Override
            protected Collection<?> getComboBoxObjects(Object object) {
                Shr5System generator = ((LifeModulesGenerator)object).getGenerator();
                if (generator instanceof LifeModulesSystem) {
                    LifeModulesSystem lms = (LifeModulesSystem)generator;
                    return FluentIterable.from(lms.getModules()).filter(ShadowrunManagmentTools.moduleTypePredicate(LifeModuleType.REAL_LIFE) ).toList();
                } 
                return super.getComboBoxObjects(object);
            }
        });
    }

    /**
     * This adds a property descriptor for the Module Karma Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModuleKarmaCostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_LifeModulesGenerator_moduleKarmaCost_feature"),
                 getString("_UI_LifeModulesGenerator_moduleKarmaCost_description"),
                 Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__MODULE_KARMA_COST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Starting Age feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartingAgePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_LifeModulesGenerator_startingAge_feature"),
                 getString("_UI_LifeModulesGenerator_startingAge_description"),
                 Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__STARTING_AGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns LifeModulesGenerator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/LifeModulesGenerator"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((LifeModulesGenerator)object).getCharacterName();
        return label == null || label.length() == 0 ?
            getString("_UI_LifeModulesGenerator_type") :
            getString("_UI_LifeModulesGenerator_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(LifeModulesGenerator.class)) {
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__MODULE_KARMA_COST:
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__STARTING_AGE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
