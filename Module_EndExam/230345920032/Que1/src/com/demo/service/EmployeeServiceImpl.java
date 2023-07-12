package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao empDao=new EmployeeDaoImpl();
	
	//this method will get all details need to created employee object 
	// and transfer the object to dao_layer for storing purpose
	@Override
	public boolean addNewEmp() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		String empName = sc.next();
		System.out.println("Enter empId :");
		int empID=sc.nextInt();
		System.out.println("Default Role Is Developer,Want to add the Role of Emp ? [Y/N] : ");
		String choice=sc.next();
		
		//here we have created a new system as question asked to create to overloaded constructor 
		//in one role can be default and in another given by user
		//so here given a choice to user where he can select whether he wants to add a role or not 
		//choice will in form of y or n
		//according to choice object created
		boolean empRoleChoice=false;
		if(choice.equalsIgnoreCase("y")) {
			empRoleChoice=true;
		}
		if(empRoleChoice) {
			System.out.println("Enter Employee Role : ");
			String empRole=sc.next();
			Employee e=new Employee(empName,empID,empRole);
			return empDao.addNewEmp(e);
		}
		else {
			Employee e=new Employee(empName,empID);
			return empDao.addNewEmp(e);
		}
		
		
	}
	@Override
	public List<Employee> showAllEmp() {
		
		return empDao.getAllEmp();
	}
	@Override
	public List<Employee> sortEmpbyId() {
		
		return empDao.sortByID();
	}
	@Override
	public List<Employee> showEmpByName(String empName) {
		
		return empDao.getEmpByName(empName);
	}
	@Override
	public boolean removeEmpList() {
		
		return empDao.removeEmpList();
	}
	@Override
	public boolean saveAllEmpTOFile() {
		
		return empDao.writeFile();
	}

}
