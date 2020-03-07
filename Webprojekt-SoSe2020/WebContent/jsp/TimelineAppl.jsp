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
		String zurueckzp = this.denullify(request.getParameter("zurueckzp"));
		

		if (zurueckzp.equals("Zum Portal")) {

			response.sendRedirect("./PortalView.jsp");

		} else {

			response.sendRedirect("./TimelineView.jsp");

		}
	%>

</body>
</html>