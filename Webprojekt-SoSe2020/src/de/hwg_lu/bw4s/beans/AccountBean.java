package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.NoConnectionException;
import de.hwg_lu.bw.jdbc.PostgreSQLAccess;


public class AccountBean {

	String userid;
	String password;
	String active;
	String admin;
	String username;
	String email;
	
	Connection dbConn;
	
	public AccountBean() throws SQLException {
		super();
		this.userid   = "";
		this.password = "";
		this.active   = "Y";
		this.admin    = "N";
		this.username = "";
		this.email    = "";
		this.dbConn = new PostgreSQLAccess().getConnection();
	}

	public boolean insertIfNotExists() throws SQLException{
		// Account nur einfügen, wenn er noch nicht existiert
		// return true: insert hat geklappt, Account gab's noch nicht
		// return false: insert hat nicht geklappt, Account gab's schon
		this.prepareAttributesForDB();
		boolean gefunden = this.checkAccountExists();
		if (gefunden){
			System.out.println("Account " + this.userid + " existiert bereits");
			return false;
		}else{
			this.insertNoCheck();
			return true;
		}
//		if (!gefunden) this.insertNoCheck();
//		return (!gefunden);
	}

	public void prepareAttributesForDB(){
		if (this.userid.length() > 16) this.userid = this.userid.substring(0,16);
		if (this.password.length() > 32) this.password = this.password.substring(0,32);
		if (this.username.length() > 256) this.username = this.username.substring(0,256);
		if (this.email.length() > 256) this.email = this.email.substring(0,256);
		if (this.active.equalsIgnoreCase("ja")
				|| this.active.equalsIgnoreCase("yes")
				|| this.active.equalsIgnoreCase("j")
				|| this.active.equalsIgnoreCase("y")
			) this.active = "Y";
		if (this.admin.equalsIgnoreCase("ja")
				|| this.admin.equalsIgnoreCase("yes")
				|| this.admin.equalsIgnoreCase("j")
				|| this.admin.equalsIgnoreCase("y")
			) this.admin = "Y";
	}
	
	public boolean checkAccountExists() throws SQLException{
		// prüfen, ob der Account mit this.userid in der Tabelle account schon existiert
		// return true, wenn Account existiert
		// return false, wenn Account nicht existiert
		String sql = "SELECT FROM account where userid = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.userid);
		ResultSet dbRes = prep.executeQuery();
		return dbRes.next();
//		boolean gefunden = dbRes.next();
//		if (gefunden) return true;
//		else return false;
	}
	public boolean checkAccountExists2() throws SQLException{
		// prüfen, ob der Account mit this.userid in der Tabelle account schon existiert
		// return true, wenn Account existiert
		// return false, wenn Account nicht existiert
		String sql = "SELECT count(*) FROM account where userid = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.userid);
		ResultSet dbRes = prep.executeQuery();
		dbRes.next();
		int anzahl = dbRes.getInt(1);
		if (anzahl >= 1) return true;
		else return false;
	}
	public boolean checkAccountExists3() throws SQLException{
		// prüfen, ob der Account mit this.userid in der Tabelle account schon existiert
		// return true, wenn Account existiert
		// return false, wenn Account nicht existiert
		String sql = "SELECT * FROM account";
		System.out.println(sql);
		ResultSet dbRes = dbConn.createStatement().executeQuery(sql);
		// ResultSet zeilenweise durchsuchen, ob sie this.userid finden
		// Viel Spaß
		boolean gefunden = false;
		while(dbRes.next()){
			
			
			
			
			// trim() benutzen
		}
		return gefunden;
	}
	
	public void insertNoCheck() throws SQLException{
		// Datensatz in Tabelle account anlegen
		// mit den Daten aus den Attributen des Objekts
		String sql = "insert into account (userid, password, active, admin, username, email) "
					+ "values (?,?,?,?,?,?)";
		System.out.println(sql);
		
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.userid);
		prep.setString(2, this.password);
		prep.setString(3, this.active);
		prep.setString(4, this.admin);
		prep.setString(5, this.username);
		prep.setString(6, this.email);
		
		prep.executeUpdate();
		
		System.out.println("Account " + this.userid + " wurde erfolgreich angelegt");
	}
	
	
	
	
	
	
	
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
