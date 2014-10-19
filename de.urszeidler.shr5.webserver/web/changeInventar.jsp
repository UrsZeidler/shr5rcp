<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="de.urszeidler.eclipse.shr5.Shr5Package"%>
<%@page import="com.google.common.collect.Collections2"%>
<%@page import="de.urszeidler.eclipse.shr5.util.ShadowrunTools"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="de.urszeidler.eclipse.shr5.AbstraktGegenstand"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.PlayerManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
    PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
    RuntimeCharacter character = pm.getCharacter();
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>manage <%=WebTools.getText(character)%></title>
<link href="main.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="page">
		<form action="main" method="get">
			<input type="hidden" name="action" value="changeCharacter" />
			<div class="character-container">
				<div class="character-container-head">
					<h4>
						Name
						<%=WebTools.getText(character)%></h4>
					<h4>
						edge used :
						<%=character.getUsedEdge()%>/<%=character.getCharacter().getPersona().getEdge()%></h4>
				</div>
				<div class="character-single-item-container">
					left hand : <select class="item " name="lefthand">
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
				<div class="character-single-item-container">right hand : <select class="item " name="righthand">
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
					armor : <select class="item " name="armor">
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
				<input type="submit" />
				<div class="character-multi-item-container">
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
			</div>
		</form>
	</div>
</body>
</html>