package com.examples.students.dao;

import java.util.Collection;

import com.examples.students.entity.Student;

public interface StudentDAO {
	Collection<Student> getAllStudents() throws Exception;
	void deleteStudent(int studentId);
	int createStudent(Student newStudent);
	void updateStudent(Student updateStudent);
}
