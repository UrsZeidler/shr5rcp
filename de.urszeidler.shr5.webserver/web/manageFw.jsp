<?xml version="1.0" encoding="UTF-8" ?>
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
    RuntimeCharacter character = pm.getCharacter();
    String id = (String)request.getParameter("id");
    
    EObject object = ShadowrunTools.getFirstObjectById(character.getInUse(), id);
    if(!(object instanceof Feuerwaffe)){
    	response.sendRedirect("member.jsp");
    }
    Feuerwaffe fw = (Feuerwaffe)object;
    IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(object, Shr5Package.Literals.FEUERWAFFE__MAGAZIN);
    List<?> values = (List<?>)propertyDescriptor.getChoiceOfValues(object);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>manage ammunition for character : <%=WebTools.getText(character)%></title>
<%@include file="include/style.jsp" %>
</head>
<body>
	<div class="page">
		<form action="main" method="get">
			<input type="hidden" name="action" value="doManageFw" />
			<input type="hidden" name="fw" value="<%=id%>" />
			<div class="character-container">
				<div class="character-container-head">
					<h4>
						Name
						<%=WebTools.getText(object)%></h4>
						
				</div>
				<div class="character-single-item-container" >
				Choose Magazine type : <select class="item " name="mag" style="display: list-item;">
						<%
						    for (Object g :  values) {
						%>
						<option value="<%=ShadowrunTools.getResourceId((EObject)g)%>" >
							<%=WebTools.getText(g)%></option>
						<%
						    }
						%>
					</select>
				</div>
				<div class="character-single-item-container" >
				Choose default fire modus : <select class="item " name="modus" style="display: list-item;">
						<%
						    for (FeuerModus g :  fw.getModie()) {
						%>
						<option value="<%= g.getLiteral()%>" >
							<%=WebTools.literal2Name(g, fw, Shr5Package.Literals.FEUERWAFFE__MODIE)%></option>
						<%
						    }
						%>
					</select>
				</div>

				<input type="submit" />				
			</div>

			
		</form>
	</div>
</body>
</html>