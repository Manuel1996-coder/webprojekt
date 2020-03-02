<%@page import="de.hwg_lu.bw4s.beans.MsgBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="de.hwg_lu.bw4s.beans.LiteraturBean" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="fb" class="de.hwg_lu.bw4s.beans.LiteraturBean" scope="session"/>
<jsp:useBean id="msg" class="de.hwg_lu.bw4s.beans.MsgBean" scope="session"/>
<%

String bestellung = ""+request.getParameter("button");
String kunde = request.getParameter("kunde");
String[] artikel = request.getParameterValues("artikel");

if (artikel == null) artikel = new String[1];

if(bestellung.equals("bestellen")){
	if (fb.bestellungSpeichern(kunde, artikel))
	msg.setDone();
	else msg.setFail();
}
response.sendRedirect("./S621382-Fanshop.jsp");
%>

</body>
</html>