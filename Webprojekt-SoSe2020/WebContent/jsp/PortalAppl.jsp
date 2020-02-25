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
<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean" scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean" scope="session" />
<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean" scope="session" />
<%!
public String denullify(String s){
	if (s == null) return "";
	else return s;
}
%>
<%
String logout   = this.denullify(request.getParameter("logout"));
String appl     = this.denullify(request.getParameter("appl"));
String comeFrom = this.denullify(request.getParameter("comeFrom"));

if (!lb.isLoggedIn()){
	mb.setNotLoggedIn();
	response.sendRedirect("./LoginAppl.jsp?comeFrom=PortalAppl");	
}else if(logout.equals("Abmelden")){
	lb.setLoggedIn(false);
	mb.setLogoutSuccessful();
	response.sendRedirect("./LoginAppl.jsp?comeFrom=PortalAppl");
}else if(!appl.equals("")){
	
	response.sendRedirect("./" + appl + "Appl.jsp");
	
}else if(!comeFrom.equals("")){
	//Message schon gesetzt
	response.sendRedirect("./ErsteSeite.jsp");
}else{
	mb.setGeneralWelcome();
	response.sendRedirect("./LoginAppl.jsp");
}

%>





</body>
</html>