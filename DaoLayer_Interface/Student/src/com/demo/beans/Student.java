package com.demo.beans;

public class Student {
    private String id;
    private static int count;
    private String name;
    
	public Student() {
		count++;
	this.id=null;
	this.name=null;
	
	
	}
	public Student(String name) {
		count++;
		this.id="STD"+name.substring(0,2).toUpperCase()+"-"+count;
		this.name=name;
		}
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student ID : " + id + ", Name : " + name;
	}
	

}
