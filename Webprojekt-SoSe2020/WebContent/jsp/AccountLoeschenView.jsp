<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account löschen | lazyNerds</title>
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

	<form action="./AccountLoeschenAppl.jsp" method="get">
		<div class="background">
			<h1>Account löschen</h1>
			<h2>Bitte gebe nochmals dein aktuelles Passwort ein, damit wir
				dein Account entgültig löschen können.</h2>
			<div class="Rand">
				<div class="Kastenmitte">
					<div style="text-align: center;">
						<div style="display: inline-block; text-align: left;">
							<table>
								<tr>
									<td><h2>Aktuelles Passwort:</h2></td>
									<td><input type="password" value=""
										name="aktuellesPassword" id="btn"></td>
								</tr>
							</table>
							<br><br><br>
							<input type="submit" value="Account dauerhaft löschen"
								name="dauerhaftloeschen" id="detail" class="submitBewertung">
							<input type="submit" value="Zurück zu Einstellungen"
								name="zurueckEinstellungen" id="detail" class="submitSettingPortal">
						</div>
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