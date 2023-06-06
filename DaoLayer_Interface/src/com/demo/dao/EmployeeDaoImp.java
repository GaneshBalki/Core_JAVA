package com.demo.dao;


import java.util.ArrayList;
import java.util.List;
import com.demo.beans.Employee;

public class EmployeeDaoImp implements EmployeeDao {
	//declared a List of type Type Employee
  private static List<Employee> empList;
  static {
	  //Initialised it with ArrayList
	  empList = new ArrayList<>();
  }
	public EmployeeDaoImp() {
		
	}

	@Override
	public void save(Employee e) {
	empList.add(e);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empList;
	}

}
