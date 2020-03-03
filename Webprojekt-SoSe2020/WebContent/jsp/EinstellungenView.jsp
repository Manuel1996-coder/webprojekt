<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.LoginBean"%>
<%@page import="de.hwg_lu.bw4s.beans.AccountBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<link type="text/css" rel="stylesheet" href="../css/einstellungen.css" />

<body>
	<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
		scope="session" />
	<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
		scope="session" />
	<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
		scope="session" />
	<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean"
		scope="session" />
		


	<form action="./EinstellungenAppl.jsp" method="get">

		<h1>Einstellungen</h1>

		<table>

			<tr>

				<td><h3>Benutzername</h3></td>
				<td>
					<h3><%=lb.getUsername()%></h3>
				</td>



			</tr>

			<tr>

				<td><h3>Matrikelnummer</h3></td>
				<td><h3>
						<%=lb.getMatrkid()%>
					</h3></td>



			</tr>

			<tr>

				<td><h3>E-mail</h3></td>
				<td><h3>
						<%=lb.getEmail()%>
					</h3></td>


			</tr>



			<tr>

				<td><h3>Passwort ändern:</h3></td>
				<td><input type="submit" value="Passwort ändern"
					name="passwortaendern" id="btn"></td>



			</tr>

			<tr>

				<td><h3>Account löschen:</h3></td>
				<td><input type="submit" value="Account dauerhaft löschen"
					name="accountLoeschen" id="btn"></td>



			</tr>











		</table>

		<input type="submit" value="Zurueck zu Home" name="zurück" id="detail">


	</form>


</body>
</html>