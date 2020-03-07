package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.hwg_lu.bw.jdbc.NoConnectionException;
import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class NotizenBean {

	String notiz;
	Connection dbConn;
	String matrkid;
	
	

	public NotizenBean() throws SQLException {
		super();
		
		this.notiz = "";
		this.dbConn = new PostgreSQLAccess().getConnection();
		this.getNotizDateienfromDB();
		
		
	}

	public NotizenBean(String notiz, String matrkid) {
		super();
		this.notiz = notiz;
		this.matrkid = matrkid;
	}

	public void createNotizTable() throws SQLException {
		String sql = "create table notizen" + this.matrkid 
				+ " (matrkid VARCHAR(10)	NOT NULL PRIMARY KEY,"
				+ "notiz 	VARCHAR(2000) 	NOT NULL            )";

		System.out.println(sql);
		Statement myStat = dbConn.createStatement();
		myStat.executeUpdate(sql);
		System.out.println("Tabelle <matrikelnummer>Notizen angelegt");
		
		//---------------------- insert --------------------
		
		String sql1 = "insert into notizen" + this.matrkid + " (matrkid,notiz) " + "values (?,?)";
		System.out.println(sql);
		try {

			PreparedStatement prep = dbConn.prepareStatement(sql1);
			prep.setString(1, this.matrkid);
			prep.setString(2, " ");

			prep.executeUpdate();

		} catch (

		SQLException se) {

			System.out.println("B DB schreiben fehlgeschlagen, Mist!");
			System.out.println("SQLCode=" + se.getErrorCode());
			System.out.println("Error-Message=" + se.getMessage());

		}

		System.out.println("Notiz erfolgreich gespeichert");
		
		
	}

	public void insertNotiz() {

		String sql = "insert into notizen" + this.matrkid + " (matrkid,notiz) " + "values (?,?)";
		System.out.println(sql);
		try {

			PreparedStatement prep = dbConn.prepareStatement(sql);
			prep.setString(1, this.matrkid);
			prep.setString(2, this.notiz);

			prep.executeUpdate();

		} catch (

		SQLException se) {

			System.out.println("B DB schreiben fehlgeschlagen, Mist!");
			System.out.println("SQLCode=" + se.getErrorCode());
			System.out.println("Error-Message=" + se.getMessage());

		}

		System.out.println("Notiz erfolgreich gespeichert");
	}
	
	public void updateNotizen() throws SQLException {
		String sql = "UPDATE notizen"+ this.matrkid + " SET notiz= ? WHERE matrkid = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.notiz);
		prep.setString(2, this.matrkid);
		prep.executeUpdate();
		System.out.println("Update erfolgreich");

	}

	public void getNotizDateienfromDB() throws SQLException {

		

		String sql = "select * from " + this.matrkid + "notizen";

		System.out.println(sql);

		try {

			ResultSet dbResult = dbConn.createStatement().executeQuery(sql);
			while (dbResult.next()) {

				String matrikid = dbResult.getString("matrikid");
				String notiz = dbResult.getString("notiz");
				this.setNotiz(notiz);
				this.setMatrkid(matrikid);

				
			}
		} catch (SQLException se) {

			System.out.println("B DB schreiben fehlgeschlagen, Mist!");
			System.out.println("SQLCode=" + se.getErrorCode());
			System.out.println("Error-Message=" + se.getMessage());

		}

		

	}
	
	public String getHTMLNotizen() {
		
		String html = "";
		
		html += "<h1> Notizen von " + this.matrkid + "</h1><br>";
		
		html += "<textarea rows='40' cols='100' name='notiz'>";
		html += this.notiz;
		html += "</textarea><br>";
		
		return html;
		
	}

	public String getMatrkid() {
		return matrkid;
	}

	public void setMatrkid(String matrkid) {
		this.matrkid = matrkid;
	}

	public String getNotiz() {
		return notiz;
	}

	public void setNotiz(String notiz) {
		this.notiz = notiz;
	}

}
