package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.service.dao.StudentDao;
import com.example.student.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentdao;

	public Student createStudent(Student student) {
		return studentdao.save(student);

	}

	public Iterable<Student> getAllStudent() {
		return studentdao.findAll();
	}

	public void deleteStudent(Integer phoneNo) {
		studentdao.deleteById(phoneNo);
	}

	public Student updateStudent(Integer phoneNo, String newEmail) {
		Student student = studentdao.findById(phoneNo).orElse(new Student());
		student.setEmailId(newEmail);
		return studentdao.save(student);
	}

}
