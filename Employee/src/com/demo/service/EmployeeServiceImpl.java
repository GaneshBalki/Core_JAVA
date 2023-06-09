package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
    EmployeeDao ed = new EmployeeDaoImpl();
	@Override
	public boolean addEmployee() {
		
		return ed.addEmployee();
	}
	@Override
	public Set<Employee> displayAll() {
	
		return ed.displayAll();
	}
	@Override
	public List<Employee> empByName(String name) {
		
		return ed.empByName(name);
	}
	@Override
	public boolean removeEmployee(int id) {
		
		return ed.removeEmp(id);
	}

}
