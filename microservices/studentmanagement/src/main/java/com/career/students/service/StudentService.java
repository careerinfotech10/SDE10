package com.career.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.career.students.entity.Student;
import com.career.students.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	public Student getStuentById(Long id) {
		return studentRepo.findById(id).orElse(new Student());
	}

}
