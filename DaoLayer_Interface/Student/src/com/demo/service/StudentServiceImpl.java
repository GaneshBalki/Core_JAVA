package com.demo.service;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
public class StudentServiceImpl implements StudentService{
    StudentDao std;
	public StudentServiceImpl() {
	std=new StudentDaoImpl();
	}

	@Override
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		Student s = new Student(name);
		std.save(s);
		
	}

	@Override
	public List<Student> displayAllStudent() {
		
		return std.getAllStudents();
	}
 
}
