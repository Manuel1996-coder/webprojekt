package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import de.hwg_lu.bw.jdbc.NoConnectionException;


import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class BewertungBean {
	
	String kommentar;
	String sterne;
	String matrikid;
	Connection dbConn;

	public BewertungBean() throws NoConnectionException {
		bewertungen = new Vector<Bewertung>();
		this.dbConn = new PostgreSQLAccess().getConnection();
		// TODO Auto-generated constructor stub
	}

	public BewertungBean(String kommentar, String matrikelnummer, String sterne) throws SQLException {
		super();
		this.kommentar = kommentar;
		this.sterne = sterne;
		this.matrikid = matrikelnummer;
		
		
	//	this.getTimelineDateien();
	}
	
	// Kommentar speichern

	public void insertKommentar() throws SQLException {

		String sql = "insert into bewertung (matrikid, sterne, kommentar) " + "values (?,?,?)";
		System.out.println(sql);
		try {
			
			PreparedStatement prep = dbConn.prepareStatement(sql);
			prep.setString(1, this.getMatrikid());
			prep.setString(2, this.getSterne());
			prep.setString(3, this.getKommentar());

			prep.executeUpdate();

		} catch (

		SQLException se) {

			System.out.println("B DB schreiben fehlgeschlagen, Mist!");
			System.out.println("SQLCode=" + se.getErrorCode());
			System.out.println("Error-Message=" + se.getMessage());

		}

		System.out.println("Kommentar erfolgreich gespeichert");

	}
	
  //	Kommentare ausgeben anzeigen
	
	Vector <Bewertung> bewertungen;
	
	public void delete() {
		
		this.bewertungen.clear();
		
	}

	
	
	public void getTimelineDateien() throws SQLException {

		System.out.println("servus");
		
		    
			String sql = "select * from bewertung";

			System.out.println(sql);

			try {
				
				
				ResultSet dbResult = dbConn.createStatement().executeQuery(sql);
				while (dbResult.next()){
					
					String matrikid   = dbResult.getString("matrikid");
					String sterne = dbResult.getString("sterne");
					String kommentar   = dbResult.getString("kommentar");
					

					Bewertung best = new Bewertung(matrikid, sterne, kommentar);
					
					this.bewertungen.add(best);

				}
			} catch (SQLException se) {

				System.out.println("B DB schreiben fehlgeschlagen, Mist!");
				System.out.println("SQLCode=" + se.getErrorCode());
				System.out.println("Error-Message=" + se.getMessage());

			}

		}

boolean flux = true;

     public String getHTMLTimeline() {

    	 String bewertungHTML = "";

	  for (Bewertung art : bewertungen) {

		  if(flux) {
			  this.flux = false;
			  //rechts
			  bewertungHTML += art.bewertung() + "<br/>\n";
				
			  
		  }else {
			  this.flux = true;
			  //links
		  bewertungHTML += art.bewertung2() + "<br/>\n";
		  }
		
		
		
	}
	return bewertungHTML;

}
	
	

	public String getKommentar() {
		return kommentar;
	}

	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public String getMatrikid() {
		return matrikid;
	}

	public void setMatrikid(String matrikid) {
		this.matrikid = matrikid;
	}

	public String getSterne() {
		return sterne;
	}

	public void setSterne(String sterne) {
		this.sterne = sterne;
	}

	public boolean isFlux() {
		return flux;
	}

	public void setFlux(boolean flux) {
		this.flux = flux;
	}
	
	

	

}
