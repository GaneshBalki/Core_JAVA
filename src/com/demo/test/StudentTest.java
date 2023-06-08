package com.demo.test;
import com.demo.service.*;
import com.demo.bean.*;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService es = new StudentServiceImpl();
		String name,dept;
		int id, rank,choice=0;
		boolean status;
		do {
			System.out.println("\n1.Add New Student\n2.Display All Students\n3.Display Student By ID\n4.Display Student By Dept");
			System.out.println("5.Display Student by Rank\n6.Sort Students By Rank\n7.................\n8.Sort Student by Dept Name\n9.Remove Student\n0.Exit\nEnter Choice...");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				status=es.addnewStudent();
				if(status) {
					System.out.println("Student Added SuccessFully !!!");
				}
				else {
					System.out.println("Student with ID already exists !!");
				}
				break;
			case 2:
				Set<Student> wSet = es.displayAll();
				if(wSet!=null) {
					wSet.forEach(ob->System.out.println(ob));
				}
				else {
					System.out.println("Set is Empty..");
				}
				break;
			case 3:
				System.out.println("Enter Student ID : ");
				id=sc.nextInt();
				Student s = es.displayById(id);
				if(s!=null)
					System.out.println(s);
				else
					System.out.println("Not Found !!");
				break;
			case 4:
				System.out.println("Enter Department Name...");
				dept = sc.next();
				List<Student> dList=es.getStdByDept(dept);
				 if(dList!=null) {
				   dList.forEach(ob->System.out.println(ob));
				 }
				 else {
					 System.out.println("Not Found");
				 }
				 break;
			case 6:
				Set<Student> si = es.sortByRank();
			    si.forEach(ob->System.out.println(ob));
			
				break;
			case 8:
				Set<Student> sd = es.sortByDept();
				sd.forEach(ob->System.out.println(ob));
				break;
			case 0:
				sc.close();
				System.out.println("RAH TAKE MERE NAIN...");
				break;
			}
		}while(choice!=0);
	}

}
