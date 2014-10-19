package de.urszeidler.shr5.webserver.mgnt;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;

import de.urszeidler.shr5.webserver.Activator;
import de.urszeidler.shr5.webserver.preferences.PreferenceConstants;

public class ServerStatusDialog extends TitleAreaDialog {
    private DataBindingContext m_bindingContext;
    private Table table;
    private ScriptViewerWrapper viewerWrapper;
    private List<PlayerManager> registeredPlayers;
    private TableViewer tableViewer;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public ServerStatusDialog(Shell parentShell) {
        super(parentShell);
        viewerWrapper = Activator.getDefault().getScriptViewerWrapper();
        if (viewerWrapper != null)
            registeredPlayers = viewerWrapper.getRegisteredPlayers();

    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite)super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(1, false));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        Group grpSetverState = new Group(container, SWT.NONE);
        grpSetverState.setText("server state");
        grpSetverState.setLayout(new GridLayout(1, false));
        grpSetverState.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblNewLabel = new Label(grpSetverState, SWT.NONE);
        
        Label lblServeriplabel = new Label(grpSetverState, SWT.NONE);
        
        if (viewerWrapper == null)
            lblNewLabel.setText("server not startet");
        else{
            lblNewLabel.setText("server startet");

            try {
                StringBuffer sb = new StringBuffer();
                printIpUrls(sb);
                lblServeriplabel.setText(sb.toString());
            } catch (SocketException e) {
                throw new RuntimeException(e);
            }
        }

        Group grpConnectedPlayer = new Group(container, SWT.NONE);
        grpConnectedPlayer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
        grpConnectedPlayer.setText("connected player");
        grpConnectedPlayer.setLayout(new FillLayout(SWT.HORIZONTAL));

        tableViewer = new TableViewer(grpConnectedPlayer, SWT.BORDER | SWT.FULL_SELECTION);
        table = tableViewer.getTable();

        return area;
    }

    /**
     * @param sb
     * @throws SocketException
     */
    private void printIpUrls(StringBuffer sb) throws SocketException {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        int port = store.getInt(PreferenceConstants.SERVER_PORT);
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface iface = interfaces.nextElement();
            // filters out 127.0.0.1 and inactive interfaces
            if (iface.isLoopback() || !iface.isUp())
                continue;
            
            Enumeration<InetAddress> addresses = iface.getInetAddresses();
            while(addresses.hasMoreElements()) {
                InetAddress addr = addresses.nextElement();
                //filter out ip6
                if(addr.getAddress().length>4)
                    continue;

                sb.append(iface.getDisplayName()).append("  ").append("http://").append(addr.getHostAddress()).append(":").append(port).append("/main");
                sb.append("\n");
            }
        }
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        m_bindingContext = initDataBindings();
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 392);
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        if (viewerWrapper == null)
            return bindingContext;
        //
        ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
        IObservableMap observeMap = PojoObservables.observeMap(listContentProvider.getKnownElements(), PlayerManager.class,
                "character.character.persona.name");
        tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap));
        tableViewer.setContentProvider(listContentProvider);
        //
        IObservableList selfList = Properties.selfList(PlayerManager.class).observe(registeredPlayers);
        tableViewer.setInput(selfList);
        //
        return bindingContext;
    }
}
