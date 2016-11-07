package com.examples.students.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.examples.students.entity.Student;

@Repository
@Qualifier("stubRepo")
public class StubStudentDAOImpl implements StudentDAO {

	public static Map<Integer,Student> students = new HashMap<Integer, Student>(); 
	static {
		students.put(1, new Student(1,"Student A","Course A",28));
		students.put(2, new Student(2,"Student B","Course C",30));
		students.put(3, new Student(3,"Student C","Course C",26));
		students.put(4, new Student(4,"Student D","Course D",28));
	}
	@Override
	public Collection<Student> getAllStudents() {
		return students.values();
	}

	@Override
	public void deleteStudent(int studentId) {
	students.remove(studentId);
	}

	@Override
	public int createStudent(Student newStudent) {
		students.put(newStudent.getId(), newStudent);
		return newStudent.getId();
	}

	@Override
	public void updateStudent(Student updateStudent) {
		Student student=students.get(updateStudent.getId());
		System.out.println("student : " + student);
		student.setCourse(updateStudent.getCourse());
		student.setName(updateStudent.getName());
		student.setAge(updateStudent.getAge());
		students.put(student.getId(), student);
	}

}
