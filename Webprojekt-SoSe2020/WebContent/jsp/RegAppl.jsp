<%@page import="java.sql.SQLException"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.AccountBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
// mit ! ist es eine Deklaration - nötig um eigene Methoden anzulegen
public String denullify(String s){
	if (s == null) return "";
	else return s;
// return(s==null)?"":s;
}
%>
<%
AccountBean ab = (AccountBean) session.getAttribute("ab");
if (ab == null){
	ab = new AccountBean();
	session.setAttribute("ab", ab);
}
MessageBean mb = (MessageBean) session.getAttribute("mb");
if (mb == null){
	mb = new MessageBean();
	session.setAttribute("mb", mb);
}

String matrkid = request.getParameter("matrkid");
String password = request.getParameter("password");
String username = request.getParameter("username");
String email = request.getParameter("email");

String zumLogin = this.denullify(request.getParameter("zumLogin"));
String register = this.denullify(request.getParameter("register"));
//if (zumLogin == null) zumLogin = "";
//if (register == null) register = "";
String comeFrom = this.denullify(request.getParameter("comeFrom"));

if (zumLogin.equals("zum Login")){
	mb.setGeneralWelcome();
	response.sendRedirect("./LoginAppl.jsp?comeFrom=RegAppl");
}else if (register.equals("Registrieren")){
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

	try{
		boolean accountInserted = ab.insertIfNotExists();
		if (accountInserted){
//			mb.setRegistrationSuccessful();
			mb.setRegistrationSuccessful(ab.getMatrkid());
			response.sendRedirect("./LoginView.jsp");
		}else{
//			mb.setAccountAlreadyExists();
			mb.setAccountAlreadyExists(ab.getMatrkid());
			response.sendRedirect("./RegView.jsp");		
		}
	}catch(SQLException se){
		mb.setAnyError();
		response.sendRedirect("./RegView.jsp");		
	}
}else if(!comeFrom.equals("")){
	//Message ist schon gesetzt	
	response.sendRedirect("./RegView.jsp");
}else{	System.out.print("weder zum Login noch Registrieren wurde gedrückt" + "<br>");
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
out.print("JSP-out: zumLogin: " + zumLogin + "<br>");
out.print("JSP-out: register: " + register + "<br>");




System.out.println("System-out: userid: " + matrkid);




%>
</body>
</html>