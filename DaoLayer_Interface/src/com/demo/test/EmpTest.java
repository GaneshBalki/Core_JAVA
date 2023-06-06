package com.demo.test;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImp;
public class EmpTest {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  EmployeeService es = new EmployeeServiceImp();
	  int choice=0;
	  do {
		  System.out.println("\n1.Add New Employee\n2.Display All Employee\n6.Exit\nEnter Choice...");
		  choice = sc.nextInt();
		  switch(choice) {
		  case 1:
			  // add new employee
			 es.addNewEmployee();
			  break;
		  case 2:
			  // display all employee
			  List<Employee> list= es.displayAll();
			  list.forEach(ob->{System.out.println(ob);});
			  break;
		  case 6:
			  sc.close();
			  System.out.println("Thank You...");
			  break;
		  }
	  }while(choice!=6);
	}

}
