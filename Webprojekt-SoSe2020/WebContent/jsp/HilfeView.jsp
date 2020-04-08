<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href='https://fonts.googleapis.com/css?family=Fjalla+One'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="../css/Startseite.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Support | lazyNerds </title>
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>
	<form action="../jsp/StartseiteAppl.jsp" method="get">

		<!-- HEADER -->
		<jsp:getProperty property="headerAsHtml2" name="sb" />

		<!-- CONTENT -->
		<div class="background">
			<br>
			<p class="title1">Häufige Fragen und Antworten</p>

			<nav class="accordion arrows">
				<div class="hilfekasten">
					<input type="radio" name="accordion" id="cb1" />
					<section class="box">
						<label class="box-title" for="cb1">Allgemeine Fragen</label> <label
							class="box-close" for="acc-close"></label>
						<div class="box-content">
							<p>
								<b><font class="color">Werden die Altklasuren immer
										aktualisiert?</font></b><br>
							</p>
							<p style="padding-left: 1em;">Semester zu Semester, werden
								die, von den Professoren zur Verfügung gestellten Altklausuren,
								immer aktualisiert. Falls neue vorhanden sind, werden sie
								beigefügt.</p>
							<p>
								<b><font class="color">Wie kann ich mein Passwort
										ändern?</font></b><br>
							</p>
							<p style="padding-left: 1em;">
								Schau mal <a href="../jsp/PasswortaendernView.jsp">hier</a> vorbei.
							</p>
							<p>
								<b><font class="color">Wie kann ich einen Buch
										bestellen?</font></b><br>
							</p>
							<p style="padding-left: 1em;">Gehe zu Literatur, zu den
								jeweiligen Fächer. Dort kannst du dann ein Buch aussuchen und
								diese anschließend zum Warenkoorb beifügen.</p>

							<p>
								<b><font class="color">Warum benötige ich lazyNerds?</font></b><br>
							</p>
							<p style="padding-left: 1em;">
								<a href="../jsp/WirView.jsp">Hier</a> findest du weitere hilfreiche Informationen.
							</p>
							<p>
								<b><font class="color">Wie kann ich meine Notizen
										speichern?</font></b><br>
							</p>
							<p style="padding-left: 1em;">Deine Notizen werden duch den
								aktiven Button 'speichern' auf der Seite aktiv gespeichert. Wenn
								du dich erneut anmeldest, kannst du darin weiterarbeiten.</p>
							<p>
								<b><font class="color">Was kostet mich ein Account?</font></b><br>
							</p>
							<p style="padding-left: 1em;">NICHTS! Es ist eine
								Unterstützung von Studenten für Studenten.</p>
						</div>
					</section>
					<input type="radio" name="accordion" id="cb2" />
					<section class="box">
						<label class="box-title" for="cb2">Technische Fragen</label> <label
							class="box-close" for="acc-close"></label>
						<div class="box-content">
							<p>
								<b><font class="color">Warum kann ich die Startseite
										nicht mehr öffnen?</font></b><br>
							<p style="padding-left: 1em;"></p>
							<ol>
								<li>Prüfe deine Internetverbindung.</li>
								<li>Schließe die Seite, und starte den Browser erneut.
									Manchmal ist es der Fall, dass der Browser unsere Fähigkeiten
									nicht aufheben kann.</li>
							</ol>
							<p>
								<b><font class="color">Ich kann mich nicht
										registrieren. Warum?</font></b><br>
							</p>
							<p style="padding-left: 1em;">
							<ol>
								<li>Prüfe, ob du schon bereits eingeloggt bist.</li>
								<li>Versuche dich mit einer anderen E-Mail Adresse zu
									registrieren</li>
								<li>Vermutlch passt dein Passwort nicht. Achte bite darauf,
									dass dein Passwort mindestens aus sechs Zeichen besteht.</li>

							</ol>
							<p>
								<b><font class="color">Wo kann ich mich bei
										technischen Problemen melden?</font></b><br>
							</p>
							<p style="padding-left: 1em;">
							<ol>
								<li>Für Unterstützung bei technischen Problemen erreichen
									Sie uns unter der Rufnummer 0176 123 45 67.</li>
								<li>Schreib uns gerne eine Mail: lazyNerds@web.de</li>
							</ol>
							<p style="padding-left: 1em;"></p>
							<p>
								<b><font class="color">Warum kann ich meinen Einkauf
										nicht abschließen?</font></b><br>
							</p>
							<p style="padding-left: 1em;">Vermutlich ist der Artikel
								nicht mehr vorhanden. Du wirst in Kürze diesbezüglch informiert.</p>
						</div>
					</section>

					<input type="radio" name="accordion" id="cb3" />
					<section class="box">
						<label class="box-title" for="cb3">Fragen zum Portal</label> <label
							class="box-close" for="acc-close"></label>
						<div class="box-content">
							<p>
								<b><font class="color">Benötige ich einen Account, um
										den Zugriff zum Portal zu erhalten</font></b><br>
							</p>
							<p style="padding-left: 1em;">
								Ein Account ist erforderlich, um ins Portal zu gelangen. Falls
								du noch kein Account besitzt, kannst du es <a href="../jsp/RegView.jsp">hier</a>
								erstellen.
							</p>
							<p>
								<b><font class="color">Wie kann ich wissen, wer
										angemeldet ist?</font></b><br>
							</p>
							<p style="padding-left: 1em;">Nach dem Einloggen, siehst du
								an der Menüliste deine Matrikelnummer. Anahnd dessen kannst du
								dich identifizieren.</p>
							<p>
								<b><font class="color">Wie funktioniert das
										Ratespiel?</font></b><br>
							</p>
							<p style="padding-left: 1em;">
								Das Ratespiel auch lazyQuiz genannt besteht aus Fragen bezüglich
								dem Thema Informatik. Es ist vom Schwierigkeitsgrad ganz still
								gelassen. Aber trotzdem etwas kniffelig. Du solltest in der
								Lage sein, allgemeine Fragen zu deinem Studium beantworten zu
								können. Teste dich <a href="../jsp/QuizView.jsp">jetzt</a> selsbt
							</p>
							<p>
								<b><font class="color">Kann man durch den Quiz eine
										Sache gewinnen?</font></b><br>
							</p>
							<p style="padding-left:">Na klar! Sobald du 100% geschafft
								hast, wirst du per Mail benachrichtigt.</p>
							<p>
								<b><font class="color">Kann auch meine Freundin sich
										registrieren?</font></b><br>
							</p>
							<p style="padding-left: 1em;">Wenn Person A ebenfalls an der
								HWG Ludwigshafen, den Studiengang Wirtschaftsinformatik
								studiert, ist sie herzlich Willkommen!</p>
						</div>
					</section>
					<input type="radio" name="accordion" id="cb4" />
					<section class="box">
						<label class="box-title" for="cb4">Wie kann ich am besten
							Lernen?</label> <label class="box-close" for="acc-close"></label>
						<div class="box-content">
							<p>
								<b><font class="color">Kann ich den Skript direkt
										öffnen, ohne erst heruntergeladen zu haben?</font></b><br>
							</p>
							<p style="padding-left: 1em;">lazyNerds vereinfacht dir
								diesen Aufwand. Du siehst auch direkt die Unterlagen zur
								Volesung, sobald du dich durch die einzelnen Semester
								durchgegangen bist.</p>
							<p>
								<b><font class="color">Kann jeder Altklausuren
										hochladen?</font></b><br>
							</p>
							<p style="padding-left: 1em;">Um den Lernerffekt zu
								vereinfachen, verzichten wir auf externe Unterlagen. Diese
								können gegen unseren Copyright-Schutz zu treffen. Aus mehreren
								Gründen, darf kein Benutzer Unterlagen hochaden.</p>
							<p>
								<b><font class="color">Lieber nur mit dem Skript
										arbeiten oder auch Notizen nebenbei machen?</font></b><br>
							</p>
							<p style="padding-left: 1em;">Im Portal findest du ebenfalls
								einen Notepad für dich. Du kannst parallel zur Vorlesung direkte
								Mitschriebe führen, auf denen nur du den Zugriff hast. Durch
								eigene Erfahrung, empfehlen wir dir Notizen zu betätigen, da
								mündlche Aussagen nicht immer im Skript vorhanden sind.</p>

							<p>
								<b><font class="color">Eure Empfehlungen?</font></b><br>
							</p>
							<p style="padding-left: 1em;"></p>
							<ol>
								<li>Sei schlau und aktiv in den Vorlesungen.</li>
								<li>Versuche dich nicht abzulenken und setze sich soweit
									wie möglich nach vorne.</li>
								<li>Suche dir eine gute Lerngruppe aus, von max. drei
									Personen. Die Gefahr von einer größeren Gruppe stellt sich
									durch vielen verschiedenen Meinungen und zu noch mehr Zeitdruck
									auf. Nicht zu viel, aber auch nicht zu wenige solltet ihr sein.</li>
							</ol>
						</div>
					</section>
					<input type="radio" name="accordion" id="acc-close" />
				</div>
			</nav>
		</div>
		<br><br><br>
		
		<!-- Icons -->
		<jsp:getProperty property="socialButtons" name="sb"/>
		<!-- FOOTER -->
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>