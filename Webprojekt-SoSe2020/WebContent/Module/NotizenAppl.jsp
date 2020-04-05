
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="nb" class="de.hwg_lu.bw4s.beans.NotizenBean"
		scope="session" />
	<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
		scope="session" />

	<%!public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}%>
	<%
		String speichern = this.denullify(request.getParameter("speichern"));
		String zurueckzs = this.denullify(request.getParameter("zurueckzs"));
		String notiz = this.denullify(request.getParameter("notiz"));

		if (speichern.equals("Speichern")) {

			nb.setMatrkid(lb.getMatrkid());
			nb.setNotiz(notiz);

			try {

				nb.updateNotizen();

			} catch (Exception se) {

				System.out.println("DB schreiben fehlgeschlagen, Mist!");

				System.out.println("Error-Message=" + se.getMessage());

			}

			response.sendRedirect("../Module/NotizenView.jsp");
		} else
		
			if (zurueckzs.equals("Zurück zum Skript")) {
			response.sendRedirect("../Module/NotizenView.jsp");
		}	
	%>
</body>
</html>