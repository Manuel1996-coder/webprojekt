package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class SkriptBean {

	public String getAltklausur() {
		return altklausur;
	}

	public void setAltklausur(String altklausur) {
		this.altklausur = altklausur;
	}

	String altklausur;
	String modul;
	String prof;
	String skript;
	String titel;
	String sprechstunde;
	String lehrgebiete;
	String forschungsschwerpunkte;
	String publikationen;
	String funktion;
	String beruflicher;
	String matrkid;
	String modulValue;
	int anr;
	boolean button;
	Vector<Artikel> artikelListe;

	int bnr;

	public String getBeruflicher() {
		return beruflicher;
	}

	public void setBeruflicher(String beruflicher) {
		this.beruflicher = beruflicher;
	}

	public SkriptBean(String modul, String prof, String skript, String titel, String sprechstunde, String lehrgebiete,
			String forschungsschwerpunkte, String publikationen, String beruflicher, String funktion, double summe,
			int anr, String altklausur, String matrkid, String modulValue) {
		super();
		this.modul = modul;
		this.prof = prof;
		this.skript = skript;
		this.titel = titel;
		this.sprechstunde = sprechstunde;
		this.lehrgebiete = lehrgebiete;
		this.forschungsschwerpunkte = forschungsschwerpunkte;
		this.publikationen = publikationen;
		this.beruflicher = beruflicher;
		this.funktion = funktion;
		this.summe = summe;
		this.anr = anr;
		this.altklausur = altklausur;
		this.matrkid = matrkid;
		this.modulValue = modulValue;

	}
	
	

	public void Professor() {

		switch (this.modul) {
		case "abwlbuch":

			this.setProf("Prof. Dr. rer. pol. Stefan Bongard");
			this.setSkript("../Skript/Skript1/bwlSkript.pdf#toolbar=0");
			this.setAltklausur("../Altklausuren/Semester1/BWL.pdf");

			break;
		case "wm":
			this.setProf("LB Lehmann");
			this.setSkript("../Skript/Skript1/WM.pdf");
			this.setAltklausur("../Altklausuren/Semester1/WM.pdf");

			break;
		case "sk":

			this.setProf("Dieter Ott");
			this.setSkript("../Skript/Skript1/Softskills.pdf");
			break;
		case "wi":
			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/Skript1/Ewi.pdf");
			this.setAltklausur("../Altklausuren/Semester1/EWI.pdf");

			break;
		case "prog1":
			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/Skript1/Programierung1.pdf");
			this.setAltklausur("../Altklausuren/Semester1/Prog1.pdf");

			break;
		case "businessIntelligence":
			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/Skript5/BI.pdf");
			this.setAltklausur("../Altklausuren/Semester1/Prog1.pdf");

			break;	
			
			
		case "Invest":
			this.setProf("Prof. Dr. Andreas Diesch");
			this.setSkript("../Skript/Skript2/Invest.pdf");
			this.setAltklausur("../Altklausuren/Semester2/Invest.pdf");

			break;
		case "modell":
			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/Skript2/Modellierung.pdf");
			this.setAltklausur("../Altklausuren/Semester2/Modell.pdf");

			break;
		case "software":
			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/Skript2/software.pdf");
			this.setAltklausur("../Altklausuren/Semester2/SE.pdf");

			break;
		case "Prog2":
			this.setProf("Prof. Dr. Peer Küppers");
			this.setSkript("../Skript/Skript2/Programierung2.pdf");
			this.setAltklausur("../Altklausuren/Semester2/Prog2.pdf");

			break;
		case "VWL":
			this.setProf("Markus Heilig");
			this.setSkript("../Skript/Skript2/VWL.pdf");
			this.setAltklausur("../Altklausuren/Semester3/VWL.pdf");

			break;
		case "OR":
			this.setProf("Prof. Dr. rer. pol. Joachim Schmidt");
			this.setSkript("../Skript/Skript3/OR.pdf");

			break;
		case "algoDatenbanken":
			this.setProf("Prof. Dr. Peer Küppers");
			this.setSkript("../Skript/Skript3/Datenbanken.pdf");
			this.setAltklausur("../Altklausuren/Semester3/Algorithme.pdf");

			break;
		case "betriebsrechner":
			this.setProf("Prof. Dr. Peer Küppers");
			this.setSkript("../Skript/Skript3/Rechnernetze.pdf");
			this.setAltklausur("../Altklausuren/Semester3/Rechnerntze.pdf");

			break;
		case "UFUDL":
			this.setProf("Prof. Dr. rer. pol. Martin Selchert");
			this.setSkript("../Skript/Skript4/DLM&UFU.pdf");
			this.setAltklausur("../Altklausuren/Semester4/DL&UFU.pdf");

			break;
		case "Supply":
			this.setProf("Prof. Dr. rer. pol. Frank Thomé");
			this.setSkript("../Skript/Skript4/Supply.pdf");

			break;
		case "erpScm":
			this.setProf("Prof. Dr. rer. pol. Frank Thomé");
			this.setSkript("../Skript/Skript5/ERP.pdf");

			break;
		case "webAnwendung":
			this.setProf("Prof. Dr. Haio Röckle");
			this.setSkript("../Skript/Skript4/Anwendung.pdf");
			this.setAltklausur("../Altklausuren/Semester4/WEB.pdf");

			break;
		case "infoSicher":
			this.setProf("Prof. Dr. Haio Röckle");
			this.setSkript("../Skript/Skript5/InfoSicherheit.pdf");
			this.setAltklausur("../Altklausuren/Semester5/InfoSicherheit.pdf");

			break;
			
			
			
			
			
		case "praktikumAnwendungs":
			this.setProf("Prof. Dr. Haio Röckle");
			this.setSkript("../Skript/Skript4/Anwendung.pdf");
			this.setAltklausur("../Altklausuren/Semester4/WEB.pdf");

			break;
		case "Stat":
			this.setProf("Sabine Gondrom");
			this.setSkript("../Skript/Skript3/Statistik.pdf");
			this.setAltklausur("../Altklausuren/Semester3/Statistik.pdf");

			break;
		case "Seminar":
			this.setProf("Prof. Dr. Melcher, Joachim");
			this.setSkript("../Skript/Skript4/Seminar.pdf");

			break;
		case "wahlfach":
			this.setProf("Prof. Dr. rer. pol. Petra Weber-Dreßler");
			this.setSkript("../Skript/Skript4/Controlling.pdf");
			this.setAltklausur("../Altklausuren/Semester4/WM.pdf");

		default:
			System.out.println("fehler");
		}

	}

	public void titel() {
		String html = "";

		switch (this.modul) {
		
		case "abwlbuch":

			html += "<h3>Diplom-Kaufmann</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Betriebswirtschaftslehre und Logistik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E36</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-309</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Bongard.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:stefan.bongard@hwg-lu.de\">stefan.bongard@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
		case "wm":
			
			html += "Leider kein Profil verfügbar";
			this.setTitel(html);
			

			break;
			
			
			
		case "sk":

			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td> B302</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-221</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Ott_Dieter.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:Dieter.Ott@hwg-lu.de\">Dieter.Ott@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
		case "wi":

			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>T001 (Turmstraße) </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-330</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Dorrhauer_Carsten.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:carsten.dorrhauer@hwg-lu.de\">carsten.dorrhauer@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
		case "prog1":

			html += "<h3>Diplom-Mathematiker</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>B305</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-219</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Freyburger_Klaus.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:klaus.freyburger@hwg-lu.de\">klaus.freyburger@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
		case "businessIntelligence":

			html += "<h3>Diplom-Mathematiker</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>B305</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-219</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Freyburger_Klaus.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:klaus.freyburger@hwg-lu.de\">klaus.freyburger@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
			
			
	       

		case "Prog2":

			html += "<h3>Professur für Wirtschaftsinformatik</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E1020</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-416</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/kueppers.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:peer.kueppers@hwg-lu.de\">peer.kueppers@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
		case "Invest":

			html += "<h3>Dipl.-oec., Wirtschaftsprüfer / Steuerberater</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professor für Betriebswirtschaftslehre insbesondere Betriebswirtschaftliche Steuerlehre und Wirtschaftsprüfung\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E1020</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-473</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Diesch.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:andreas.diesch@hwg-lu.de\">andreas.diesch@hwg-lu.de</a>\n";

			this.setTitel(html);
			
			break;
		case "software":

			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>T001 (Turmstraße) </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-330</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Dorrhauer_Carsten.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:carsten.dorrhauer@hwg-lu.de\">carsten.dorrhauer@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
		case "modell":

			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>T001 (Turmstraße) </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-330</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Dorrhauer_Carsten.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:carsten.dorrhauer@hwg-lu.de\">carsten.dorrhauer@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;


		case "OR":
			html += "<h3>Diplom-Wirtschaftsingenieur</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Logistik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E1024a </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-352</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Schmidt.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:joachim.schmidt@hwg-lu.de\">joachim.schmidt@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;

		case "algoDatenbanken":
			html += "<h3>Diplom-Mathematiker</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>B305</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-219</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Freyburger_Klaus.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:klaus.freyburger@hwg-lu.de\">klaus.freyburger@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;

		case "betriebsrechner":

			html += "<h3>Professur für Wirtschaftsinformatik</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E1020</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-416</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/kueppers.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:peer.kueppers@hwg-lu.de\">peer.kueppers@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;

		case "UFUDL":

			html += "<h3>Diplom-Kaufmann</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Marketing und Unternehmensführung\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>B320</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-261</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Selchert.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:martin.selchert@hwg-lu.de\">martin.selchert@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;

		case "Supply":

			html += "<h3>Diplom-Kaufmann, M.A.</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E1021a</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-213</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Thome_Frank.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:frank.thome@hwg-lu.de\">frank.thome@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
			
		
			
		case "erpScm":

			html += "<h3>Diplom-Kaufmann, M.A.</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E1021a</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-213</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Thome_Frank.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:frank.thome@hwg-lu.de\">frank.thome@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;		
			
			
			
			

		case "webAnwendung":

			html += "<h3>Diplom-Mathematiker</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E34</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-227</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Roeckle_Haio.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:haio.roeckle@hwg-lu.de\">haio.roeckle@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
		case "infoSicher":

			html += "<h3>Diplom-Mathematiker</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>E34</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 621/5203-227</td>\n";

			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Roeckle_Haio.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:haio.roeckle@hwg-lu.de\">haio.roeckle@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;
			
			
			
			
		case "VWL":
			html += "Leider kein Profil verfügbar";
			this.setTitel(html);
			break;
		
            case "Stat":

			
            html += "Leider kein Profil verfügbar";

			this.setTitel(html);

			break;

		case "wahlfach":

			html += "<h3>Diplom-Kauffrau</h3>\n";
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Controlling\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>B 122</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 0621/5203-201</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/R.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:petra.weber-dressler@hwg-lu.de\">petra.weber-dressler@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;

		case "Seminar":

			
			html += "<br/>\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td>Professur für Wirtschaftsinformatik\n";
			html += "<table>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-home\"></i></td>\n";
			html += "<td>T107</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td><i class=\"fas fa-phone\"></i></td>\n";
			html += "<td>+49 (0) 0621/5203-201</td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "</td>\n";
			html += "<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n"
					+ "				src=\"../img/imgProf/Joachim_melcher.jpg\"></td>\n";
			html += "</tr>\n";
			html += "</table>\n";
			html += "<a href=\"mailto:joahim.melcher@hwg-lu.de\">joahim.melcher@hwg-lu.de</a>\n";

			this.setTitel(html);

			break;

		default:
			System.out.println("fehler");
		}

	}

	public void lehrgebiete() {
		String html = "";
		switch (this.modul) {
		case "abwlbuch":

			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Betriebswirtschaft</li>\n";
			html += "<li>Logistik</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
		case "wm":
			
			html += "";
			this.setLehrgebiete(html);

			break;
			
			
            case "Stat":
			
			html += "";
			this.setLehrgebiete(html);

			break;
		case "sk":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Soft Skills</li>\n";
			html += "<li>Wirtschaftsethik und Interkulturelle Kompetenz</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
		case "wi":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Modellierung</li>\n";
			html += "<li>Software Engineering</li>\n";
			html += "<li>Information Management</li>\n";
			html += "<li>ITIL</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
			
		case "VWL":
			html += "";
			this.setLehrgebiete(html);
			break;
		
		

		case "prog1":

			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Programmierung </li>\n";
			html += "<li>Business Intelligence</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
			
			
			
			
		case "businessIntelligence":

			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Programmierung </li>\n";
			html += "<li>Business Intelligence</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
		case "Prog2":

			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Data Science und Business Analytics </li>\n";
			html += "<li>Big Data Architekturene</li>\n";
			html += "<li>Machine Learning</li>\n";
			html += "<li>Datenbanken</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
		case "Invest":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Ertragssteuern</li>\n";
			html += "<li>Internationales Steuerrecht</li>\n";
			html += "<li>Besteuerung der Umstrukturierung von Unternehmen</li>\n";
			html += "<li>Rechnungslegung</li>\n";
			html += "<li>Investition</li>\n";
			html += "<li>Kostenrechnung</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;

		case "software":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Modellierung</li>\n";
			html += "<li>Software Engineering</li>\n";
			html += "<li>Information Management</li>\n";
			html += "<li>ITIL</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
		case "modell":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Modellierung</li>\n";
			html += "<li>Software Engineering</li>\n";
			html += "<li>Information Management</li>\n";
			html += "<li>ITIL</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;


		case "OR":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Verkehrslogistik</li>\n";
			html += "<li>Planungsprozesse und Optimierungsverfahren in der Logistik</li>\n";
			html += "<li>Quantitative Methoden (Operations Research)</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;

		case "algoDatenbanken":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Programmierung </li>\n";
			html += "<li>Business Intelligence</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;

		case "betriebsrechner":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Data Science und Business Analytics </li>\n";
			html += "<li>Big Data Architekturene</li>\n";
			html += "<li>Machine Learning</li>\n";
			html += "<li>Datenbanken</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;

		case "UFUDL":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Marketing</li>\n";
			html += "<li>Unternehmensführung</li>\n";
			html += "<li>Dienstleistungsmanagement</li>\n";
			html += "<li>E-Commerce Strategie</li>\n";
			html += "<li>Change Management</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;

		case "Supply":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>E-Business und Supply Chain Management </li>\n";
			html += "<li>ERP Systeme / ERP Consulting</li>\n";
			html += "<li>Prozess- und Systemmodellierung</li>\n";
			html += "<li>Internet of Things (IoT) Technologien und Anwendungen</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
			
		case "erpScm":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>E-Business und Supply Chain Management </li>\n";
			html += "<li>ERP Systeme / ERP Consulting</li>\n";
			html += "<li>Prozess- und Systemmodellierung</li>\n";
			html += "<li>Internet of Things (IoT) Technologien und Anwendungen</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;		
			
			
			

		case "webAnwendung":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Programmierung</li>\n";
			html += "<li>Datenbanken</li>\n";
			html += "<li>Web Anwendungen</li>\n";
			html += "<li>Information Security</li>\n";
			html += "<li>Wirtschaftsmathematik</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;
		case "infoSicher":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Programmierung</li>\n";
			html += "<li>Datenbanken</li>\n";
			html += "<li>Web Anwendungen</li>\n";
			html += "<li>Information Security</li>\n";
			html += "<li>Wirtschaftsmathematik</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;	
   
        
			
			

		case "Seminar":
			

			html += "";
			this.setLehrgebiete(html);

			break;

		case "wahlfach":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Kosten- und Leistungsrechnung</li>\n";
			html += "<li>Strategisches und Operatives Controlling</li>\n";
			html += "<li>Dienstleistungscontrolling</li>\n";
			html += "<li>Controlling in internationalen Unternehmen</li>\n";

			html += "</ul>\n";
			this.setLehrgebiete(html);

			break;

		default:
			System.out.println("fehler");
		}

	}

	public void sprechstunde() {
		String html = "";
		switch (this.modul) {
		case "abwlbuch":

			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Terminabsprache nach Vereinbarung per Mail\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";

			this.setSprechstunde(html);

			break;
		case "wm":
			html += "";
			this.setSprechstunde(html);

			break;
			
		
		case "sk":

			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Terminabsprache per Mail\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";

			this.setSprechstunde(html);

			break;
		case "wi":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> nach telefonischer Vereinbarung\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";

			this.setSprechstunde(html);

			break;
		case "prog1":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Mittwochs 13:30 bis 14:30 Uhr\n";
			html += "<br /> Terminabsprache nach Vereinbarung per Mail\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;
		case "businessIntelligence":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Mittwochs 13:30 bis 14:30 Uhr\n";
			html += "<br /> Terminabsprache nach Vereinbarung per Mail\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;		
			
			
			
			
		case "Prog2":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> nach Vereinbarung\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;

		case "Invest":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Mittwoch vormittags bis 11:30 Uhr\n";
			html += "<br /> Termine nach Vereinbarung mit Frau Gray\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;

		case "software":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> nach telefonischer Vereinbarung\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";

			this.setSprechstunde(html);

			break;
			
		case "modell":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> nach telefonischer Vereinbarung\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";

			this.setSprechstunde(html);

			break;
			
		case "VWL":
			html += "";
			this.setSprechstunde(html);
			break;
		
		case "Stat":
			html += "";
			this.setSprechstunde(html);
			break;

		case "OR":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br />Donnerstags 10:00 - 11:30 Uhr\n";
			html += "<br /> und nach Vereinbarung \n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			this.setSprechstunde(html);

			break;

		case "algoDatenbanken":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Mittwochs 13:30 bis 14:30 Uhr\n";
			html += "<br /> Terminabsprache nach Vereinbarung per Mail\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;

		case "betriebsrechner":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> nach Vereinbarung\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;

		case "UFUDL":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Termine montags nach Vereinbarung über das Sekretariat des Fachbereichs Dienstleistungen und Consulting, Frau Stefanie Gray\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;

		case "Supply":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br />Termine nach Vereinbarung\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;
		case "erpScm":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br />Termine nach Vereinbarung\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;			
			
			
			
			

		case "webAnwendung":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Dienstags 10:00 bis 11:30 Uhr\n";
			html += "<br /> Termine nach Vereinbarung mit Frau Gray, 0621 5203-150\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;
		case "infoSicher":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Dienstags 10:00 bis 11:30 Uhr\n";
			html += "<br /> Termine nach Vereinbarung mit Frau Gray, 0621 5203-150\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;		
			
			
			
			

		case "wahlfach":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Termine nach Vereinbarung mit Frau Gray\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;

		case "Seminar":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Termine nach Vereinbarung mit Frau Gray\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);

			break;

		default:
			System.out.println("fehler");
		}

	}

	public void forschungsschwerpunkte() {
		String html = "";
		
		switch (this.modul) {
		case "abwlbuch":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
		case "wm":

			html += "";
			this.setForschungsschwerpunkte(html);

			break;
		case "sk":
			html += "";
			this.setForschungsschwerpunkte(html);

			break;
			
		case "Stat":
			html += "";
			this.setForschungsschwerpunkte(html);

			break;
		case "wi":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>IT-Servicemanagement</li>\n";
			html += "<li>Software Engineering</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
		case "prog1":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Business Intelligence mit SAP, Microsoft und Open Source</li>\n";
			html += "<li>IT-Unterstützung der Unternehmensplanung</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);
			
		case "businessIntelligence":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Business Intelligence mit SAP, Microsoft und Open Source</li>\n";
			html += "<li>IT-Unterstützung der Unternehmensplanung</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);
	
			
			
			

			break;
		case "Prog2":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Business Analytics</li>\n";
			html += "<li>Predictive Applications für Industrie 4.0</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;

		case "software":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>IT-Servicemanagement</li>\n";
			html += "<li>Software Engineering</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
			
		case "modell":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>IT-Servicemanagement</li>\n";
			html += "<li>Software Engineering</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;


		case "Invest":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Rechtsformwahl und Besteuerung</li>\n";
			html += "<li>Unternehmensbewertung</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;

		case "OR":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Management von Logistiknetzwerken</li>\n";
			html += "<li>Transportsteuerung </li>\n";
			html += "<li>Störungsmanagement in logistischen Netzen </li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;

		case "algoDatenbanken":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Business Intelligence mit SAP, Microsoft und Open Source</li>\n";
			html += "<li>IT-Unterstützung der Unternehmensplanung</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;

		case "betriebsrechner":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Business Analytics</li>\n";
			html += "<li>Predictive Applications für Industrie 4.0</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;

		case "UFUDL":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Customer Relationship Management</li>\n";
			html += "<li>Service und Vertriebsoptimierung</li>\n";
			html += "<li>Strategisches Business Development</li>\n";

			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;

		case "Supply":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Softwarearchitekturen</li>\n";
			html += "<li>Internet of Things (IoT)</li>\n";
			html += "<li>Industrie 4.0 / Logistik 4.0</li>\n";
			html += "<li>Smart Energy Management</li>\n";
			html += "<li>Smart Home / Ambient Assisted Living</li>\n";

			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
			
		case "erpScm":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Softwarearchitekturen</li>\n";
			html += "<li>Internet of Things (IoT)</li>\n";
			html += "<li>Industrie 4.0 / Logistik 4.0</li>\n";
			html += "<li>Smart Energy Management</li>\n";
			html += "<li>Smart Home / Ambient Assisted Living</li>\n";

			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;

		case "webAnwendung":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Software Entwicklung, Web Anwendungen, </li>\n";
			html += "<li>Information Security</li>\n";

			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
		case "infoSicher":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Software Entwicklung, Web Anwendungen, </li>\n";
			html += "<li>Information Security</li>\n";

			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
			
			
			
			

		case "wahlfach":
			html += "<h3>Forschungsschwerpunkte</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Strategisches und operatives Controlling </li>\n";
			html += "<li>Internationales Controlling</li>\n";

			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

		default:
			System.out.println("fehler");
		}

	}

	public void Funktion() {
		String html = "";
		

		switch (this.modul) {
		case "abwlbuch":

			html += "<h3>Funktionen an der Hochschule</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
		case "wm":
			html += "<h3>Funktionen an der Hochschule</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "";
			this.setFunktion(html);

			

			break;
		case "sk":
			html += "<h3>Funktionen an der Hochschule</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "";
			this.setFunktion(html);

			break;
			
			
		case "Stat":
			
			html += "";
			this.setFunktion(html);

			break;
		case "wi":
			
			html += "";
			this.setFunktion(html);

			break;

		case "prog1":
			html += "<h3>Funktionen an der Hochschule</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Mitglied des Fachbereichsrates</li>\n";

			html += "</ul>\n";

			this.setFunktion(html);

			break;
		case "businessIntelligence":
			html += "<h3>Funktionen an der Hochschule</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Mitglied des Fachbereichsrates</li>\n";

			html += "</ul>\n";

			this.setFunktion(html);

			break;

		case "webAnwendung":
			html += "<h3>Funktionen an der Hochschule</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Dekan des Fachbereichs Dienstleistungen und Consulting</li>\n";

			html += "</ul>\n";

			this.setFunktion(html);

			break;
		case "infoSicher":
			html += "<h3>Funktionen an der Hochschule</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Dekan des Fachbereichs Dienstleistungen und Consulting</li>\n";

			html += "</ul>\n";

			this.setFunktion(html);

			break;

		case "wahlfach":
			html += "<h3>Funktionen an der Hochschule</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Mitglied im Fachbereichsrat</li>\n";
			html += "<li>Mitglied im Prüfungsausschuss</li>\n";

			html += "</ul>\n";

			this.setFunktion(html);

			break;

		default:
			System.out.println("fehler");
		}

	}

	public void Beruflicher() {
		String html = "";
		

		switch (this.modul) {

		case "abwlbuch":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			this.setBeruflicher(html);

			break;
		case "wm":

			html += "";
			this.setBeruflicher(html);
			

			break;
			
		case "Stat":

			html += "";
			this.setBeruflicher(html);
			
		
		case "sk":

			html += "";
			this.setBeruflicher(html);

			break;
		case "wi":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1989-1995</td>\n";
			html += "<td>Studium (BWL und Informatik auf Lehramt) an der Universität Mannheim, Abschluß Dipl.-Hdl.</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1995-2001</td>\n";
			html += "<td>Assistent von Prof. Dr. Franz Steffens am Lehrstuhl für Organisation und Wirtschaftsinformatik, Universität Mannheim</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2000</td>\n";
			html += "<td>Promotion zum Dr. rer. pol. im Fach Wirtschaftsinformatik</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2001-2004</td>\n";
			html += "<td>IT-Projektmanager bei der Heidelberger Druckmaschinen AG</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2004-2009</td>\n";
			html += "<td>Professur für Angewandte Informatik im Studiengang Wirtschaftsingenieurwesen an der Berufsakademie Stuttgart</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2009</td>\n";
			html += "<td>Professur für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;
		case "prog1":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1982-1989 </td>\n";
			html += "<td>Studium der Mathematik und Betriebswirtschaftslehre an der Universität Mannheim und an der University of Massachusetts at Amherst USA </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1991 </td>\n";
			html += "<td>Promotion in Mathematik zum Dr. rer.nat.</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1991-2002</td>\n";
			html += "<td>Beschäftigt bei der SAP AG in Walldorf, Tätigkeitsschwerpunkt: Entwicklung von Software zur Unternehmensplanung;\n"
					+ "zuletzt Leiter der Entwicklung von SAP BW-BPS </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2002</td>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;
		case "businessIntelligence":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1982-1989 </td>\n";
			html += "<td>Studium der Mathematik und Betriebswirtschaftslehre an der Universität Mannheim und an der University of Massachusetts at Amherst USA </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1991 </td>\n";
			html += "<td>Promotion in Mathematik zum Dr. rer.nat.</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1991-2002</td>\n";
			html += "<td>Beschäftigt bei der SAP AG in Walldorf, Tätigkeitsschwerpunkt: Entwicklung von Software zur Unternehmensplanung;\n"
					+ "zuletzt Leiter der Entwicklung von SAP BW-BPS </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2002</td>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;

		case "Prog2":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>2001-2006 </td>\n";
			html += "<td>Studium der Technischen Informatik, Technische Universität Berlin, Abschluss Dipl.-Ing. </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2006-2009 </td>\n";
			html += "<td>Studium der Betriebswirtschaftslehre, Westfälische Wilhelms-Universität Münster, Abschluss BSc.</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2009-2013</td>\n";
			html += "<td>Wissenschaftlicher Mitarbeiter am Lehrstuhl für Wirtschaftsinformatik und Logistik, Westfälische Wilhelms-Universität Münster</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2013</td>\n";
			html += "<td>Promotion zum Dr. rer. pol. im Fach Wirtschaftsinformatik (Thema „ Coordination in Heterarchical Supply Chains – A Framework for the Design and Evaluation of Collaborative Planning Concepts“)</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2013-2015</td>\n";
			html += "<td>IT-Projektkoordinator bei der Liebherr-Aerospace Lindenberg GmbH</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2015-2016</td>\n";
			html += "<td>Data Scientist bei der Blue Yonder GmbH</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2017</td>\n";
			html += "<td>Data Science Consultant bei der Blue Yonder GmbH</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td> seit 2017</td>\n";
			html += "<td>Professor für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";

			html += "</table>\n";

			this.setBeruflicher(html);

			break;
		case "Invest":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1986-1993 </td>\n";
			html += "<td>Studium der Wirtschaftswissenschaften an der Universität Hohenheim</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1993-1996 </td>\n";
			html += "<td>Schitag Ernst Young Deutsche Allgemeine Treuhand AG, Stuttgart</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1996</td>\n";
			html += "<td>Ernst & Young, New York (3 Monate) </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1997-2000</td>\n";
			html += "<td>Schitag Ernst & Young AG, Stuttgart</td>\n";
			html += "</tr>\n";

			html += "<tr>\n";
			html += "<td>2001-2005</td>\n";
			html += "<td>Ernst & Young AG, Stuttgart</td>\n";
			html += "</tr>\n";

			html += "<tr>\n";
			html += "<td>2005-2006</td>\n";
			html += "<td>Geschäftsführer des Verbundes Europatreuhand Wirtschaftsprüfer • Steuerberater</td>\n";
			html += "</tr>\n";

			html += "<tr>\n";
			html += "<td>2006-2017</td>\n";
			html += "<td>Mitglied des Vorstands bei der Baker Tilly AG \n"
					+ "Wirtschaftsprüfungsgesellschaft und Leiter der Niederlassung Stuttgart</td>\n";
			html += "</tr>\n";

			html += "<tr>\n";
			html += "<td>seit 2017</td>\n";
			html += "<td>Professor für Betriebswirtschaftslehre \n"
					+ "insbesondere Betriebswirtschaftliche Steuerlehre und Wirtschaftsprüfung an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";

			html += "</table>\n";

			this.setBeruflicher(html);

			break;

		case "software":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1989-1995</td>\n";
			html += "<td>Studium (BWL und Informatik auf Lehramt) an der Universität Mannheim, Abschluß Dipl.-Hdl.</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1995-2001</td>\n";
			html += "<td>Assistent von Prof. Dr. Franz Steffens am Lehrstuhl für Organisation und Wirtschaftsinformatik, Universität Mannheim</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2000</td>\n";
			html += "<td>Promotion zum Dr. rer. pol. im Fach Wirtschaftsinformatik</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2001-2004</td>\n";
			html += "<td>IT-Projektmanager bei der Heidelberger Druckmaschinen AG</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2004-2009</td>\n";
			html += "<td>Professur für Angewandte Informatik im Studiengang Wirtschaftsingenieurwesen an der Berufsakademie Stuttgart</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2009</td>\n";
			html += "<td>Professur für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;
			
		case "modell":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1989-1995</td>\n";
			html += "<td>Studium (BWL und Informatik auf Lehramt) an der Universität Mannheim, Abschluß Dipl.-Hdl.</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1995-2001</td>\n";
			html += "<td>Assistent von Prof. Dr. Franz Steffens am Lehrstuhl für Organisation und Wirtschaftsinformatik, Universität Mannheim</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2000</td>\n";
			html += "<td>Promotion zum Dr. rer. pol. im Fach Wirtschaftsinformatik</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2001-2004</td>\n";
			html += "<td>IT-Projektmanager bei der Heidelberger Druckmaschinen AG</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2004-2009</td>\n";
			html += "<td>Professur für Angewandte Informatik im Studiengang Wirtschaftsingenieurwesen an der Berufsakademie Stuttgart</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2009</td>\n";
			html += "<td>Professur für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;


		case "OR":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1986</td>\n";
			html += "<td>Studium Wirtschaftsingenieurwesen an der Universität Karlsruhe, Fachrichtung Operations Research/ Informatik</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1988</td>\n";
			html += "<td>Eintritt in die PTV Planungsbüro Transport und Verkehr GmbH, Karlsruhe</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1993</td>\n";
			html += "<td>Dissertation bei Prof. Dr. Domschke, Technische Universität Darmstadt mit dem  Thema: „Die Fahrzeugeinsatzplanung im gewerblichen Güterfernverkehr“</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1994</td>\n";
			html += "<td>Übernahme der Leitung für den Bereich Dispositionssysteme bei der PTV Planungsbüro Transport und Verkehr GmbH, Karlsruhe</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1998</td>\n";
			html += "<td>Vorstandsmitglied der PTV Planung Transport Verkehr AG, Karlsruhe</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2010</td>\n";
			html += "<td>Business Director Central Europe der Quintiq B.V., s’ Hertogenbosch, Niederlande</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2011</td>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Logistik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;

		case "algoDatenbanken":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1982-1989 </td>\n";
			html += "<td>Studium der Mathematik und Betriebswirtschaftslehre an der Universität Mannheim und an der University of Massachusetts at Amherst USA </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1991 </td>\n";
			html += "<td>Promotion in Mathematik zum Dr. rer.nat.</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1991-2002</td>\n";
			html += "<td>Beschäftigt bei der SAP AG in Walldorf, Tätigkeitsschwerpunkt: Entwicklung von Software zur Unternehmensplanung;\n"
					+ "zuletzt Leiter der Entwicklung von SAP BW-BPS </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2002</td>\n";
			html += "<td>Professur für Betriebswirtschaftslehre, insbesondere Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;

		case "betriebsrechner":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>2001-2006 </td>\n";
			html += "<td>Studium der Technischen Informatik, Technische Universität Berlin, Abschluss Dipl.-Ing. </td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2006-2009 </td>\n";
			html += "<td>Studium der Betriebswirtschaftslehre, Westfälische Wilhelms-Universität Münster, Abschluss BSc.</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2009-2013</td>\n";
			html += "<td>Wissenschaftlicher Mitarbeiter am Lehrstuhl für Wirtschaftsinformatik und Logistik, Westfälische Wilhelms-Universität Münster</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2013</td>\n";
			html += "<td>Promotion zum Dr. rer. pol. im Fach Wirtschaftsinformatik (Thema „ Coordination in Heterarchical Supply Chains – A Framework for the Design and Evaluation of Collaborative Planning Concepts“)</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2013-2015</td>\n";
			html += "<td>IT-Projektkoordinator bei der Liebherr-Aerospace Lindenberg GmbH</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2015-2016</td>\n";
			html += "<td>Data Scientist bei der Blue Yonder GmbH</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>2017</td>\n";
			html += "<td>Data Science Consultant bei der Blue Yonder GmbH</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td> seit 2017</td>\n";
			html += "<td>Professor für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";

			html += "</table>\n";

			this.setBeruflicher(html);

			break;

		case "UFUDL":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1988-1993</td>\n";
			html += "<td>Betriebswirtschaftslehre an den Universitäten Hagen, Gießen und Mannheim mit Abschluss Diplom-Kaufmann</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1994-2000</td>\n";
			html += "<td>Internationale Unternehmensberatung bei McKinsey & Company mit Schwerpunkt Strategie- und Organisationsentwicklung</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1996</td>\n";
			html += "<td>Promotion in Betriebswirtschaftlicher Organisationslehre bei Prof. Dr. Alfred Kieser an der Universität Mannheim</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2000</td>\n";
			html += "<td>Professur für Marketing und Unternehmensführung an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2006</td>\n";
			html += "<td>Studiengangleiter Master of Science in Wirtschaftsinformatik mit Schwerpunkt Information Management & Consulting</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2010</td>\n";
			html += "<td>Transferbeauftragter der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";

			html += "</table>\n";

			this.setBeruflicher(html);

			break;

		case "Supply":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1995-1999</td>\n";
			html += "<td>Wissenschaftlicher Angestellter am Lehrstuhl für Wirtschaftsinformatik an der Rheinisch-Westfälischen Technischen Hochschule (RWTH) Aachen</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1999-2010</td>\n";
			html += "<td>Beschäftigt bei SAP AG, Walldorf und SAP Labs Inc., Palo Alto, USA. \n"
					+ "Tätigkeitsschwerpunkt: Softwareentwicklung Supply Chain Management,\n"
					+ "zuletzt Programm-Manager für SAP Supply Network Collaboration (SNC)</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2010</td>\n";
			html += "<td>Professur für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";

			html += "</table>\n";

			this.setBeruflicher(html);

			break;
		case "erpScm":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1995-1999</td>\n";
			html += "<td>Wissenschaftlicher Angestellter am Lehrstuhl für Wirtschaftsinformatik an der Rheinisch-Westfälischen Technischen Hochschule (RWTH) Aachen</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1999-2010</td>\n";
			html += "<td>Beschäftigt bei SAP AG, Walldorf und SAP Labs Inc., Palo Alto, USA. \n"
					+ "Tätigkeitsschwerpunkt: Softwareentwicklung Supply Chain Management,\n"
					+ "zuletzt Programm-Manager für SAP Supply Network Collaboration (SNC)</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2010</td>\n";
			html += "<td>Professur für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";

			html += "</table>\n";

			this.setBeruflicher(html);

			break;


		case "webAnwendung":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td> bis 1994</td>\n";
			html += "<td>Mathematikstudium an den Universitäten Stuttgart, Köln und Bochum</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1994</td>\n";
			html += "<td>Promotion zum Thema „Abstract Wiener Spaces, Infinite-Dimensional Gaussian Processes and Applications“</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1994-1998</td>\n";
			html += "<td>Beschäftigt als IT-Berater und Projektleiter</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1998-2005</td>\n";
			html += "<td>Geschäftsführender Gesellschafter der Röckle IT-Sicherheit GmbH in Bochum</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2005</td>\n";
			html += "<td>Professur für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;
			
			
			
		case "infoSicher":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td> bis 1994</td>\n";
			html += "<td>Mathematikstudium an den Universitäten Stuttgart, Köln und Bochum</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1994</td>\n";
			html += "<td>Promotion zum Thema „Abstract Wiener Spaces, Infinite-Dimensional Gaussian Processes and Applications“</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1994-1998</td>\n";
			html += "<td>Beschäftigt als IT-Berater und Projektleiter</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1998-2005</td>\n";
			html += "<td>Geschäftsführender Gesellschafter der Röckle IT-Sicherheit GmbH in Bochum</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2005</td>\n";
			html += "<td>Professur für Wirtschaftsinformatik an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;

		case "wahlfach":
			html += "<h3>Beruflicher Werdegang</h3>\n";
			html += "<table border=\"2\">\n";
			html += "<tr>\n";
			html += "<td>1987-1992</td>\n";
			html += "<td>Studium der Betriebswirtschaftslehre in Kombination mit Fremdsprachen an der Universität  Bayreuth</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1993-1996</td>\n";
			html += "<td>Wissenschaftliche Mitarbeiterin am Lehrstuhl für Marketing, Universität Bayreuth</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1996</td>\n";
			html += "<td>Promotion zum Dr. rer. pol. an der Universität Bayreuth</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1997</td>\n";
			html += "<td>Wissenschaftliche Assistentin am Lehrstuhl für Marketing, Universität Bayreuth</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>1998-2002</td>\n";
			html += "<td>General Motors Europe und Adam Opel AG, Rüsselsheim</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td>seit 2003</td>\n";
			html += "<td>Professur für Controlling an der Hochschule für Wirtschaft und Gesellschaft Ludwigshafen / Rhein</td>\n";
			html += "</tr>\n";
			html += "<tr>\n";
			html += "<td> seit 2004</td>\n";
			html += "<td>Prodekanin  des  Fachbereichs  Management, Controlling, HealthCare</td>\n";
			html += "</tr>\n";
			html += "</table>\n";

			this.setBeruflicher(html);

			break;

		default:
			System.out.println("fehler");
		}

	}

	public void publikationen() {
		String html = "";
		switch (this.modul) {
		case "abwlbuch":

			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";
			html += "<li>Elektromobilität im motorisierten Individualverkehr, Springer\n"
					+ "			Vieweg, 2014 (<a href=\"http://www.springer.com/978-3-658-02263-1\">http://www.springer.com/978-3-658-02263-1</a>)\n"
					+ "		</li>\n";
			html += "<li>Beer Game reloaded - Erfahrungsbericht und Spielvarianten der\n"
					+ "			Supply Chain Simulation \"Beer Game\" an der Hochschule für Wirtschaft\n"
					+ "			und Gesellschaft Ludwigshafen, in: BIBB-Forum für Planspiele und\n"
					+ "			Serious Games 2013 (<a href=\"www.bibb.de/planspielforum\">www.bibb.de/planspielforum</a>),\n"
					+ "			U. Blötz (Hrsg.): \"Planspiele und Serious Games in der beruflichen\n"
					+ "			Bildung\", (<a href=\"http://www.bibb.de/dokumente/pdf/3_31.pdf\">http://www.bibb.de/dokumente/pdf/3_31.pdf</a>)\n"
					+ "\n" + "		</li>\n";
			html += "</ul>\n";

			this.setPublikationen(html);

			break;
		case "wm":
			html = "";
			this.setPublikationen(html);

			break;
			
			
		case "Stat":
			html = "";
			this.setPublikationen(html);

			break;
		case "sk":
			html = "";
			this.setPublikationen(html);

			break;
		case "wi":

			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Steffens, F./ Dorrhauer, C./ Zlender, A.: Usability-Test ausgewählter Geschäftsprozesse – Vergleich der SAP-Systeme R/3 4.0B und Enjoy R/3 Release (4.6A), in: HMD Praxis der Wirtschaftsinformatik 212(2000), S. 57-69</li>\n";
			html += "<li>Dorrhauer, C./Zlender, A.: Business Software, Marburg 2004, ISBN 3-8288-8628-0</li>\n";
			html += "<li>Dorrhauer, C.: ITIL V3 — IT–Servicemanagement für die \"Digital Firm\"?, in: Keuper, F./Hamidian, K./Verwaayen, E./Kalinowski, T. (Hrsg.), transformIT − Optimale Geschäftsprozesse durch eine transformierende IT, Wiesbaden 2009, S. 201−215.</li>\n";
			html += "<li> Röckle, H./ Dorrhauer, C.: Messbarkeit der Sicherheitsqualität im Lebenszyklus betrieblicher Anwendungssysteme, in: Barton, T. u.a. (Hrsg.): Betriebliche Anwendungssysteme, Berlin 2011</li>\n";

			html += "</ul>\n";

			this.setPublikationen(html);

			break;
		case "prog1":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Hagen, T.; Freyburger, K.: Neue Technologien als integraler Bestandteil eines Business Intelligence Curriculums am Beispiel von SAP BW on HANA, In: Nissen, V. et. al (Hrsg.): Multikonferenz Wirtschaftsinformatik (MKWI), S. 741-750 (2016)</li>\n";
			html += "<li>Breitkopf, Freyburger, Grimm, Singh: Seismografen im Politik-Geschäft, Sentiment-Analyse sozialer Netzwerke, in BI Spektrum 2/2013</li>\n";
			html += "<li>Business Planning and Support by IT-Systems, in: Rausch, Peter; Sheta, Alaa F.; Ayesh, Aladdin (Eds.), Business Intelligence and Performance Management, Springer 2013</li>\n";
			html += "<li> Freyburger, Klaus; OSBI Lösungen in der Praxis: Anwendungsszenarien, in: Open Source Business Intelligence (OSBI): Möglichkeiten, Chancen und Risiken quelloffener BI-Lösungen, Haneke, Uwe/Trahasch, Stephan/Hagen, Tobias/Lauer, Tobias (Herausgeber),  Carl Hanser Verlag, München 2010</li>\n";
			html += "<li> Freyburger, K.: OSBI – am Nutzen partizipieren statt ignorieren, is report 9/2008</li>\n";
			html += "<li>Freyburger, K.; Lehmann, P.: Herausforderungen bei der Wirtschaftsinformatik-Ausbildung mit Standardsoftware am Beispiel von mySAP Business Intelligence, In: Proceedings zur Multikonferenz Wirtschaftsinformatik, 26.2. - 28.2.2008, München. </li>\n";
			html += "<li>Seufert, A.; Lehmann, P.; Freyburger, K.: Zukunftsorientierte Unternehmenssteuerung auf der Basis von Business Intelligence - Herausforderungen und Potenziale für das Controlling, In: Controller-Leitfaden, Weka Verlag, Zürich, 2006.\n"
					+ " </li>\n";
			html += "<li> Freyburger, K.; Seufert, A.; Lehmann, P.; Zirn, W.; Grasse, S.; Suhl, C.: Unternehmensplanung mit SAP BW BPS, Steinbeis Edition, Okt. 2005.</li>\n";

			html += "<li>Lehmann, P.; Freyburger, K.; Seufert, A.; Zirn, W.; Grasse, S.; Suhl, C.: Modellierung und Reporting mit SAP BW, Steinbeis Edition, Okt. 2005. </li>\n";
			html += "</ul>\n";

			this.setPublikationen(html);

			break;
		case "businessIntelligence":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Hagen, T.; Freyburger, K.: Neue Technologien als integraler Bestandteil eines Business Intelligence Curriculums am Beispiel von SAP BW on HANA, In: Nissen, V. et. al (Hrsg.): Multikonferenz Wirtschaftsinformatik (MKWI), S. 741-750 (2016)</li>\n";
			html += "<li>Breitkopf, Freyburger, Grimm, Singh: Seismografen im Politik-Geschäft, Sentiment-Analyse sozialer Netzwerke, in BI Spektrum 2/2013</li>\n";
			html += "<li>Business Planning and Support by IT-Systems, in: Rausch, Peter; Sheta, Alaa F.; Ayesh, Aladdin (Eds.), Business Intelligence and Performance Management, Springer 2013</li>\n";
			html += "<li> Freyburger, Klaus; OSBI Lösungen in der Praxis: Anwendungsszenarien, in: Open Source Business Intelligence (OSBI): Möglichkeiten, Chancen und Risiken quelloffener BI-Lösungen, Haneke, Uwe/Trahasch, Stephan/Hagen, Tobias/Lauer, Tobias (Herausgeber),  Carl Hanser Verlag, München 2010</li>\n";
			html += "<li> Freyburger, K.: OSBI – am Nutzen partizipieren statt ignorieren, is report 9/2008</li>\n";
			html += "<li>Freyburger, K.; Lehmann, P.: Herausforderungen bei der Wirtschaftsinformatik-Ausbildung mit Standardsoftware am Beispiel von mySAP Business Intelligence, In: Proceedings zur Multikonferenz Wirtschaftsinformatik, 26.2. - 28.2.2008, München. </li>\n";
			html += "<li>Seufert, A.; Lehmann, P.; Freyburger, K.: Zukunftsorientierte Unternehmenssteuerung auf der Basis von Business Intelligence - Herausforderungen und Potenziale für das Controlling, In: Controller-Leitfaden, Weka Verlag, Zürich, 2006.\n"
					+ " </li>\n";
			html += "<li> Freyburger, K.; Seufert, A.; Lehmann, P.; Zirn, W.; Grasse, S.; Suhl, C.: Unternehmensplanung mit SAP BW BPS, Steinbeis Edition, Okt. 2005.</li>\n";

			html += "<li>Lehmann, P.; Freyburger, K.; Seufert, A.; Zirn, W.; Grasse, S.; Suhl, C.: Modellierung und Reporting mit SAP BW, Steinbeis Edition, Okt. 2005. </li>\n";
			html += "</ul>\n";

			this.setPublikationen(html);

			break;


		case "Prog2":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Küppers, P. (2015). Coordination in Heterarchical Supply Chains – A Framework for the Design and Evaluation of Collaborative Planning Concepts. Berlin: Logos Verlag</li>\n";
			html += "<li>Küppers, P., Saalmann, P., & Hellingrath, B. (2015). An Approach for Assessing the Applicability of Collaborative Planning Concepts. In Proceedings of the Hawaii International Conference on System Sciences, Kauai, USA.</li>\n";
			html += "<li>Hellingrath, B., Böhle, C., Küppers, P., & Könning, M. (2012). Dezentrales Koordinationskonzept zur multilateralen kollaborativen Produktions- und Distributionsplanung. In Proceedings of the Multikonferenz Wirtschaftsinformatik 2012, Braunschweig, 187–197.</li>\n";
			html += "<li>Hellingrath, B., & Küppers, P. (2011). Model-Driven Development of Multi-Agent Based Collaborative Planning Concepts for Heterarchical Supply Chains. In Mar̆ík, V., Vrba, P., & Leitão, P. (Eds.), Holonic and Multi-Agent Systems for Manufacturing (pp. 153–164). Lecture Notes in Artificial Intelligence: Vol. 6867. Berlin Heidelberg: Springer.</li>\n";
			html += "<li> Hellingrath, B., & Küppers, P. (2011). Multi-Agent Based Evaluation of Collaborative Planning Concepts in Heterarchical Supply Chains. In Sucky, E., Asdecker, B., Dobhan, A. H. S., & Wiese, J. (Eds.), Logistikmanagement: Herausforderungen, Chancen — Lösungen (pp. 1–22). Bamberg: University of Bamberg Press.</li>\n";
			html += "<li>Hellingrath, B., & Küppers, P. (2011). Multi-Agent Based Collaborative Demand and Capacity Network Planning in Heterarchical Supply Chains. In Proceedings of the 22nd International Joint Conference on Artificial Intelligence (IJCAI), Barcelona, Spain, 25–30.</li>\n";
			html += "<li>Küppers, P. (2011). A Framework for Decentralized Coordination in Heterarchical Supply Chains. In Proceedings of the Wirtschaftsinformatik 2011 (Doctoral Consortium), Zürich, 124–129. </li>\n";
			html += "</ul>\n";

			this.setPublikationen(html);

			break;
		case "Invest":

			html += "<li>2015	Bilanzierung von Lizenzvereinbarungen nach IFRS\n"
					+ "DB vom 10.07.2015, Heft 27-28, Seite 1537 - 1545 </li>\n";
			html += "<li>2012	Financial Benchmarking 2012\n" + "ISBN 978-3-00-040764-2</li>\n";
			html += "<li>2011	Financial Benchmarking 2011\n" + "ISBN 978-3-00-040763-5\n" + "</li>\n";
			html += "<li>2008	Financial Benchmarking 2008\n" + "ISBN 978-3-00-040762-8</li>\n";
			html += "<li>2007	Business Valuation in Germany\n" + "Finpress 4/2007, page 46-58 ISSN 1607-968X</li>\n";

			html += "</ul>\n";

			this.setPublikationen(html);

			break;

		case "software":

			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Steffens, F./ Dorrhauer, C./ Zlender, A.: Usability-Test ausgewählter Geschäftsprozesse – Vergleich der SAP-Systeme R/3 4.0B und Enjoy R/3 Release (4.6A), in: HMD Praxis der Wirtschaftsinformatik 212(2000), S. 57-69</li>\n";
			html += "<li>Dorrhauer, C./Zlender, A.: Business Software, Marburg 2004, ISBN 3-8288-8628-0</li>\n";
			html += "<li>Dorrhauer, C.: ITIL V3 — IT–Servicemanagement für die \"Digital Firm\"?, in: Keuper, F./Hamidian, K./Verwaayen, E./Kalinowski, T. (Hrsg.), transformIT − Optimale Geschäftsprozesse durch eine transformierende IT, Wiesbaden 2009, S. 201−215.</li>\n";
			html += "<li> Röckle, H./ Dorrhauer, C.: Messbarkeit der Sicherheitsqualität im Lebenszyklus betrieblicher Anwendungssysteme, in: Barton, T. u.a. (Hrsg.): Betriebliche Anwendungssysteme, Berlin 2011</li>\n";

			html += "</ul>\n";

			this.setPublikationen(html);

			break;
			
		case "modell":

			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Steffens, F./ Dorrhauer, C./ Zlender, A.: Usability-Test ausgewählter Geschäftsprozesse – Vergleich der SAP-Systeme R/3 4.0B und Enjoy R/3 Release (4.6A), in: HMD Praxis der Wirtschaftsinformatik 212(2000), S. 57-69</li>\n";
			html += "<li>Dorrhauer, C./Zlender, A.: Business Software, Marburg 2004, ISBN 3-8288-8628-0</li>\n";
			html += "<li>Dorrhauer, C.: ITIL V3 — IT–Servicemanagement für die \"Digital Firm\"?, in: Keuper, F./Hamidian, K./Verwaayen, E./Kalinowski, T. (Hrsg.), transformIT − Optimale Geschäftsprozesse durch eine transformierende IT, Wiesbaden 2009, S. 201−215.</li>\n";
			html += "<li> Röckle, H./ Dorrhauer, C.: Messbarkeit der Sicherheitsqualität im Lebenszyklus betrieblicher Anwendungssysteme, in: Barton, T. u.a. (Hrsg.): Betriebliche Anwendungssysteme, Berlin 2011</li>\n";

			html += "</ul>\n";

			this.setPublikationen(html);

			break;

		case "OR":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>„Das Potenzial von Operations Research in Transport und Verkehr“ In: Perspectives on Operations Research; Herausgeber: Morlock, Schwindt, Trautmann, Zimmermann; Deutscher Universitäts-Verlag, Gabler, Edition Wissenschaft; 2006</li>\n";
			html += "<li>„Ist Güterverkehr auf der Straße auch 2020 noch möglich?“ In: Kongressband zum 23. Deutschen Logistik Kongress, 2006; Deutscher Verkehrs Verlag 2006</li>\n";
			html += "<li>„Mehr als nur Fahrzeuge anzeigen - Kosten Nutzen und Zukunftssicherheit von Telematiksystemen“ Logistra 5/2007; Huss Verlag</li>\n";
			html += "<li>„Zustell-Logistik“ In: Handbuch Geomarketing; Herausgeber: Härter, Mühlbauer; Wichmann Verlag, 2008</li>\n";
			html += "<li> „Supply Chain Execution – Hype oder Durchbruch? Anwendungspotentiale und Zukunft“. Veröffentlicht auf(<a href=\\\"https://www.competence-site.de/center/logistik/#/Slide-Advisor/43126/\\\">http://www.Logistics.de</a>); 6/2008</li>\n";
			html += "<li>„Denn wir wissen nicht, was sie tun. Wirksame Verkehrssteuerung mittels Telematik“ Verkehrsrundschau 9/2009; Verlag Heinrich Vogel </li>\n";
			html += "<li>„Zustell-Logistik – Neue Anforderungen in der Kundenbelieferung“ In: Praxishandbuch Logistik; Herausgeber: Pradel, Piontek, Süssenguth, Schwolgin, Loseblattwerke Deutscher Wirtschaftsdienst 10/2010</li>\n";
			html += "</ul>\n";

			this.setPublikationen(html);

			break;

		case "algoDatenbanken":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Hagen, T.; Freyburger, K.: Neue Technologien als integraler Bestandteil eines Business Intelligence Curriculums am Beispiel von SAP BW on HANA, In: Nissen, V. et. al (Hrsg.): Multikonferenz Wirtschaftsinformatik (MKWI), S. 741-750 (2016)</li>\n";
			html += "<li>Breitkopf, Freyburger, Grimm, Singh: Seismografen im Politik-Geschäft, Sentiment-Analyse sozialer Netzwerke, in BI Spektrum 2/2013</li>\n";
			html += "<li>Business Planning and Support by IT-Systems, in: Rausch, Peter; Sheta, Alaa F.; Ayesh, Aladdin (Eds.), Business Intelligence and Performance Management, Springer 2013</li>\n";
			html += "<li> Freyburger, Klaus; OSBI Lösungen in der Praxis: Anwendungsszenarien, in: Open Source Business Intelligence (OSBI): Möglichkeiten, Chancen und Risiken quelloffener BI-Lösungen, Haneke, Uwe/Trahasch, Stephan/Hagen, Tobias/Lauer, Tobias (Herausgeber),  Carl Hanser Verlag, München 2010</li>\n";
			html += "<li> Freyburger, K.: OSBI – am Nutzen partizipieren statt ignorieren, is report 9/2008</li>\n";
			html += "<li>Freyburger, K.; Lehmann, P.: Herausforderungen bei der Wirtschaftsinformatik-Ausbildung mit Standardsoftware am Beispiel von mySAP Business Intelligence, In: Proceedings zur Multikonferenz Wirtschaftsinformatik, 26.2. - 28.2.2008, München. </li>\n";
			html += "<li>Seufert, A.; Lehmann, P.; Freyburger, K.: Zukunftsorientierte Unternehmenssteuerung auf der Basis von Business Intelligence - Herausforderungen und Potenziale für das Controlling, In: Controller-Leitfaden, Weka Verlag, Zürich, 2006.\n"
					+ " </li>\n";
			html += "<li> Freyburger, K.; Seufert, A.; Lehmann, P.; Zirn, W.; Grasse, S.; Suhl, C.: Unternehmensplanung mit SAP BW BPS, Steinbeis Edition, Okt. 2005.</li>\n";

			html += "<li>Lehmann, P.; Freyburger, K.; Seufert, A.; Zirn, W.; Grasse, S.; Suhl, C.: Modellierung und Reporting mit SAP BW, Steinbeis Edition, Okt. 2005. </li>\n";
			html += "</ul>\n";

			this.setPublikationen(html);

			break;

		case "betriebsrechner":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Küppers, P. (2015). Coordination in Heterarchical Supply Chains – A Framework for the Design and Evaluation of Collaborative Planning Concepts. Berlin: Logos Verlag</li>\n";
			html += "<li>Küppers, P., Saalmann, P., & Hellingrath, B. (2015). An Approach for Assessing the Applicability of Collaborative Planning Concepts. In Proceedings of the Hawaii International Conference on System Sciences, Kauai, USA.</li>\n";
			html += "<li>Hellingrath, B., Böhle, C., Küppers, P., & Könning, M. (2012). Dezentrales Koordinationskonzept zur multilateralen kollaborativen Produktions- und Distributionsplanung. In Proceedings of the Multikonferenz Wirtschaftsinformatik 2012, Braunschweig, 187–197.</li>\n";
			html += "<li>Hellingrath, B., & Küppers, P. (2011). Model-Driven Development of Multi-Agent Based Collaborative Planning Concepts for Heterarchical Supply Chains. In Mar̆ík, V., Vrba, P., & Leitão, P. (Eds.), Holonic and Multi-Agent Systems for Manufacturing (pp. 153–164). Lecture Notes in Artificial Intelligence: Vol. 6867. Berlin Heidelberg: Springer.</li>\n";
			html += "<li> Hellingrath, B., & Küppers, P. (2011). Multi-Agent Based Evaluation of Collaborative Planning Concepts in Heterarchical Supply Chains. In Sucky, E., Asdecker, B., Dobhan, A. H. S., & Wiese, J. (Eds.), Logistikmanagement: Herausforderungen, Chancen — Lösungen (pp. 1–22). Bamberg: University of Bamberg Press.</li>\n";
			html += "<li>Hellingrath, B., & Küppers, P. (2011). Multi-Agent Based Collaborative Demand and Capacity Network Planning in Heterarchical Supply Chains. In Proceedings of the 22nd International Joint Conference on Artificial Intelligence (IJCAI), Barcelona, Spain, 25–30.</li>\n";
			html += "<li>Küppers, P. (2011). A Framework for Decentralized Coordination in Heterarchical Supply Chains. In Proceedings of the Wirtschaftsinformatik 2011 (Doctoral Consortium), Zürich, 124–129. </li>\n";
			html += "</ul>\n";

			this.setPublikationen(html);

			break;

		case "UFUDL":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Ermittlung des Erfolgs von CRM-Systemen – Konzeption und praktische Anwendung, in: Controlling, 16. Jg., Januar 2004, S.27-34.</li>\n";
			html += "<li>Enhanced Project Success through SAP Best Practices – International Benchmarking Study, Bonn, 2004.</li>\n";
			html += "<li>CFROI of Customer Relationship Management – Empirical Evidence from mySAP CRM Users, 2. Aufl., Sternenfels, 2005.</li>\n";
			html += "<li>Neue Geschäftsmöglichkeiten durch Informationstechnologie, zusammen mit Detlev J. Hoch, in: Hungenberg, Harald und Jürgen Meffert, Handbuch Strategisches Management, 2. Aufl., Wiesbaden, 2005, S. 755-778.</li>\n";
			html += "<li>Wider die CRM-Unwägbarkeiten, mit Christoph Resch, in: E3, Oktober 2006, S. 60-62.</li>\n";
			html += "<li>Häufige Fehler im Kundenbeziehungsmanagement – und wie man sie vermeidet?, in: Blaupause, Jan. 2007, S. 36-39. </li>\n";

			html += "</ul>\n";

			this.setPublikationen(html);

			break;

		case "wahlfach":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>Internationalisierungsstrategien mittelständischer Unternehmen, Wiesbaden 1997.</li>\n";
			html += "<li>Internationalisierungsstrategien mittelständischer Unternehmen, in: BF/M-Spiegel, 2/1997, S. 8-11.</li>\n";
			html += "<li>Internationalisierungsstrategien mittelständischer Unternehmen, in: Meiler, R. C. (Hrsg.), Mittelstand und Betriebswirtschaft – Beiträge aus Wissenschaft und Praxis, Wiesbaden 1999, S. 241 – 266.</li>\n";
			html += "</ul>\n";

			this.setPublikationen(html);

			break;

		case "webAnwendung":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>H. Röckle: Wiener-Räume und asymptotische Entwicklung für die Wärmeleitungsgleichung, Diplomarbeit in Mathematik an der Ruhr-Universität Bochum (1991)</li>\n";
			html += "<li>H. Röckle: Abstract Wiener Spaces, Infinite-Dimensional Gaussian Processes and Applications, Doktorarbeit in Mathematik an der Ruhr-Universität Bochum (1993)</li>\n";
			html += "<li>H. Röckle: Banach Space-Valued Ornstein-Uhlenbeck Processes with General Drift Coefficients, Acta Appl. Math., Vol.47, No.3, pp. 323-349 (1997)</li>\n";
			html += "<li>H. Röckle: Asymptotic Expansions Related to the Semiclassical Limit in Infinite Dimensions, to appear in: Advanced Topics in Applied Mathematics and Theoretical Physics: Complex Systems: Classical and Quantum Aspects, Proceedings Marseille (1994)</li>\n";
			html += "<li>H. Röckle: Asymptotic Expansions for Ornstein-Uhlenbeck Semigroups over Banach Space Perturbed by a Potential, Preprint (1994)</li>\n";
			html += "<li>S. Albeverio, H. Röckle, V. Steblovskaya: Asymptotic Expansions for Ornstein-Uhlenbeck Semigroups Perturbed by Potentials over Banach Spaces, Stochastics and Stochastics Reports, Vol. 69, Issue 3&4, pp. 195-238 (2000)</li>\n";
			html += "<li>H. Röckle: Geschäftsprozesse als semantische Grundlage für Rollen- und Modellkonzepte der IT-Sicherheits-Administration, Arbeitspapier (1997)</li>\n";
			html += "<li>H. Röckle, M. Schmitz: Kommunikationssicherheit und Datenschutz im Gesundheitswesen, output-Journal des Technologiezentrum Ruhr in Bochum, Ausgabe November 1998, Hrsg.: chip GmbH Bochum (1998)</li>\n";
			html += "<li>H. Röckle, Th. Tigges: Online Shopping - Sicherheitsmaßnahmen schaffen Wettbewerbsvorteile, Synergie-Journal, Ausgabe Februar 1999, Hrsg: Technologiezentren im Land Nordrhein-Westfalen e.V. (1999)</li>\n";
			html += "<li>H. Röckle: Rollenbasierter Zugriffsschutz – Automatisierte Bildung der Rollen im Unternehmen auf der Basis eines prozessorientierten Vorgehensmodells, IT-Sicherheit, Ausgabe 2/1999, Hrsg.: Datakontext Fachverlag, Frechen (1999)</li>\n";
			html += "<li>H. Röckle, G. Schimpf, R. Weidinger: Process-Oriented Approach for Role-Finding to Implement Role-Based Security Administration in a Large Industrial Organization, 5th ACM-Workshop on Role-Based Access Control, Berlin (2000)</li>\n";
			html += "<li>H. Röckle, G. Schimpf: Rollen-Engineering im IT-Berechtigungsmanagement, KES 5/2000, (2000)</li>\n";
			html += "<li>H. Röckle, G. Schimpf: Erfolgsfaktoren im Identitäts- und Berechtigungsmanagement, KES 3/2003, (2003)</li>\n";
			html += "<li>H. Röckle: IT-Sicherheit für mittelständische Unternehmen, Synergiejournal der nordrhein-westfälischen Technologiezentren, Ausgabe 3/2003, (2003)</li>\n";
			html += "<li>H. Röckle: Praktische und unpraktische Ansätze zur IT-Sicherheit für kleine und große Unternehmen, Vortragsmanuskript für das Institut für Sicherheit im E-Business (ISEB) an der Ruhr-Universität Bochum, (2004)</li>\n";
			html += "<li>H. Röckle, G. Schimpf: Security Reporting in großen Unternehmen, in: D-A-CH Security 2009, S. 240-252 (2009)</li>\n";
			html += "<li>J. Janeschitz, H. Röckle: Monetäre Wirkungszusammenhänge zwischen Online-Werbung und Gesamterlös von Web Angeboten und web-unterstützten Angeboten, Preprint (2010)</li>\n";
			html += "<li>C. Dorrhauer, H. Röckle: Messbarkeit der Sicherheitsqualität im Lebenszyklus betrieblicher Anwendungssysteme, in: Thomas Barton, Burkhard Erdlenbruch, Frank Herrmann, Christian Müller (Hrsg.), Herausforderungen an die Wirtschaftsinformatik: Betriebliche Anwendungssysteme, Verlag News & Media, Berlin 2011</li>\n";
			html += "<li>H. Röckle, G. Schimpf: Vertrauen und Risiken, IT Freelancer Magazin 03/2012</li>\n";

			html += "</ul>\n";

			this.setPublikationen(html);
			break;
			
		case "infoSicher":
			html += "<h3>Publikationen</h3>\n";
			html += "<br />\n";
			html += "<ul>\n";

			html += "<li>H. Röckle: Wiener-Räume und asymptotische Entwicklung für die Wärmeleitungsgleichung, Diplomarbeit in Mathematik an der Ruhr-Universität Bochum (1991)</li>\n";
			html += "<li>H. Röckle: Abstract Wiener Spaces, Infinite-Dimensional Gaussian Processes and Applications, Doktorarbeit in Mathematik an der Ruhr-Universität Bochum (1993)</li>\n";
			html += "<li>H. Röckle: Banach Space-Valued Ornstein-Uhlenbeck Processes with General Drift Coefficients, Acta Appl. Math., Vol.47, No.3, pp. 323-349 (1997)</li>\n";
			html += "<li>H. Röckle: Asymptotic Expansions Related to the Semiclassical Limit in Infinite Dimensions, to appear in: Advanced Topics in Applied Mathematics and Theoretical Physics: Complex Systems: Classical and Quantum Aspects, Proceedings Marseille (1994)</li>\n";
			html += "<li>H. Röckle: Asymptotic Expansions for Ornstein-Uhlenbeck Semigroups over Banach Space Perturbed by a Potential, Preprint (1994)</li>\n";
			html += "<li>S. Albeverio, H. Röckle, V. Steblovskaya: Asymptotic Expansions for Ornstein-Uhlenbeck Semigroups Perturbed by Potentials over Banach Spaces, Stochastics and Stochastics Reports, Vol. 69, Issue 3&4, pp. 195-238 (2000)</li>\n";
			html += "<li>H. Röckle: Geschäftsprozesse als semantische Grundlage für Rollen- und Modellkonzepte der IT-Sicherheits-Administration, Arbeitspapier (1997)</li>\n";
			html += "<li>H. Röckle, M. Schmitz: Kommunikationssicherheit und Datenschutz im Gesundheitswesen, output-Journal des Technologiezentrum Ruhr in Bochum, Ausgabe November 1998, Hrsg.: chip GmbH Bochum (1998)</li>\n";
			html += "<li>H. Röckle, Th. Tigges: Online Shopping - Sicherheitsmaßnahmen schaffen Wettbewerbsvorteile, Synergie-Journal, Ausgabe Februar 1999, Hrsg: Technologiezentren im Land Nordrhein-Westfalen e.V. (1999)</li>\n";
			html += "<li>H. Röckle: Rollenbasierter Zugriffsschutz – Automatisierte Bildung der Rollen im Unternehmen auf der Basis eines prozessorientierten Vorgehensmodells, IT-Sicherheit, Ausgabe 2/1999, Hrsg.: Datakontext Fachverlag, Frechen (1999)</li>\n";
			html += "<li>H. Röckle, G. Schimpf, R. Weidinger: Process-Oriented Approach for Role-Finding to Implement Role-Based Security Administration in a Large Industrial Organization, 5th ACM-Workshop on Role-Based Access Control, Berlin (2000)</li>\n";
			html += "<li>H. Röckle, G. Schimpf: Rollen-Engineering im IT-Berechtigungsmanagement, KES 5/2000, (2000)</li>\n";
			html += "<li>H. Röckle, G. Schimpf: Erfolgsfaktoren im Identitäts- und Berechtigungsmanagement, KES 3/2003, (2003)</li>\n";
			html += "<li>H. Röckle: IT-Sicherheit für mittelständische Unternehmen, Synergiejournal der nordrhein-westfälischen Technologiezentren, Ausgabe 3/2003, (2003)</li>\n";
			html += "<li>H. Röckle: Praktische und unpraktische Ansätze zur IT-Sicherheit für kleine und große Unternehmen, Vortragsmanuskript für das Institut für Sicherheit im E-Business (ISEB) an der Ruhr-Universität Bochum, (2004)</li>\n";
			html += "<li>H. Röckle, G. Schimpf: Security Reporting in großen Unternehmen, in: D-A-CH Security 2009, S. 240-252 (2009)</li>\n";
			html += "<li>J. Janeschitz, H. Röckle: Monetäre Wirkungszusammenhänge zwischen Online-Werbung und Gesamterlös von Web Angeboten und web-unterstützten Angeboten, Preprint (2010)</li>\n";
			html += "<li>C. Dorrhauer, H. Röckle: Messbarkeit der Sicherheitsqualität im Lebenszyklus betrieblicher Anwendungssysteme, in: Thomas Barton, Burkhard Erdlenbruch, Frank Herrmann, Christian Müller (Hrsg.), Herausforderungen an die Wirtschaftsinformatik: Betriebliche Anwendungssysteme, Verlag News & Media, Berlin 2011</li>\n";
			html += "<li>H. Röckle, G. Schimpf: Vertrauen und Risiken, IT Freelancer Magazin 03/2012</li>\n";

			html += "</ul>\n";

			this.setPublikationen(html);


		default:
			System.out.println("fehler");
		}

	}

	// --------------------------------------------

	public SkriptBean() throws SQLException {
		super();
		artikelListe = new Vector<Artikel>();
		ausgewaehlteWarenkorbListe = new Vector<Warenkorb>();
		this.dbConn = new PostgreSQLAccess().getConnection();
		//this.getArtikelFromDB();
		// this.artikelListe.clear();
		this.summe = 0.0;
		this.modul = "";
		this.prof = "";
		this.skript = "";
		this.titel = "";
		this.sprechstunde = "";
		this.lehrgebiete = "";
		this.forschungsschwerpunkte = "";
		this.publikationen = "";
		this.beruflicher = "";
		this.funktion = "";
		
		this.altklausur = "";
		this.matrkid = "";
		this.modulValue = "";
	}

	Connection dbConn;

	public void getArtikelFromDB() throws SQLException {
        this.artikelListe.clear();
		String sql = "SELECT * FROM artikel where modul ='" + this.modul + "'";

		System.out.println(sql);

		try {
			Statement stmt = dbConn.createStatement();
			ResultSet res = stmt.executeQuery(sql);

			while (res.next()) {

				System.out.println(res.getInt("ANR"));
				System.out.println(res.getString("ANAME"));
				System.out.println(res.getDouble("PREIS"));
				System.out.println(res.getString("AUTOR"));
				System.out.println(res.getString("MODUL"));

				Artikel art = new Artikel(res.getInt("ANR"), res.getString("ANAME"), res.getDouble("PREIS"),
						res.getString("AUTOR"), res.getString("MODUL"));
				this.artikelListe.add(art);

			}
		} catch (SQLException se) {

			System.out.println("B DB schreiben fehlgeschlagen, Mist!");
			System.out.println("SQLCode=" + se.getErrorCode());
			System.out.println("Error-Message=" + se.getMessage());

		}
	}

	public String getHTMLFromArtikel() {

		String alleArtikelHTML = "";

		if (button == false) {

			this.artikelListe.clear();
			
			return alleArtikelHTML;

		} else {

			for (Artikel art : artikelListe) {

				alleArtikelHTML += art.toKaestchen() + "<br />\n";
			}
			return alleArtikelHTML;

		}

	}
	// ------------------------------

	// ------------------------------
	Vector<Warenkorb> ausgewaehlteWarenkorbListe;

	public void getausgewaehlteArtikelFromDB(String[] warenkorbValues) throws SQLException {

		for (String string : warenkorbValues) {

			String sql = "SELECT * FROM artikel where anr ='" + string + "'";

			System.out.println(sql);

			try {
				Statement stmt = dbConn.createStatement();
				ResultSet res = stmt.executeQuery(sql);

				while (res.next()) {

					System.out.println(res.getInt("ANR"));
					System.out.println(res.getString("ANAME"));
					System.out.println(res.getDouble("PREIS"));
					System.out.println(res.getString("AUTOR"));
					System.out.println(res.getString("MODUL"));

					Warenkorb art = new Warenkorb(String.valueOf(res.getInt("ANR")), res.getString("ANAME"),
							res.getDouble("PREIS"), res.getString("MODUL"));

					this.ausgewaehlteWarenkorbListe.add(art);

					String sql2 = "insert into warenkorb" + this.matrkid
							+ "(wnr, aname, preis, modul) values (?,?,?,?)";
					System.out.println(sql2);

					PreparedStatement prep = dbConn.prepareStatement(sql2);

					prep.setString(1, String.valueOf(res.getInt("ANR")));

					prep.setString(2, res.getString("ANAME"));
					prep.setDouble(3, res.getDouble("PREIS"));
					prep.setString(4, res.getString("MODUL"));

					prep.executeUpdate();

				}
			} catch (SQLException se) {

				System.out.println("B DB schreiben fehlgeschlagen, Mist!");
				System.out.println("SQLCode=" + se.getErrorCode());
				System.out.println("Error-Message=" + se.getMessage());

			}

		}
	}

	public void createWarenkorbTable() throws SQLException {
		String sql = "create table Warenkorb" + this.matrkid + " (wnr character varying(255),"
				+ " aname character varying(255)," + " preis numeric," + "modul character varying(255))";

		System.out.println(sql);
		Statement myStat = dbConn.createStatement();
		myStat.executeUpdate(sql);
		System.out.println("Tabelle Notizen<matrikelnummer> angelegt");

	}

	double summe = 0.0;

	public String getHTMLFromAusgewaehlteWarenkorbProdukte() {

		// String alleArtikelHTML = "";
		String html = "";
		this.setSumme(0.0);

		for (Warenkorb art : ausgewaehlteWarenkorbListe) {

			// String html = "";

			html += "<tr><br/>";
			html += "<td><input type=\"text\" size=\"3\" value=\"1\"></td><br/>";
			html += "<td>" + art.aname + "</td><br/>";
			html += "<td>" + art.modul + "</td><br/>";
			html += "<td>" + art.preis + "</td><br/>";
			html += "<td>" + art.preis + "</td><br/>";
			html += "</tr>";

			// alleArtikelHTML += art.warenkorbEinführen() + "<br/>\n";

			this.summe += art.summeBerechnen();
			
		}
		return html;

	}
	public void deleteWarenkorb() throws SQLException{
		
		this.ausgewaehlteWarenkorbListe.clear();
		
		String sql = "DELETE FROM warenkorb"+this.matrkid;
		System.out.println(sql);
		Connection dbConn = new PostgreSQLAccess().getConnection();
		dbConn.createStatement().executeUpdate(sql);
	}

