package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class LoginBean {
	
	String matrkid;
	String password;
	String aktupassword;
	String username;
	String email;
	String neuesPassword;
	boolean isLoggedIn;
	Connection dbConn;
	
	Vector<Account> allAccounts;
	
	public LoginBean() throws SQLException {
		this.matrkid = "";
		this.password = "";
		this.username = "";
		this.email    = "";
		this.aktupassword = "";
		this.neuesPassword = "";
		this.isLoggedIn = false;
		
		this.dbConn = new PostgreSQLAccess().getConnection();
		//this.readAllAccountsFromDB(this.getMatrkid(),this.getPassword());
		
		
		
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
	
	
	
	
	
	
	// überprüfen ob die Passworter übereinstimmen
	
	
	
	public boolean checkPassword() throws SQLException{
		String sql = "SELECT password FROM benutzer where password = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.aktupassword);
		ResultSet dbRes = prep.executeQuery();
		return dbRes.next();
	}
	
	//  Passworter updaten
	
	public void updatePassword() throws SQLException{
		String sql = "UPDATE benutzer SET password = ? WHERE matrkid = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.neuesPassword);
		prep.setString(2, this.matrkid);
		prep.executeUpdate();
		System.out.println("Update erfolgreich");
		
	}
	// Account loeschen
	
	public void deleteAccount() throws SQLException{
		String sql = "DELETE FROM benutzer WHERE matrkid = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, "628761");
		prep.executeUpdate();
		System.out.println("Delete Account erfolgreich");
	}
	
	
	
public void insertNeuesPasswort() throws SQLException {
		
		
		
		String sql = "insert into benutzer (password) "
				+ "values (?)";
	System.out.println(sql);
	
	PreparedStatement prep = dbConn.prepareStatement(sql);
	prep.setString(1, this.neuesPassword);
	
	
	prep.executeUpdate();
	
	System.out.println("Das Passwort wurde erfolgreich ersetzt");
		
	}
	
	
	
	

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
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
	}public String getUsername() {
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

	public String getAktupassword() {
		return aktupassword;
	}

	public void setAktupassword(String aktupassword) {
		this.aktupassword = aktupassword;
	}

	public String getNeuesPassword() {
		return neuesPassword;
	}

	public void setNeuesPassword(String neuesPassword) {
		this.neuesPassword = neuesPassword;
	}
	
	
	
	
	
}
