<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="com.google.common.collect.Collections2"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.ScriptViewerWrapper"%>
<%@page import="de.urszeidler.shr5.webserver.Activator"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="de.urszeidler.eclipse.shr5.util.ShadowrunTools"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.Team"%>
<%@page import="org.eclipse.emf.common.util.EList"%>
<%@page import="de.urszeidler.shr5.scripting.ScriptHistory"%>
<%@page import="de.urszeidler.shr5.ecp.service.ScriptService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>shr5rcp main page</title>
<%@include file="include/style.jsp" %>
</head>
<body>
	<%
	    ScriptService scriptService = Activator.getDefault().getScriptService();
		ScriptViewerWrapper scriptViewerWrapper = Activator.getDefault().getScriptViewerWrapper();
	    if (scriptService.getCurrentScript() == null) {
	%>
	No script !
</body>
</html>
<%
    return;
    }
    ScriptHistory history = scriptService.getCurrentScript().getHistory();
    EList<String> writtenProtokol = history.getWrittenProtokol();
    Team player = scriptService.getCurrentScript().getPlayer();
%>
<!-- <script type="text/javascript" src="//code.jquery.com/jquery-2.1.1.min.js"></script> -->
<div class="page">
	<div class="main-header">
		Current placement :
		<img class="eobject" src="images?uriFragment=<%=WebTools.getUriFragment(history.getCurrentPlacement())%>" />
		<b><%=history.getCurrentPlacement().getName()%></b>
		at
		<%=history.getCurrentDate()%></div>
	<div class="main-container">
		<div class="main-container-row">
			<div class="row-part-left" width="20%">Impersonate :</div>
			<div class="main-list row-part-right" width="80%">
				<%
			for (RuntimeCharacter c : player.getMembers()) {
				 if(!Collections2.transform(scriptViewerWrapper.getRegisteredPlayers(), 
				     scriptViewerWrapper.createPlayerManager2RuntimeCharacterTransformer()).contains(c)){
				%>
				<a class="button" href="main?id=<%=ShadowrunTools.getResourceId(c)%>"><img class="eobject" src="images?uriFragment=<%=WebTools.getUriFragment(c)%>" />
				<%=WebTools.getText(c)%></a> 
				<%}else{%>
				<img class="eobject" src="images?uriFragment=<%=WebTools.getUriFragment(c)%>" />
				<%=WebTools.getText(c)%>
				<%
					}    
				}
				%>
			</div>
		</div>
	</div>
	<script  type="text/javascript" >
(function poll() {
    $.ajax({
        url: "/main?action=history",
        type: "GET",
        success: function(data) {
        if (data != "") {
            $('#history-container').html(data);
        }
            
        },
        dataType: "text",
        complete: setTimeout(function() {poll()}, 1000),
        timeout: 2000
    })
})();
</script>

	
	
	<jsp:include page="include/history.jsp" />
</div>
	<div>
	
	<form action="/characterUpload" method="post" enctype="multipart/form-data">
  <p>Choose a character from your local file system to upload in the script:<br>
    <input name="file" type="file" size="50" maxlength="300000" accept="text/*">
  	</p>
  		<input type="submit" />
	</form>
	
	</div>
</body>
</html>