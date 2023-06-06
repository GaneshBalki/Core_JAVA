package com.demo.beans;

public class Employee {
   private int id;
   private String name;
   private String desg;
   private int sal;
	public Employee() {
		super();
		this.id=0;
		this.name=null;
		this.desg=null;
		this.sal=0;
	}
	public Employee(int id,String name,String desg,int sal) {
		super();
		this.id=id;
		this.name=name;
		this.desg=desg;
		this.sal=sal;
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
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "ID = " + id + "\nname = " + name + "\ndesg = " + desg + "\nsal = " + sal ;
	}
	

}
