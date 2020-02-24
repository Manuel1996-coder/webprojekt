<%@page import="java.sql.SQLException"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.AccountBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Regi</title>
</head>
<body>
	<jsp:useBean id="ab" scope="session"
		class="de.hwg_lu.bw4s.beans.AccountBean" />
	<jsp:useBean id="mb" scope="session"
		class="de.hwg_lu.bw4s.beans.MessageBean" />

	<%!
	public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}
	%>
	
	<%
		String matrkid = request.getParameter("matrkid");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String email = request.getParameter("email");

		String register = this.denullify(request.getParameter("register"));
	
		String comeFrom = this.denullify(request.getParameter("comeFrom"));

		
	 if (register.equals("Registrieren")) {
			System.out.print("registrieren wurde gedrückt" + "<br>");
			//	AccountBean ab = new AccountBean();
			ab.setMatrkid(matrkid);
			ab.setPassword(password);
			ab.setUsername(username);
			ab.setEmail(email);
			ab.setActive("Y");
			ab.setAdmin("N");
			//	session.setAttribute("ab", ab);
			//	ab.insertNoCheck();

			try {
				boolean accountInserted = ab.insertIfNotExists();
				if (accountInserted) {
					//			mb.setRegistrationSuccessful();
					mb.setRegistrationSuccessful(ab.getMatrkid());
					response.sendRedirect("./RegView.jsp");
				} else {
					//			mb.setAccountAlreadyExists();
					mb.setAccountAlreadyExists(ab.getMatrkid());
					response.sendRedirect("./RegView.jsp");
				}
			} catch (SQLException se) {
				mb.setAnyError();
				response.sendRedirect("./RegView.jsp");
			}
		} else if (!comeFrom.equals("")) {
			//Message ist schon gesetzt	
			response.sendRedirect("./RegView.jsp");
		} else {
			System.out.print("weder zum Login noch Registrieren wurde gedrückt" + "<br>");
			//Message
			//mb.setRegistrationWelcome();
			//response.sendRedirect("./RegView.jsp");
			mb.setGeneralWelcome();
			response.sendRedirect("./LoginAppl.jsp");
		}

		out.print("JSP-out: userid: " + matrkid + "<br>");
		out.print("JSP-out: password: " + password + "<br>");
		out.print("JSP-out: username: " + username + "<br>");
		out.print("JSP-out: email: " + email + "<br>");
		out.print("JSP-out: register: " + register + "<br>");

		System.out.println("System-out: userid: " + matrkid);
	%>
</body>
</html>