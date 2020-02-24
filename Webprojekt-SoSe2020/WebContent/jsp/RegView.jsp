<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.AccountBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="../js/BW4S.js"></script>
<link type="text/css" rel="stylesheet" href="../css/RegView.css" />
</head>
<body>
<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean" scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean" scope="session" />
<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean" scope="session" />

<jsp:getProperty name="gb" property="htmlHeadline" />
<jsp:getProperty name="mb" property="htmlMessage" />
<form id="regForm" action="./RegAppl.jsp" method="get" onsubmit="return inputCheck(this)">
<table>
	<tr>
		<td>MatrikelNr:</td>
		<td><input type="text"
					name="matrkid"
					value='<jsp:getProperty name="ab" property="matrkid" />'
					onkeyup="checkUserid(this.value)"
					onchange="checkUserid(this.value)"
			/>
		</td>
		<td class="fehler" id="useridMsgFeld"></td>
	</tr>
	<tr>
		<td>Passwort:</td>
		<td><input type="password" name="password" value="" 
			onkeyup="checkPassword(this.value)"
		/></td>
		<td class="fehler" id="passwordMsgFeld"></td>
	</tr>
	<tr>
		<td>Username:</td>
		<td><input type="text" name="username"
				value='<jsp:getProperty name="ab" property="username" />'
				onkeyup="checkUsername(this.value)"
			/>
		</td>
		<td class="fehler" id="usernameMsgFeld"></td>
	</tr>
	<tr>
		<td>E-Mail:</td>
		<td><input type="text" name="email"
				value='<jsp:getProperty name="ab" property="email" />'
			/>
		</td>
		<td class="fehler" id="emailMsgFeld"></td>
	</tr>
	<tr>
		<td></td>
		<td>
			
			<input type="submit" name="register" value="Registrieren" onclick="setButton(this.value)" />
		</td>
	</tr>
</table>
</form>
</body>
</html>