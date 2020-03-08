<%@page import="java.sql.SQLException"%>
<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
		<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />
	<jsp:useBean id="a" class="de.hwg_lu.bw4s.beans.Artikel"
	scope="session" />
		
		
	<%!public String denullify(String s) {
		if (s == null)
			return "";
		else
			return s;
	}%>
	<%
	
	
	    String bewertung = this.denullify(request.getParameter("bewertung"));
		String logout = this.denullify(request.getParameter("logout"));
		String appl = this.denullify(request.getParameter("appl"));
		String comeFrom = this.denullify(request.getParameter("comeFrom"));
		String home = this.denullify(request.getParameter("home"));
		// Mein Profil
		String ratespiel = this.denullify(request.getParameter("ratespiel"));
		String einstellungen = this.denullify(request.getParameter("einstellungen"));
		String standort = this.denullify(request.getParameter("standort"));
		String einkaufstasche = this.denullify(request.getParameter("einkaufstasche"));
		String video = this.denullify(request.getParameter("video"));
	
		
		// 1er Semester	
		String abwlbuch = this.denullify(request.getParameter("abwlbuch"));
		String sk = this.denullify(request.getParameter("sk"));
		String wm = this.denullify(request.getParameter("wm"));
		String wi = this.denullify(request.getParameter("wi"));
		String prog1 = this.denullify(request.getParameter("prog1"));
		
	// 		2.Semester	
		String Invest = this.denullify(request.getParameter("Invest"));
		String VWL = this.denullify(request.getParameter("VWL"));
		String Stat = this.denullify(request.getParameter("Stat"));
		String Prog2 = this.denullify(request.getParameter("Prog2"));
		String software = this.denullify(request.getParameter("software"));
		String modell = this.denullify(request.getParameter("modell"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		if (!lb.isLoggedIn()) {
			mb.setNotLoggedIn();
			response.sendRedirect("./LoginAppl.jsp?comeFrom=PortalAppl");
			
		} else if (logout.equals("Abmelden")) {
			lb.setLoggedIn(false);
				
			response.sendRedirect("./LoginAppl.jsp?comeFrom=PortalAppl");
			
		} else if (!appl.equals("")) {
			response.sendRedirect("./" + appl + "Appl.jsp");

		} else if (!comeFrom.equals("")) {
			//Message schon gesetzt
			response.sendRedirect("./PortalView.jsp");
			
		} else if (video.equals("Zum HWG-LU Video")) {
			
			
			response.sendRedirect("../jsp/VideoView.jsp");
			
		} else if (einkaufstasche.equals("Warenkorb")) {
			
			
			response.sendRedirect("../jsp/WarenkorbView.jsp");
			
		} else if (ratespiel.equals("Zum Ratespiel")) {
			response.sendRedirect("../jsp/Quiz.jsp");
			
		}else if (standort.equals("Standort HWG-LU")) {
			
			
			response.sendRedirect("../jsp/KarteView.jsp");
			
		} else if (bewertung.equals("LazyNerds Bewertungen")) {
			
			
			response.sendRedirect("../jsp/BewertungView.jsp");
			
		}else if (abwlbuch.equals("ABWL und Buchfuehrung")) {
			
			kb.setModul("abwlbuch");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.publikationen();
			a.setModul(abwlbuch);
			
			
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (wm.equals("Wirtschaftsmathematik")) {
			
			kb.setModul("wm");
			kb.Professor();
			
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (home.equals("Home")) {
			
			
			
			response.sendRedirect("../jsp/StartseiteView.jsp");
			
		}else if (sk.equals("Social Skills")) {
			
			kb.setModul("sk");
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
		
			
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (wi.equals("Wirtschaftsinformatik")) {
			
			kb.setModul("wi");
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
		    kb.Funktion();
			kb.Beruflicher();
			kb.publikationen();
			
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (prog1.equals("Prog I")) {
			
			kb.setModul("prog1");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.Funktion();
			kb.Beruflicher();
			kb.publikationen();
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (Prog2.equals("Prog II")) {
			
			kb.setModul("Prog2");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.Funktion();
			kb.Beruflicher();
			kb.publikationen();
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (Invest.equals("Investition & Finanzierung")) {
			
			kb.setModul("Invest");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.Funktion();
			kb.Beruflicher();
			kb.publikationen();
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (VWL.equals("VWL")) {
			
			kb.setModul("VWL");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.Funktion();
			kb.Beruflicher();
			kb.publikationen();
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (Stat.equals("Statistik")) {
			
			kb.setModul("Stat");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.Funktion();
			kb.Beruflicher();
			kb.publikationen();
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (software.equals("Software Engineering")) {
			
			kb.setModul("software");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.Funktion();
			kb.Beruflicher();
			kb.publikationen();
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (modell.equals("Modellierung")) {
			
			kb.setModul("modell");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.Funktion();
			kb.Beruflicher();
			kb.publikationen();
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}
	
		else if (einstellungen.equals("Einstellungen")) {
			try{
			lb.readAccountsFromDB();
			} catch (SQLException se){
				
				System.out.println("DB schreiben fehlgeschlagen, Mist!");
				System.out.println("SQLCode=" + se.getErrorCode());
				System.out.println("Error-Message=" + se.getMessage());
			}
				
			response.sendRedirect("./EinstellungenView.jsp");
			
		} else {
			mb.setGeneralWelcome();
			response.sendRedirect("./LoginAppl.jsp");
		}
	%>
</body>
</html>
