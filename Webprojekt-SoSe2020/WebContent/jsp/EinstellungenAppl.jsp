<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean"
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
		String zurück = this.denullify(request.getParameter("zurück"));
		String accountLoeschen = this.denullify(request.getParameter("accountLoeschen"));
		String passwortaendern = this.denullify(request.getParameter("passwortaendern"));

		if (zurück.equals("Zum Portal")) {

			response.sendRedirect("./PortalView.jsp");

		} else if (passwortaendern.equals("Passwort ändern")) {

			response.sendRedirect("./PasswortaendernView.jsp");
		}

		else if (accountLoeschen.equals("Account dauerhaft löschen")) {

			response.sendRedirect("./AccountLoeschenView.jsp");
		} else {

			response.sendRedirect("./EinstellungenView.jsp");

		}
	%>

</body>
</html>