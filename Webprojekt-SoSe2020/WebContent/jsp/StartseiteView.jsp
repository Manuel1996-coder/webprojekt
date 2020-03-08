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
<title>Startseite | lazyNerds</title>
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>
	<form action="../jsp/StartseiteAppl.jsp" method="get">

		<!-- HEADER -->
		<jsp:getProperty property="headerAsHtml" name="sb" />

		<!-- CONTENT -->
		<div class="background">

			<!-- Text erscheint beim Laden von selbst -->
			<script type="text/javascript">
				var textarea = $('textarea'), speed = 80, text = 'Hallo wir sind cool.';

				function writeText(text) {
					textarea.text(textarea.text()
							+ text[$('#textarea').text().length]);

					if (textarea.text().length == text.length) {
						clearInterval(timeout);
					}
				}
				var timeout = setInterval('writeText(text)', speed);
			</script>

			<div class="Porschediv">
				<textarea id="textarea"></textarea>
			</div>
			<br>
			
			<div class="abstand">
				<p class="title1">Albert Einstein</p>
			</div>
			
			<p class="title2">Man muss die Welt nicht verstehen, man muss
				sich nur darin zurechtfinden.
			<p class="zitat2">- Albert Einstein</p>

			<div class="Porschediv">
				<img src="../img/imgStart/Albert-Einstein.jpg" class="Porsche">
			</div>

		</div>
		<br> <br> <br>
		<div id="social-platforms">

			<h6>follow me</h6>
			<div>
				<a class="tooltip" href="https://www.facebook.com/NerdsLazy"
					data-title="Facebook"><i class="fa fa-facebook"></i><span>Facebook</span></a>

				<a class="tooltip" href="https://twitter.com/NerdsLazy"
					data-title="Twitter"><i class="fa fa-twitter"></i><span>Twitter</span></a>

				<a class="tooltip" href="https://www.instagram.com/lazy.nerds/"
					data-title="Instagram"><i class="fa fa-instagram"></i><span>Instagram</span></a>

				<a class="tooltip"
					href="https://de.linkedin.com/in/lazy-nerds-30a0b01a4/en"
					data-title="LinkedIn"><i class="fa fa-linkedin"></i><span>LinkedIn</span></a>
			</div>
		</div>
		<!--<jsp:getProperty property="contentStartseiteAsHtml" name="sb" />-->
		<!-- FOOTER -->
		<jsp:getProperty property="footerAsHtml" name="sb" />
	</form>
</body>
</html>