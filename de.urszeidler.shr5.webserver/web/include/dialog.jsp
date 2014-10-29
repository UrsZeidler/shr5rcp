<?xml version="1.0" encoding="UTF-8" ?>
<%@page
	import="de.urszeidler.eclipse.shr5.gameplay.provider.util.GameplayEditTools"%>
<%@page import="de.urszeidler.eclipse.shr5.gameplay.Probe"%>
<%@page import="de.urszeidler.eclipse.shr5.gameplay.ProbeMod"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="org.eclipse.emf.ecore.EcorePackage"%>
<%@page import="org.eclipse.emf.ecore.EStructuralFeature"%>
<%@page
	import="de.urszeidler.shr5.webserver.mgnt.PlayerManager.ProbeDialog"%>
<%@page import="de.urszeidler.eclipse.shr5.AbstraktGegenstand"%>
<%@page import="de.urszeidler.eclipse.shr5.ChrakterLimits"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.PlayerManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
    RuntimeCharacter character = pm.getCharacter();
    ProbeDialog pd = pm.getCurrentDialog();
    if (pd == null)
        return;

    String characterName = WebTools.getText(character);
    if (pd.getCmd() == null) {
%>
<form id="probe-dialog" action="main" method="post">
<div class="probe-container thin-border big-corner ui-dialog">
	<div class="big-corner-margin">
		<div class="probe-header">
			<h4>
				A Message for
				<%=characterName%></h4>
			<p><%=WebTools.getText(pd.getMessage())%></p>
		</div>
	</div>
<input id="probe-submit" type="submit" />
</div>
</form>

<%
    } else {
%>
<form id="probe-dialog" action="main" method="post">
	<div class="probe-container thin-border big-corner ui-dialog">
		<div class="big-corner-margin">
			<div class="probe-header">
				<h4>
					Test for
					<%=characterName%></h4>
				<%=WebTools.getText(pd.getCmd())%>
				<%
				    if (pd.getCmd() instanceof Probe) {
				%>
				<p><%=WebTools.probe2ProbeString((Probe)pd.getCmd())%></p>
				<%
				    }
				%>
			</div>
			<%
			    if (pd.getCmd() instanceof Probe) {
			%>
			<div class="probe-mods">
				Modifications :
				<%
			    for (ProbeMod mod : ((Probe)pd.getCmd()).getProbeMods()) {
			%>
				<div class="default-line"><%=WebTools.getText(mod)%></div>
				<%
				    }
				%>
			</div>
			<hr />
			<%
			    }
			%>
			<%
			    for (EStructuralFeature ef : pd.getFeatures()) {
			%>
			<div class="probe-input-line">
				<div class="probe-input-label"><%=ef.getName()%></div>
				<div class="probe-input-field">
					<%
					    if (ef.getEType().equals(EcorePackage.Literals.EBOOLEAN)) {
					%>
					<input name="<%=ef.getName()%>" type="checkbox" value="true"
						<%if (pd.getCmd().eGet(ef) != null && (Boolean)pd.getCmd().eGet(ef)) {%>
						checked <%}%> />
					<%
					    } else {
					%>
					<input name="<%=ef.getName()%>" <%if (pd.getCmd().eIsSet(ef)) {%>
						value="<%=pd.getCmd().eGet(ef)%>" <%}%> />
					<%
					    }
					%>
				</div>
			</div>
			<%
			    }
			%>
			<input id="probe-submit" type="submit" />
		</div>
	</div>
</form>
<%
    }
%>