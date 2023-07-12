package com.demo.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;


public class EmployeeDaoImpl implements EmployeeDao {
	//this elist will be like database for employee  
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>();
	}
	
	//this method will save new employee
	@Override
	public boolean addNewEmp(Employee e) {
		
		return elist.add(e);
	}
	
	//this method will send all emp (list of emp) to callimg method
	@Override
	public List<Employee> getAllEmp() {
		
		return elist;
	}
	
	
	//this method will generate a new list where employee added in sorted manner on the basis of employeeId
	@Override
	public List<Employee> sortByID() {
		List<Employee> elistByID=new ArrayList<>();
		for(Employee e:elist) {
			elistByID.add(e);
		}
		elistByID.sort(null);
		
		return elistByID;
	
	}
	
	
	//this method will create a new list of employee when a certain name is provided to this method
	// we are returning a list because there may be many employee with same name
	@Override
	public List<Employee> getEmpByName(String empName) {
		List<Employee> empByName=new ArrayList<>();
		boolean flag=false;
		for(Employee e:elist) {
			if(e.getEmpName().equalsIgnoreCase(empName)) {
				empByName.add(e);
				flag=true;
			}
		}
		if(flag)
			return empByName;
		else
		    return null;
	}
	
	//this method will remove all employee from list as option selected by user
	@Override
	public boolean removeEmpList() {
		if(elist!=null) {
			 elist=null;
		     return true;
		}
	    return false; 
	}
	
	
	//this method will store all employee data into a text fle name as 'EmployeeRecord'
	
	@Override
	public boolean writeFile() {
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("EmployeeRecord.txt"))){
			for(Employee ob:elist) {
				oos.writeObject(ob);
			}
			return true;
		}catch(IOException e){
			System.out.println("Error...");
			e.printStackTrace();
			return false;
		}
		
		
	}

}
