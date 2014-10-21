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
        Feuerwaffe type = GameplayTools.getMagazingType(m);
        int kapazitaet = 0;
        int size = 0;
        if (type != null) {
            kapazitaet = type.getKapazitaet();
            size = m.getBullets().size();
        }
        
%>
damage :<%=fw.getSchadenscode()%>|(<%=size%>/<%=kapazitaet%>)
<br />
<%=fw.getReichweite().getMin()%>-<%=fw.getReichweite().getKurz()%>|
<%=fw.getReichweite().getKurz()%>-<%=fw.getReichweite().getMittel()%>|
<%=fw.getReichweite().getMittel()%>-<%=fw.getReichweite().getWeit()%>|
<%=fw.getReichweite().getWeit()%>-<%=fw.getReichweite().getExtrem()%>
<%
    } else if (item instanceof Nahkampfwaffe) {
        Nahkampfwaffe nw = (Nahkampfwaffe)item;
%>
damage :
<%=nw.getSchadenscode()%>|
<br />
reach :
<%=nw.getReichweite()%>
<%
    }
%>