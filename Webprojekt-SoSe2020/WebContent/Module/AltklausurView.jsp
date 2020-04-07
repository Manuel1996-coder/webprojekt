<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Altklausur | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />

<body>
	<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
		scope="session" />
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<div class="backgroundWir">
		<div class="Anfang2">
			<h1>Altklausur</h1>

			<div class="Anfang2">
				<iframe src="<%=kb.getAltklausur()%>" width="100%" height="1000px">

				</iframe>
			</div>
			<div class="Anfangdiv">
				<form action="AltklausurAppl.jsp" method="get">
					<input type="submit" name="zurueckza" value="Zur Agenda"
						class="submitSettingPortal">
				</form>
			</div>
		</div>
	</div>

	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>