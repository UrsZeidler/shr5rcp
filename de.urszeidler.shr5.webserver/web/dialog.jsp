<?xml version="1.0" encoding="UTF-8" ?>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%
    PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
    RuntimeCharacter character = pm.getCharacter();
    ProbeDialog pd = pm.getCurrentDialog();;

    String characterName = WebTools.getText(character);// character.getCharacter().getPersona().getName();
    //
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Probe <%=pd.getState()%> for <%=characterName%></title>
<link href="main.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<div class="page">
		<form action="main" method="post">
			<div class="probe-container">
				<div class="probe-header">
					<%=WebTools.getText(pd.getCmd())%>
					Probe for
					<%=characterName%>
				</div>
				Modifications :
				<div class="probe-mods">				
				<%for(ProbeMod mod : ((Probe)pd.getCmd()).getProbeMods()){%>
					<div class="default-line"><%=WebTools.getText(mod)%></div>
				<%}%>
				</div>
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
							<%if ((Boolean)pd.getCmd().eGet(ef)) {%> checked <%}%> />
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
				<input type="submit" />
			</div>
		</form>
	</div>
</body>
</html>