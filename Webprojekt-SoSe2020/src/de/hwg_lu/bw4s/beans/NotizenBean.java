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
		
		//this.getNotizDateienfromDB();
		
		this.matrkid = "";

	}

	public NotizenBean(String notiz, String matrkid) throws SQLException {
		super();
		this.notiz = notiz;
		this.matrkid = matrkid;
		this.getNotizDateienfromDB();
	}

	public void createNotizTable() throws SQLException {
		String sql = "create table notizen" + this.matrkid + " (matrkid VARCHAR(10)	NOT NULL PRIMARY KEY,"
				+ "notiz 	VARCHAR(2000) 	NOT NULL            )";

		System.out.println(sql);
		
		try {
		Statement myStat = dbConn.createStatement();
		myStat.executeUpdate(sql);
		
		} catch (SQLException se) {
			System.out.println("B DB schreiben fehlgeschlagen, Mist!");
			System.out.println("SQLCode=" + se.getErrorCode());
			System.out.println("Error-Message=" + se.getMessage());
				
	}
		System.out.println("Tabelle <matrikelnummer>Notizen angelegt");

		// ---------------------- insert --------------------

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
		
		this.getNotizDateienfromDB();

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
		String sql = "UPDATE notizen" + this.matrkid + " SET notiz= ? WHERE matrkid = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.notiz);
		prep.setString(2, this.matrkid);
		prep.executeUpdate();
		System.out.println("Update erfolgreich");

	}

	public void getNotizDateienfromDB() throws SQLException {

		String sql = "select * from notizen" + this.matrkid;

		System.out.println(sql);

		try {

			ResultSet dbResult = dbConn.createStatement().executeQuery(sql);
			while (dbResult.next()) {

				String matrkid = dbResult.getString("matrkid");
				String notiz = dbResult.getString("notiz");
				this.setNotiz(notiz);
				this.setMatrkid(matrkid);

			}
		} catch (SQLException se) {

			System.out.println("B DB schreiben fehlgeschlagen, Mist!");
			System.out.println("SQLCode=" + se.getErrorCode());
			System.out.println("Error-Message=" + se.getMessage());

		}

	}

//	public String getHTMLNotizen2() {
//
//		String html1 = "";
//
//		html1 += "<br><h3> Notizen von " + this.matrkid + "</h3>";
//		html1 += "<textarea rows='50' cols='90%' name='notiz' style='position:relative;'>";
//		html1 += this.notiz;
//		html1 += "</textarea>";
//
//		return html1;
//
//	}

	public String getHTMLNotizen() {

		String html = "";
		
		html += "<h3> Notizen von " + this.matrkid + "</h3><br>";

		html += "<h3>Hier kannst du deine eigenen Stichpunkte speichern. Nur du wirst Zugriff darauf haben, also mache dir keine Sorgen, deine Notizen werden nicht mit anderen geteilt. ;)</h3>";
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
