<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kontakt | lazyNerds</title>
<link rel="stylesheet" type="text/css" href="../css/Startseite.css">
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>
	<form action="../jsp/StartseiteAppl.jsp" method="get">

		<!-- HEADER-->

		<jsp:getProperty property="headerAsHtml" name="sb" />

		<!-- CONTENT -->

		<div class="background">
			<br>
			<p class="title1">Kontakt</p>

			<p class="title2">xx</p>
			<p class="zitat2">xx</p>
			<div class="Porschediv">
				<img src="" class="Porsche">
			</div>
			<br>
		</div>

		<!-- FOOTER -->
		<jsp:getProperty property="startFooterAsHtml" name="sb" />






	</form>
</body>
</html>