<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/Startseite.css">
<title>Impressum | lazyNerds</title>
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
			<p class="title1">Impressum</p>

			<p class="title2">xx
			<p class="zitat2">xx</p>
			<div class="Porschediv">
				<img src="" class="Porsche">
			</div>
			<br>
		</div>

		<!-- FOOTER -->
		<jsp:getProperty property="footerAsHtml" name="sb" />
		 
	</form>
</body>
</html>