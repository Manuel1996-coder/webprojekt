<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PortalView</title>
</head>
<link rel="stylesheet" href="../css/style.css" />
<link rel="stylesheet" href="../css/all.min.css" />
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />



<body>
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
									<li><input type="submit" name="PMPM"
									value="ABWL und Buchführung" /></li>
								<li><input type="submit" name="OR" value="Wirtschaftsmathematik" /></li>
								<li><input type="submit" name="ufü" value="Social Skills" /></li>
								<li><input type="submit" name="betriebsrechner"
									value="Wirtschaftsinformatik" /></li>
								<li><input type="submit" name="algoDatenbanken"
									value="Prog I" /></li>
								

							</ul>

						</div></li>


					<li><i class="fas fa-baby"></i> <input type="submit"
						name="2semester" value="2.Semester" />

						<div class="sub-menu-1">

							<ul>

								<li><input type="submit" name="PMPM"
									value="Investition & Finanzierung" /></li>
								<li><input type="submit" name="OR" value="VWL" /></li>
								<li><input type="submit" name="ufü" value="Statistik" /></li>
								<li><input type="submit" name="betriebsrechner"
									value="Prog II" /></li>
								<li><input type="submit" name="algoDatenbanken"
									value="Englisch & SoftSkills II" /></li>
								<li><input type="submit" name="software"
									value="Software Engineering" /></li>

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
								<li><input type="submit" name="ufü"
									value="U-Führung & DL-Mgmt" /></li>
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
					<li><i class="fas fa-graduation-cap"></i> <input type="submit"
						name="5semester" value="5.Semester" />

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
						name="profil" value="Mein Profil" />

						<div class="sub-menu-1">

							<ul>
								<li><input type="submit" name="Matrikelnummer"
									value="628761" /></li>
								<li><input type="submit" name="profilBearbeiten"
									value="Profil bearbeiten" /></li>
								<li><input type="submit" name="standort" value="Mein Standort"/></li>
								<li><input type="submit" name="Ratespiel" value="Zum Ratespiel"/></li>
								<li><input type="submit" name="hilfe" value="Hilfe" /></li>




							</ul>


						</div></li>

					<li><i class="fas fa-sign-out-alt"></i> <input type="submit"
						name="logout" value="Abmelden"
						 /></li>



				</ul>
			</div>
			<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
				scope="session" />
			<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
				scope="session" />
			<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
				scope="session" />

			<%
				if (!lb.isLoggedIn()) {
					mb.setNotLoggedIn();
					response.sendRedirect("./PortalAppl.jsp");
				}
			%>

		</div>

	</form>



</body>

</html>