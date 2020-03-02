package de.hwg_lu.bw4s.beans;

public class SkriptBean {

	String modul;
	String prof;
	String skript;
	String titel;
	String sprechstunde;
	String lehrgebiete;
	String forschungsschwerpunkte;
	String publikationen;
	

	public SkriptBean() {

	}

	

	public SkriptBean(String modul, String prof, String skript, String titel, String sprechstunde, String lehrgebiete,
			String forschungsschwerpunkte, String publikationen) {
		super();
		this.modul = modul;
		this.prof = prof;
		this.skript = skript;
		this.titel = titel;
		this.sprechstunde = sprechstunde;
		this.lehrgebiete = lehrgebiete;
		this.forschungsschwerpunkte = forschungsschwerpunkte;
		this.publikationen = publikationen;
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
			
			this.setProf("Prof. Ott");
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
   String html ="";
		switch (this.modul) {
		case "abwlbuch":

			html += "<h3>Diplom-Kaufmann</h3>\n";
			html +="<br/>\n";
			html +="<table>\n";
			html +="<tr>\n";
			html +="<td>Professur für Betriebswirtschaftslehre und Logistik\n";
			html +="<table>\n";
			html +="<tr>\n";
			html +="<td><i class=\"fas fa-home\"></i></td>\n";
			html +="<td>E36</td>\n";
			html +="</tr>\n";
			html +="<tr>\n";
			html +="<td><i class=\"fas fa-phone\"></i></td>\n";
			html +="<td>+49 (0) 621/5203-309</td>\n";
			
			html +="</tr>\n";
			html +="</table>\n";
			html +="</td>\n";
			html +="<td><img alt=\"Das Bild hochladen fehlgeschlagen\"\n" + 
					"				src=\"../img/Bongard.jpg\"></td>\n";
			html +="</tr>\n";
			html +="</table>\n";
			html +="<a href=\"mailto:stefan.bongard@hwg-lu.de\">stefan.bongard@hwg-lu.de</a>\n";
			
			
			this.setTitel(html);
			
			

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
	
	
	
	
	
	
	
	
	public void lehrgebiete() {
		   String html ="";
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
					
					this.setProf("Prof. Ott");
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
	
	
	public void sprechstunde() {
		   String html ="";
				switch (this.modul) {
				case "abwlbuch":

					html += "<h3>Sprechstunde</h3>\n";
					html += "<br /> Terminabsprache nach Vereinbarung per Mai\n";
					html += "<br />\n";
					html += "<a href=\"https://olat.vcrp.de/dmz/\">zu den Veranstaltungsunterlagen in OLAT </a>\n";
					
					
					this.setSprechstunde(html);
					
					

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
	
	
	
	
	public void forschungsschwerpunkte() {
		   String html ="";
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
					
					html += "";
					
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
	
	

	public void publikationen() {
		   String html ="";
				switch (this.modul) {
				case "abwlbuch":

					html += "<h3>Publikationen</h3>\n";
					html += "<br />\n";
					html += "<ul>\n";
					html += "<li>Elektromobilität im motorisierten Individualverkehr, Springer\n" + 
							"			Vieweg, 2014 (<a href=\"http://www.springer.com/978-3-658-02263-1\">http://www.springer.com/978-3-658-02263-1</a>)\n" + 
							"		</li>\n";
					html += "<li>Beer Game reloaded - Erfahrungsbericht und Spielvarianten der\n" + 
							"			Supply Chain Simulation \"Beer Game\" an der Hochschule für Wirtschaft\n" + 
							"			und Gesellschaft Ludwigshafen, in: BIBB-Forum für Planspiele und\n" + 
							"			Serious Games 2013 (<a href=\"www.bibb.de/planspielforum\">www.bibb.de/planspielforum</a>),\n" + 
							"			U. Blötz (Hrsg.): \"Planspiele und Serious Games in der beruflichen\n" + 
							"			Bildung\", (<a href=\"http://www.bibb.de/dokumente/pdf/3_31.pdf\">http://www.bibb.de/dokumente/pdf/3_31.pdf</a>)\n" + 
							"\n" + 
							"		</li>\n";
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
	
	
	
	

	
	
	
	

}
