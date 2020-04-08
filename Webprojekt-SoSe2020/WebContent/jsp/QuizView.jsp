<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" media="screen"
	href="./Beispiel:SELFHTML-Beispiel-Grundlayout.css" />
<link rel="stylesheet" type="text/css" href="../css/quiz.css">
<link rel="stylesheet" type="text/css" href="../css/bewertung.css">

<script type="text/javascript" src="../js/quizNeu.js"></script>
<title>Quiz | lazyNerds</title>
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>

	<div class="backgroundWir">

			<main id="main">

				<form id="quiz" action="">
					<h1 id="intro">lazyQuiz</h1>
					<h2>Viel Spass beim Spielen!</h2>

				</form>
			</main>

			<form action="./EinstellungenAppl.jsp" method="get">

		
					<input type="submit" value="Zum Portal" name="zurück" id="detail" class="backPortal">
					
			</form>
			

		</div>
		
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>


	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>

</body>

</html>