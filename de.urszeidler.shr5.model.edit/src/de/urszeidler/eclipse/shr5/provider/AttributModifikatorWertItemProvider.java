/**
 */
package de.urszeidler.eclipse.shr5.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.BioWare;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.CyberwareEnhancement;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * This is the item provider adapter for a
 * {@link de.urszeidler.eclipse.shr5.AttributModifikatorWert} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AttributModifikatorWertItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributModifikatorWertItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addAttributPropertyDescriptor(object);
            addWertPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
	 * This adds a property descriptor for the Attribut feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	protected void addAttributPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(// createItemPropertyDescriptor
				new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AttributModifikatorWert_attribut_feature"), getString(
								"_UI_PropertyDescriptor_description", "_UI_AttributModifikatorWert_attribut_feature",
								"_UI_AttributModifikatorWert_type"), Shr5Package.Literals.ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT,
						true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						AttributModifikatorWert attributModifikatorWert = (AttributModifikatorWert) object;
						Modifizierbar modifiziertes = attributModifikatorWert.getModifiziertes();

						if (modifiziertes instanceof Gegenstand) {
							ArrayList<Object> arrayList = new ArrayList<Object>();
							arrayList.addAll(Shr5Package.Literals.GEGENSTAND_STUFEN.getEAttributes());
							arrayList.addAll(Shr5Package.Literals.PANZERUNG.getEAttributes());

							return arrayList;

						}
						if (modifiziertes instanceof Fertigkeit) {// ??
							ArrayList<Object> arrayList = new ArrayList<Object>();
							arrayList.addAll(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE.getEAttributes());
							arrayList.addAll(Shr5Package.Literals.GEISTIGE_ATTRIBUTE.getEAttributes());

							return arrayList;

						}

						if (modifiziertes instanceof FernkampfwaffeModifikator) {
							ArrayList<Object> arrayList = new ArrayList<Object>();
							arrayList.addAll(Shr5Package.Literals.FERNKAMPFWAFFEN_MODIFIKATOREN.getEAttributes());

							return arrayList;

						}
						if (modifiziertes instanceof PersonaEigenschaft) {
							ArrayList<Object> arrayList = new ArrayList<Object>();
							arrayList.addAll(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE.getEAttributes());
							arrayList.addAll(Shr5Package.Literals.GEISTIGE_ATTRIBUTE.getEAttributes());
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE);
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
							arrayList.addAll(Shr5Package.Literals.CHRAKTER_LIMITS.getEAttributes());
                            arrayList.addAll(Shr5Package.Literals.PANZERUNG.getEAttributes());
                            arrayList.addAll(Shr5Package.Literals.PROBEN_MODIFIKATOREN.getEAttributes());
                            arrayList.add(Shr5Package.Literals.SPEZIES__CHARISMA_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__STAERKE_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__KONSTITUTION_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__INTUITION_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__LOGIK_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__EDGE_MAX);

							return arrayList;

						}
						if( (modifiziertes instanceof Cyberware)||(modifiziertes instanceof BioWare|| modifiziertes instanceof CyberwareEnhancement ) ){
							ArrayList<Object> arrayList = new ArrayList<Object>();
							arrayList.addAll(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE.getEAttributes());
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ);
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE);
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
							arrayList.addAll(Shr5Package.Literals.PANZERUNG.getEAttributes());
	                        arrayList.addAll(Shr5Package.Literals.CYBERWARE_MODIFIKATIOREN.getEAttributes());
                            arrayList.addAll(Shr5Package.Literals.PROBEN_MODIFIKATOREN.getEAttributes());
                            arrayList.addAll(Shr5Package.Literals.SICHTVERHAELTNISSE.getEAttributes());
                            arrayList.add(Shr5Package.Literals.PERSONA_ZUSTAND__ZUSTAND_KOERPERLICH_MAX);
                            arrayList.add(Shr5Package.Literals.PERSONA_ZUSTAND__ZUSTAND_GEISTIG_MAX);
                            arrayList.addAll(Shr5Package.Literals.GEGENSTAND_STUFEN.getEAttributes());
							return arrayList;

						}
						if (modifiziertes instanceof KiKraft) {
							ArrayList<Object> arrayList = new ArrayList<Object>();
							arrayList.addAll(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE.getEAttributes());
							arrayList.addAll(Shr5Package.Literals.CHRAKTER_LIMITS.getEAttributes());
							arrayList.addAll(Shr5Package.Literals.GEISTIGE_ATTRIBUTE.getEAttributes());
							arrayList.addAll(Shr5Package.Literals.SICHTVERHAELTNISSE.getEAttributes());
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE);
							arrayList.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
							arrayList.addAll(Shr5Package.Literals.PANZERUNG.getEAttributes());
                            arrayList.addAll(Shr5Package.Literals.PROBEN_MODIFIKATOREN.getEAttributes());
                            arrayList.add(Shr5Package.Literals.SPEZIES__CHARISMA_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__STAERKE_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__KONSTITUTION_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__INTUITION_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__LOGIK_MAX);
                            arrayList.add(Shr5Package.Literals.SPEZIES__EDGE_MAX);

							return arrayList;
						}
						return super.getChoiceOfValues(object);
					}

				});
	}

	/**
     * This adds a property descriptor for the Wert feature.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	protected void addWertPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AttributModifikatorWert_wert_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AttributModifikatorWert_wert_feature", "_UI_AttributModifikatorWert_type"),
                 Shr5Package.Literals.ATTRIBUT_MODIFIKATOR_WERT__WERT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This returns AttributModifikatorWert.gif.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributModifikatorWert"));
    }

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		AttributModifikatorWert attributModifikatorWert = (AttributModifikatorWert) object;
		ComposeableAdapterFactory factory = ((Shr5ItemProviderAdapterFactory) this.adapterFactory).getRootAdapterFactory();
		String attName = "";
		if (factory != null && attributModifikatorWert.getAttribut() != null) {
			IItemLabelProvider labelprovider = (IItemLabelProvider) factory.adapt(attributModifikatorWert.getAttribut(),
					IItemLabelProvider.class);
			if (labelprovider != null)
				attName = labelprovider.getText(attributModifikatorWert.getAttribut()) + " : ";// getString("_UI_AttributModifikatorWert_type")
		}

		return attName + attributModifikatorWert.getWert();
	}

	/**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @generated
     */
	@Override
	public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(AttributModifikatorWert.class)) {
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__WERT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
        return Shr5EditPlugin.INSTANCE;
    }

}
