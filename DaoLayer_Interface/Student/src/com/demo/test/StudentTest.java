package com.demo.test;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentServiceImpl();
		int choice = 0;
		do {
			System.out.println("\n1.Add New Student\n2.Display All Students\n6.Exit\nEnter Your choice...");
	        choice=sc.nextInt();
	        switch(choice) {
	        case 1:
	        	ss.addStudent();
	        	break;
	        case 2:
	        	List<Student> student = ss.displayAllStudent();
	        	student.forEach(el->{System.out.println(el);});
	        	break;
	        case 3:
	        	break;
	        case 6:
	        	break;
	        }
		}while(choice!=6);
	}

}
