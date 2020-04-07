<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="nb" class="de.hwg_lu.bw4s.beans.NotizenBean"
	scope="session" />
<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
	scope="session" />

<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />
<body>

	<%!public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}%>
	<%
		String prof = this.denullify(request.getParameter("prof"));
		String skript = this.denullify(request.getParameter("skript"));
		String Literatur = this.denullify(request.getParameter("Literatur"));
		String Altklausuren = this.denullify(request.getParameter("Altklausuren"));
		String zurueck = this.denullify(request.getParameter("zurueck"));
		String quiz = this.denullify(request.getParameter("quiz"));

		if (prof.equals("PROF")) {

			response.sendRedirect("../Module/ProfView.jsp");
		} else if (skript.equals("SKRIPT")) {
			
			nb.setMatrkid(lb.getMatrkid());
			
			try {
				
				nb.createNotizTable();
				//nb.getNotizDateienfromDB();
			
			} catch (SQLException se) {

				System.out.println("B DB schreiben fehlgeschlagen, Mist!");
				System.out.println("SQLCode=" + se.getErrorCode());
				System.out.println("Error-Message=" + se.getMessage());

			}
			

			response.sendRedirect("../Module/SkriptView.jsp");
		} else if (Literatur.equals("LITERATUR")) {

			kb.setMatrkid(lb.getMatrkid());

			try {
				kb.createWarenkorbTable();

			} catch (SQLException se) {

				System.out.println("B DB schreiben fehlgeschlagen, Mist!");
				System.out.println("SQLCode=" + se.getErrorCode());
				System.out.println("Error-Message=" + se.getMessage());

			}

			response.sendRedirect("../Module/LiteraturView.jsp");

		} else if (Altklausuren.equals("ALTKLAUSUREN")) {

			response.sendRedirect("../Module/AltklausurView.jsp");
		} else if (zurueck.equals("Zurück")) {
			kb.setButton(false);
			kb.getHTMLFromArtikel();

			response.sendRedirect("../jsp/PortalView.jsp");
		} 
	
		 else if (quiz.equals("Quiz")) {


			response.sendRedirect("../jsp/QuizView.jsp");
		}
	%>

</body>
</html>