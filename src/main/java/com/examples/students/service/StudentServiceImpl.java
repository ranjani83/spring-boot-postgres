package com.examples.students.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.examples.students.entity.Student;
import com.examples.students.repository.StudentRepository;

@Service
@Qualifier("studentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Collection<Student> getAllStudents() throws Exception {
		return (Collection<Student>) studentRepository.findAll();
	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.delete(studentId);
	}

	@Override
	public int createStudent(Student newStudent) {
		if(studentRepository.exists(newStudent.getId())) {
			return newStudent.getId();
		} 
		
		Student newOne =  studentRepository.save(newStudent);
		return newOne.getId();
	}

	@Override
	public void updateStudent(Student updateStudent) {
		if(studentRepository.exists(updateStudent.getId())) {
			studentRepository.save(updateStudent);
		} 
	}

}
