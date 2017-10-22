package com.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Student;

public class StudeService {
	
	public StudeService() {
		// TODO Auto-generated constructor stub
	//	initEmps();
	}
	
	private static final Map<Integer, Student> empMap = new HashMap<Integer, Student>();
	
public List<Student> getAllStudent(){
		
	 Collection<Student> c = empMap.values();
     List<Student> list = new ArrayList<Student>();
     list.addAll(c);
     return list;
	}

	
	
	public Student getEmployee(String empNo) {
		// TODO Auto-generated method stub
		return empMap.get(Integer.parseInt(empNo));
	}

	
	 /*private static void initEmps() {
		 Student emp1 = new Student(1, "Smith","45");
		 Student emp2 = new Student(2, "Allen","25");
		 Student emp3 = new Student(3, "Jones","95");
	 
	        empMap.put(emp1.getId(), emp1);
	        empMap.put(emp2.getId(), emp2);
	        empMap.put(emp3.getId(), emp3);
	    }

*/

	public Student addStudent(Student country) {
		// TODO Auto-generated method stub
	//	System.out.println("Here"+country.toString());
		empMap.put(country.getId(), country);
		return country;
	}



	public Student updateStud(Student country) {
		// TODO Auto-generated method stub
		empMap.put(country.getId(), country);
		return country;
	}



	public void deleteStud(String id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		empMap.remove(Integer.parseInt(id));
		System.out.println(empMap.toString());
	}
}
