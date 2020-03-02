<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
public String denullify(String s){
	if (s == null) return "";
	else return s;
}
%>
<%
String prof   = this.denullify(request.getParameter("prof"));
String skript   = this.denullify(request.getParameter("skript"));
String Literatur   = this.denullify(request.getParameter("Literatur"));
String Altklausuren   = this.denullify(request.getParameter("Altklausuren"));



if(prof.equals("PROF")){
	
	response.sendRedirect("../Module/ProfView.jsp");
} else if(skript.equals("SKRIPT")){
	
	response.sendRedirect("../Module/SkriptView.jsp");
}else if(Literatur.equals("LITERATUR")){
	response.sendRedirect("../Module/LiteraturView.jsp");
	
}else if (Altklausuren.equals("ALTKLAUSUREN")){
	
	response.sendRedirect("../Module/AltklausurView.jsp");
}

%>

</body>
</html>