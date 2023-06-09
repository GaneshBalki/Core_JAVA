package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService es =new EmployeeServiceImpl();
   Scanner sc = new Scanner(System.in);
   int choice=0;
   boolean status;
   do {
	   System.out.println("\t1.Add New Employee\n\t2.Display All Employee"
                          +"\n\t3.Show Employee With Name"+"\n\t4.Remove Employee");
		   choice=sc.nextInt();
		   switch(choice) {
		   case 0:sc.close();
		   System.out.println("Bye Bye!!!");
			   break;
		   case 1:
			   status=es.addEmployee();
			   if(status) {
				   System.out.println("Employee Added SuccessFully  !!!");
			   }
			   else
				   System.out.println("**Employee with id Already Exists**");
			   break;
		   case 2:
			    Set<Employee> s = es.displayAll();
			    if(s.size()>0)
			    	s.forEach(ob->System.out.println(ob));
			    else
			    	System.out.println("Employee List is Empty");
			   break;
		   case 3:
			   System.out.println("Enter Name of Employee ");
			   String name=sc.next();
			   List<Employee> n = es.empByName(name);
			   if(n!=null)
				   n.forEach(ob->System.out.println(ob));
			   else
				   System.out.println("No Employee with Given Name");
			   
			   break;
		   case 4:
			   System.out.println("Enter Id of Employee ");
			   int id=sc.nextInt();
			   status=es.removeEmployee(id);
			   if(status)
				  System.out.println("Employee Removed SuccessFully!!!");
			   else
				   System.out.println("No with Given id");
			   break;
		   }
   }while(choice!=0);
	}

}
