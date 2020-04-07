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
<title>Einstellungen | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />
<body>
	<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
		scope="session" />
	<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
		scope="session" />
	<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
		scope="session" />
	<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean"
		scope="session" />

	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<form action="./EinstellungenAppl.jsp" method="get">

		<div class="background">
			<h1>Einstellungen & Profil</h1>
			<div class="Rand">
				<div style="text-align: center;">
					<div style="display: inline-block; text-align: left;">
						<table class="KastenGroß">
							<tr>
								<td><h4>Benutzername:</h4></td>
								<td>
									<h4><%=lb.getUsername()%></h4>
								</td>
							</tr>
							<tr>
								<td><h4>Matrikelnummer:</h4></td>
								<td><h4>
										<%=lb.getMatrkid()%>
									</h4></td>
							</tr>
							<tr>
								<td><h4>E-mail-Adresse:</h4></td>
								<td><h4>
										<%=lb.getEmail()%>
									</h4></td>
							</tr>
						</table>
						<table>
							<tr>

								<td><h4>Du möchstest dein Passwort ändern?</h4></td>
							</tr>
							<tr>
								<td class="mittig"><input type="submit"
									value="Passwort ändern" name="passwortaendern" id="btn"
									class="submitSetting"></td>
							</tr>
							<tr>
								<td><h4>Du möchstest deinen Account löschen?</h4></td>
							</tr>
							<tr>
								<td class="mittig"><input type="submit"
									value="Account dauerhaft löschen" name="accountLoeschen"
									id="btn" class="submitSetting"></td>
							</tr>
						</table>
						<br> <br> <input type="submit" value="Zum Portal"
							name="zurück" id="detail" class="submitSettingPortal">
					</div>
				</div>
			</div>
		</div>
	</form>

	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>