package com.nitesh.practise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitesh.practise.model.Student;
import com.nitesh.practise.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public List<Student> getStudents(){
		return this.studentService.getStudents();
	}
	
	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return this.studentService.saveStudent(student);
	}
}
