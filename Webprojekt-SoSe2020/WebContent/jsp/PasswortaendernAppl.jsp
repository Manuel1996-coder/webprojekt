<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		String speichern = this.denullify(request.getParameter("speichern"));
		String zurueckEinstellungen = this.denullify(request.getParameter("zurueckEinstellungen"));
		String aktuellesPassword = request.getParameter("aktuellesPassword");
		String neuespassword = request.getParameter("neuespassword");

		if (speichern.equals("Änderung speichern")) {
			lb.setAktupassword(aktuellesPassword);

			try {
				boolean altpasswortOk = lb.checkPassword();
				if (altpasswortOk) {

					lb.setNeuesPassword(neuespassword);

					lb.setMatrkid(lb.getMatrkid());

					lb.updatePassword();

					response.sendRedirect("./LoginView.jsp");

				} else {

					response.sendRedirect("./PasswortaendernView.jsp");
				}
			} catch (SQLException se) {

				response.sendRedirect("./PasswortaendernView.jsp");
			}

			//response.sendRedirect("./LoginView.jsp");
		} else if (zurueckEinstellungen.equals("Zurück zu Einstellungen")) {

			response.sendRedirect("./EinstellungenView.jsp");

		} else {

			response.sendRedirect("./PasswortaendernView.jsp");

		}
	%>

</body>
</html>