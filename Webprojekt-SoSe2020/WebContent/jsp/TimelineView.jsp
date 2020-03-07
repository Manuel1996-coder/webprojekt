<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/timeline.css" />
<jsp:useBean id="bb" class="de.hwg_lu.bw4s.beans.BewertungBean"
	scope="session" />
<body>
<form action="./TimelineAppl.jsp" method="get">
<h1> LazyNerds Kommentare </h1>
<div class="timeline">

<%= bb.getHTMLTimeline() %>

</div>

<input type="submit" name="zurueckzp"
		value="Zum Portal">
		
</form>
</body>
</html>