package com.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.Student;
import com.jpa.repository.StudentRepository;
import com.jpa.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentrepository.save(student);
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentrepository.findAll();
	}

	@Override
	public Student getAStudent(int rollNo) {
		return studentrepository.findById(rollNo).get();
	}

	@Override
	public Student updateStudent(int rollNo, Student student) {
		Student s = studentrepository.findById(rollNo).get();
		s.setEmail(student.getEmail());
		s.setName(student.getName());
		return studentrepository.save(s);
	}

	@Override
	public String deleteStudent(int rollNo) {
		
		studentrepository.deleteById(rollNo);
		return "The Student with roll no. "+ rollNo +" has been removed.";
	}

}
