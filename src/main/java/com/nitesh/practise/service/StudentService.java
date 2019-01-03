package com.nitesh.practise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitesh.practise.model.Student;
import com.nitesh.practise.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	public List<Student> getStudents() {
		return this.studentRepository.findAll();
	}
	public Student saveStudent(Student student) {
		return this.studentRepository.save(student);
	}

}
