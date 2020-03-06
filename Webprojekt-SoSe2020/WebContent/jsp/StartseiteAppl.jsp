<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<%!
	public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}%>

	<%
		String einloggen = this.denullify(request.getParameter("einloggen"));
		String register = this.denullify(request.getParameter("register"));

		String datenschutz = this.denullify(request.getParameter("datenschutz"));
		String impressum = this.denullify(request.getParameter("impressum"));
		String home = this.denullify(request.getParameter("home"));
		String kontakt = this.denullify(request.getParameter("kontakt"));
		String feedback = this.denullify(request.getParameter("feedback"));

		if (register.equals("Registrieren")) {

			response.sendRedirect("../jsp/RegView.jsp");
		}

		else if (einloggen.equals("Einloggen")) {

			response.sendRedirect("../jsp/LoginView.jsp");
		}

		else if (home.equals("Home")) {

			response.sendRedirect("../jsp/StartseiteView.jsp");

		}

		else if (datenschutz.equals("Datenschutz")) {
			response.sendRedirect("../jsp/DatenschutzView.jsp");
		}

		else {
			response.sendRedirect("../jsp/StartseiteView.jsp");
		}
	%>
</body>
</html>