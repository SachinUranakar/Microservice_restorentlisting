package com.sach.restolisting.dto;

public class Userinfodto {
	String username;
	String useraddress;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public Userinfodto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userinfodto(String username, String useraddress) {
		super();
		this.username = username;
		this.useraddress = useraddress;
	}
}
