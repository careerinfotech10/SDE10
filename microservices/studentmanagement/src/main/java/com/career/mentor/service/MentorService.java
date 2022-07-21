package com.career.mentor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.career.mentor.dto.MentorDto;
import com.career.mentor.repo.MentorRepo;

@Service
public class MentorService {
	
	@Autowired
	private MentorRepo mentorRepo;

	public ResponseEntity<MentorDto> saveMentor(MentorDto mentorDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<MentorDto> updateMentor(MentorDto mentorDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<MentorDto> getAllMentors() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<MentorDto> getMentorById(Long mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<MentorDto> deleteMentorById(Long mentorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
