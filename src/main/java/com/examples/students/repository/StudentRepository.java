package com.examples.students.repository;

import org.springframework.data.repository.CrudRepository;

import com.examples.students.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
