package com.example.service.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.student.Student;

public interface StudentDao extends CrudRepository<Student, Integer>{

}
