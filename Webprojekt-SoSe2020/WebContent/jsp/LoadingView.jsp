<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loading | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />
<body>
	<jsp:useBean id="nb" class="de.hwg_lu.bw4s.beans.NotizenBean"
		scope="session" />
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml" name="sb" />
	</form>

	<form action="StartseiteAppl.jsp" method="get">
		<div class="backgroundWir">
			<div class="Anfang">
				<div class="Kasten">
				<h1>Diese Seite ist aktuell noch in Bearbeitung. Wir bitten um Geduld...</h1>
				<div class="Kasten">
				<img src="../img/imgStart/ungeduldig.gif">
				</div>
				</div>

				<div class="Anfangdiv">
					<input type="submit"
						name="zsartseite" value="Zurück zur Startseite"
						class="submitSettingPortal">
				</div>
			</div><br>
		</div>
	</form>
	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>