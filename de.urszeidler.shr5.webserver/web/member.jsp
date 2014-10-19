<?xml version="1.0" encoding="UTF-8" ?>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
    PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
    RuntimeCharacter character = pm.getCharacter();

    String characterName = WebTools.getText(character.getCharacter().getPersona().getName());
    ScriptService scriptService = Activator.getDefault().getScriptService();
    ScriptHistory history = scriptService.getCurrentScript().getHistory();
    EList<String> writtenProtokol = history.getWrittenProtokol();
    request.setAttribute("lhand", character.getLeftHand());
    request.setAttribute("rhand", character.getRightHand());
    //
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Impersonating <%=characterName%></title>
<!-- <meta http-equiv="refresh" content="2;url=main"> -->
<!--   <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">  -->

<link href="main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="//code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>

   <style>
         .ui-widget-header,.ui-state-default, ui-button{
            background:#b9cd6d;
            border: 1px solid #b9cd6d;
            color: #FFFFFF;
            font-weight: bold;
         }
      </style>
</head>

<body>
<script  type="text/javascript" >
$("#dialog").dialog({autoOpen : false, modal : true, show : "fadeIn", hide : "fadeOut"});

(function poll() {
    $.ajax({
        url: "/main?action=dialog",
        type: "GET",
        success: function(data) {
        	if(data!=""){
        		$('#dialog').html(data);
        		$('#page').html('');
        		$('#dialog').dialog( "open" );       		
          }  
          setTimeout(function() {poll()}, 1000)
        },
        dataType: "text",
//         complete: setTimeout(function() {poll()}, 10000),
        timeout: 2000
    })
})();
</script>
	<div id="dialog" title="Probe dialog" class="ui-dialog-content"></div>
	<div id="page" class="page">	
		<div id="character" class="character-container">
			<div class="character-container-head thin-border small-corner ">
				<h4 class="container-row">
					Name
					<%=characterName%></h4>
				<h4 class="container-row">
					edge used :
					<%=character.getUsedEdge()%>/<%=character.getCharacter().getPersona().getEdge()%></h4>
					<hr />
				<jsp:include page="include/conditionMonitor.jsp" />
			</div>
			<div class="container-row">
				<div
					class="character-single-item-container thin-border small-corner ">
					left hand :
					<%=WebTools.getText(character.getLeftHand())%>
					<hr />
					<jsp:include page="include/item.jsp">
						<jsp:param name="object" value="lhand" />
					</jsp:include>
				</div>
				<div
					class="character-single-item-container thin-border small-corner ">
					right hand :
					<%=WebTools.getText(character.getRightHand())%>
					<hr />
					<jsp:include page="include/item.jsp">
						<jsp:param name="object" value="rhand" />

					</jsp:include>
				</div>
			</div>
		</div>
		<!-- end container -->
		<div class="character-inventar-container">
			<a href="changeInventar.jsp">change</a> </br>
			<div class="character-multi-item-container thin-border small-corner">
				<%
				    for (AbstraktGegenstand g : character.getInUse()) {
				%>
				<p class="inventar"><%=WebTools.getText(g)%></p>
				<%
				    }
				%>
			</div>
		</div>
<script  type="text/javascript" >
(function poll() {
    $.ajax({
        url: "/main?action=history",
        type: "GET",
        success: function(data) {
            $('#history-container').html(data);

            
        },
        dataType: "text",
        complete: setTimeout(function() {poll()}, 3000),
        timeout: 2000
    })
})();
</script>
		<jsp:include page="include/history.jsp" />
		<a href="main?action=logout">stop being <%=WebTools.getText(character)%>(logout)
		</a>
	</div>
</body>
</html>