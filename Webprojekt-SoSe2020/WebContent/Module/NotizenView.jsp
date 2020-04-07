<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notizen | LazyNerds</title>
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

	<form action="NotizenAppl.jsp" method="get">
		<div class="backgroundWir">
			<div class="Anfang">
				<div class="Kasten">
					<%=nb.getHTMLNotizen()%>
				</div>

				<div class="Anfangdiv">
					<input type="submit" name="speichern" value="Speichern"
						class="submitSetting"> <input type="submit"
						name="zurueckzs" value="Zurück zur Agenda"
						class="submitSettingPortal">
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