package com.capgemini.beans;

public class LoginBean implements Cloneable{

	private String username;
	private String password;
	
	public LoginBean(){}
	
	public LoginBean(String u, String p) {
		username = u;
		password = p;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//LoginBean(String a, String B){}//optional
	
}
