<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Einloggen | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/LoginStyle.css" />
<link href='https://fonts.googleapis.com/css?family=Fjalla+One'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="../css/Startseite.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
	scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
	scope="session" />
<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
	scope="session" />

<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>
	<form action="../jsp/StartseiteAppl.jsp" method="get">


		<!-- HEADER -->
		<jsp:getProperty property="headerAsHtml" name="sb" />

		<div class="login-box">

			<h1>Login</h1>
			<div class="textbox">
				<i class="fas fa-user-graduate"></i> <input type="text"
					name="matrkid" placeholder="Matrikelnummer"
					value='<jsp:getProperty name="lb" property="matrkid" />'>
			</div>

			<div class="textbox">
				<i class="fas fa-lock"></i> <input type="password" name="password"
					placeholder="Passwort" value="">
			</div>
			<a href="#" id="a">Passwort vergessen?</a> <input type="submit"
				class="btn" name="login" value="Anmelden"> Neu bei
			LazyNerds? <a href="./LoginAppl.jsp?zurReg=zurReg"
				href="../css/hallo.css">Registrieren</a>
		</div>
		
	</form>
</body>
</html>