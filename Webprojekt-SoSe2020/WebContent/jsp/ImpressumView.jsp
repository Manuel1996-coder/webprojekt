<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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


			<p class="title2">Postanschrift:</p>
			<div class="kasten">
				<p class="untertext">
					Hochschule für Wirtschaft und Gesellschaft Ludwigshafen<br>
					Ernst-Boehe-Str. 4<br> Postfach: layzNerds <br> 67059
					Ludwigshafen am Rhein
				</p>
			</div>
			<p class="title2">Kontakt</p>
			<div class="kasten">
				<p class="untertext">
					Tel. +49 123 456 - 7<br> E-Mail: lazyNerds@web.de
				</p>
			</div>
			<br> <br> <br>
		</div>

		<!-- Icons -->
		<jsp:getProperty property="socialButtons" name="sb" />


		<!-- FOOTER -->
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
		 
	</form>
</body>
</html>