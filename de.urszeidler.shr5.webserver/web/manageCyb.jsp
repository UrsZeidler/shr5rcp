<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="org.eclipse.emf.ecore.EAttribute"%>
<%@page import="de.urszeidler.eclipse.shr5.Cyberdeck"%>
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
    if (!(object instanceof Cyberdeck)) {
        response.sendRedirect("member.jsp");
    }
    Cyberdeck rcc = (Cyberdeck)object;
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
<script type="text/javascript">
$(document).ready(function() {
    $('#btn-up').bind('click', function() {
        $('#select-to option:selected').each( function() {
            var newPos = $('#select-to option').index(this) - 1;
            if (newPos > -1) {
                $('#select-to option').eq(newPos).before("<option value='"+$(this).val()+"' selected='selected'>"+$(this).text()+"</option>");
                $(this).remove();
            }
        });
    });
    $('#btn-down').bind('click', function() {
        var countOptions = $('#select-to option').size();
        $('#select-to option:selected').each( function() {
            var newPos = $('#select-to option').index(this) + 1;
            if (newPos < countOptions) {
                $('#select-to option').eq(newPos).after("<option value='"+$(this).val()+"' selected='selected'>"+$(this).text()+"</option>");
                $(this).remove();
            }
        });
    });
    $('#submit').bind('click', function() {
        $('#select-to option').each( function() {
        	$(this).prop("selected",true);            
        });
        this.form.submit();
    });
});

</script>
	<div class="page">
		<div class="container">
		<fieldset>
    	<legend>configure: <%=WebTools.getText(rcc)%></legend>
			<form action="main" method="get">
				<input type="hidden" name="action" value="doManageCyb" /> 
				<input
					type="hidden" name="cyb" value="<%=id%>" />
					<h5>Configure your cyberdeck.</h5>											
			<div class="character-single-item-container" >
			<label for="mode">
			<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS)%>:
			</label>
				<select class="item " name="mode" >
						<%
						    for (Object g :  Shr5Package.Literals.INTERFACE_MODUS.getELiterals()) {
						%>
						<option value="<%=g.toString()%>" 
						<%if (rcc.getCurrentModus().getLiteral().equals(g.toString())) {%> selected="selected"
							<%}%>
						 >
							<%=WebTools.literal2Name(g,rcc,Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS)%></option>
						<%
						    }
						%>
					</select>
			</div>

				<div class="character-multi-item-container">
				<label style="vertical-align: top; font-size: 10px;" for="runningPrograms">
				<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.CYBERDECK__RUNNING_PROGRAMS)%>:
				</label>
					<select class="main-list " name="runningPrograms"
						multiple="multiple">
						<%
						    for (Object g : values) {
						%>
						<option value="<%=ShadowrunTools.getResourceId((EObject)g)%>"
						<%if (rcc.getRunningPrograms().contains(g)) {%> selected="selected"
							<%}%>
						>
							<%=WebTools.getText(g)%>
						</option>
						<%
						    }
						%>
					</select>
				</div>
				<p>attribute configuration:</p>
				<div class="character-multi-item-container">
				<label style="font-size: 10px;" for="configuration">
				<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL)%>:<br />
				<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG)%>:<br />
				<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.ACTIVE_MATIX_DEVICE__SCHLEICHER)%>:<br />
				<%=WebTools.toFeatureName(rcc, Shr5Package.Literals.ACTIVE_MATIX_DEVICE__ANGRIFF)%>:<br />
				</label>
					<select class="main-list " id="select-to" name="configuration"
						multiple="multiple">
						<%
						    for (EAttribute g : rcc.getConfiguration()) {
						     Object val = rcc.eGet(g); 
						%>
			 			<option  value="<%=WebTools.escapeHTML(g.getName())%>"
						 selected="selected"
						>
							<%=WebTools.getText(g)+"="+val%>
						</option>
						<%
						    }
						%>
					</select>
					   <a href="JavaScript:void(0);" id="btn-up">Up</a>
    				   <a href="JavaScript:void(0);" id="btn-down">Down</a>
					
				</div>
					
				<input id="submit" class="button" type="submit" />	
				<a class="button" href="member.jsp">back</a>			
			</form>
			</fieldset>
			
		</div>
	</div>
</body>
</html>