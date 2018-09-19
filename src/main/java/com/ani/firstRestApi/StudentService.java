package com.ani.firstRestApi;

import java.util.List;


import org.springframework.http.ResponseEntity;

public interface StudentService {
	public List<Student> getStudent();
	public void createStudent(Student student);
	public ResponseEntity<Object> updateStudent(Student student, long id);
	public void deleteStudent(long id);
}
