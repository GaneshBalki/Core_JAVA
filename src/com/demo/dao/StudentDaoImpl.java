package com.demo.dao;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import com.demo.bean.Student;
import java.util.Scanner;
public class StudentDaoImpl implements StudentDao{
   private static Set<Student> setStd;
	static {
		setStd=new HashSet<>();
		setStd.add(new Student(1,"Allu","COMMERSE",20));
		setStd.add(new Student(11,"Virat","CHEMICAL",23));
		setStd.add(new Student(12,"Sachin","COMMERSE",11));
		setStd.add(new Student(2,"Rohit","COMMERSE",12));
		setStd.add(new Student(5,"RC Patil","CHEMICAL",30));
		setStd.add(new Student(8,"VC Patil","MECHANICAL",13));
		
	}

	@Override
	public boolean addNewStd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Dept  Name : ");
		String dname = sc.next();
		System.out.println("Enter Rank :");
		int rank = sc.nextInt();
		Student s = new Student(id,name,dname,rank);
		if(setStd.add(s)) {
			return true;	
		}
		return false;
	}

	@Override
	public Set<Student> displayAll() {
		
		return setStd;
	}

	@Override
	public Student getStudentById(int id) {
		for(Student ob:setStd) {
			if(ob.getSid()==id)
				return ob;
		}
		return null;
	}

	@Override
	public List<Student> getStdByDept(String dept) {
		List<Student> s = new ArrayList<>();
		for(Student ob:setStd) {
			System.out.println("Inside for loop");
			if(ob.getDeptName().equals(dept)) {
				System.out.println(ob.getDeptName()+"-----"+dept);
				s.add(ob);
			}
		}
		if(s!=null) {
			return s;
		}
		return null;
	}

	@Override
	public Set<Student> sortByRank() {
		
		Set<Student> s1 = new TreeSet<>();
		for(Student s:setStd) {
			s1.add(s);
		}
		return s1;
	}

	/*@Override
	public Set<Student> sortByDept() {
	   Comparator<Student> c=(o1,o2)->{
		return o1.getDeptName().compareTo(o2.getDeptName());  
	   };
	   Set<Student> s2 = new TreeSet<>(c);
	 
		for(Student s:setStd) {
			s2.add(s);
		}
		return s2;
		
	}*/
	public Set<Student> sortByDept() {
	Comparator<Student> c=(o1,o2)->{
		
		if(o1.getDeptName().equals(o2.getDeptName()))
		{
			  if(o1.getSid()<o2.getSid())
				  return -1;
			  else if(o1.getSid()==o2.getSid())
			       return 0;
			  else 
				  return 1;
			 }
		else
			return 1;
	};
	 Set<Student> s2 = new TreeSet<>(c);
	 
		for(Student s:setStd) {
			s2.add(s);
		}
		return s2;
	}
}
