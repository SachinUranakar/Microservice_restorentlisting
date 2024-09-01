package com.sach.restolisting.dto;

import com.sach.restolisting.entity.Restorent;

public class Restouser {
Restorent resto;
Userinfodto user;
public Restouser(Restorent resto, Userinfodto user) {
	super();
	this.resto = resto;
	this.user = user;
}
public Restorent getResto() {
	return resto;
}
public void setResto(Restorent resto) {
	this.resto = resto;
}
public Userinfodto getUser() {
	return user;
}
public void setUser(Userinfodto user) {
	this.user = user;
}
public Restouser() {
	super();
	// TODO Auto-generated constructor stub
}
	
}
