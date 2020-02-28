<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean"
		scope="session" />
		<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
			scope="session" />

<%!
public String denullify(String s){
	if (s == null) return "";
	else return s;
}
%>
<%
String zurück   = this.denullify(request.getParameter("zurück"));
String accountLoeschen   = this.denullify(request.getParameter("accountLoeschen"));
String passwortaendern   = this.denullify(request.getParameter("passwortaendern"));
String usernameaendern   = this.denullify(request.getParameter("usernameaendern"));




if(zurück.equals("Zurueck zu Home")){
	
	response.sendRedirect("./PortalView.jsp");
} else if(passwortaendern.equals("Passwort ändern")){
	
	response.sendRedirect("./Passwortaendern.jsp");
} else if(accountLoeschen.equals("accountLoeschen")){
	
	response.sendRedirect("./EinstellungenView.jsp");
	} else if(usernameaendern.equals("usernameaendern")){
	
		response.sendRedirect("./EinstellungenView.jsp");
} else {
	
	response.sendRedirect("./EinstellungenView.jsp");
	
	
}

%>

</body>
</html>