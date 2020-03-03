<%@page import="de.hwg_lu.bw4s.beans.LiteraturBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fanshop WM 2010</title>
</head>
<body>
<jsp:useBean id="fsb" class="de.hwg_lu.bw4s.beans.LiteraturBean" scope="session" />
<h1>Literatur</h1>

<form action="LiteraturAppl.jsp" method="get">

<br>
<!--<input type="checkbox" name="artikel" value="0" />
Power Fan 2720s, EUR 29,80 
<img src="../img/0.jpg" />  -->
<jsp:getProperty name="fsb" property="HTMLFromArtikel" />
<br>
<input type="submit" name="bestellen" value="bestellen" />
<input type="submit" name="indenwarenkorb" value="In den Warenkorb" />

</form>
</body>
</html>