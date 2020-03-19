<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
		scope="session" />
	<jsp:useBean id="wb" class="de.hwg_lu.bw4s.beans.Warenkorb"
		scope="session" />
	<%!
	
	public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}
	
	
	
	
	%>
	<%
		String weitereinkaufen = this.denullify(request.getParameter("weitereinkaufen"));
		String jetztkaufen = this.denullify(request.getParameter("jetztkaufen"));
		String kill = this.denullify(request.getParameter("kill"));
		String zurueckzp = this.denullify(request.getParameter("zurueckzp"));
		String action = this.denullify(request.getParameter("action"));
		String value = this.denullify(request.getParameter("value"));
		String warenkorb = this.denullify(request.getParameter("warenkorb"));
		
		

		if (weitereinkaufen.equals("Weiter Einkaufen")) {

			response.sendRedirect("../Module/LiteraturView.jsp");
		}else if (warenkorb.equals("Warenkorb Loeschen")) {
		    
			kb.deleteWarenkorb();
			//kb.getHTMLFromAusgewaehlteWarenkorbProdukte();
			response.sendRedirect("./WarenkorbView.jsp");

		}
		
		else if (jetztkaufen.equals("Jetzt Kaufen")) {

			response.sendRedirect("./RechnungsView.jsp");

		} else if (zurueckzp.equals("Zum Portal")) {

			response.sendRedirect("../jsp/PortalView.jsp");

		} else if (action.equals("kill")) {
			try {
				kb.deleteArtikelVonWarenkorb(value);
			} catch (SQLException se) {

				System.out.println("B DB schreiben fehlgeschlagen, Mist!");
				System.out.println("SQLCode=" + se.getErrorCode());
				System.out.println("Error-Message=" + se.getMessage());

			}
			
			kb.getHTMLFromAusgewaehlteWarenkorbProdukte();

			response.sendRedirect("../jsp/WarenkorbView.jsp");

		} else {

			response.sendRedirect("../jsp/WarenkorbView.jsp");
		}
	%>

</body>
</html>