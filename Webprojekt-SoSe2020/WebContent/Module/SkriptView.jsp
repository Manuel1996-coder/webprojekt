<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Skript | lazyNerds</title>
</head>
<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />
<body>
<h1>Skript </h1>


<iframe src="<%=kb.getSkript()%>" width="100%" height="500px"> 

</iframe>








</body>
</html>