package com.demo.beans;

import java.io.Serializable;

public class Employee implements Comparable<Employee>,Serializable{
	private String empName;
	private int empID;
	String empRole;

	public Employee() {
		super();
	}

	public Employee(String empName, int empID) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empRole = "Developer";
	}

	public Employee(String empName, int empID, String empRole) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empRole = empRole;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", empRole=" + empRole + "]";
	}

	@Override
	public int compareTo(Employee o) {
		 if(this.empID==o.empID)
				   return 0;
		else if(this.empID<o.empID)
				   return -1;
		else
				   return 1;
		
	}

}
