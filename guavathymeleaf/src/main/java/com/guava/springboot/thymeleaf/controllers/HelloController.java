package com.guava.springboot.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.guava.springboot.thymeleaf.model.Student;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView mav = new ModelAndView("data");
		mav.addObject("message", "Take up one idea and make it your life");
		return mav;
	}
	
	@GetMapping("/student")
	public ModelAndView getStudent() {
		ModelAndView mav = new ModelAndView("student");
		Student student = new Student();
		student.setName("Ravi Prasad");
		student.setScore(89);
		mav.addObject("student", student); 
		return mav;
	}
	
	@GetMapping("/students")
	public ModelAndView getStudents() {
		ModelAndView mav = new ModelAndView("studentsList");
		Student student = new Student();
		student.setName("Ravi Prasad");
		student.setScore(89);
		
		Student student1 = new Student();
		student1.setName("Laharika Sandra");
		student1.setScore(75);
		
		Student student2 = new Student();
		student2.setName("Bharath Tyagi");
		student2.setScore(92);
		
		List<Student> students =  Arrays.asList(student, student1 , student2);
		
		mav.addObject("students", students); 
		return mav;
	}
	
	@GetMapping("/studentForm")
	public ModelAndView getStudentForm() {
		ModelAndView mav = new ModelAndView("studentForm");
		Student student = new Student();
		student.setName("RaviPrasad");
		student.setScore(56);
		mav.addObject("student", student); 
		return mav;
	}
	
	@GetMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView("result");
		System.out.println(student.getName());
		System.out.println(student.getScore());
		return mav;
	}
}
