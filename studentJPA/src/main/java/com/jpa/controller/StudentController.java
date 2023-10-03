package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Student;
import com.jpa.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	//get all students
	@GetMapping("/student")
	public List<Student> returnAll() {
		return studentservice.getAllStudent();
	}
	
	//create a student
	@PostMapping("/student")
	public Student createNewStudent(@RequestBody Student s) {
		return studentservice.saveStudent(s);
	}
	
	//get a student
	@GetMapping("/student/{rollNo}")
	public Student returnAStudent(@PathVariable int rollNo) {
		return studentservice.getAStudent(rollNo);
	}
	
	//update a student
	@PutMapping("/student/{rollNo}")
	public Student updateNewStudent(@PathVariable int rollNo, @RequestBody Student s) {
		return studentservice.updateStudent(rollNo, s);
	}
	
	//delete a student
	@DeleteMapping("/student/{rollNo}")
	public String deleteStudent(@PathVariable int rollNo) {
		return studentservice.deleteStudent(rollNo);
		
	}
}
