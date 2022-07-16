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
import com.infinx.entities.Teacher;
import com.infinx.service.TeacherService;

@RestController
@RequestMapping("/teacher")
@CrossOrigin("*")
public class TeacherResource {

	@Autowired
	
	private TeacherService teacherService;

	@PostMapping("/save")
	public ResponseEntity<ResponseDto> createStudent(@RequestBody Teacher student) {
		ResponseDto createStudent = teacherService.createStudent(student);
		return new ResponseEntity<ResponseDto>(createStudent, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDto> updateStudent(@RequestBody Teacher student) {
		ResponseDto createStudent = teacherService.createStudent(student);
		return new ResponseEntity<ResponseDto>(createStudent, HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDto> deleteStudent(@PathVariable("id") Long id) {
		ResponseDto deleteStudent = teacherService.deleteStudent(id);
		return new ResponseEntity<ResponseDto>(deleteStudent, HttpStatus.OK);
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Teacher> getStudent(@PathVariable("id") Long id) {
		Teacher student = teacherService.getStudent(id);
		if (student == null) {
			return new ResponseEntity<Teacher>(HttpStatus.NOT_FOUND);

		}
		return new ResponseEntity<Teacher>(student, HttpStatus.OK);
	}

	@GetMapping("/getall/")
	public ResponseEntity<List<Teacher>> getAllStudent() {
		List<Teacher> students = teacherService.getStudents();
		return new ResponseEntity<List<Teacher>>(students, HttpStatus.OK);
	}
}
