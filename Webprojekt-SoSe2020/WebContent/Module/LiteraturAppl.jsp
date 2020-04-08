<%@page import="java.sql.SQLException"%>
<%@page import="de.hwg_lu.bw4s.beans.MsgBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="de.hwg_lu.bw4s.beans.LiteraturBean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="fb" class="de.hwg_lu.bw4s.beans.LiteraturBean"
		scope="session" />
	<jsp:useBean id="msg" class="de.hwg_lu.bw4s.beans.MsgBean"
		scope="session" />
	<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
		scope="session" />

	<%!// mit ! ist es eine Deklaration - nötig um eigene Methoden anzulegen
	public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
		// return(s==null)?"":s;
	}%>

	<%
		String bestellung = "" + request.getParameter("button");
		String kunde = request.getParameter("kunde");

		String indenwarenkorb = this.denullify(request.getParameter("indenwarenkorb"));
		String zurueckzp = this.denullify(request.getParameter("zurueckzp"));
		String[] artikel = request.getParameterValues("artikel");

		String zurueckza = this.denullify(request.getParameter("zurueckza"));

		if (artikel == null)
			artikel = new String[1];

		if (bestellung.equals("bestellen")) {
			if (fb.bestellungSpeichern(kunde, artikel))
				msg.setDone();
			else
				msg.setFail();
		} else if (indenwarenkorb.equals("In den Warenkorb")) {
			System.out.println("angekommen");
			try {
				kb.getausgewaehlteArtikelFromDB(artikel);

			} catch (SQLException se) {

				System.out.println("B DB schreiben fehlgeschlagen, Mist!");
				System.out.println("SQLCode=" + se.getErrorCode());
				System.out.println("Error-Message=" + se.getMessage());
			}

			//	System.out.println(angekreuzte.length);

			response.sendRedirect("../jsp/WarenkorbView.jsp");

		} 
		
		else if (zurueckzp.equals("Zum Portal")) {

			response.sendRedirect("../jsp/PortalView.jsp");

		} 
		
		else if (zurueckza.equals("Zur Agenda")) {

			response.sendRedirect("../jsp/AgendaView.jsp");
		} else {

		}
	%>

</body>
</html>