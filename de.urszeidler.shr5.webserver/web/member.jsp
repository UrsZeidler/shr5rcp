<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="de.urszeidler.eclipse.shr5.Cyberdeck"%>
<%@page import="de.urszeidler.eclipse.shr5.RiggerCommandConsole"%>
<%@page import="de.urszeidler.eclipse.shr5.util.ShadowrunTools"%>
<%@page import="de.urszeidler.eclipse.shr5.Magazin"%>
<%@page import="de.urszeidler.eclipse.shr5.Shr5Package"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimePackage"%>
<%@page import="de.urszeidler.shr5.ecp.util.ShadowrunEditingTools"%>
<%@page import="de.urszeidler.eclipse.shr5.KoerperPersona"%>
<%@page import="org.eclipse.emf.common.util.EList"%>
<%@page import="de.urszeidler.shr5.scripting.ScriptHistory"%>
<%@page import="de.urszeidler.shr5.ecp.service.ScriptService"%>
<%@page import="de.urszeidler.shr5.webserver.Activator"%>
<%@page import="de.urszeidler.eclipse.shr5.Feuerwaffe"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="de.urszeidler.eclipse.shr5.AbstraktGegenstand"%>
<%@page import="de.urszeidler.eclipse.shr5.ChrakterLimits"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.PlayerManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
    if(pm==null)
    	response.sendRedirect("main");

    RuntimeCharacter character = pm.getCharacter();

    String characterName = WebTools.getText(character.getCharacter().getPersona().getName());
    ScriptService scriptService = Activator.getDefault().getScriptService();
    ScriptHistory history = scriptService.getCurrentScript().getHistory();
    EList<String> writtenProtokol = history.getWrittenProtokol();
    request.setAttribute("lhand", character.getLeftHand());
    request.setAttribute("rhand", character.getRightHand());
    request.setAttribute("armor", character.getArmor());
    //
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Impersonating <%=characterName%></title>
<%@include file="include/style.jsp"%>
</head>

