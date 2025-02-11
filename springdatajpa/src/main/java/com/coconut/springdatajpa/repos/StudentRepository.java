package com.coconut.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coconut.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
