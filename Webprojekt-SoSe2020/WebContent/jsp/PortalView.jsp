<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Portal | lazyNerds</title>

</head>
<script type="text/javascript" src="../js/PortalJs.js"></script>
<script type="text/javascript" src="../js/searchbox.js"></script>
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<link rel="stylesheet" type="text/css" href="../css/all.min.css" />
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />

<body>
	<!-- KOPFZEILE -->
	<header>
		<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
			scope="session" />
		<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
			scope="session" />
		<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
			scope="session" />
			<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />
			

		<form action="./PortalAppl.jsp" method="get">

			<div class="mitte">
				<div class="menu-bar">

					<ul>
						<li class="active"><i class="fas fa-home"></i> <input
							type="submit" name="home" value="Home"></li>

						<li><i class="far fa-smile"></i> <input type="submit"
							name="1semester" value="1.Semester" />

							<div class="sub-menu-1">
								<ul>
									<li><input type="submit" name="abwlbuch"
										value="ABWL und Buchfuehrung" /></li>
									<li><input type="submit" name="wm"
										value="Wirtschaftsmathematik" /></li>
									<li><input type="submit" name="sk" value="Social Skills" /></li>
									<li><input type="submit" name="wi"
										value="Wirtschaftsinformatik" /></li>
									<li><input type="submit" name="prog1"
										value="Prog I" /></li>
								</ul>
							</div></li>

						<li><i class="fas fa-baby"></i> <input type="submit"
							name="2semester" value="2.Semester" />

							<div class="sub-menu-1">
								<ul>
									<li><input type="submit" name="Invest"
										value="Investition & Finanzierung" /></li>
									<li><input type="submit" name="VWL" value="VWL" /></li>
									<li><input type="submit" name="Stat" value="Statistik" /></li>
									<li><input type="submit" name="Prog2"
										value="Prog II" /></li>
									<li><input type="submit" name="algoDatenbanken"
										value="Englisch & SoftSkills II" /></li>
									<li><input type="submit" name="software"
										value="Software Engineering" /></li>
										<li><input type="submit" name="modell"
										value="Modellierung" /></li>
										
								</ul>
							</div></li>
						<li><i class="fas fa-glass-cheers"></i> <input type="submit"
							name="3semester" value="3.Semester" />

							<div class="sub-menu-1">
								<ul>
									<li><input type="submit" name="PMPM"
										value="Projekt-Mgmt & Prozess-Mgmt" /></li>
									<li><input type="submit" name="OR"
										value="Operations Research" /></li>
									<li><input type="submit" name="ufÃ¼"
										value="U-FÃ¼hrung & DL-Mgmt" /></li>
									<li><input type="submit" name="betriebsrechner"
										value="Betriebssys. & Rechnernetze" /></li>
									<li><input type="submit" name="algoDatenbanken"
										value="Algo/Daten & Datenbanken" /></li>
								</ul>
							</div></li>
						<li><i class="fas fa-university"></i> <input type="submit"
							name="4semester" value="4.Semester" />

							<div class="sub-menu-1">

								<ul>
									<li><input type="submit" name="wahlfach" value="Wahlfach" /></li>
									<li><input type="submit" name="dataScience"
										value="Data Science" /></li>
									<li><input type="submit" name="webAnwendungs"
										value="WebAnwendungen" /></li>
									<li><input type="submit" name="seminar" value="Seminar" /></li>
									<li><input type="submit" name="englisch3undSoftSkills3"
										value="Englisch III & Soft Skills III" /></li>
								</ul>
							</div></li>
						<li><i class="fas fa-graduation-cap"></i> <input
							type="submit" name="5semester" value="5.Semester" />

							<div class="sub-menu-1">
								<ul>
									<li><input type="submit" name="infoSicher"
										value="Info-Sicher & Info-Mgmt" /></li>
									<li><input type="submit" name="digitalBusiness"
										value="Digital Business" /></li>
									<li><input type="submit" name="praktikumAnwendungs"
										value="Praktikum Anwendungs." /></li>
									<li><input type="submit" name="businessIntelligence"
										value="Business Intelligence" /></li>
									<li><input type="submit" name="erpScm"
										value="ERP-Sys & SCM-Sys" /></li>
									<li><input type="submit" name="englischFIt"
										value="Eng. f. IT" /></li>
								</ul>
							</div></li>
						<li><i class="fas fa-user"></i> <input type="submit"
							name="profil" value="<%=lb.getMatrkid()%>" />

							<div class="sub-menu-1">

								<ul>
									<li><input type="submit" name="standort"
										value="Mein Standort" /></li>
									<li><input type="submit" name="ratespiel"
										value="Zum Ratespiel" /></li>
										<li><input type="submit" name="video"
										value="Zum HWG-LU Video" /></li>
										<li><input type="submit" name="bewertung"
										value="LazyNerds Bewertungen" /></li>
										<li><input type="submit" name="einstellungen"
										value="Einstellungen"/></li>
										
									<li><input type="submit" name="hilfe" value="Hilfe" /></li>
								</ul>
							</div></li>
						<li><i class="fas fa-shopping-cart"></i> <input type="submit"
							name="einkaufstasche" value="Warenkorb" /></li>
						<li><i class="fas fa-sign-out-alt"></i> <input type="submit"
							name="logout" value="Abmelden" /></li>
					</ul>
				</div>
			</div>
		</form>
	</header>

	<!-- SEARCHBOX -->
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<h2> LazyNerds durchsuchen</h2>

<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">

<ul id="myUL">
  <li><a href="../jsp/PortalAppl.jsp?wi=Wirtschaftsinformatik">WI</a></li>
  <li><a href="#">Agnes</a></li>

  <li><a href="#">Billy</a></li>
  <li><a href="#">Bob</a></li>

  <li><a href="#">Calvin</a></li>
  <li><a href="#">Christina</a></li>
  <li><a href="#">Cindy</a></li>
</ul>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


	<div class="container">
		<div class="search-box">
			<input id="search" placeholder=" Search..." pattern="bottom" type="text" class="input" title="Nach was suchst du?">
		</div>
	</div>
</body>
</html>