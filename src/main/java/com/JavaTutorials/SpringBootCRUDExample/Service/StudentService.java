package com.JavaTutorials.SpringBootCRUDExample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaTutorials.SpringBootCRUDExample.Entity.Student;
import com.JavaTutorials.SpringBootCRUDExample.Repository.StudentRepository;

@Service

public class StudentService {
	
	@Autowired
	
	private StudentRepository repository;
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public Student getStudent() {
		return (Student) repository.findAll();
	}
	
	public String deleteStudent(int id) {
		repository.deleteById(id);
		return "student deleted";
		
	}
	public Student updateStudent(Student student) {
		return student;
		
	}
	}

