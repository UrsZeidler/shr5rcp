/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Anwendbar;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstrakt Gegenstand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getMods <em>Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getFertigkeit <em>Fertigkeit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstraktGegenstandImpl extends MinimalEObjectImpl.Container implements AbstraktGegenstand {
	/**
	 * The default value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected String page = PAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrcBook() <em>Src Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcBook()
	 * @generated
	 * @ordered
	 */
	protected SourceBook srcBook;

	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal wert = WERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerfuegbarkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String VERFUEGBARKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerfuegbarkeit()
	 * @generated
	 * @ordered
	 */
	protected String verfuegbarkeit = VERFUEGBARKEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMods()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributModifikatorWert> mods;

	/**
	 * The cached value of the '{@link #getFertigkeit() <em>Fertigkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFertigkeit()
	 * @generated
	 * @ordered
	 */
	protected Fertigkeit fertigkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstraktGegenstandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.ABSTRAKT_GEGENSTAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(String newPage) {
		String oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__PAGE, oldPage, page));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceBook getSrcBook() {
		if (srcBook != null && srcBook.eIsProxy()) {
			InternalEObject oldSrcBook = (InternalEObject)srcBook;
			srcBook = (SourceBook)eResolveProxy(oldSrcBook);
			if (srcBook != oldSrcBook) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK, oldSrcBook, srcBook));
			}
		}
		return srcBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceBook basicGetSrcBook() {
		return srcBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcBook(SourceBook newSrcBook) {
		SourceBook oldSrcBook = srcBook;
		srcBook = newSrcBook;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK, oldSrcBook, srcBook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWert(BigDecimal newWert) {
		BigDecimal oldWert = wert;
		wert = newWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerfuegbarkeit() {
		return verfuegbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerfuegbarkeit(String newVerfuegbarkeit) {
		String oldVerfuegbarkeit = verfuegbarkeit;
		verfuegbarkeit = newVerfuegbarkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributModifikatorWert> getMods() {
		if (mods == null) {
			mods = new EObjectContainmentWithInverseEList<AttributModifikatorWert>(AttributModifikatorWert.class, this, Shr5Package.ABSTRAKT_GEGENSTAND__MODS, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES);
		}
		return mods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fertigkeit getFertigkeit() {
		if (fertigkeit != null && fertigkeit.eIsProxy()) {
			InternalEObject oldFertigkeit = (InternalEObject)fertigkeit;
			fertigkeit = (Fertigkeit)eResolveProxy(oldFertigkeit);
			if (fertigkeit != oldFertigkeit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT, oldFertigkeit, fertigkeit));
			}
		}
		return fertigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fertigkeit basicGetFertigkeit() {
		return fertigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFertigkeit(Fertigkeit newFertigkeit) {
		Fertigkeit oldFertigkeit = fertigkeit;
		fertigkeit = newFertigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT, oldFertigkeit, fertigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMods()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
				return ((InternalEList<?>)getMods()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5Package.ABSTRAKT_GEGENSTAND__PAGE:
				return getPage();
			case Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK:
				if (resolve) return getSrcBook();
				return basicGetSrcBook();
			case Shr5Package.ABSTRAKT_GEGENSTAND__WERT:
				return getWert();
			case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT:
				return getVerfuegbarkeit();
			case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG:
				return getBeschreibung();
			case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE:
				return getImage();
			case Shr5Package.ABSTRAKT_GEGENSTAND__NAME:
				return getName();
			case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
				return getMods();
			case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT:
				if (resolve) return getFertigkeit();
				return basicGetFertigkeit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Shr5Package.ABSTRAKT_GEGENSTAND__PAGE:
				setPage((String)newValue);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK:
				setSrcBook((SourceBook)newValue);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__WERT:
				setWert((BigDecimal)newValue);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT:
				setVerfuegbarkeit((String)newValue);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG:
				setBeschreibung((String)newValue);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE:
				setImage((String)newValue);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__NAME:
				setName((String)newValue);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
				getMods().clear();
				getMods().addAll((Collection<? extends AttributModifikatorWert>)newValue);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT:
				setFertigkeit((Fertigkeit)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Shr5Package.ABSTRAKT_GEGENSTAND__PAGE:
				setPage(PAGE_EDEFAULT);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK:
				setSrcBook((SourceBook)null);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__WERT:
				setWert(WERT_EDEFAULT);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT:
				setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
				getMods().clear();
				return;
			case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT:
				setFertigkeit((Fertigkeit)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Shr5Package.ABSTRAKT_GEGENSTAND__PAGE:
				return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
			case Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK:
				return srcBook != null;
			case Shr5Package.ABSTRAKT_GEGENSTAND__WERT:
				return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
			case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT:
				return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
			case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
			case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case Shr5Package.ABSTRAKT_GEGENSTAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
				return mods != null && !mods.isEmpty();
			case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT:
				return fertigkeit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeldWert.class) {
			switch (derivedFeatureID) {
				case Shr5Package.ABSTRAKT_GEGENSTAND__WERT: return Shr5Package.GELD_WERT__WERT;
				case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT: return Shr5Package.GELD_WERT__VERFUEGBARKEIT;
				default: return -1;
			}
		}
		if (baseClass == Beschreibbar.class) {
			switch (derivedFeatureID) {
				case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG: return Shr5Package.BESCHREIBBAR__BESCHREIBUNG;
				case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE: return Shr5Package.BESCHREIBBAR__IMAGE;
				case Shr5Package.ABSTRAKT_GEGENSTAND__NAME: return Shr5Package.BESCHREIBBAR__NAME;
				default: return -1;
			}
		}
		if (baseClass == Modifizierbar.class) {
			switch (derivedFeatureID) {
				case Shr5Package.ABSTRAKT_GEGENSTAND__MODS: return Shr5Package.MODIFIZIERBAR__MODS;
				default: return -1;
			}
		}
		if (baseClass == Anwendbar.class) {
			switch (derivedFeatureID) {
				case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT: return Shr5Package.ANWENDBAR__FERTIGKEIT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeldWert.class) {
			switch (baseFeatureID) {
				case Shr5Package.GELD_WERT__WERT: return Shr5Package.ABSTRAKT_GEGENSTAND__WERT;
				case Shr5Package.GELD_WERT__VERFUEGBARKEIT: return Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT;
				default: return -1;
			}
		}
		if (baseClass == Beschreibbar.class) {
			switch (baseFeatureID) {
				case Shr5Package.BESCHREIBBAR__BESCHREIBUNG: return Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG;
				case Shr5Package.BESCHREIBBAR__IMAGE: return Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE;
				case Shr5Package.BESCHREIBBAR__NAME: return Shr5Package.ABSTRAKT_GEGENSTAND__NAME;
				default: return -1;
			}
		}
		if (baseClass == Modifizierbar.class) {
			switch (baseFeatureID) {
				case Shr5Package.MODIFIZIERBAR__MODS: return Shr5Package.ABSTRAKT_GEGENSTAND__MODS;
				default: return -1;
			}
		}
		if (baseClass == Anwendbar.class) {
			switch (baseFeatureID) {
				case Shr5Package.ANWENDBAR__FERTIGKEIT: return Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (page: ");
		result.append(page);
		result.append(", wert: ");
		result.append(wert);
		result.append(", verfuegbarkeit: ");
		result.append(verfuegbarkeit);
		result.append(", beschreibung: ");
		result.append(beschreibung);
		result.append(", image: ");
		result.append(image);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstraktGegenstandImpl
