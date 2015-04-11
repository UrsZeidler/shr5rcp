/**
 * 
 */
package de.urszeidler.eclipse.shr5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * @author urs
 */
public class ModSetter implements Adapter {
    private Map<EObject, Integer> fMap = new HashMap<EObject, Integer>();
    private AbstraktPersona persona;
    private boolean dirty = true;

    @SuppressWarnings({ "unchecked" })
    public void setModvalues() {
        List<Modifizierbar> list = new ArrayList<Modifizierbar>(); // persona.getModifikatoren();
        // FeatureMap featureMap = persona.getMods();
        EList<EReference> contents = persona.eClass().getEAllReferences();
        for (EReference eref : contents) {
            if (!isExcluded(eref))
                if (eref.isMany()) {
                    Object ob = persona.eGet(eref);
                    if (ob instanceof List) {
                        List<Modifizierbar> list1 = (List<Modifizierbar>)ob;
                        if (list1.size() > 0)
                            if (list1.get(0) instanceof Modifizierbar) {
                                list.addAll(list1);
                            }
                    }
                }else{
                    Object ob = persona.eGet(eref);
                    if (ob instanceof Modifizierbar) {
                        Modifizierbar m = (Modifizierbar)ob;
                        list.add(m);
                    }
                }
        }

        fMap.clear();
        dirty = false;
        for (Modifizierbar modifikatoren : list) {
            addModificationValue(modifikatoren);
         }

    }

    private boolean isExcluded(EReference eref) {
        return eref.equals(Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN)
                || eref.equals(Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN);
    }

    private void addModificationValue(Modifizierbar modifikatoren) {
        EList<AttributModifikatorWert> mods = modifikatoren.getMods();        
        addModificatorValue(mods);
        if (modifikatoren instanceof Cyberware) {
            Cyberware cb = (Cyberware)modifikatoren;
            for (CyberwareEnhancement ce : cb.getEinbau()) {
                mods = ce.getMods();
                addModificatorValue(mods);
            }
        }
    }

    /**
     * @param mods
     */
    private void addModificatorValue(EList<AttributModifikatorWert> mods) {
        for (AttributModifikatorWert wert : mods) {
            if (wert.getAttribut() != null) {
                Integer value = fMap.get(wert.getAttribut());
                if (value == null) {
                    value = new Integer(0);
                }
                value = value + wert.getWert();
                fMap.put(wert.getAttribut(), value);
            }else if(wert.getModifiziertes() !=null ){
                Integer value = fMap.get(wert.getModifiziertes());
                if (value == null) {
                    value = new Integer(0);
                }
                value = value + wert.getWert();
                fMap.put(wert.getModifiziertes(), value);
            }
        }
    }

    public int getmodWert(EObject feature) {
        if (dirty)
            setModvalues();

        Integer value = fMap.get(feature);
        // Set<EAttribute> keySet = fMap.keySet();

        int ret;
        if (value == null)
            ret = 0;
        else
            ret = value;

        return ret;
    }

    public AbstraktPersona getPersona() {
        return persona;
    }

    public void setPersona(AbstraktPersona persona) {
        this.persona = persona;
        this.persona.eAdapters().add(this);
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    /**
     * Checks if the changes affects the modsetter.
     */
    @Override
    public void notifyChanged(Notification notification) {
        // System.out.println("notifcation :" + notification);

        Object object = notification.getFeature();
        if (object instanceof EReference) {
            EReference eRef = (EReference)object;

            EClass eReferenceType = eRef.getEReferenceType();
            if (Shr5Package.Literals.MODIFIZIERBAR.isSuperTypeOf(eReferenceType))
                notifyModChanges(notification);
        }
    }

    /**
     * Calls for all mod the notification.
     * 
     * @param notification
     */
    @SuppressWarnings("unchecked")
    private void notifyModChanges(Notification notification) {
        setDirty(true);

        List<AttributModifikatorWert> mods = null;
        if (notification.getEventType() == Notification.REMOVE_MANY || (notification.getEventType() == Notification.ADD_MANY)) {
            Collection<Modifizierbar> newValue = (Collection<Modifizierbar>)notification.getNewValue();
            if (newValue == null)
                newValue = (Collection<Modifizierbar>)notification.getOldValue();

            mods = new ArrayList<AttributModifikatorWert>();
            for (Modifizierbar modifizierbar : newValue) {
                mods.addAll(modifizierbar.getMods());
                if (modifizierbar instanceof Cyberware) {
                    Cyberware cb = (Cyberware)modifizierbar;
                    for (CyberwareEnhancement ce : cb.getEinbau()) {
                        mods = ce.getMods();
                        mods.addAll(modifizierbar.getMods());
                    }
                }
            }

        } else {
            Modifizierbar newValue = (Modifizierbar)notification.getNewValue();
            if (newValue == null)
                newValue = (Modifizierbar)notification.getOldValue();

            mods = newValue.getMods();
        }
        for (AttributModifikatorWert attributModifikatorWert : mods) {
            EAttribute attribut = attributModifikatorWert.getAttribut();
            if (attribut != null)
                persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET, attribut, 0, 1));
        }
    }

    @Override
    public Notifier getTarget() {
        return persona;
    }

    @Override
    public void setTarget(Notifier newTarget) {

    }

    @Override
    public boolean isAdapterForType(Object type) {
        return false;
    }

    /**
     * A read only map from the active modificators.
     * 
     * @return
     */
    public Map<EObject, Integer> getModificatorMap() {
        return Collections.unmodifiableMap(fMap);
    }
}
