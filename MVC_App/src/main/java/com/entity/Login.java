package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
@Id	
private  String email;
private String password;
private String typeofuser;

public String getTypeofuser() {
	return typeofuser;
}
public void setTypeofuser(String typeofuser) {
	this.typeofuser = typeofuser;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	
}
	


