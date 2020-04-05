<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Über uns | lazyNerds</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="../css/Startseite.css">
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>
	<form action="../jsp/StartseiteAppl.jsp" method="get">

		<!-- HEADER-->
		<jsp:getProperty property="headerAsHtml" name="sb" />

		<!-- CONTENT -->
		<div class="backgroundWir">
			<br>
			<p class="title1-start">Wir sind die lazyNerds!</p>
			
			<div class="Anfangdiv">
				<p class="title2-start">Die ersten Ideen...</p>
				<div id="part2part">
					<div class="panel panel-test3">
						<img src="../img/imgStart/start.png" class="Anfang">
					</div>
					<div class="panel panel-test4">
						<h5>
							Die Idee <span>lazyNerds</span>, kommt von drei Wifo-Studenten
							der HWG Ludwigshafen. Die drei Studenten, die seit dem zweiten
							Semester zusammen lernen und alles bis heute erfolgreich
							absolviert haben. Während dem Lernen, ist uns aufgefallen wie
							schwer und komplex das Lernen immer war. Eines Tages fiel uns die
							Idee ein, unsere eigne Dropbox zu erschaffen. "Die Altklausuren
							sind überall, alles zu kompliziert und nicht direkt zu finden."
							Dieser Satz ging uns jedes mal durch die Gedanken, und genau dies
							wollten wir umsetzen!!! Um uns das Lernen zu vereinfachen, und
							nicht gleichzeitig 10 Tabs geöffnet zu haben, starteten wir mit
							einer Seite worin wir all unsere Quellen hochladen konnten.
						</h5>
					</div>
				</div>
				<br> <br> <br>
				<p class="title2-start">Die ersten Schritte...</p>

				<div id="part2part">
					<div class="panel panel-test3">
						<video src="../mp4/ersteschritte.mp4" class="Anfang" controls>
						</video>
					</div>
					<div class="panel panel-test4">
						<h5>Das Aussehen ist ganz wichtig für uns gewesen. Wir
							wollten was cooles aber dennoch etwas klassisches. Im Web bekommt
							man eine menge Ideen angezeigt, aber der Nachteil daran ist, dass
							man sich aboslut gar nicht entscheiden kann. Demnach haben wir
							schon gemerkt gehabt, dass wir sehr viel Zeitin dem Design
							investieren würden. Denn, der erste Eindruck würde am Besten
							sein! Parralel zum Design, haben wir, ohne vorher uns viel
							Gedanken darüber gemacht zu haben, alle Skripte und Altklausuren,
							die für uns zur Verfügung gestellt waren und immernoch sind, in
							unserem Portal hochgeladen.</h5>
					</div>
				</div>
				<br> <br> <br>
				<p class="title2-start">Die erfolgreiche Motivation...</p>

				<div id="part2part">
					<div class="panel panel-test3">
						<img src="../img/imgStart/middle.png" class="Anfang" width="50px">
						<img src="../img/imgStart/manu.png" class="Anfang">
					</div>
					<div class="panel panel-test4">
						<h5 class="farbe">Step - by - Step ging es bei uns weiter,
							das Logo war auch schon fertig (gleich mehr dazu) und unsere
							Startseite war dem 80% anvertraut. Jedoch hat es uns noch nicht
							zu 100% überzeugt gehabt. Dies haben wir noch mit ein paar
							Details am Ende angepasst. Die Farben mussten sehr gut
							miteinander harmonieren. Die Farben und all die ganzen
							Überschriften waren vom Logo abhängig. In dem Augenblick fingen
							wir ebenfalls mit dem Backend-Bereich an. Es war zunächst ganz
							einfach, jedoch wollten wir immer mehr und mehr. Und nach einer
							Zeit wurde der Dropbox-Gedanke zusätzlich zu einem Webshop. Wir
							haben uns sehr gefreut, dass wir noch zusätzlich einige
							unerwartete Funktionen beifügen konnten. Es war nicht einfach.
							Anfags war unser Server leicht überlastet, dann mussten wir uns
							was kompakteres einfallen lassen. Haben wir dann auch geschafft.
							Der Backend-Bereich hat unsere Lerngruppe noch näher
							zusammengebracht. Jeder hatte eine andere Version, somit konnten
							wir unsere Ideen immer weiter erweitern. Es war auch einfach auf
							Funktionen zu kommen und diese natürlich auch umzusetzen, denn
							jeder hatte seinen Beitrag dazu, es haben gleichzeitig drei
							starke Gehirnzellen gearbeitet. Es war immer einer starke
							Herausforderung.</h5>
					</div>
				</div>

				<br> <br> <br>
				<p class="title2-start">Ein erfolgreiches Ende...</p>

				<div id="part2part">
					<div class="panel panel-test3">
						<img src="../img/imgStart/logo.png" class="Anfang">
					</div>
					<div class="panel panel-test4">
						<h5>
							Warum ausgerechnet diese Farbe? - Es ist eine Lieblingsfarbe von
							uns :). Und warum muss der Hund eine Brille tragen? - <span>"Das
								Leben ist zu bezaubernd, man muss es nur durch die richtige
								Brille sehen!"</span> Klar, es war eine gute Idee das Logo ganz am Ende
							einzufügen, somit konnten wir ohne Probleme den Hauptteil
							abdecken. Nicht alles war möglich, aber diese werden wir
							natürlich noch weitere erweitern.<br>
						</h5>
					</div>
				</div>
				<br> <br> <br>
				<p class="title2-start">Von uns für euch!</p>

				<div id="part2part">
					<div class="panel panel-test3">
						<img src="../img/imgStart/wir.png" class="Anfang">
					</div>
					<div class="panel panel-test4">
						<h5>
							Wir sind fertig und bereit euch zu sagen, dass ihr mit lazyNerds
							problemlos das Lernen einfacher haben werdet. Wir wünschen
							unseren Komilitonen das Beste und hoffen das du genauso viel Spaß
							mit unserer Hompegae haben wirst, wie wir auch.<br> <br>
							<a href="../jsp/RegView.jsp">Registriere</a> dich jetzt in
							unserem Portal und sei erfolgreich während deinem
							Wirtschaftsinformatik Studium.
						</h5>
					</div>
				</div>
			</div>
		</div>

		<!-- Icons -->
		<jsp:getProperty property="socialButtons" name="sb" />
		<!-- FOOTER -->
		<jsp:getProperty property="startFooterAsHtml" name="sb" />

	</form>
</body>
</html>