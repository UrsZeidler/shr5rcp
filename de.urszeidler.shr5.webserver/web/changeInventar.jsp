<?xml version="1.0" encoding="UTF-8" ?>
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
	if(pm==null)
		response.sendRedirect("main");

    if(pm.isInCombat())
        response.sendRedirect("member.jsp");
    
    RuntimeCharacter character = pm.getCharacter();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>manage <%=WebTools.getText(character)%></title>
<%@include file="include/style.jsp" %>
</head>
<body>
	<div class="page">
				<fieldset>
			 <legend>Inventory for
						<%=WebTools.getText(character)%>
						</legend>
	
		<form action="main" method="get">
			<div class="character-container">
			<div class="character-container-head" >
			<h5>Change the inventory</h5>
			</div>
			
			<input type="hidden" name="action" value="changeCharacter" />
				<div class="character-single-item-container" >
<label><%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND) %>:
</label>
					 
					<select class="item " name="lefthand" >
						<%
						    for (AbstraktGegenstand g : character.getInUse()) {
						%>
						<option value="<%=ShadowrunTools.getResourceId(g)%>"
							<%if (character.getLeftHand() == g) {%> selected="selected" <%}%>>
							<%=WebTools.getText(g)%></option>
						<%
						    }
						%>
					</select>
				</div>
				<div class="character-single-item-container">
				<label><%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND) %>:</label>
				 <select class="item " name="righthand">
						<%
						    for (AbstraktGegenstand g : character.getInUse()) {
						%>
						<option value="<%=ShadowrunTools.getResourceId(g)%>"
							<%if (character.getRightHand() == g) {%> selected="selected"
							<%}%>>
							<%=WebTools.getText(g)%></option>
						<%
						    }
						%>
					</select>
				</div>
				<div class="character-single-item-container">
				<label>
				<%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__ARMOR) %>:
				</label>
					 <select class="item " name="armor" >
						<%
						    for (AbstraktGegenstand g : Collections2.filter(character.getInUse(), ShadowrunTools.eclassPredicate(Shr5Package.Literals.KLEIDUNG))) {
						%>
						<option value="<%=ShadowrunTools.getResourceId(g)%>"
							<%if (character.getArmor() == g) {%> selected="selected" <%}%>>
							<%=WebTools.getText(g)%></option>
						<%
						    }
						%>
					</select>
				</div>
				<div class="character-multi-item-container" >
				<label >
				<%=WebTools.toFeatureName(character, RuntimePackage.Literals.RUNTIME_CHARACTER__IN_USE) %>:
				</label>				
					<select class="main-list " name="inventar" multiple="multiple" >
						<%
						    for (AbstraktGegenstand g : character.getCharacter().getInventar()) {
						%>
						<option value="<%=ShadowrunTools.getResourceId(g)%>"
							<%if (character.getInUse().contains(g)) {%> selected="selected"
							<%}%>>
							<%=WebTools.getText(g)%></option>
						<%
						    }
						%>
					</select>
				</div>
				<input class="button" type="submit" />		
				<a class="button" href="member.jsp">back</a>		
	</div>
		</form>
		</fieldset>
			</div>
</body>
</html>