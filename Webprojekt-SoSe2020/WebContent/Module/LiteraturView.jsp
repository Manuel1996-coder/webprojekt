<%@page import="de.hwg_lu.bw4s.beans.LiteraturBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Literatur | lazyNerds</title>
</head>

<link type="text/css" rel="stylesheet" href="../css/warenkorb.css" />
<body>
<jsp:useBean id="fsb" class="de.hwg_lu.bw4s.beans.LiteraturBean" scope="session" />
<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean" scope="session" />
<h1>Literatur <%= kb.getModulValue() %></h1>

<form action="LiteraturAppl.jsp" method="get">

<br>
<!--<input type="checkbox" name="artikel" value="0" />
Power Fan 2720s, EUR 29,80 
<img src="../img/0.jpg" />  -->
<jsp:getProperty name="kb" property="HTMLFromArtikel" />
<br>

<input type="submit" name="indenwarenkorb" value="In den Warenkorb" />
<input type="submit" name="zurueckzp"
		value="Zum Portal">

</form>
</body>
</html>