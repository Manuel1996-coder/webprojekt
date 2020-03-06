<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.AccountBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registriere | lazyNerds</title>
<script type="text/javascript" src="../js/BW4S.js"></script>
<link type="text/css" rel="stylesheet" href="../css/RegView.css" />
<link type="text/css" rel="stylesheet" href="../css/RegViewStyle.css" />
</head>

<body>
	<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean"
		scope="session" />
	<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
		scope="session" />
	<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
		scope="session" />

	<form id="regForm" action="./RegAppl.jsp" method="get"
		onsubmit="return inputCheck(this)">
		<div class="reg-box">

			<h1>Registrieren</h1>

			<div class="textbox">
				<i class="fas fa-user-graduate"></i> <input type="text"
					name="matrkid" placeholder="Matrikelnummer"
					value='<jsp:getProperty name="ab" property="matrkid" />'
					onkeyup="checkUserid(this.value)"
					onchange="checkUserid(this.value)" />
			</div>
			<div class="fehler" id="useridMsgFeld"></div>

			<div class="textbox">
				<i class="fas fa-lock"></i> <input type="password" name="password"
					placeholder="Passwort" value="" onkeyup="checkPassword(this.value)" />
			</div>
			<div class="fehler" id="passwordMsgFeld"></div>

			<div class="textbox">
				<i class="fas fa-user"></i><input type="text" name="username"
					placeholder="Username"
					value='<jsp:getProperty name="ab" property="username" />'
					onkeyup="checkUsername(this.value)" />
			</div>
			<div class="fehler" id="usernameMsgFeld"></div>

			<div class="textbox">
				<i class="far fa-envelope"></i><input type="text" name="email"
					placeholder="E-Mail"
					value='<jsp:getProperty name="ab" property="email" />' />
			</div>
			<div class="fehler" id="emailMsgFeld"></div>

			<input type="submit" class="btn" name="register" value="Registrieren"
				onclick="setButton(this.value)" id="detail" /> <input type="submit"
				class="btn" name="zurueck" value="Zur�ck zum Login"
				onclick="setButton(this.value)" />
		</div>
	</form>
</body>
</html>