package de.hwg_lu.bw4s.beans;


import java.sql.*;
import java.util.Iterator;
import java.util.Vector;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;




public class LiteraturBean {
	
	Vector<Artikel> artikelListe = new Vector<Artikel>();
	Connection dbConn;
	int bnr;

	public LiteraturBean() throws SQLException {
		super();
		this.dbConn = new PostgreSQLAccess().getConnection();
		this.getArtikelFromDB();
	}
	
	
	public Vector<Artikel> getArtikelListe() {
		return artikelListe;
	}

	public void setArtikelListe(Vector<Artikel> artikelListe) {
		this.artikelListe = artikelListe;
	}
	
	public void getArtikelFromDB() throws SQLException{
		
		String sql = "SELECT * FROM ARTIKEL";
		
		Statement stmt = dbConn.createStatement();
		ResultSet res = stmt.executeQuery(sql);
		
		while(res.next()){
			
//			System.out.println(res.getInt("ANR"));
//			System.out.println(res.getString("ANAME"));
//			System.out.println(res.getDouble("PREIS"));
			
			Artikel art = new Artikel(res.getInt("ANR"), res.getString("ANAME"), res.getDouble("PREIS"));
			this.artikelListe.add(art);
			
		}	
	}
	
//	public String getHTMLFromArtikel(){
//		
//		String alleArtikelHTML = "";
//		Iterator<Artikel> iter = this.artikelListe.iterator();
//		
//		while(iter.hasNext()){
//			
//			alleArtikelHTML += iter.next().toKaestchen()+"<br />";
//
//		}
//		return alleArtikelHTML;
//	}
	
	
	public String getHTMLFromArtikel(){
		
		String alleArtikelHTML = "";
	
		for (Artikel art : artikelListe){
			
			alleArtikelHTML += art.toKaestchen()+"<br />\n";
		}
		return alleArtikelHTML;
	}
	
	
	public boolean bestellungSpeichern(String kunde, String[] bestArt) {
		
		
		if (bestArt[0] == null) return false;
	
		try{
		String sql = "INSERT INTO BESTELLUNG "
				+ "(KUNDE) "
				+ "VALUES " + "(?)";
		
		System.out.println(sql);
		
		PreparedStatement prep = dbConn.prepareStatement(sql);
		
			prep.setString(1, kunde);
			prep.executeUpdate();
		
		String sql2 = "INSERT INTO BESTART (ANR, BNR) VALUES (?, IDENTITY_VAL_LOCAL())";
		
		System.out.println(sql2);
		
		PreparedStatement prep2 = dbConn.prepareStatement(sql2);
		
		for (String artNrString : bestArt) {
			int anr = Integer.parseInt(artNrString);
			prep2.setInt(1, anr);
			prep2.executeUpdate();
		}

		System.out.println("Kunde "+kunde+" wurde erfolgreich in die Datenbank geschrieben.");
		return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
