package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	
public class Student {
@Id
	
private int sid;
	
 private String name;
	
 private int age;
 private int scid;
 
public int getScid() {
	return scid;
}
public void setScid(int scid) {
	this.scid = scid;
}
public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}
	 

	}
