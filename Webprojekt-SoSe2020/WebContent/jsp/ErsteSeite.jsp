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


					<li class="active"><a href="#"><i class="fas fa-home"></i> Home</a></li>
					<li><a href="#"><i class="far fa-smile"></i> 1.Semester</a>
						<div class="sub-menu-1">
							<ul>
								<li><a href="../jsp/ABWL.jsp">ABWL</a></li>
								<li><a href="#">Wirtschaftsmathe</a></li>
								<li><a href="#">Buchführung & Kostenrechnung</a></li>
								<li><a href="#">Recht</a></li>
								<li><a href="#">Marketing</a></li>
								<li><a href="#">Wirtschaftsinfo</a></li>
								<li><a href="#">Prog I</a></li>

							</ul>

						</div></li>
					<li><a href="#"><i class="fas fa-baby"></i> 2.Semester</a>

						<div class="sub-menu-1">

							<ul>
								<li><a href="#">Investition & Finanzierung</a></li>
								<li><a href="#">VWL</a></li>
								<li><a href="#">Statistik</a></li>
								<li><a href="#">Prog II</a></li>
								<li><a href="#">Englisch & SoftSkills II</a></li>
								<li><a href="#">Software Engineering</a></li>

							</ul>


						</div></li>
					<li><a href="#"><i class="fas fa-glass-cheers"></i> 3.Semester</a>
						<div class="sub-menu-1">

							<ul>
								<li><a href="#">Projekt-Mgmt & Prozess-Mgmt</a></li>
								<li><a href="#">Operations Research</a></li>
								<li><a href="#">Englisch II & Soft Skills II</a></li>
								<li><a href="#">U-Führung & DL-Mgmt</a></li>
								<li><a href="#">Betriebssys. & Rechnernetze</a></li>
								<li><a href="#">Algo/Daten & Datenbanken </a></li>

							</ul>


						</div></li>
					<li><a href="#"><i class="fas fa-university"></i> 4.Semester</a>

						<div class="sub-menu-1">

							<ul>
								<li><a href="#">Wahlfach</a></li>
								<li><a href="#">Data Science</a></li>
								<li><a href="#">WebAnwendungen</a></li>
								<li><a href="#">Seminar</a></li>
								<li><a href="#">Englisch III & Soft Skills III</a></li>
							</ul>


						</div></li>
					<li><a href="#"><i class="fas fa-graduation-cap"></i> 5.Semester</a>

						<div class="sub-menu-1">

							<ul>
								<li><a href="#">Info-Sicher & Info-Mgmt</a></li>
								<li><a href="#">Digital Business</a></li>
								<li><a href="#">Praktikum Anwendungs.</a></li>
								<li><a href="#">Business Intelligence</a></li>
								<li><a href="#">ERP-Sys & SCM-Sys</a></li>
								<li><a href="#">Eng. f. IT</a></li>

							</ul>


						</div></li>
					<li><a href="#"><i class="fas fa-user"></i> Mein Profil</a>

						<div class="sub-menu-1">

							<ul>
								<li><a href="#">628761</a></li>
								<li><a href="#">Profil bearbeiten</a></li>
								<li><a href="#">Hilfe/Support</a></li>



							</ul>


						</div></li>

					<li><a> <i class="fas fa-sign-out-alt"></i> <input type="submit" name="logout"
							value="Abmelden" 
							style="background: none; border-width: 0px; color: #fff; " /></a></li>



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