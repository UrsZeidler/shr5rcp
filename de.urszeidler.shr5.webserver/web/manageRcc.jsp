<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="de.urszeidler.eclipse.shr5.RiggerCommandConsole"%>
<%@page import="de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools"%>
<%@page import="com.google.common.base.Predicates"%>
<%@page import="java.util.Collection"%>
<%@page import="de.urszeidler.eclipse.shr5.FeuerModus"%>
<%@page import="de.urszeidler.eclipse.shr5.Feuerwaffe"%>
<%@page import="de.urszeidler.eclipse.shr5.Munition"%>
<%@page import="java.util.List"%>
<%@page import="de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil"%>
<%@page import="org.eclipse.emf.edit.provider.IItemPropertyDescriptor"%>
<%@page import="de.urszeidler.eclipse.shr5.Magazin"%>
<%@page import="org.eclipse.emf.ecore.EObject"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimePackage"%>
<%@page import="de.urszeidler.shr5.ecp.util.ShadowrunEditingTools"%>
<%@page import="de.urszeidler.eclipse.shr5.Shr5Package"%>
<%@page import="com.google.common.collect.Collections2"%>
<%@page import="de.urszeidler.eclipse.shr5.util.ShadowrunTools"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="de.urszeidler.eclipse.shr5.AbstraktGegenstand"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.PlayerManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
    if (pm == null)
        response.sendRedirect("main.jsp");
    RuntimeCharacter character = pm.getCharacter();
    if (pm.isInCombat())
        response.sendRedirect("member.jsp");
    String id = (String)request.getParameter("id");

    EObject object = ShadowrunTools.getFirstObjectById(character.getInUse(), id);
    if (!(object instanceof RiggerCommandConsole)) {
        response.sendRedirect("member.jsp");
    }
    RiggerCommandConsole rcc = (RiggerCommandConsole)object;
    List<?> values = rcc.getStoredPrograms();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>configure: <%=WebTools.getText(rcc)%></title>
<%@include file="include/style.jsp"%>
</head>
<body>

	<div class="page">
		<div class="container">
		<fieldset>
    <legend>configure: <%=WebTools.getText(rcc)%></legend>
			<form action="main" method="get">
				<input type="hidden" name="action" value="doManageRcc" /> 
				<input
					type="hidden" name="rcc" value="<%=id%>" />
			<div class="character-single-item-container" >
			<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS)%>:
				<select class="item " name="mode" >
						<%
						    for (Object g :  Shr5Package.Literals.INTERFACE_MODUS.getELiterals()) {
						%>
						<option value="<%=g.toString()%>" >
							<%=WebTools.literal2Name(g,rcc,Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS)%></option>
						<%
						    }
						%>
					</select>
			</div>
					
				<h5>
<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS)%>
					<%=WebTools.getText(object)%>
				</h5>
				<div class="character-multi-item-container">
					<select class="main-list " name="runningPrograms"
						multiple="multiple">
						<%
						    for (Object g : values) {
						%>
						<option value="<%=ShadowrunTools.getResourceId((EObject)g)%>"
						<%if (rcc.getRunningPrograms().contains(g)) {%> selected="selected"
							<%}%>
						>
							<%=WebTools.getText(g)%></option>
						<%
						    }
						%>
					</select>
				</div>
				<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__ZUGRIFF)%>: 
				<input type="number" min="0"
					max="<%=rcc.getDeviceRating()%>" step="1"
					value="<%=rcc.getZugriffBasis()%>" />
					
					<input class="button" type="submit" />	<a class="button" href="member.jsp">back</a>			
			</form>
			</fieldset>
			
		</div>
	</div>
</body>
</html>