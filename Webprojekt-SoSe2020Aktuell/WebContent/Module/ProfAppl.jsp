<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}%>
	<%
		
		String zurueckza = this.denullify(request.getParameter("zurueckza"));

		if (zurueckza.equals("Zur Agenda")) {

			response.sendRedirect("../jsp/AgendaView.jsp");

		}  else {

			response.sendRedirect("../Module/ProfView.jsp");

		}
	%>

</body>
</html>