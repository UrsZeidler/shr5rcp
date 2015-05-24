package de.urszeidler.shr5.ecp.preferences;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.wb.swt.FieldLayoutPreferencePage;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class SourcebookViewerPreferences extends FieldLayoutPreferencePage implements IWorkbenchPreferencePage {

    /**
     * Create the preference page.
     */
    public SourcebookViewerPreferences() {

        setTitle("Link source");
        setDescription("Linke the source books with the pdf.");
        setMessage("Link the source books.");
        setPreferenceStore(Activator.getDefault().getPreferenceStore());

    }

 
    /**
     * Initialize the preference page.
     */
    public void init(IWorkbench workbench) {
        // Initialize the preference page
    }

    /**
     * Create contents of the preference page.
     * 
     * @param parent
     */
    @Override
    public Control createPageContents(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        GridLayout gl_container = new GridLayout();
        gl_container.numColumns = 2;
        container.setLayout(gl_container);

        Group grpSourceBooks = new Group(container, SWT.NONE);
        grpSourceBooks.setLayout(new GridLayout(2, false));
        grpSourceBooks.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpSourceBooks.setText("Source books");
        
        Object root = Activator.getDefault().getEdtingDomain().getResourceSet().getResources().get(0).getAllContents().next();
        Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType((EObject)root, Shr5Package.Literals.SOURCE_BOOK);

        // Create the field editors
        for (EObject eObject : collection) {
            if (eObject instanceof SourceBook) {
                SourceBook sb = (SourceBook)eObject;
                Composite composite = new Composite(grpSourceBooks, SWT.NONE);
                composite.setLayout(new GridLayout(4, false));
                composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
                addField(new FileFieldEditor(PreferenceConstants.LINKED_SOURCEBOOKS + ShadowrunEditingTools.getId(sb), AdapterFactoryUtil
                        .getInstance().getLabelProvider().getText(sb), composite));
                Composite composite_1 = new Composite(grpSourceBooks, SWT.NONE);
                composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
                addField(new IntegerFieldEditor(PreferenceConstants.LINKED_SOURCEBOOKS_OFFSET + ShadowrunEditingTools.getId(sb), 
                        " offset", composite_1));
            }
        }
          return container;
    }
}
