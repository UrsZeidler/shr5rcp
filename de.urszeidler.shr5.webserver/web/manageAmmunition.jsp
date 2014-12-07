<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.util.Collection"%>
<%@page import="com.google.common.base.Predicates"%>
<%@page import="com.google.common.base.Predicate"%>
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
	if(pm==null)
		response.sendRedirect("main");

    if(pm.isInCombat())
        response.sendRedirect("member.jsp");
    RuntimeCharacter character = pm.getCharacter();
    String id = (String)request.getParameter("id");
    
    EObject object = ShadowrunTools.getFirstObjectById(character.getInUse(), id);
    if(!(object instanceof Magazin)){
    	response.sendRedirect("member.jsp");
    }
    Magazin magazine = (Magazin)object;
    IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(object, Shr5Package.Literals.MAGAZIN__BULLETS);
    List<?> values1 = (List<?>)propertyDescriptor.getChoiceOfValues(object);
    Collection<?> values = Collections2.filter(values1,Predicates.in((List<?> )character.getInUse()));
    
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
		<fieldset>
			 <legend>manage ammunition for character : <%=WebTools.getText(character)%>
						</legend>
	
		<form action="main" method="get">
			<input type="hidden" name="action" value="doMagazinRefill" />
			<input type="hidden" name="magazin" value="<%=id%>" />
			<div class="character-container" >
				<div class="character-container-head">
					<h4>
						Name
						<%=WebTools.getText(object)%>(<%=magazine.getType().getKapazitaet()%>/<%=magazine.getBullets().size()%>)</h4>
						
				</div>
				<div class="character-single-item-container" >
				<label>Choose Ammo type:</label> 
				<select class="item " name="muni" >
						<%
						    for (Object g :  values) {
						%>
						<option value="<%=ShadowrunTools.getResourceId((EObject)g)%>" >
							<%=WebTools.getText(g)%>
						</option>
						<%
						    }
						%>
					</select>
				</div>
				<input type="submit" />		<a  href="member.jsp">back</a>		

			</div>
		<div class="character-single-item-container small-corner thin-border" >
			<%for(Munition muni : magazine.getBullets()){ %>
			<p> <%=WebTools.getText(muni)%>  </p>
			<%} %>
		</div>
			
		</form>
		</fieldset>
	</div>
</body>
</html>