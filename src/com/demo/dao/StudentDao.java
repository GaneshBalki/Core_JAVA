package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.bean.Student;

public interface StudentDao {

	boolean addNewStd();

	Set<Student> displayAll();

	Student getStudentById(int id);

	List<Student> getStdByDept(String dept);

	Set<Student> sortByRank();

	Set<Student> sortByDept();

}
