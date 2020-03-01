<%@page import="java.sql.SQLException"%>
<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
		scope="session" />
	<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
		scope="session" />
	<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
		scope="session" />
		<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean"
		scope="session" />
		
		
	<%!public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}%>
	<%
		String logout = this.denullify(request.getParameter("logout"));
		String appl = this.denullify(request.getParameter("appl"));
		String comeFrom = this.denullify(request.getParameter("comeFrom"));
		// Mein Profil
		String ratespiel = this.denullify(request.getParameter("ratespiel"));
		String einstellungen = this.denullify(request.getParameter("einstellungen"));
		String standort = this.denullify(request.getParameter("standort"));
		String video = this.denullify(request.getParameter("video"));

		if (!lb.isLoggedIn()) {
			mb.setNotLoggedIn();
			response.sendRedirect("./LoginAppl.jsp?comeFrom=PortalAppl");
			
		} else if (logout.equals("Abmelden")) {
			lb.setLoggedIn(false);
				
			response.sendRedirect("./LoginAppl.jsp?comeFrom=PortalAppl");
			
		} else if (!appl.equals("")) {
			response.sendRedirect("./" + appl + "Appl.jsp");

		} else if (!comeFrom.equals("")) {
			//Message schon gesetzt
			response.sendRedirect("./PortalView.jsp");
			
		} else if (video.equals("Zum HWG-LU Video")) {
			
			
			response.sendRedirect("../jsp/VideoView.jsp");
			
		} else if (ratespiel.equals("Zum Ratespiel")) {
			response.sendRedirect("../jsp/Quiz.jsp");
			
		}else if (standort.equals("Standort HWG-LU")) {
			
			
			response.sendRedirect("../jsp/KarteView.jsp");
			
		} else if (einstellungen.equals("Einstellungen")) {
			try{
			lb.readAccountsFromDB();
			} catch (SQLException se){
				
				System.out.println("DB schreiben fehlgeschlagen, Mist!");
				System.out.println("SQLCode=" + se.getErrorCode());
				System.out.println("Error-Message=" + se.getMessage());
			}
				
			response.sendRedirect("./EinstellungenView.jsp");
			
		} else {
			mb.setGeneralWelcome();
			response.sendRedirect("./LoginAppl.jsp");
		}
	%>
</body>
</html>
