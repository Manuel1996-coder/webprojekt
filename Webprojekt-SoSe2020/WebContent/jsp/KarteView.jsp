<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />
<title>Standort | lazyNerds</title>
</head>
<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<div class="background">
		<h1>HWG-LU Standort</h1>
		<div class="Rand">
			<div class="Kastenmitte">
				<div style="text-align: center;">
					<div style="display: inline-block; text-align: left;">
						<div style='height: 300px; width: 100%;'>
							<iframe width="" height="300"
								src=https://maps.google.de/maps?hl=de&q=LazyNerds%20%20Ernst-Boehe-Straße+4%20Ludwigshafen+am+Rhein&t=&z=10&ie=utf8&iwloc=b&output=embed
								frameborder="0" scrolling="no" marginheight="0" marginwidth="0"
								style='height: 300px; width: 100%;'></iframe>
							<p
								style="text-align: right; margin: 0px; padding-top: -10px; line-height: 10px; font-size: 10px; margin-top: -25px;">
								<a href="http://www.checkpoll.de/google-maps-generator/"
									style="font-size: 10px;" target="_blank">Google Maps
									Generator</a> by <a href="https://www.on-projects.de/"
									rel="nofollow" style="font-size: 10px;" title=""
									target="_blank">on-projects</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="Anfangdiv">
			<form action="./EinstellungenAppl.jsp" method="get">
				<input type="submit" value="Zum Portal" name="zurück" id="detail"
					class="submitSettingPortal">
			</form>
		</div>
		
	</div>
	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>