<body>
	<div id="dialog" class="no-close"></div>
	<script type="text/javascript">
		$("#dialog").dialog({
			dialogClass : "no-close",
			autoOpen : false,
			modal : true,
// 			height : 400,
			show : "puff",
			hide : "puff"
		});

		(function poll() {
			$.ajax({
				url : "/main?action=dialog",
				type : "GET",
				success : function(data) {
					if (data != "") {
						$('#dialog').html(data);
						//$('#page').html('');
						$('#dialog').dialog("option", "position", {
							my : "left top",
							at : "left top",
							of : window
						});
			
						$('#dialog').dialog("option", "closeOnEscape", false);
						$('#dialog').dialog("open");
					} else {
						setTimeout(function() {
							poll()
						}, 1000)
					}
				},
				dataType : "text",
				//         complete: setTimeout(function() {poll()}, 10000),
				timeout : 2000
			})
		})();
	</script>
	<div id="page" class="page">
		<div id="character" class="character-container">
			<div class="character-container-head thin-border small-corner ">
				<div class="inner-margin">
					<strong class="container-row"> <img class="eobject"
						src="images?uriFragment=<%=WebTools.getUriFragment(character)%>" />
						<%=characterName%></strong> 
						
					<hr />
					<div class="condition-monitor-section" >
					<div id="conditionMonitor">
						<jsp:include page="include/conditionMonitor.jsp" />
					</div>
						<div class="condition-monitor-container">
						<ul class="action">
						<li class="action "><a class="button" style="width: 100px;" href="member.jsp" >reload page</a></li>
						<li class="action"><a class="button" style="width: 100px;" href="changeInventar.jsp">change inventory</a></li>						
						<li class="action"><a class="button" style="width: 100px;" href="transaction.jsp">make a transaction</a></li>
						
						</ul>
						<p><%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__USED_EDGE)%>:
						<%=character.getUsedEdge()%>/<%=character.getCharacter().getPersona().getEdge()%></p>
						<p>available credits : <%=WebTools.getAvailableCredits(character)%></p>
						</div>
					</div>
				</div>
			</div>
			<div class="container-row">
				<div
					class="character-single-item-container thin-border small-corner ">
					
					<div class="inner-margin">
						<small><%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND)%></small>
						: <img class="eobject"
							src="images?uriFragment=<%=WebTools.getUriFragment(character.getLeftHand())%>" /><%=WebTools.getText(character.getLeftHand())%>
						<hr />
						<jsp:include page="include/item.jsp">
							<jsp:param name="object" value="lhand" />
						</jsp:include>
					</div>
					
				</div>

				<div
					class="character-single-item-container thin-border small-corner ">
					<div class="inner-margin">
						<small><%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND)%></small>
						: <img class="eobject"
							src="images?uriFragment=<%=WebTools.getUriFragment(character.getRightHand())%>" /><%=WebTools.getText(character.getRightHand())%>
						<hr />
						<jsp:include page="include/item.jsp">
							<jsp:param name="object" value="rhand" />
						</jsp:include>
					</div>
				</div>

				<div
					class="character-single-item-container thin-border small-corner ">
					<div class="inner-margin">
						<small><%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__ARMOR)%></small>
						: <img class="eobject"
							src="images?uriFragment=<%=WebTools.getUriFragment(character.getArmor())%>" /><%=WebTools.getText(character.getArmor())%>
						<hr />
						<jsp:include page="include/item.jsp">
							<jsp:param name="object" value="armor" />
						</jsp:include>
					</div>
				</div>

			</div>
			<!--  -->
		</div>

		<!-- end container -->
		<div id="inventar-container" class="character-inventar-container">
			
			<div class="character-multi-item-container thin-border small-corner ">
				<div class="inner-margin two-col">
					<%
					    for (AbstraktGegenstand g : character.getInUse()) {
					%>
					<p class="inventar ">
						<img class="eobject"
							src="images?uriFragment=<%=WebTools.getUriFragment(g)%>" /><%=WebTools.getText(g)%> 
							<% if (g instanceof Magazin) {
							    Magazin mz = (Magazin)g; %>
							<a class="button " href="manageAmmunition.jsp?id=<%=ShadowrunTools.getResourceId(g)%>">manage</a>
							<% }else if (g instanceof Feuerwaffe) {
							    Feuerwaffe fw = (Feuerwaffe)g;%>
							   <a class="button " href="manageFw.jsp?id=<%=ShadowrunTools.getResourceId(g)%>">manage</a> 
							    <% }else if (g instanceof RiggerCommandConsole) {
							        RiggerCommandConsole rcc = (RiggerCommandConsole)g;%>
							    <a class="button " href="manageRcc.jsp?id=<%=ShadowrunTools.getResourceId(g)%>">manage</a> 
							    <% }else if (g instanceof Cyberdeck) {
							        Cyberdeck cyb = (Cyberdeck)g;%>
							    <a class="button " href="manageCyb.jsp?id=<%=ShadowrunTools.getResourceId(g)%>">manage</a> 
								<%} %>
							</p>
					<%
					    }
					%>
				</div>
			</div>
		</div>
		<!-- end of inventar -->
		<script type="text/javascript">
			(function poll() {
				$.ajax({
					url : "/main?action=history",
					type : "GET",
					success : function(data) {
						if (data != "") {
							$('#history').html(data);
						}
					},
					dataType : "text",
					timeout : 2000
				})
				$.ajax({
					url : "/main?action=conditionMonitor",
					type : "GET",
					success : function(data) {
						if (data != "") {
							$('#conditionMonitor').html(data);
						}
					},
					dataType : "text",
					complete : setTimeout(function() {
						poll()
					}, 3000),
					timeout : 2000
				})				
			})();
		</script>
		<div id="history">
		<jsp:include page="include/history.jsp" />
		</div>
		<a class="button" href="main?action=logout">stop being <%=WebTools.getText(character)%>(logout)
		</a>
	</div>
</body>
</html>