package com.demo.service;

import java.util.*;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImp;
public class EmployeeServiceImp implements EmployeeService {
  private EmployeeDao empDao;
	public EmployeeServiceImp() {
		super();
		this.empDao=new EmployeeDaoImp();
	}

	@Override
	public void addNewEmployee() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Emp ID : ");
		 int id = sc.nextInt();
		 System.out.println("Enter Emp Name");
		 String nm = sc.next();
		 System.out.println("Enter Desg : ");
		 String desg = sc.next();
		 System.out.println("Enter Salary : ");
		 int sal = sc.nextInt();
		 Employee e = new Employee(id,nm,desg,sal);
		 empDao.save(e);
		
	}

	@Override
	public List<Employee> displayAll() {
		
		return empDao.getAllEmployee();
	}

}
