package de.urszeidler.shr5.ecp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.exceptions.ECPProjectWithNameExistsException;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.workspace.internal.core.WorkspaceProvider;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.wb.swt.ResourceManager;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    private static final String PLATFORM_RESOURCE_SHR5_URI = "platform:/resource/shr5Resource/shr5-1.shr5";

    // The plug-in ID
    public static final String PLUGIN_ID = "de.urszeidler.shr5.ecp"; //$NON-NLS-1$

    public static final String DEFAUL_PROJECT_NAME = "shr5Resources";

    // The shared instance
    private static Activator plugin;

    private IPreferenceStore store;

    private BundleContext context;
    
    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        store = getPreferenceStore();
        this.context = context;
    }

//    /**
//     * Cleans the old editorref. A patch for https://bugs.eclipse.org/bugs/show_bug.cgi?id=386648 .
//     */
//    private void cleanOldEditors() {
//        try {
//            IWorkbench wb = PlatformUI.getWorkbench();
//            IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
//            if (win == null)
//                return;
//            IWorkbenchPage page = win.getActivePage();
//
//            // IWorkbenchPage activePage = workbenchWindow.getActivePage();
//            IEditorReference[] refs = page.getEditorReferences();
//            for (IEditorReference ref : refs) {
//                String editorId = ref.getId();
//                if (EditorRegistry.EMPTY_EDITOR_ID.equals(editorId)) {
//                    page.closeEditors(new IEditorReference[]{ ref }, false);
//                }
//            }
//        } catch (Exception e) {
//            logError("Error closing editors", e);
//        }
//    }

    public EditingDomain getEdtingDomain() {
        ECPProject project = getDefaultEcpProject();
        if (project == null)
            return null;
        EditingDomain editingDomain = project.getEditingDomain();
        return editingDomain;
    }

    /**
     * @return
     */
    public ECPProject getDefaultEcpProject() {
        String projectName = store.getString(PreferenceConstants.DEFAUL_PROJECT_NAME);
        ECPProject project = ECPUtil.getECPProjectManager().getProject(projectName);
        return project;
    }

    public void createECPWorkspace() throws ECPProjectWithNameExistsException {
        String projectName = store.getString(PreferenceConstants.DEFAUL_PROJECT_NAME);
        @SuppressWarnings("restriction")
        ECPProvider provider = ECPUtil.getECPProviderRegistry().getProvider(WorkspaceProvider.NAME);
        ECPProperties ecpProperties = ECPUtil.createProperties();
        ecpProperties.addProperty("rootURI", PLATFORM_RESOURCE_SHR5_URI);
        ECPProject ecpProject = ECPUtil.getECPProjectManager().getProject(projectName);
        if (ecpProject == null) {
            logInfo("creating ECP project....");
            ECPProject project = ECPUtil.getECPProjectManager().createProject(provider, DEFAUL_PROJECT_NAME, ecpProperties);
            project.open();
        }

        // ecpProperties = ECPUtil.createProperties();
        // ecpProperties.addProperty("rootURI", "platform:/resource/shr5Resource/shr5-1-test.shr5");
        // ecpProject = ECPUtil.getECPProjectManager().getProject(DEFAUL_PROJECT_NAME+"-chummer-test");
        // if (ecpProject == null) {
        // logInfo("creating ECP project.... chummer-test");
        // ECPProject project = ECPUtil.getECPProjectManager().createProject(provider, DEFAUL_PROJECT_NAME+"-chummer-test", ecpProperties);
        // project.open();
        // }
    }
//
//    private IValidationServiceProvider getValidationServiceProvider() {
//        if (validationServiceProvider == null) {
//            // Register directly with the service
//            final ServiceReference<IValidationServiceProvider> reference = context
//                .getServiceReference(IValidationServiceProvider.class);
//            validationServiceProvider = context.getService(reference);
//        }
//        return validationServiceProvider;
//    }

    
    public void createDefaultWorkspace() {
        IProgressMonitor progressMonitor = new NullProgressMonitor();
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = root.getProject("shr5Resource");
        if (!project.exists()) {
            try {
                logInfo("creating default workspace....");
                project.create(progressMonitor);
                project.open(progressMonitor);
                copyResource(progressMonitor, project);
                project.refreshLocal(3, progressMonitor);
            } catch (CoreException e) {
                logError(e.getMessage());
            }
        }
    }

