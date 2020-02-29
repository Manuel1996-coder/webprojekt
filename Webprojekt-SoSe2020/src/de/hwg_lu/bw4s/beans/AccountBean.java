package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.NoConnectionException;
import de.hwg_lu.bw.jdbc.PostgreSQLAccess;


public class AccountBean {

	String matrkid;
	String password;
	String active;
	String admin;
	String username;
	String email;
	
	Connection dbConn;
	
	public AccountBean() throws SQLException {
		super();
		this.matrkid   = "";
		this.password = "";
		this.active   = "Y";
		this.admin    = "N";
		this.username = "";
		this.email    = "";
		this.dbConn = new PostgreSQLAccess().getConnection();
	}
	
	
	public boolean checkUseridPassword() throws SQLException{
		String sql = "SELECT matrkid FROM benutzer WHERE matrkid = ? AND password = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.matrkid);
		prep.setString(2, this.password);
		ResultSet dbRes = prep.executeQuery();
		return dbRes.next();
	}
	
	
	
	public void deletePasswort() throws SQLException {
		
		String sql="delete  from benutzer  where  password=?";
		System.out.println(sql);
		PreparedStatement prep= dbConn.prepareStatement(sql);
		prep.setString(1, this.password);
		prep.executeUpdate();
		System.out.println("password erfolgreich gelöscht");
	}
	
	public void insertNeuesPasswort() throws SQLException {
		
		
		
		String sql = "insert into benutzer ( password) "
				+ "values (?)";
	System.out.println(sql);
	
	PreparedStatement prep = dbConn.prepareStatement(sql);
	prep.setString(1, this.password);
	
	
	prep.executeUpdate();
	
	System.out.println("Das Passwort wurde erfolgreich ersetzt");
		
	}
	
	
	
	
	
	
	
	

	public boolean insertIfNotExists() throws SQLException{
		// Account nur einf�gen, wenn er noch nicht existiert
		// return true: insert hat geklappt, Account gab's noch nicht
		// return false: insert hat nicht geklappt, Account gab's schon
		this.prepareAttributesForDB();
		boolean gefunden = this.checkAccountExists();
		if (gefunden){
			System.out.println("Benutzer " + this.matrkid + " existiert bereits");
			return false;
		}else{
			this.insertNoCheck();
			return true;
		}
//		if (!gefunden) this.insertNoCheck();
//		return (!gefunden);
	}

	public void prepareAttributesForDB(){
		if (this.matrkid.length() > 16) this.matrkid = this.matrkid.substring(0,16);
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
		// pr�fen, ob der Account mit this.userid in der Tabelle account schon existiert
		// return true, wenn Account existiert
		// return false, wenn Account nicht existiert
		String sql = "SELECT FROM benutzer where matrkid = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.matrkid);
		ResultSet dbRes = prep.executeQuery();
		return dbRes.next();
//		boolean gefunden = dbRes.next();
//		if (gefunden) return true;
//		else return false;
	}
	public boolean checkAccountExists2() throws SQLException{
		// pr�fen, ob der Account mit this.userid in der Tabelle account schon existiert
		// return true, wenn Account existiert
		// return false, wenn Account nicht existiert
		String sql = "SELECT count(*) FROM benutzer where matrkid = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.matrkid);
		ResultSet dbRes = prep.executeQuery();
		dbRes.next();
		int anzahl = dbRes.getInt(1);
		if (anzahl >= 1) return true;
		else return false;
	}
	public boolean checkAccountExists3() throws SQLException{
		// pr�fen, ob der Account mit this.userid in der Tabelle account schon existiert
		// return true, wenn Account existiert
		// return false, wenn Account nicht existiert
		String sql = "SELECT * FROM benutzer";
		System.out.println(sql);
		ResultSet dbRes = dbConn.createStatement().executeQuery(sql);
		// ResultSet zeilenweise durchsuchen, ob sie this.userid finden
		// Viel Spa�
		boolean gefunden = false;
		while(dbRes.next()){
			
			
			
			
			// trim() benutzen
		}
		return gefunden;
	}
	
	public void insertNoCheck() throws SQLException{
		// Datensatz in Tabelle account anlegen
		// mit den Daten aus den Attributen des Objekts
		String sql = "insert into benutzer (matrkid, password, active, admin, username, email) "
					+ "values (?,?,?,?,?,?)";
		System.out.println(sql);
		
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.matrkid);
		prep.setString(2, this.password);
		prep.setString(3, this.active);
		prep.setString(4, this.admin);
		prep.setString(5, this.username);
		prep.setString(6, this.email);
		
		prep.executeUpdate();
		
		System.out.println("Account " + this.matrkid + " wurde erfolgreich angelegt");
	}
	
	
	
	
	
	
	
	
	
	
	public String getMatrkid() {
		return matrkid;
	}

	public void setMatrkid(String matrkid) {
		this.matrkid = matrkid;
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
