package com.coconut.springdatajpa;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coconut.springdatajpa.entities.Student;
import com.coconut.springdatajpa.repos.StudentRepository;

@SpringBootTest
class StarterProjectApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1L);
		student.setName("Raman");
		student.setTestScore(98);
		repository.save(student);

		Student savedStudent = repository.findById(1L).get();
		assertNotNull(savedStudent);
	}
}
