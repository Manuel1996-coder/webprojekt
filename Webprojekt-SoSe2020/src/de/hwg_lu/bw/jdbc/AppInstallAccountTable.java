package de.hwg_lu.bw.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppInstallAccountTable {

	public Connection dbConn = null;
	
	public static void main(String[] args) throws NoConnectionException, SQLException{
		AppInstallAccountTable myApp = new AppInstallAccountTable();
		myApp.dbConn = new PostgreSQLAccess().getConnection(); 
		myApp.installAccountTable();
	}
	
	public void installAccountTable() throws SQLException{
		System.out.println("installAccountTable() gestartet");
//		this.dropAccountTable();		
		this.createAccountTable();
		this.insertFirstUser();
     	this.insertSecondUser();
		this.insertMoreUsers();
		this.insertMoreUsersKonventionell();
		this.showAccountData();
	}
	
	public void dropAccountTable() throws SQLException {
		String sql = "drop table benutzer";
		System.out.println(sql);
	//		dbConn.createStatement().executeUpdate(sql);
			Statement myStat = dbConn.createStatement();
			myStat.executeUpdate(sql);
			System.out.println("Tabelle benutzer gedroppt");
	}

	public void createAccountTable() throws SQLException{
		String sql = "create table benutzer                 (" +
				"matrkid   	VARCHAR(10)	NOT NULL PRIMARY KEY," +
				"password 	CHAR(32) 	NOT NULL            ," +
				"active   	CHAR(1)  	NOT NULL DEFAULT 'Y'," +
				"admin    	CHAR(1)  	NOT NULL DEFAULT 'N'," +
				"username 	VARCHAR(256)                 ," +
				"email    	VARCHAR(256)                 )";
		System.out.println(sql);
		Statement myStat = dbConn.createStatement();
		myStat.executeUpdate(sql);
		System.out.println("Tabelle benutzer angelegt");
	}
	

	public void insertFirstUser() throws SQLException{
		String sql = "INSERT INTO benutzer " +
			"(MATRKID, PASSWORD, ACTIVE, ADMIN, USERNAME, EMAIL) " +
			"VALUES " +
			"('testuser1', 'geheim', 'Y', 'N', 'Testuser 1', 'testus1@test.de')";
		System.out.println(sql);
		Statement myStat = dbConn.createStatement();
		myStat.executeUpdate(sql);
		System.out.println("Testuser1 eingef�gt");
	}

	public void insertSecondUser() throws SQLException{
		String sql = "INSERT INTO benutzer " +
			"(MATRKID, PASSWORD, ACTIVE, ADMIN, USERNAME, EMAIL) " +
			"VALUES (?, ?, ?, ?, ?, ?)";
		System.out.println(sql);
		PreparedStatement myStat = dbConn.prepareStatement(sql);
		myStat.setString(1, "testuser2");
		myStat.setString(2, "geheim");
		myStat.setString(3, "Y");
		myStat.setString(4, "N");
		myStat.setString(5, "Testuser 2");
		myStat.setString(6, "testus2@test.de");
		myStat.executeUpdate();
		System.out.println("Testuser2 eingef�gt");
	}

	public void insertMoreUsers() throws SQLException{
		String sql = "INSERT INTO benutzer " +
			"(MATRKID, PASSWORD, ACTIVE, ADMIN, USERNAME, EMAIL) " +
			"VALUES (?, ?, ?, ?, ?, ?)";
		System.out.println(sql);
		PreparedStatement myStat = dbConn.prepareStatement(sql);
		myStat.setString(1, "testuser3");
		myStat.setString(2, "geheim");
		myStat.setString(3, "Y");
		myStat.setString(4, "N");
		myStat.setString(5, "Testuser 3");
		myStat.setString(6, "testus3@test.de");
		myStat.executeUpdate();
		System.out.println("Testuser eingef�gt");
		myStat.setString(1, "testuser4");
		myStat.setString(2, "geheim");
		myStat.setString(3, "Y");
		myStat.setString(4, "N");
		myStat.setString(5, "Testuser 4");
		myStat.setString(6, "testus4@test.de");
		myStat.executeUpdate();
		System.out.println("Testuser eingef�gt");
	}

	public void insertMoreUsersKonventionell() throws SQLException{
		String sql = "INSERT INTO benutzer " +
			"(MATRKID, PASSWORD, ACTIVE, ADMIN, USERNAME, EMAIL) " +
			"VALUES " +
			"('testuser5', 'geheim', 'Y', 'N', 'Testuser 5', 'testus5@test.de')," +
			"('testuser6', 'geheim', 'Y', 'N', 'Testuser 6', 'testus6@test.de')";
		System.out.println(sql);
		Statement myStat = dbConn.createStatement();
		myStat.executeUpdate(sql);
		System.out.println("Testuser 5-6 eingef�gt");
	}
	public void showAccountData() throws SQLException{
		String sql = "SELECT MATRKID, PASSWORD, ACTIVE, ADMIN, USERNAME, EMAIL " +
			"FROM benutzer ";
		System.out.println(sql);
		ResultSet dbRes = dbConn.createStatement().executeQuery(sql);
		while (dbRes.next()){
			String matrkid   = dbRes.getString("MATRKID");
			String password = dbRes.getString("PASSWORD");
			String active   = dbRes.getString("ACTIVE");
			String admin    = dbRes.getString("ADMIN");
			String username = dbRes.getString("USERNAME");
			String email    = dbRes.getString("EMAIL");
			String outString = matrkid + ", ";
			outString += password + ", ";
			outString += active + ", ";
			outString += admin + ", ";
			outString += username + ", ";
			outString += email;
			System.out.println(outString);
		}
	}

}