package com.demo.dao;
import java.util.List;
import com.demo.beans.Employee;
public interface EmployeeDao {
	//1. to save employee details in list/database
   void save(Employee e);
    //2.return all employee in list
   List<Employee> getAllEmployee();
}