//	public void loescheWarenVektor(String xx) {
//		
//		this.ausgewaehlteWarenkorbListe.remove(xx);
//		
//		
//		
//	}

	// Artikel vom Warenkorb löschen

	public void deleteArtikelVonWarenkorb(int wnr) throws SQLException {
		String sql = "DELETE FROM warenkorb WHERE wnr = ?";
		System.out.println(sql);
		Connection dbConn = new PostgreSQLAccess().getConnection();
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setInt(1, wnr);
		prep.executeUpdate();

		this.ausgewaehlteWarenkorbListe.removeElementAt(wnr);

		// this.ausgewaehlteWarenkorbListe.clear();
	}

	public Vector<Warenkorb> getAusgewaehlteWarenkorbListe() {
		return ausgewaehlteWarenkorbListe;
	}

	public void setAusgewaehlteWarenkorbListe(Vector<Warenkorb> ausgewaehlteWarenkorbListe) {
		this.ausgewaehlteWarenkorbListe = ausgewaehlteWarenkorbListe;
	}

	public double getSumme() {
		return summe;
	}

	public void setSumme(double summe) {
		this.summe = summe;
	}

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getSkript() {
		return skript;
	}

	public void setSkript(String skript) {
		this.skript = skript;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getSprechstunde() {
		return sprechstunde;
	}

	public void setSprechstunde(String sprechstunde) {
		this.sprechstunde = sprechstunde;
	}

	public String getLehrgebiete() {
		return lehrgebiete;
	}

	public void setLehrgebiete(String lehrgebiete) {
		this.lehrgebiete = lehrgebiete;
	}

	public String getForschungsschwerpunkte() {
		return forschungsschwerpunkte;
	}

	public void setForschungsschwerpunkte(String forschungsschwerpunkte) {
		this.forschungsschwerpunkte = forschungsschwerpunkte;
	}

	public String getPublikationen() {
		return publikationen;
	}

	public void setPublikationen(String publikationen) {
		this.publikationen = publikationen;
	}

	public String getFunktion() {
		return funktion;
	}

	public void setFunktion(String funktion) {
		this.funktion = funktion;
	}

	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
	}

	public Vector<Artikel> getArtikelListe() {
		return artikelListe;
	}

	public void setArtikelListe(Vector<Artikel> artikelListe) {
		this.artikelListe = artikelListe;
	}

	public int getAnr() {
		return anr;
	}

	public void setAnr(int anr) {
		this.anr = anr;
	}

	// -----------------------------WARENKORB---------------------------------

	String wnr;
	String aname;
	double preis;
	String autor;

	public SkriptBean(String wnr, String aname, double preis, String autor, String modul) {
		super();
		this.wnr = wnr;
		this.aname = aname;
		this.preis = preis;
		this.autor = autor;
		this.modul = modul;
	}

