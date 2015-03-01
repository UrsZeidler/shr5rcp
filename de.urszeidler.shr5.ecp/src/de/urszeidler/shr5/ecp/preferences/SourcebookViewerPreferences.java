package de.urszeidler.shr5.ecp.preferences;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.urszeidler.commons.eclipse.preferences.editor.SeparatorFieldEditor;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.PathEditor;

import com.google.common.base.Joiner;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;

public class SourcebookViewerPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    /**
     * Create the preference page.
     */
    public SourcebookViewerPreferences() {
        super(FLAT);
        setTitle("Link source");
        setDescription("Linke the source books with the pdf.");
        setMessage("Link the source books.");
        setPreferenceStore(Activator.getDefault().getPreferenceStore());

    }

    /**
     * Create contents of the preference page.
     */
    @Override
    protected void createFieldEditors() {
        Object root = Activator.getDefault().getEdtingDomain().getResourceSet().getResources().get(0).getAllContents().next();
        Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType((EObject)root, Shr5Package.Literals.SOURCE_BOOK);

        // Create the field editors
        addField(new BooleanFieldEditor("id", "preload pdf", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
        for (EObject eObject : collection) {
            if (eObject instanceof SourceBook) {
                addField(new SeparatorFieldEditor(getFieldEditorParent()));
                SourceBook sb = (SourceBook)eObject;
                addField(new FileFieldEditor(PreferenceConstants.LINKED_SOURCEBOOKS + ShadowrunEditingTools.getId(sb), AdapterFactoryUtil
                        .getInstance().getLabelProvider().getText(sb), getFieldEditorParent()));
                addField(new IntegerFieldEditor(PreferenceConstants.LINKED_SOURCEBOOKS_OFFSET + ShadowrunEditingTools.getId(sb), AdapterFactoryUtil
                        .getInstance().getLabelProvider().getText(sb)+ " offset", getFieldEditorParent()));

            }
        }
//
//        String string = "sourcebook::idfff"; // getPreferenceStore().getString(PreferenceConstants.LINKED_SOURCEBOOKS);
//        String[] split = string.split("\n");
//        for (String string2 : split) {
//            String[] split2 = string2.split("::");
//            if (split2.length == 2) {
//                addField(new FileFieldEditor(PreferenceConstants.LINKED_SOURCEBOOKS + split2[1], split2[0], getFieldEditorParent()));
//
//            }
//        }
        
    }

    /**
     * Initialize the preference page.
     */
    public void init(IWorkbench workbench) {
        // Initialize the preference page
    }

}
