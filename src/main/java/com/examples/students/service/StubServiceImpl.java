package com.examples.students.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.examples.students.dao.StudentDAO;
import com.examples.students.entity.Student;

@Service
@Qualifier("stubService")
public class StubServiceImpl implements StudentService {

	@Autowired
	@Qualifier("stubRepo")
	StudentDAO studentDao;
	
	@Override
	public Collection<Student> getAllStudents() throws Exception {
		return studentDao.getAllStudents();
	}

	@Override
	public void deleteStudent(int studentId) {
		studentDao.deleteStudent(studentId);		
	}

	@Override
	public int createStudent(Student newStudent) {
		return studentDao.createStudent(newStudent);
	}

	@Override
	public void updateStudent(Student updateStudent) {
		studentDao.updateStudent(updateStudent);
	}

}
