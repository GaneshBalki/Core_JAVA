package com.demo.bean;

import java.util.Objects;

public class Student implements Comparable {
	private int sid;
	private String sname;
	private String deptName;
	private int rank;

	public Student() {

		this.sid = 0;
		this.sname = null;
		this.rank = 0;
		this.deptName = null;
	}

	public Student(int id,String sname, String deptName, int rank) {
		this.sid = id;
		this.sname = sname;
		this.rank = rank;
		this.deptName = deptName;
	
	}

	/*
	 * private String generateId(String deptName) {
	 * 
	 * return deptName.substring(0,3).toUpperCase()+"-"; }
	 */
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public int hashCode() {
		return sid;
	}

	@Override
	public boolean equals(Object obj) {
		return sid == ((Student)obj).sid;
	}
	@Override
	public int compareTo(Object o) {
		
		return this.rank-((Student)o).rank;
	}

	@Override
	public String toString() {
		return "Student [ ID = " + sid + ", Name=" + sname + ", DeptName=" + deptName + ", Rank=" + rank + "]";
	}

	
}
