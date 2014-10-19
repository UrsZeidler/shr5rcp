<%@page import="de.urszeidler.eclipse.shr5.Feuerwaffe"%>
<%@page import="de.urszeidler.eclipse.shr5.Nahkampfwaffe"%>

<%
    String key = (String)request.getParameter("object");
    Object item = request.getAttribute(key);
    if (item instanceof Feuerwaffe) {
        Feuerwaffe fw = (Feuerwaffe)item;
%>
damage :<%=fw.getSchadenscode()%>|
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