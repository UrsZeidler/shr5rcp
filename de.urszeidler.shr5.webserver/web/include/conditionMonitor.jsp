<%@page import="de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimePackage"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.WebTools"%>
<%@page import="de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter"%>
<%@page import="de.urszeidler.eclipse.shr5.KoerperPersona"%>
<%@page import="de.urszeidler.shr5.webserver.mgnt.PlayerManager"%>
<%
    PlayerManager pm = (PlayerManager)session.getAttribute("playerManager");
    if(pm==null){
    	response.sendRedirect("main");
    }
    RuntimeCharacter character = pm.getCharacter();

    KoerperPersona kp = (KoerperPersona)character.getCharacter().getPersona();
    int pcm = kp.getZustandKoerperlichMax();
    int pcmd = character.getPhysicalDamage();
    int mcm = kp.getZustandGeistigMax();
    int mcmd = character.getMentalDamage();
    int rcm = kp.getZustandGrenze();
    int rcmd = character.getOverDead();
%>
	<div  class="condition-monitor-container">
		<div class="condition-monitor-titel">physical</div>
		<div class="condition-monitor " >
			<%
			    for (int i = 0; i < pcm; i++) {
			        if (i % 3 == 0) {
			%>
			<div class="condition-monitor-row">
				<div  class="condition-box <%if (i >= pcmd) {%>" <%} else {%>red-filled" <%}%>></div>
				<%
				    } else {
				%>
				<div  class="condition-box <%if (i >= pcmd) {%>" <%} else {%>red-filled" <%}%>></div>
				<%
				    }
				        if ((i % 3 == 2) || (i + 1 == pcm)) {
				%>
				<div class="condition-box-number"><%=(((i) / 3) + 1) * -1%></div>
			</div>
			<%
			    }
			    }
			%>
		</div>
	</div>
	<div class="condition-monitor-container">
		<div class="condition-monitor-titel">mental</div>
		<div class="condition-monitor">
			<%
			    for (int i = 0; i < mcm; i++) {
			        if (i % 3 == 0) {
			%>
			<div class="condition-monitor-row">
				<div  class="condition-box <%if (i >= mcmd) {%>" <%} else {%>red-filled" <%}%>>&#160;</div>
				<%
				    } else {
				%>
				<div  class="condition-box <%if (i >= mcmd) {%>" <%} else {%>red-filled" <%}%>>&#160;</div>
				<%
				    }
				        if ((i % 3 == 2) || (i + 1 == mcm)) {
				%>
				<div class="condition-box-number"><%=(((i) / 3) + 1) * -1%></div>
			</div><!-- end of row -->
			<%
			    }
			    }
			%>
		</div>
	</div>
	<div class="condition-monitor-container">
		<div class="condition-monitor-titel">overdead</div>
		<div class="condition-monitor">
			<%
			    for (int i = 0; i < rcm; i++) {
			        if (i % 4 == 0) {
			%>
			<div class="condition-monitor-row">
				<div class="condition-box <%if (i >= rcmd) {%>" <%} else {%>red-filled" <%}%>>&#160;</div>
				<%
				    } else {
				%>
				<div  class="condition-box <%if (i >= rcmd) {%>" <%} else {%>red-filled" <%}%>>&#160;</div>
				<%
				    }
				        if ((i % 4 == 3) || (i + 1 == rcm)) {
				%>
			</div>
			<%
			    }
			    }
			%>
		</div>
		<div class="condition-monitor-titel"><%=WebTools.toFeatureName(character, RuntimePackage.Literals.PHYICAL_STATE__ZUSTAND)%>:<%=WebTools.literal2Name(character.getZustand(), character, RuntimePackage.Literals.PHYICAL_STATE__ZUSTAND) %></div>
	</div>
<!-- last line -->