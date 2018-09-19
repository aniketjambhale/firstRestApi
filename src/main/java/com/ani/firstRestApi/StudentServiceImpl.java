package com.ani.firstRestApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getStudent() {
		
		return studentRepository.findAll();
	}
	
	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public ResponseEntity<Object> updateStudent(Student student, long id) {
		// TODO Auto-generated method stub
		Optional<Student> studentOptional = studentRepository.findById((int) id);

		if (!studentOptional.isPresent())
			return ResponseEntity.notFound().build();

		student.setId((int) id);
		
		studentRepository.save(student);

		return ResponseEntity.noContent().build();
		
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById((int) id);
	}
	
	

}
