<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean" scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean" scope="session" />
<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean" scope="session" />

<jsp:getProperty name="gb" property="htmlHeadline" />
<jsp:getProperty name="mb" property="htmlMessage" />

<%
if (!lb.isLoggedIn()){
	mb.setNotLoggedIn();
	response.sendRedirect("./PortalAppl.jsp");	
}
%>

<a href="./PortalAppl.jsp?appl=ShowAllAccounts">Show All Accounts</a><br>
<a href="./PortalAppl.jsp?appl=Urlaubx">Urlaubsziele</a><br>
<br>

<form action="./PortalAppl.jsp" method="get">
	<input type="submit" name="logout" value="Abmelden" />
</form>
</body>
</html>