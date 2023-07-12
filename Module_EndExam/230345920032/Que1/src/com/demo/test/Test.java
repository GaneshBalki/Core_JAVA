package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
	int choice=0;
	EmployeeService es=new EmployeeServiceImpl();
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome !");
	
	
	//menu driven programm to demonstrate operations on Employee
	do {
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("1. Add Employee to List\n2. Remove Employee List\n3. Show All Employee");
	    System.out.println("4. Show all Employee in Sorted Order\n5. Find Employee With Name\n6. Save all Employee into File\n7. Quit");
		
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		choice=sc.nextInt();
		switch(choice) {
	    case 1:
	    	boolean status=es.addNewEmp();
	    	if(status)
	    		System.out.println("Employee Added !!!");
	    	else
	    		System.out.println("***Failed TO Add Employee ");
	    	break;
	    case 2:
	    	status=es.removeEmpList();
	    	if(status)
	    		System.out.println("Removed Employee List !!!");
	    	else
	    		System.out.println("List is Already Empty ...");
	    	break;
	    case 3:
	    	List<Employee> elist=es.showAllEmp();
	    	elist.forEach((e)->{System.out.println(e);});
	    	break;
	    case 4:
	    	 elist=es.sortEmpbyId();
		     elist.forEach((e)->{System.out.println(e);});
	    	break;
	    case 5:
	    	System.out.println("Enter Employee Name :");
	    	String empName=sc.next();
	    	 elist=es.showEmpByName(empName);
	    	 if(elist!=null)
		         elist.forEach((e)->{System.out.println(e);});
	    	 else
	    		 System.out.println("No Employee with given name "+empName);
	    	break;
	    case 6:
	    	status=es.saveAllEmpTOFile();
	    	if(status) {
	    		System.out.println("All Employee Detailes Saved In File 'EmployeeRecord.txt'");
	    	}
	    	break;
	    case 7:
	    	sc.close();
	    	System.out.println("Thank You For Visiting Us !!!");
	    	break;
		}
	    
	}while(choice!=7);

	}

}
