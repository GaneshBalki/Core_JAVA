package com.demo.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
 
	private static Set<Employee> empSet;
	static {
		empSet=new HashSet<>();
		empSet.add(new Employee(1,"VIRAT","Cricketer",122145));
	}
	@Override
	public boolean addEmployee() {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Emplyee ID ");
	int id=sc.nextInt();
	System.out.println("Enter Employee Name ");
	String name=sc.next();
	System.out.println("Enter Job of Employee");
	String job=sc.next();
	System.out.println("Enter Salary ");
	double sal=sc.nextDouble();
	Employee e = new Employee(id,name,job,sal);
	if(empSet.add(e)) {
		return true;
	}
	else
		return false;
		
	}
	@Override
	public Set<Employee> displayAll() {
	
		return empSet;
	}
	@Override
	public List<Employee> empByName(String name) {
		List<Employee> nameList=new ArrayList<>();
		for(Employee ob:empSet) {
			if(ob.getName().equals(name))
				nameList.add(ob);
		}
		if(nameList!=null)
		   return nameList;
		else
			return null;
	}
	@Override
	public boolean removeEmp(int id) {
		for(Employee ob:empSet) {
			if(ob.getId()==id) {
				empSet.remove(new Employee(id));
				return true;
			}
				
		}
		return false;
	}
	
	
}
