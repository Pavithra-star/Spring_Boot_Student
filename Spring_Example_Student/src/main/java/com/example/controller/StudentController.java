package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.StudentService;
import com.example.student.Student;


@RestController
public class StudentController {
	
		@Autowired
		private StudentService service;
		@GetMapping("/getAllstudentaddress")
		public Iterable<Student>getAllStudent() {
			return service.getAllStudent();
		}
		// creating Student
		@PostMapping("/studentcreate")
		public Student createStudent(@RequestBody Student student) {
			return service.createStudent(student);
		}
		//get a Student
		@GetMapping("/student/{studentpnoneNo}")
		public Student getStudent(@PathVariable("phoneNo")Student phoneNo) {
			return service.createStudent(phoneNo);
		}
	//	
		//Delete a Student
		@DeleteMapping("/student/{studentphoneNo}")
		public void deleteTicket(@PathVariable("phoneNo")Integer phoneNo) {
			service.deleteStudent(phoneNo);
		}
		//update a Student 
		@PutMapping("/student/{studentphoneNo}/{emailId}")
		public Student updateTicket(@PathVariable("ticketId") Integer phoneNo,@PathVariable("newEmail")String newEmail) {
			return service.updateStudent(phoneNo,newEmail);
		}
		

	}























