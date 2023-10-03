package com.jpa.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jpa.entity.Student;

@Component
public interface StudentService {

	Student saveStudent(Student student);
	
	List<Student> getAllStudent();
	
	Student getAStudent(int rollNo);
	
	Student updateStudent(int rollNo, Student student);
	
	String deleteStudent(int rollNo);
}
