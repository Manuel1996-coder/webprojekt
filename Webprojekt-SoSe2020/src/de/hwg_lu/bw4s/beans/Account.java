package de.hwg_lu.bw4s.beans;

public class Account {
	
	String matrkid;
	String password;
	String active;
	String admin;
	String username;
	String email;
// Klasse Account ist keine Bean
	public Account( String username, String email) {
		super();
		
		
		this.username = username;
		this.email = email;
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
