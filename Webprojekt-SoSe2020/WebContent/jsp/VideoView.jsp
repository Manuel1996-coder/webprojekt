<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />
<title>Media | lazyNerds</title>
</head>

<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<div class="background">
		<h1>Für die HWG-LU Fan's - Imagefilm</h1>
		<div class="Kasten">
			<form action="./VideoAppl.jsp" method="get">
				<video src="../mp4/vid.mp4" width="80%" height="450" controls>
				</video>
			</form>
		</div>
		<div style="text-align: center;">
			<div style="display: inline-block; text-align: left;">

				<form action="../jsp/EinstellungenAppl.jsp" method="get">
					<input type="submit" value="Zum Portal"
							name="zurück" id="detail" class="submitSettingPortal">
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