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
<title>transfer from credstick : <%=WebTools.getText(character)%></title>
<%@include file="include/style.jsp" %>
</head>
<body>
	<div class="page">
		<form action="main" method="get">
			<input type="hidden" name="action" value="doCredstickTransaction" />
			<div class="character-container">
				<div class="character-container-head">
					<h4>
						Name
						<%=WebTools.getText(character)%></h4>
						available credits : <%=WebTools.getAvailableCredits(character)%>
				</div>
				<div class="character-single-item-container" >
				Choose Credstick : <select class="item " name="id" style="display: list-item;">
						<%
						    for (AbstraktGegenstand g :  Collections2.filter( character.getInUse() ,ShadowrunTools.eclassPredicate(Shr5Package.Literals.CREDSTICK)) ) {
						%>
						<option value="<%=ShadowrunTools.getResourceId(g)%>" >
							<%=WebTools.getText(g)%></option>
						<%
						    }
						%>
					</select>
				</div>
				<div class="character-single-item-container" >
				Amount : <input type="text"  name="amount" />
				</div>
				<div class="character-single-item-container" >
				Mesage : <input type="text" name="message" />
				</div>
				<input type="submit" /><a  href="member.jsp">back</a>			
			</div>
		</form>
	</div>
</body>
</html>