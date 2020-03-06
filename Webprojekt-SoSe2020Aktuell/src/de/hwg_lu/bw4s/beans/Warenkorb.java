package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class Warenkorb {

	int anr;
	String aname;
	double preis;
	String autor;
	String modul;

	public Warenkorb() {

	}

	public Warenkorb(int anr, String aname, double preis, String autor, String modul) {
		super();
		this.anr = anr;
		this.aname = aname;
		this.preis = preis;
		this.autor = autor;
		this.modul = modul;
	}

	public String warenkorbEinführen() {
		String html = "";
		

		html += "<tr>";
		html += "<td><input type=\"text\" size=\"3\" value=\"1\"></td>";
		html += "<td>" + this.aname + "</td>";
		html += "<td>" + this.modul + "</td>";
		html += "<td>" + this.preis + "</td>";
		html += "<td>" + this.preis + "</td>";
		html += "		<td>" + 
				"<a href='./WarenkorbAppl.jsp?action=kill&value=" + 
							this.anr +
						"'>Löschen</a>" +
				"</td>\n";
		
		html += "</tr>";
		
		


		return html;
	}
	
	// Artikel vom Warenkorb löschen
	
		public void deleteArtikelVonWarenkorb(String anr) throws SQLException{
			String sql = "DELETE FROM warenkorb WHERE wnr = ?";
			System.out.println(sql);
			Connection dbConn = new PostgreSQLAccess().getConnection();
			PreparedStatement prep = dbConn.prepareStatement(sql);
			prep.setString(1, anr);
			prep.executeUpdate();
		}
	
	public double summeBerechnen() {
		double summe =0.0;
		
		
		
		summe = this.preis;
	   
		
		
		return summe;
	}

	public int getAnr() {
		return anr;
	}

	public void setAnr(int anr) {
		this.anr = anr;
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

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}

}
