<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notizen | LazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/warenkorb.css" />
<body>
<jsp:useBean id="nb" class="de.hwg_lu.bw4s.beans.NotizenBean"
	scope="session" />

<form action="NotizenAppl.jsp" method="get">

<%=  nb.getHTMLNotizen()  %>


<input type="submit" name="speichern" value="Speichern" >
</form>


</body>
</html>