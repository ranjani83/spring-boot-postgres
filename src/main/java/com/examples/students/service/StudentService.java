package com.examples.students.service;

import java.util.Collection;

import com.examples.students.entity.Student;

public interface StudentService {
	Collection<Student> getAllStudents() throws Exception;
	void deleteStudent(int studentId);
	int createStudent(Student newStudent);
	void updateStudent(Student updateStudent);
}
