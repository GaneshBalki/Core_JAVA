package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.bean.Student;

public interface StudentService {

	boolean addnewStudent();

	Set<Student> displayAll();

	Student displayById(int id);

	List<Student> getStdByDept(String dept);

	Set<Student> sortByRank();

	Set<Student> sortByDept();

}
