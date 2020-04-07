<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/timeline.css" />
<jsp:useBean id="bb" class="de.hwg_lu.bw4s.beans.BewertungBean"
	scope="session" />
<body>

	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<form action="./TimelineAppl.jsp" method="get">

		<div class="background">
			<h1>LazyNerds Kommentare</h1>
			<div class="timeline">
				<%=bb.getHTMLTimeline()%>
			</div>
			<input type="submit" name="zurueckzp" value="Zum Portal"
				class="submitSettingPortal">
		</div>
	</form>
	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>