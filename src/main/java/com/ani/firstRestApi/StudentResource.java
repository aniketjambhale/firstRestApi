package com.ani.firstRestApi;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getStudent(){
		return studentService.getStudent();
	}
	
	@PostMapping("/student")
	public void createStudent(@RequestBody Student student){
		studentService.createStudent(student);
	}
	
	@PutMapping("/student/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable long id){
		studentService.updateStudent(student, id);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentService.deleteStudent(id);
	}
}
