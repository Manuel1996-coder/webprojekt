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

if(prof.equals("PROF")){
	
	response.sendRedirect("../Module/ProfView.jsp");
} else if(skript.equals("SKRIPT")){
	
	response.sendRedirect("../Module/skriptView.jsp");
}

%>

</body>
</html>