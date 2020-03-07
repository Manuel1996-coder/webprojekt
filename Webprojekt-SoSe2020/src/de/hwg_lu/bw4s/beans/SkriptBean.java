package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class SkriptBean {

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
			String forschungsschwerpunkte, String publikationen, String beruflicher, String funktion, double summe, int anr) {
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

	}

	public void Professor() {

		switch (this.modul) {
		case "abwlbuch":

			this.setProf("Prof. Dr. rer. pol. Stefan Bongard");
			this.setSkript("../Skript/bwlSkript.pdf#toolbar=0");

			break;
		case "wm":
			this.setProf("Prof. Dr. Wirtschaftsmathe");
			this.setSkript("./Skript/bwlSkript.pdf");

			break;
		case "sk":

			this.setProf("Dieter Ott");
			this.setSkript("../Skript/bwlSkript.pdf");
			break;
		case "wi":
			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;
		case "prog1":
			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/selchert.pdf");

			break;
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
			this.setProf("Prof. Dr. Wirtschaftsmathe");
			this.setSkript("../Skript/bwlSkript.pdf");

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

			this.setProf("Dieter Ott");
			this.setSkript("../Skript/bwlSkript.pdf");
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

			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/bwlSkript.pdf");

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

			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/selchert.pdf");

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
			this.setProf("Prof. Dr. Wirtschaftsmathe");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;
		case "sk":
			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Soft Skills</li>\n";
			html += "<li>Wirtschaftsethik und Interkulturelle Kompetenz</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			this.setProf("Dieter Ott");
			this.setSkript("../Skript/bwlSkript.pdf");
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

			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;
		case "prog1":

			html += "<h3>Lehrgebiete</h3>\n";
			html += "<br/>\n";
			html += "<ul>\n";
			html += "<li>Programmierung </li>\n";
			html += "<li>Business Intelligence</li>\n";
			html += "</ul>\n";
			this.setLehrgebiete(html);

			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/selchert.pdf");

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
			this.setProf("Prof. Dr. Wirtschaftsmathe");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;
		case "sk":

			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Terminabsprache per Mail\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";

			this.setSprechstunde(html);

			this.setProf("Prof. Ott");
			this.setSkript("../Skript/bwlSkript.pdf");
			break;
		case "wi":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> nach telefonischer Vereinbarung\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";

			this.setSprechstunde(html);

			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;
		case "prog1":
			html += "<h3>Sprechstunde</h3>\n";
			html += "<br /> Mittwochs 13:30 bis 14:30 Uhr\n";
			html += "<br /> Terminabsprache nach Vereinbarung per Mai\n";
			html += "<br />\n";
			html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
			html += "<a href=\"https://www.hwg-lu.de/fileadmin/user_upload/fachbereiche/fachbereich-3/Downloads/Dokumente/Wissenschaftliches_Arbeiten/3_WissenswertesAbschlussFreyburger.pdf\">Wissenswertes für Abschlussarbeiten</a>\n";
			this.setSprechstunde(html);
			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/selchert.pdf");

			break;
		default:
			System.out.println("fehler");
		}

	}

	public void forschungsschwerpunkte() {
		String html = "";
		html += "<h3>Forschungsschwerpunkte</h3>\n";
		html += "<br />\n";
		html += "<ul>\n";
		switch (this.modul) {
		case "abwlbuch":

			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
		case "wm":

			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			break;
		case "sk":

			break;
		case "wi":
			html += "<li>IT-Servicemanagement</li>\n";
			html += "<li>Software Engineering</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;
		case "prog1":

			html += "<li>Business Intelligence mit SAP, Microsoft und Open Source</li>\n";
			html += "<li>IT-Unterstützung der Unternehmensplanung</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/selchert.pdf");

			break;
		default:
			System.out.println("fehler");
		}

	}

	public void Funktion() {
		String html = "";
		html += "<h3>Funktionen an der Hochschule</h3>\n";
		html += "<br />\n";
		html += "<ul>\n";

		switch (this.modul) {
		case "abwlbuch":

			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
		case "wm":

			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			break;
		case "sk":

			break;
		case "wi":
			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;

		case "prog1":

			html += "<li>Mitglied des Fachbereichsrates</li>\n";

			html += "</ul>\n";

			this.setFunktion(html);

			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/selchert.pdf");

			break;
		default:
			System.out.println("fehler");
		}

	}

	public void Beruflicher() {
		String html = "";
		html += "<h3>Beruflicher Werdegang</h3>\n";

		switch (this.modul) {

		case "abwlbuch":

			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			this.setForschungsschwerpunkte(html);

			break;
		case "wm":

			html += "<li>Elektromobilität</li>\n";
			html += "<li>System Dynamics</li>\n";
			html += "</ul>\n";

			break;
		case "sk":

			html += "";

			break;
		case "wi":

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

			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;
		case "prog1":

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

			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/selchert.pdf");

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
			this.setProf("Prof. Dr. Wirtschaftsmathe");
			this.setSkript("../Skript/bwlSkript.pdf");

			break;
		case "sk":

			this.setProf("Prof. Ott");
			this.setSkript("../Skript/bwlSkript.pdf");
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

			this.setProf("Prof. Dr. Dorrhauer");
			this.setSkript("../Skript/bwlSkript.pdf");

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

			this.setProf("Prof. Dr. rer. nat. Klaus Freyburger");
			this.setSkript("../Skript/selchert.pdf");

			break;
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
		this.getArtikelFromDB();
		this.summe = 0.0;
	}

	Connection dbConn;

	public void getArtikelFromDB() throws SQLException {

		

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

					
					
					Warenkorb art = new Warenkorb(String.valueOf(res.getInt("ANR")), res.getString("ANAME"), res.getDouble("PREIS"),
							 res.getString("MODUL"));
					
					this.ausgewaehlteWarenkorbListe.add(art);

					String sql2 = "insert into warenkorb (wnr, aname, preis, modul) values (?,?,?,?)";
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
	double summe = 0.0;

	public String getHTMLFromAusgewaehlteWarenkorbProdukte() {

		//String alleArtikelHTML = "";
		String html = "";
		this.setSumme(0.0);

		for (Warenkorb art : ausgewaehlteWarenkorbListe) {
			
		//	String html = "";
			

			html += "<tr><br/>";
			html += "<td><input type=\"text\" size=\"3\" value=\"1\"></td><br/>";
			html += "<td>" + art.aname + "</td><br/>";
			html += "<td>" + art.modul + "</td><br/>";
			html += "<td>" + art.preis + "</td><br/>";
			html += "<td>" + art.preis + "</td><br/>";
			html += "		<td>" + 
					"<a href='./WarenkorbAppl.jsp?action=kill&value=" + 
								art.wnr +
							"'>kill</a><br/>" +
					"</td>\n<br/>";
			
			html += "</tr>";

			 
			
		//	alleArtikelHTML += art.warenkorbEinführen() + "<br/>\n";
			
			this.summe += art.summeBerechnen();
			
		}
		return html;

	}
	
//	public void loescheWarenVektor(String xx) {
//		
//		this.ausgewaehlteWarenkorbListe.remove(xx);
//		
//		
//		
//	}
	
	
	// Artikel vom Warenkorb löschen
	
			public void deleteArtikelVonWarenkorb(int wnr) throws SQLException{
				String sql = "DELETE FROM warenkorb WHERE wnr = ?";
				System.out.println(sql);
				Connection dbConn = new PostgreSQLAccess().getConnection();
				PreparedStatement prep = dbConn.prepareStatement(sql);
				prep.setInt(1, wnr);
				prep.executeUpdate();
				
				
				this.ausgewaehlteWarenkorbListe.removeElementAt(wnr);
				
				
				//this.ausgewaehlteWarenkorbListe.clear();
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
	
	
	//-----------------------------WARENKORB---------------------------------
	
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
	
		public void deleteArtikelVonWarenkorb(String wnr) throws SQLException{
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

	
	
	

}
