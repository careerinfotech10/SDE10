package com.infinx.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinx.dto.ResponseDto;
import com.infinx.entities.Student;
import com.infinx.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentResource {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<ResponseDto> createStudent(@RequestBody Student student) {
		ResponseDto createStudent = studentService.createStudent(student);
		return new ResponseEntity<ResponseDto>(createStudent, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDto> updateStudent(@RequestBody Student student) {
		ResponseDto createStudent = studentService.createStudent(student);
		return new ResponseEntity<ResponseDto>(createStudent, HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDto> deleteStudent(@PathVariable("id") Long id) {
		ResponseDto deleteStudent = studentService.deleteStudent(id);
		return new ResponseEntity<ResponseDto>(deleteStudent, HttpStatus.OK);
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") Long id) {
		Student student = studentService.getStudent(id);
		if (student == null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);

		}
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@GetMapping("/getall/")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> students = studentService.getStudents();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
}
