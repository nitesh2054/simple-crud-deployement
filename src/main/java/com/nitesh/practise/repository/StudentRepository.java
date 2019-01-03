package com.nitesh.practise.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nitesh.practise.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
