<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rechnung | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />
<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<form action="./WarenkorbAppl.jsp" method="get">
		<div class="backgroundWir">
		<br> <br> <br> <br> <br> <br><br> <br> <br>

			<h1>Vielen Dank für Deine Bestellung.</h1>

			<div class="Anfangdiv">
			<br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br>

			</div>
		</div>
		<br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br>

	</form>


	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>