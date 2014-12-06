<%@page import="de.urszeidler.eclipse.shr5.RiggerProgram"%>
<%@page import="de.urszeidler.eclipse.shr5.RiggerCommandConsole"%>
<%@page import="de.urszeidler.eclipse.shr5.MatrixProgram"%>
<%@page import="de.urszeidler.eclipse.shr5.Cyberdeck"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.PlayerManager"%>
<%@page import="de.urszeidler.eclipse.shr5.Kleidung"%>
<%@page import="de.urszeidler.eclipse.shr5.Shr5Package"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimePackage"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools"%>
<%@page import="de.urszeidler.eclipse.shr5.Magazin"%>
<%@page import="de.urszeidler.eclipse.shr5.Feuerwaffe"%>
<%@page import="de.urszeidler.eclipse.shr5.Nahkampfwaffe"%>
<%
	PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
	String key = (String)request.getParameter("object");
    Object item = request.getAttribute(key);
    if (item instanceof Feuerwaffe) {
        Feuerwaffe fw = (Feuerwaffe)item;
        Magazin m = (Magazin)fw.getMagazin();
        int kapazitaet = 0;
        int size = 0;
        if(m!=null){
        	Feuerwaffe type = GameplayTools.getMagazingType(m);
        	if (type != null) {
            	kapazitaet = type.getKapazitaet();
            	size = m.getBullets().size();
        	}    
        }    
%>
<%=WebTools.toFeatureName(fw, Shr5Package.Literals.ABSTAKT_WAFFE__SCHADENSCODE) %>:
<%=fw.getSchadenscode()%>|
AP: <%=fw.getDurchschlagsKraft()%>
|(<%=size%>/<%=kapazitaet%>)|modus: <%=WebTools.literal2Name(GameplayTools.getFireArmModus(pm.getCharacter(), fw), fw, Shr5Package.Literals.FEUERWAFFE__MODIE) %>
<br />
<%=fw.getReichweite().getMin()%>-<%=fw.getReichweite().getKurz()%>|
<%=fw.getReichweite().getKurz()%>-<%=fw.getReichweite().getMittel()%>|
<%=fw.getReichweite().getMittel()%>-<%=fw.getReichweite().getWeit()%>|
<%=fw.getReichweite().getWeit()%>-<%=fw.getReichweite().getExtrem()%>|
<%
    } else if (item instanceof Nahkampfwaffe) {
        Nahkampfwaffe nw = (Nahkampfwaffe)item;
%>
<%=WebTools.toFeatureName(nw, Shr5Package.Literals.ABSTAKT_WAFFE__SCHADENSCODE) %>:
<%=nw.getSchadenscode()%>|
AP: <%=nw.getDurchschlagsKraft()%>|
<br />
<%=WebTools.toFeatureName(nw, Shr5Package.Literals.NAHKAMPFWAFFE__REICHWEITE) %>:
<%=nw.getReichweite()%>
<%
    }else if (item instanceof Kleidung) {
        Kleidung k = (Kleidung)item;
%>
<%=WebTools.toFeatureName(k, Shr5Package.Literals.KLEIDUNG__RUESTUNG) %>:
<%=k.getRuestung()%>|
<% } else if (item instanceof Cyberdeck) {
    Cyberdeck cyb = (Cyberdeck)item; 
%>
<div class="small-detail" >
<%=WebTools.toFeatureName(cyb, Shr5Package.Literals.MATRIX_ATTRIBUTES__GERAETESTUFE)%>:<%=cyb.getGeraetestufe()%>|
at: <%=cyb.getAngriff()%>|sn: <%=cyb.getSchleicher()%>|
<%=WebTools.toFeatureName(cyb, Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG)%>:<%=cyb.getDatenverarbeitung()%>|
<%=WebTools.toFeatureName(cyb, Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL)%>:<%=cyb.getFirewall()%>|
<%=WebTools.toFeatureName(cyb, Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS)%>:<%=WebTools.literal2Name(cyb.getCurrentModus(),cyb,Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS)%>|
<br/>
<% for(MatrixProgram mp :cyb.getRunningPrograms()){ %>
<%=WebTools.getText(mp)%>|
<%} %>   
 </div> 
<%}  else if (item instanceof RiggerCommandConsole) {
    RiggerCommandConsole rcc = (RiggerCommandConsole)item; 
    %>
<div class="small-detail" >
<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.MATRIX_ATTRIBUTES__GERAETESTUFE)%>:<%=rcc.getGeraetestufe()%>|
<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG)%>:<%=rcc.getDatenverarbeitung()%>|
<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG)%>:<%=rcc.getRauschunterdrueckung()%>|
<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__ZUGRIFF)%>:<%=rcc.getZugriff()%>|
<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL)%>:<%=rcc.getFirewall()%>|
<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS)%>:<%=WebTools.literal2Name(rcc.getCurrentModus(),rcc,Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS)%>|
<br/>
<% for(RiggerProgram mp :rcc.getRunningPrograms()){ %>
<%=WebTools.getText(mp)%>|
<%} %>   
</div>
<%} %> 
