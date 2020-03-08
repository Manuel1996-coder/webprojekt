<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Skript | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/warenkorb.css" />
<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />
<body>
<form action="SkriptAppl.jsp" method="get">
<h1>Skript </h1>


<iframe src="<%=kb.getSkript()%>" width="100%" height="500px"> 

</iframe>





<input type="submit" name="zurueckza"
		value="Zur Agenda">

</form>
</body>
</html>