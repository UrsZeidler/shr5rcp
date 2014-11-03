<%@page import="de.urszeidler.eclipse.shr5.Kleidung"%>
<%@page import="de.urszeidler.eclipse.shr5.Shr5Package"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimePackage"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools"%>
<%@page import="de.urszeidler.eclipse.shr5.Magazin"%>
<%@page import="de.urszeidler.eclipse.shr5.Feuerwaffe"%>
<%@page import="de.urszeidler.eclipse.shr5.Nahkampfwaffe"%>
<%
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
<%=WebTools.toFeatureName(fw, Shr5Package.Literals.ABSTAKT_WAFFE__SCHADENSCODE) %> :
<%=fw.getSchadenscode()%>|
<%=WebTools.toFeatureName(fw, Shr5Package.Literals.ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT) %>:<%=fw.getDurchschlagsKraft()%>|(<%=size%>/<%=kapazitaet%>)
<br />
<%=fw.getReichweite().getMin()%>-<%=fw.getReichweite().getKurz()%>|
<%=fw.getReichweite().getKurz()%>-<%=fw.getReichweite().getMittel()%>|
<%=fw.getReichweite().getMittel()%>-<%=fw.getReichweite().getWeit()%>|
<%=fw.getReichweite().getWeit()%>-<%=fw.getReichweite().getExtrem()%>|
<%
    } else if (item instanceof Nahkampfwaffe) {
        Nahkampfwaffe nw = (Nahkampfwaffe)item;
%>
<%=WebTools.toFeatureName(nw, Shr5Package.Literals.ABSTAKT_WAFFE__SCHADENSCODE) %> :
<%=nw.getSchadenscode()%>|
<%=WebTools.toFeatureName(nw, Shr5Package.Literals.ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT) %>:<%=nw.getDurchschlagsKraft()%>|
<br />
<%=WebTools.toFeatureName(nw, Shr5Package.Literals.NAHKAMPFWAFFE__REICHWEITE) %> :
<%=nw.getReichweite()%>
<%
    }else if (item instanceof Kleidung) {
        Kleidung k = (Kleidung)item;
%>
<%=WebTools.toFeatureName(k, Shr5Package.Literals.KLEIDUNG__RUESTUNG) %> :
<%=k.getRuestung()%>|
<%} %>


