package com.demo.service;
import java.util.List;
import java.util.Set;

import com.demo.bean.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
public class StudentServiceImpl implements StudentService {
 StudentDao stdDao; 
	public StudentServiceImpl() {
		super();
	 stdDao = new StudentDaoImpl();
	}

	@Override
	public boolean addnewStudent() {
		
		return stdDao.addNewStd();
	}

	@Override
	public Set<Student> displayAll() {
		
		return stdDao.displayAll();
	}

	@Override
	public Student displayById(int id) {

		return stdDao.getStudentById(id);
	}

	@Override
	public List<Student> getStdByDept(String dept) {
	
		return stdDao.getStdByDept(dept);
	}

	@Override
	public Set<Student> sortByRank() {
		
		return stdDao.sortByRank();
	}

	@Override
	public Set<Student> sortByDept() {
	
		return stdDao.sortByDept();
	}

}
