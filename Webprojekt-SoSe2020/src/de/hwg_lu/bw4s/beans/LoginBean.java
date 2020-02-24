package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class LoginBean {
	
	String matrkid;
	String password;
	boolean isLoggedIn;
	Connection dbConn;
	
	public LoginBean() throws SQLException {
		this.matrkid = "";
		this.password = "";
		this.isLoggedIn = false;
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
	}
}
