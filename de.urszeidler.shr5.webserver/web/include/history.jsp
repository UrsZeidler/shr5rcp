<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="org.eclipse.emf.common.util.EList"%>
<%@page import="de.urszeidler.shr5.scripting.ScriptHistory"%>
<%@page import="de.urszeidler.shr5.webserver.Activator"%>
<%@page import="de.urszeidler.shr5.ecp.service.ScriptService"%>
<%
    ScriptService scriptService = Activator.getDefault().getScriptService();
    ScriptHistory history = scriptService.getCurrentScript().getHistory();
    EList<String> writtenProtokol = history.getWrittenProtokol();
%>
<div id="history-container" class="history-container">
	History
	<div id="history-list" class="history-list small-corner thin-border">
		<div class="inner-margin">
			<%
			    for (String line : writtenProtokol) {
			%>
			<div class="history-line"><%=WebTools.escapeHTML(line)%></div>
			<%
			    }
			%>
		</div>
	</div>
</div>