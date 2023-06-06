package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {
      void save(Student s);
      List<Student> getAllStudents();
}
