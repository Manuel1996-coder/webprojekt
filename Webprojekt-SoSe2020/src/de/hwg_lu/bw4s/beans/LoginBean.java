package de.hwg_lu.bw4s.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class LoginBean {
	
	String userid;
	String password;
	boolean isLoggedIn;
	Connection dbConn;
	
	public LoginBean() throws SQLException {
		this.userid = "";
		this.password = "";
		this.isLoggedIn = false;
		this.dbConn = new PostgreSQLAccess().getConnection();
	}
	
	public boolean checkUseridPassword() throws SQLException{
		String sql = "SELECT userid FROM account WHERE userid = ? AND password = ?";
		System.out.println(sql);
		PreparedStatement prep = dbConn.prepareStatement(sql);
		prep.setString(1, this.userid);
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
}