//	public String warenkorbEinführen() {
//		String html = "";
//		
//
//		html += "<tr>";
//		html += "<td><input type=\"text\" size=\"3\" value=\"1\"></td>";
//		html += "<td>" + this.aname + "</td>";
//		html += "<td>" + this.modul + "</td>";
//		html += "<td>" + this.preis + "</td>";
//		html += "<td>" + this.preis + "</td>";
//		html += "		<td>" + 
//				"<a href='./WarenkorbAppl.jsp?action=kill&value=" + 
//							ausgewaehlteWarenkorbListe +
//						"'>kill</a>" +
//				"</td>\n";
//		
//		html += "</tr>";
//		
//		
//
//
//		return html;
//	}

	// Artikel vom Warenkorb löschen

	public void deleteArtikelVonWarenkorb(String wnr) throws SQLException {
		String sql = "DELETE FROM warenkorb WHERE wnr = ?";
		System.out.println(sql);
		Connection dbConn = new PostgreSQLAccess().getConnection();
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, wnr);
		prep.executeUpdate();
	}

	public double summeBerechnen() {
		double summe = 0.0;

		summe = this.preis;

		return summe;
	}

	public String getWnr() {
		return wnr;
	}

	public void setWnr(String wnr) {
		this.wnr = wnr;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getMatrkid() {
		return matrkid;
	}

	public void setMatrkid(String matrkid) {
		this.matrkid = matrkid;
	}

	public String getModulValue() {
		return modulValue;
	}

	public void setModulValue(String modulValue) {
		this.modulValue = modulValue;
	}

}
