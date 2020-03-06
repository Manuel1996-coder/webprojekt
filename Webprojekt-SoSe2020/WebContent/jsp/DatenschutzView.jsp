<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/Startseite.css">
<title>Datenschutz | lazyNerds</title>
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>
	<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
		scope="session" />
	<form action="../jsp/StartseiteAppl.jsp" method="get">

		<!-- Kopfzeile -->
		<!-- Content -->
		<div class="background">
			<br>
			<p class="title1">Datenschutz</p>

			<p class="title2">xx
			<p class="zitat2">- Albert Einstein</p>
			<div class="Porschediv">
				<img src="" class="Porsche">

			</div>
		</div>

		

		<jsp:getProperty property="footerAsHtml" name="sb" />
</body>
</html>