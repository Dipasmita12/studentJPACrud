package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
