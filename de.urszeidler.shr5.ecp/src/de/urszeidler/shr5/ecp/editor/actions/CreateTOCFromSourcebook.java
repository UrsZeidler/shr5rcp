package de.urszeidler.shr5.ecp.editor.actions;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSObject;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.COSArrayList;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.SourceLink;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.ecp.views.SourceBookView;

public class CreateTOCFromSourcebook extends Action {
    private Shell shell;
    private SourceLink theObject;
    private LabelProvider labelProvider= new DefaultLabelProvider();

    public CreateTOCFromSourcebook(Shell shell, SourceLink object) {
        this.shell = shell;
        this.theObject = object;
        setToolTipText("Create source links from "+ labelProvider.getText(theObject.getSrcBook()));
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/collection.png"));
    }

    @Override
    public void run() {
        final SourceBook srcBook = theObject.getSrcBook();
        if(srcBook==null && (theObject.getPage()==null || theObject.getPage().isEmpty()) ){
            importAllSources();
            return;
        }
        if (srcBook == null)
            return;
        
        final File docFile = SourceBookView.getFileFromPreferences(srcBook);
        final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        final String id2 = ShadowrunEditingTools.getId(srcBook);
        if (docFile == null || id2 == null) {
            MessageDialog.openError(shell, "Sourcebook not configured.",
                    String.format("%s is not configured propertly, you need to set the pdf in the preferences", labelProvider.getText(theObject)));
            return;
        }

        Job job = new Job(String.format("importing outline from %s" , labelProvider.getText(theObject))) {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                return doAction(monitor,docFile,store,id2,srcBook,theObject);
            }
        };

        job.setUser(true);
        job.schedule();
    }

    private void importAllSources() {
        final Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(theObject, Shr5Package.Literals.SOURCE_BOOK);

        Job job = new Job(String.format("Importing outline from all confifured sources." , labelProvider.getText(theObject))) {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                
                for (EObject eObject : collection) {
                    SourceBook srcBook = (SourceBook)eObject;
                    if (srcBook == null)
                        continue;
                    
                    final File docFile = SourceBookView.getFileFromPreferences(srcBook);
                    final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
                    final String id2 = ShadowrunEditingTools.getId(srcBook);
                    if (docFile == null || id2 == null) {
                        continue;
                    }
                    
                    SourceLink link = Shr5Factory.eINSTANCE.createSourceLink();
                    link.setSrcBook(srcBook);
                    link.setName(srcBook.getName());
                    theObject.getSubLinks().add(link);
                    doAction(monitor,docFile,store,id2,srcBook,link);
                }
                return Status.OK_STATUS;
            }
        };

        job.setUser(true);
        job.schedule();
    }

    protected IStatus doAction(IProgressMonitor monitor, File docFile, IPreferenceStore store, String id2, SourceBook srcBook, SourceLink orgLink) {
        int offset = store.getInt(PreferenceConstants.LINKED_SOURCEBOOKS_OFFSET + id2);
        monitor.setTaskName("load document "+labelProvider.getText(srcBook));
        SourceLink link = Shr5Factory.eINSTANCE.createSourceLink();
        link.setSrcBook(srcBook);
        try {
            PDDocument pdDocument = PDDocument.load(docFile);
            if (pdDocument.isEncrypted()) {
                //pdDocument..decrypt("");
                pdDocument.setAllSecurityToBeRemoved(true);
            }
            PDDocumentOutline root = pdDocument.getDocumentCatalog().getDocumentOutline();
            monitor.setTaskName("process document");
            PDOutlineItem item = root.getFirstChild();
            processItem(item, link, pdDocument, offset);
            pdDocument.close();
            
            EList<SourceLink> subLinks = link.getSubLinks();
            EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(orgLink);
            if(editingDomain!=null){
                Command command = AddCommand.create(editingDomain, orgLink, Shr5Package.Literals.SOURCE_LINK__SUB_LINKS, subLinks);
                editingDomain.getCommandStack().execute(command);
            }
        } catch (IOException e) {
            Activator.logError(e);
        }
        return Status.OK_STATUS;
    }

    private void processItem(PDOutlineItem item, SourceLink sl, PDDocument doc, int offset) {

        while (item != null) {
            SourceLink link = Shr5Factory.eINSTANCE.createSourceLink();
            link.setName(item.getTitle());
            link.setSrcBook(sl.getSrcBook());
            try {
                PDPage page = item.findDestinationPage(doc);
                if (page != null) {
                    COSDictionary cosObject = page.getCOSObject();
                    COSArray cosArray = cosObject.getCOSArray(COSName.PARENT);
                    Integer integer = doc.getDocumentCatalog().getPages().indexOf(page) + 1;
                    
//                    COSArray pageArray = ((COSArrayList<?>)page.getParent().getKids()).toList();
//                    int indexOfObject = pageArray.indexOfObject(page.getCOSObject());
//                    COSObject cosBase = (COSObject)pageArray.get(indexOfObject);
//                    cosBase.getGenerationNumber();
//                    String objStr = String.valueOf(cosBase.getObjectNumber());
//                    String genStr = String.valueOf(cosBase.getGenerationNumber());
//                    Integer integer = doc.getPageMap().get(objStr + "," + genStr);
                    if (integer != null) {
                        integer = integer - offset;
                        link.setPage(integer.toString());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            sl.getSubLinks().add(link);

            PDOutlineItem child = item.getFirstChild();
            if (child != null) {
                processItem(child, link, doc, offset);
            }
            item = item.getNextSibling();
        }

    }
}