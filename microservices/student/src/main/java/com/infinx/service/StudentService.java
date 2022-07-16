package com.infinx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinx.dto.ResponseDto;
import com.infinx.entities.Student;
import com.infinx.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	public ResponseDto createStudent(Student student) {
		ResponseDto responseDto = new ResponseDto();

		Student savedStudent = studentRepo.save(student);
		if (savedStudent != null) {

			responseDto.setMsg("data saved with id" + savedStudent.getId());
			return responseDto;

		}
		responseDto.setMsg("unable to save record" + savedStudent.getFirstName());
		return responseDto;
	}

	public ResponseDto updateStudent(Student student) {
		ResponseDto responseDto = new ResponseDto();

		Student savedStudent = studentRepo.save(student);
		if (savedStudent != null) {
			responseDto.setMsg("data updated with id" + savedStudent.getId());
			return responseDto;
		}
		responseDto.setMsg("unable to update record" + savedStudent.getFirstName());
		return responseDto;
	}

	public ResponseDto deleteStudent(Long id) {

		ResponseDto responseDto = new ResponseDto();

		if (studentRepo.findById(id).isPresent()) {
			studentRepo.deleteById(id);
			responseDto.setMsg("Data Deleted Succesfully " + id);
			return responseDto;
		}
		responseDto.setMsg("Data unable to delete" + id);
		return responseDto;

	}

	public Student getStudent(Long id) {
		// TODO Auto-generated method stub
		if (studentRepo.existsById(id)) {
			return studentRepo.findById(id).get();
		}

		return null;

	}

	public List<Student> getStudents() {
		return studentRepo.findAll();

	}

}
