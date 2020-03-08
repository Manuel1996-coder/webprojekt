<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="bb" class="de.hwg_lu.bw4s.beans.BewertungBean"
	scope="session" />
	<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
	scope="session" />
<body>
<%!
public String denullify(String s){
	if (s == null) return "";
	else return s;
}
%>
<%
String speichern = this.denullify(request.getParameter("speichern"));
String bewertung = this.denullify(request.getParameter("bewertung"));
String kommentar = this.denullify(request.getParameter("kommentar"));
String timeline = this.denullify(request.getParameter("timeline"));





if(speichern.equals("Speichern")){
	
	bb.setMatrikid(lb.getMatrkid());
	bb.setKommentar(kommentar);
	bb.setSterne(bewertung);
	
	try{
	bb.insertKommentar();
     } catch (SQLException se) {

			System.out.println("B DB schreiben fehlgeschlagen, Mist!");
			System.out.println("SQLCode=" + se.getErrorCode());
			System.out.println("Error-Message=" + se.getMessage());

		}
	
	
	response.sendRedirect("../jsp/BewertungView.jsp");
} else if(timeline.equals("Zur Timeline")){
	bb.delete();
	try{
		
	bb.getTimelineDateien();
	
} catch (SQLException se) {

	System.out.println("B DB schreiben fehlgeschlagen, Mist!");
	System.out.println("SQLCode=" + se.getErrorCode());
	System.out.println("Error-Message=" + se.getMessage());

}
	
	response.sendRedirect("../jsp/TimelineView.jsp");
	
}else {
	
	response.sendRedirect("../jsp/BewertungView.jsp");
}

%>

</body>
</html>