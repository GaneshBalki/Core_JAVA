package com.demo.beans;

import java.util.Objects;

public class Employee {
  private int id;
  private String name;
  private String job;
  private double salary;
public Employee(int id, String name, String job, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.job = job;
	this.salary = salary;
}
  public Employee() {
	  this.id=0;
	  this.job=null;
	  this.name=null;
	  this.salary=0;
  }
public Employee(int id2) {
	 this.id=id2;
	  this.job=null;
	  this.name=null;
	  this.salary=0;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", salary=" + salary + "]";
}
@Override
public int hashCode() {
	return this.id;
}
@Override
public boolean equals(Object obj) {
	
	return this.id == ((Employee)obj).id;
}
  
}
