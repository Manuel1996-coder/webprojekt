<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Altklausur | lazyNerds</title>
</head>

<link type="text/css" rel="stylesheet" href="../css/warenkorb.css" />
<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />


<body>

<form action="AltklausurAppl.jsp" method="get">

<h1>Altklausur</h1>

<iframe src="<%=kb.getSkript()%>" width="100%" height="500px"> 

</iframe>





<input type="submit" name="zurueckza"
		value="Zur Agenda">



</form>
</body>


</html>