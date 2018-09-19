package com.ani.firstRestApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	/*@Query(name="select * from student " ,nativeQuery=true)
	public List<Student> findAll();*/
	

}
