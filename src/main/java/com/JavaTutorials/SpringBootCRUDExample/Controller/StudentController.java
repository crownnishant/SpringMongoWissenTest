package com.JavaTutorials.SpringBootCRUDExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaTutorials.SpringBootCRUDExample.Entity.Student;
import com.JavaTutorials.SpringBootCRUDExample.Service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class StudentController {
		
	@Autowired
	private StudentService service;
	
	private static final Logger logger=org.slf4j.LoggerFactory.getLogger(StudentController.class);
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping("/students")
	
	public List<Student> findAllStudents(){
		
		logger.error("FATAL ERROR");
		return (List<Student>) service.getStudent();
	}
	

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/delete{id}")
	public String deleteStudent(int id) {
		return service.deleteStudent(id);
	}
}