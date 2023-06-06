package com.demo.dao;

import java.util.List;
import java.util.ArrayList;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao{
//Database layer
	static List<Student> stdList;
	static {
		stdList = new ArrayList<>();
	}
	public StudentDaoImpl() {
		
	}


	@Override
	public List<Student> getAllStudents() {
		
		return stdList;
	}

	@Override
	public void save(Student s) {
		
		stdList.add(s);
		
	}

}
