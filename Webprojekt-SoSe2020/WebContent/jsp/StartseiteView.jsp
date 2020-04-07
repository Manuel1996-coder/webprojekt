<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href='https://fonts.googleapis.com/css?family=Fjalla+One'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="../css/Startseite.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script type="text/javascript" src="../js/Startseite.js"></script>
<title>Startseite | lazyNerds</title>
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>
	<form action="../jsp/StartseiteAppl.jsp" method="get">

		<!-- HEADER -->

		<jsp:getProperty property="headerAsHtml" name="sb" />

		<!-- CONTENT -->
		<div class="start-background">

			<p class="title1-start">lazyNerds</p>
		</div>

		<p class="title2-start">Man muss die Welt nicht verstehen, man
			muss sich nur darin zurechtfinden.
		<p class="zitat2-start">- Albert Einstein</p>

		<div class="Porschediv">
			<img src="../img/imgStart/Albert-Einstein.jpg" class="Porsche">
		</div>

		<div class="Porschediv-2">
			<p class="title2-start">Sei auch ein lazyNerd!</p>
			<div id="flex-container">
				<div class="panel panel-test2">
					<h5>
						All die Jahre, f&uuml;r was den ganzen Aufwand genommen. Tagelang
						auf eine Antwort von der ehemaligen Kommilitonen gewartet. Den
						gr&ouml;&szlig;ten Stress &uuml;berhaupt erlebt, da ich keine
						Struktur in meinem Leben hatte. Sei es in meinem Kleiderschrank,
						Auto, Beziehung oder meinen Mitschrieben. Ich wusste nie was
						P&uuml;nktlichkeit bedeutet. Und schon gar nicht wie man einen
						Skript bearbeitet. Sei eine Ver&auml;ndung f&uuml;r dich selbst
						und<a href="../jsp/RegView.jsp"> registriere dich kostenlos
							bei uns im Portal</a> ein. Wir garantieren dir, dein Studium so
						einfach wie m&ouml;glich zu gestalten!
					</h5>
				</div>
				<div class="panel panel-test2">
					<h5>
						Aktuelle News:
						<ol>
							<li><a
								href="https://www.hwg-lu.de/hochschule/corona-aktuelle-informationen-der-hwg-lu.html">Corona-Virus</a></li>
							<li><a
								href="https://www.hwg-lu.de/hochschule/wir-ueber-uns.html">Unsere
									Hochschule</a></li>
						</ol>
					</h5>
				</div>
			</div>
		</div>

		<br> <br> <br>

		<!-- Icons -->
		<jsp:getProperty property="socialButtons" name="sb" />

		<!-- FOOTER -->
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>