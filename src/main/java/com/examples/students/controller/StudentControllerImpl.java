package com.examples.students.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examples.students.entity.Student;
import com.examples.students.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentControllerImpl implements StudentController {

	@Autowired
	@Qualifier("studentService")
	StudentService studentService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents() throws Exception{
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
	}

	@RequestMapping(method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public int createStudent(@RequestBody Student newStudent) {
		return studentService.createStudent(newStudent);
	}

	@RequestMapping(method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student updateStudent) {
		studentService.updateStudent(updateStudent);
	}
}
