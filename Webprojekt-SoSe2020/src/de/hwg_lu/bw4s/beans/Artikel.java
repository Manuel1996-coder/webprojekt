package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class Artikel {
	int anr;
	String aname;
	double preis;
	String autor;
	String modul;

	public Artikel() {

	}

	public Artikel(int anr, String aname, double preis, String autor, String modul) {
		super();
		this.anr = anr;
		this.aname = aname;
		this.preis = preis;
		this.autor = autor;
		this.modul = modul;
	}

	public String toKaestchen() {
		String html = "";
		html += "<div class='KastenMitte'>";
		html += "<table>";
		html += "<tr>";
		html += "<td>";
		html += "<img  src='../img/" + this.aname + ".jpg' width= '250' height= '300'/>";
		html += "</td>";
		html += "<td>";
		html += "<h4>" + this.aname + "<br> von " + this.autor + "</h4>";
		html += "<h4>EUR "+ this.preis + "</h4>";
		html += "<br><br>" + " <h4>Hier auswählen: <input type='checkbox' name='artikel' value=' </h4>" + "<h4>"
				+ this.anr + "<h4>'/>";
		html += "</td>";
		html += "<tr>";
		html += "</table>";
		html += "</div>";

		return html;
	}

	public String warenkorbEinführen() {
		String html = "";

		html += "<tr>";
		html += "<td><input type=\"text\" size=\"3\" value=\"1\"></td>";
		html += "<td>" + this.aname + "</td>";
		html += "<td>" + this.preis + "</td>";
		html += "<td>" + this.preis + "</td>";
		html += "</tr>";

		return html;
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
