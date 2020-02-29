<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.SQLException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
	scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
	scope="session" />
<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
	scope="session" />
	<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean"
		scope="session" />

	
	<%!public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}%>





<% 


String speichern   = this.denullify(request.getParameter("speichern"));
String zurueckEinstellungen   = this.denullify(request.getParameter("zurueckEinstellungen"));
String neuespassword = request.getParameter("neuespassword");




if(speichern.equals("Änderung speichern")){
	
	
	
	try{
		boolean altpasswortOk = ab.checkUseridPassword();
		if (altpasswortOk){
			
			ab.deletePasswort();
			
			
			ab.setPassword(neuespassword);
			
			ab.insertNeuesPasswort();
			
			
			
				response.sendRedirect("./PortalAppl.jsp?comeFrom=LoginAppl");
		
		
		}else{
			lb.setLoggedIn(false);
			
			response.sendRedirect("./LoginView.jsp");
		}
	}catch(SQLException se){
		lb.setLoggedIn(false);
		mb.setAnyError();
		response.sendRedirect("./LoginView.jsp");
	}
	
	
	
	
	
	
	
	response.sendRedirect("./PortalView.jsp");
} else if (zurueckEinstellungen.equals("Zurück zu Einstellungen")) {
	
	response.sendRedirect("./EinstellungenView.jsp");
	
	
}else {
	
	response.sendRedirect("./PasswortaendernView.jsp");
	
	
}

%>

</body>
</html>