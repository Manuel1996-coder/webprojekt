
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
	<%!public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}%>
	<%
		String matrkid = request.getParameter("matrkid");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String login = this.denullify(request.getParameter("login"));
		String zurReg = this.denullify(request.getParameter("zurReg"));
		String comeFrom = this.denullify(request.getParameter("comeFrom"));

		if (login.equals("Anmelden")) {
			mb.setGeneralWelcome();
			lb.setMatrkid(matrkid);
			lb.setPassword(password);

			try {
				boolean loginOk = lb.checkUseridPassword();
				if (loginOk) {
					lb.setLoggedIn(true);
					mb.setLoginSuccessful();

					response.sendRedirect("./PortalAppl.jsp?comeFrom=LoginAppl");

				} else {
					lb.setLoggedIn(false);
					mb.setLoginFailed();
					response.sendRedirect("./LoginView.jsp");
				}
				
			} catch (SQLException se) {
				lb.setLoggedIn(false);
				mb.setAnyError();
				response.sendRedirect("./LoginView.jsp");
			}
		} 
		else if (zurReg.equals("zurReg")) {
			mb.setRegistrationWelcome();
			response.sendRedirect("./RegAppl.jsp?comeFrom=LoginAppl"); // nur wenn erfolgreich
		} else if (!comeFrom.equals("")) {
			//Message schon gesetzt
			response.sendRedirect("./LoginView.jsp"); // nur wenn erfolgreich
		} else {
			//Message
			mb.setGeneralWelcome();
			response.sendRedirect("./LoginView.jsp"); // nur wenn erfolgreich
		}
	%>
</body>
</html>