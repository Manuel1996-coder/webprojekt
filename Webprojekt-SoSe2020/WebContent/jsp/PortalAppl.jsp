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
		String startseite = this.denullify(request.getParameter("startseite"));
		String hilfe = this.denullify(request.getParameter("hilfe"));
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
		
		
	// 3.Semester
	
		String OR = this.denullify(request.getParameter("OR"));
		String algoDatenbanken = this.denullify(request.getParameter("algoDatenbanken"));
		String betriebsrechner = this.denullify(request.getParameter("betriebsrechner"));
		String UFUDL = this.denullify(request.getParameter("UFUDL"));
		
		
		
	// 4. Semester
		
		String Supply = this.denullify(request.getParameter("Supply"));
		String webAnwendung = this.denullify(request.getParameter("webAnwendung"));
		String wahlfach = this.denullify(request.getParameter("wahlfach"));
		String Seminar = this.denullify(request.getParameter("Seminar"));
		
		// 5. Semester
		
		String praktikumAnwendungs = this.denullify(request.getParameter("praktikumAnwendungs"));
		String businessIntelligence = this.denullify(request.getParameter("businessIntelligence"));
		String infoSicher = this.denullify(request.getParameter("infoSicher"));
		String erpScm = this.denullify(request.getParameter("erpScm"));
		
		
		
		

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
			response.sendRedirect("../jsp/QuizView.jsp");
			
		}else if (standort.equals("HWG-LU Standort")) {
			
			
			response.sendRedirect("../jsp/KarteView.jsp");
			
		} else if (bewertung.equals("LazyNerds Bewertungen")) {
			
			
			response.sendRedirect("../jsp/BewertungView.jsp");
			
		}else if (hilfe.equals("Hilfe")) {
			
			
			response.sendRedirect("../jsp/HilfeView.jsp");
			
		}else if (abwlbuch.equals("ABWL und Buchfuehrung")) {
			
			kb.setModulValue(abwlbuch);
			
			kb.setModul("abwlbuch");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.publikationen();
			
			
			
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (wm.equals("Wirtschaftsmathematik")) {
			
			kb.setModulValue(wm);
			kb.setModul("wm");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
			kb.publikationen();
			
			
			
			
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (startseite.equals("Startseite")) {
			
			
			
			response.sendRedirect("../jsp/StartseiteView.jsp");
			
		}else if (sk.equals("Social Skills")) {
			
			kb.setModulValue(sk);
			kb.setModul("sk");
			kb.setButton(true);
			kb.getArtikelFromDB();
			kb.Professor();
			kb.titel();
			kb.sprechstunde();
			kb.lehrgebiete();
			kb.forschungsschwerpunkte();
		
			
			response.sendRedirect("../jsp/AgendaView.jsp");
			
		}else if (wi.equals("Wirtschaftsinformatik")) {
			
			kb.setModulValue(wi);
			kb.setModul("wi");
			kb.setButton(true);
			kb.getArtikelFromDB();;
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
			
			kb.setModulValue(prog1);
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
			
			kb.setModulValue(Prog2);
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
			kb.setModulValue(Invest);
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
			kb.setModulValue(VWL);
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
			kb.setModulValue(Stat);
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
			kb.setModulValue(software);
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
			kb.setModulValue(modell);
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
			
		}else if (OR.equals("Operations Research")) {
			kb.setModulValue(OR);
			kb.setModul("OR");
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
			
		} else if (algoDatenbanken.equals("Algo/Daten & Datenbanken")) {
			kb.setModulValue(algoDatenbanken);
			kb.setModul("algoDatenbanken");
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
			
		}else if (betriebsrechner.equals("Betriebssys. & Rechnernetze")) {
			kb.setModulValue(betriebsrechner);
			kb.setModul("betriebsrechner");
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
			
		}else if (wahlfach.equals("Wahlfach")) {
			kb.setModulValue(wahlfach);
			kb.setModul("wahlfach");
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
			
		}else if (Supply.equals("Supply Chain Managment")) {
			kb.setModulValue(Supply);
			kb.setModul("Supply");
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
			
		}else if (webAnwendung.equals("WebAnwendungen")) {
			kb.setModulValue(webAnwendung);
			kb.setModul("webAnwendung");
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
			
		}else if (praktikumAnwendungs.equals("Praktikum Anwendungsysteme")) {
			kb.setModulValue(praktikumAnwendungs);
			kb.setModul("webAnwendung");
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
			
		}else if (businessIntelligence.equals("Business Intelligence")) {
			kb.setModulValue(businessIntelligence);
			kb.setModul("businessIntelligence");
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
			
		}else if (infoSicher.equals("Info-Sicherheit & InfoManagement")) {
			kb.setModulValue(infoSicher);
			kb.setModul("infoSicher");
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
			
		}else if (erpScm.equals("ERP-Sys & SCM-Sys")) {
			kb.setModulValue(erpScm);
			kb.setModul("erpScm");
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
		
		else if (Seminar.equals("Seminar")) {
			kb.setModulValue(Seminar);
			kb.setModul("Seminar");
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
			
		}else if (UFUDL.equals("U-Fuehrung & Dl-Mgmt")) {
			kb.setModulValue(UFUDL);
			kb.setModul("UFUDL");
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
			response.sendRedirect("./PortalView.jsp");
		}
	%>
</body>
</html>