//    /**
//     * Check and do the update of the resouces.
//     * 
//     * @throws IOException
//     */
//    @SuppressWarnings("restriction")
//    public void checkForResourceUpdate() throws IOException {
//        final EditingDomain editingDomain = getEdtingDomain();
//        ResourceSet resourceSet = editingDomain.getResourceSet();
//        Resource resource = resourceSet.getResources().get(0);// .getResource(URI.createPlatformResourceURI(PLATFORM_RESOURCE_SHR5_URI, true), true);
//
//        Bundle extensionBundle = Activator.getDefault().getBundle();
//        URL entry = extensionBundle.getEntry("shr5Resource/shr5-1.shr5");
//        String file = FileLocator.toFileURL(entry).getFile();
//        // Platform.asLocalURL(entry).getFile();
//        final Shr5ResourceFactoryImpl newResourceSet = new Shr5ResourceFactoryImpl();
//        final XMIResource newResource = (XMIResource)newResourceSet.createResource(URI.createFileURI(file));
//        Map<?, ?> options = new HashMap<Object, Object>();
//        newResource.load(options);
//        EObject eObject = newResource.getContents().get(0);
//        final EObject newRes = eObject.eContents().get(0);
//        String newId = newResource.getID(newRes);
//
//        final EObject eObject1 = resource.getContents().get(0);
//        EObject res = eObject1.eContents().get(0);
//       
//        if (res instanceof ShrList) {
//            final int indexOf = ((ShrList)eObject1).getEntries().indexOf(res);
//            
//            final XMIResource xresource = (XMIResource)resource;
//            String id = xresource.getID(res);
//            if (!newId.equals(id)) {
//                final IValidationServiceProvider validationServiceProvider2 = getValidationServiceProvider();     
//                IValidationService validationService = validationServiceProvider2.getValidationService(getDefaultEcpProject());
//               
//                validationServiceProvider2.deleteValidationService(getDefaultEcpProject());
//                Job job = new Job("Relpace resources") {
//
//                    @SuppressWarnings("restriction")
//                    @Override
//                    protected IStatus run(IProgressMonitor monitor) {
//                        monitor.setTaskName("replacing resources");
//                        editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, eObject1, Shr5Package.Literals.SHR_LIST__ENTRIES, newRes, indexOf));
//                        newResource.unload();
//                        validationServiceProvider2.getValidationService(getDefaultEcpProject());
////                        validationService.
//                        return Status.OK_STATUS;
//                    }
//                    
//                };
//                job.setUser(true);
//                job.schedule();
////                if (MessageDialog.openConfirm(Display.getCurrent().getActiveShell(), "Resources changes",
////                        "The resources are new do you want to update the resources ?")) {
////                    
//            }
//
//        }
//        
//    }

    private void copyResource(IProgressMonitor monitor, IProject project) throws CoreException {
        Bundle extensionBundle = Activator.getDefault().getBundle();
        IContainer target = project;// .getFolder("resource");
        Enumeration<String> entryPaths = extensionBundle.getEntryPaths("shr5Resource");
        processPath(entryPaths, target, extensionBundle, "shr5Resource");
    }

    protected void processPath(Enumeration<String> entryPaths, IContainer target, Bundle extensionBundle, String basename) throws CoreException {
        for (Enumeration<String> iter = entryPaths; iter.hasMoreElements();) {
            String name = (String)iter.nextElement();
            if (name.endsWith("/.svn/"))
                continue;

            File file = getFile(name);
            IFileStore fileStore = EFS.getLocalFileSystem().getStore(target.getLocationURI());
            IContainer ntarget;
            if (file.isDirectory()) {
                IFileStore dir = fileStore.getChild(name.substring(basename.length())).mkdir(EFS.SHALLOW, null);
                IContainer[] containers = ResourcesPlugin.getWorkspace().getRoot().findContainersForLocationURI(dir.toURI());
                if (containers.length == 1) {
                    Enumeration<String> entrys = extensionBundle.getEntryPaths(name);
                    ntarget = containers[0];
                    if (entrys != null) {
                        ntarget.refreshLocal(1, null);
                        processPath(entrys, ntarget, extensionBundle, name);
                    }
                }
            }
            if (!file.isDirectory())
                generate(new NullProgressMonitor(), file, target);
        }

    }

    public IResource generate(IProgressMonitor monitor, File _source, IContainer _destination) throws CoreException {
        monitor.setTaskName("Template Generation Process");
        IResource dest = null;

        dest = _copyFile(_source, _destination, monitor);
        monitor.subTask(""); //$NON-NLS-1$
        monitor.worked(1);
        return dest;
    }

    protected IFile _copyFile(File file, IContainer dest, IProgressMonitor monitor) throws CoreException {
        String targetFileName = (file.getName());

        monitor.subTask(targetFileName);
        IFile dstFile = dest.getFile(new Path(targetFileName));

        InputStream stream = null;
        try {
            stream = new FileInputStream(file);
            if (dstFile.exists()) {
                dstFile.setContents(stream, true, true, monitor);
            } else {
                dstFile.create(stream, true, monitor);
            }
            stream.close();
        } catch (IOException ioe) {
            logError("error while copy file", ioe);
        }
        return dstFile;
    }

    /**
     * Returns the file of the given relativePath
     * 
     * @param relativePath
     * the relativePath of the template which represent the file to
     * get
     * @return the file
     */
    protected File getFile(String relativePath) {
        try {
            Bundle extensionBundle = Platform.getBundle(Activator.PLUGIN_ID);
            URL templateFileURL = extensionBundle.getEntry(relativePath);
            FileLocator.toFileURL(templateFileURL);
            return new File(Platform.asLocalURL(templateFileURL).getFile());
        } catch (IOException e) {
            e.printStackTrace();
            ILog log = Activator.getDefault().getLog();
            log.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        AdapterFactoryUtil.dispose();
        ResourceManager.dispose();
        plugin = null;
        super.stop(context);
    }

    public static void logError(String message, Exception e) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), message, e));
    }

    public static void logError(String message) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), message));
    }

    public static void logError(Exception e) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), e.getMessage(), e));
    }

    public static void logInfo(String message) {
        plugin.getLog().log(new Status(IStatus.INFO, plugin.getBundle().getSymbolicName(), message));
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

}
