package com.examples.students.controller;

import java.util.Collection;

import com.examples.students.entity.Student;

public interface StudentController {
	Collection<Student> getAllStudents() throws Exception;
	void deleteStudent(int studentId);
	int createStudent(Student newStudent);
	void updateStudent(Student updateStudent);

}
