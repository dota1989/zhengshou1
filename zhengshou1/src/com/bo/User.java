package com.bo;

public class User {
	
	private String username;
	
	private String password;
	
	private String credentialsSalt;
	
	private long locked;
	
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
	public String getCredentialsSalt() {
		return credentialsSalt;
	}
	public void setCredentialsSalt(String credentialsSalt) {
		this.credentialsSalt = credentialsSalt;
	}
	public long getLocked() {
		return locked;
	}
	public void setLocked(long locked) {
		this.locked = locked;
	}
}
