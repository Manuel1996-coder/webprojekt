<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StartseiteAppl</title>
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
		String home = this.denullify(request.getParameter("home"));
		String portal = this.denullify(request.getParameter("portal"));
		String wir = this.denullify(request.getParameter("wir"));
		String einloggen = this.denullify(request.getParameter("einloggen"));
		String register = this.denullify(request.getParameter("register"));

		String datenschutz = this.denullify(request.getParameter("datenschutz"));
		String impressum = this.denullify(request.getParameter("impressum"));
		String kontakt = this.denullify(request.getParameter("kontakt"));
		String feedback = this.denullify(request.getParameter("feedback"));
		String support = this.denullify(request.getParameter("support"));
		
		String zstartseite = this.denullify(request.getParameter("zstartseite"));

		if (register.equals("Registrieren")) {
			response.sendRedirect("../jsp/RegView.jsp");
		}

		else if (einloggen.equals("Einloggen")) {
			response.sendRedirect("../jsp/LoginView.jsp");
		}

		else if (home.equals("Home")) {
			response.sendRedirect("../jsp/StartseiteView.jsp");
		}

		else if (portal.equals("Wifo-Portal")) {
			response.sendRedirect("../jsp/PortalView.jsp");
		}

		else if (datenschutz.equals("Datenschutz")) {
			response.sendRedirect("../jsp/DatenschutzView.jsp");
		}

		else if (impressum.endsWith("Impressum")) {
			response.sendRedirect("../jsp/ImpressumView.jsp");
		}

		else if (kontakt.equals("Kontakt")) {
			response.sendRedirect("../jsp/KontaktView.jsp");
		}

		else if (feedback.equals("Feedback")) {
			response.sendRedirect("../jsp/TimelineView.jsp");
		}

		else if (wir.equals("Wer wir sind")) {
			response.sendRedirect("../jsp/WirView.jsp");
		}

		else if (support.equals("Support")) {
			response.sendRedirect("../jsp/HilfeView.jsp");
		}

		else {
			response.sendRedirect("../jsp/StartseiteView.jsp");
		}
	%>
</body>
</html>