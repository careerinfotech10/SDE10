package com.infinx;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infinx.entities.Teacher;
import com.infinx.repo.TeacherRepo;

@SpringBootApplication
public class TeacherApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(TeacherApplication.class, args);

		List<Teacher> students = Arrays.asList(new Teacher(1L, "Rahul ", "C", "DSA & System Design Expert"),
				new Teacher(2L, "Santosh", "Turerao", "FullStack"), new Teacher(3L, "Prajkta", "C", "FullStack"),
				new Teacher(4L, "Raj", "S", "Data Scietist"), new Teacher(5L, "Vyanktes", "K", "Data Engineering"),
				new Teacher(6L, "Nikita", "Sardar", "Front Development"),
				new Teacher(7L, "Amrapali", "T", "UI/UX Developer"),
				new Teacher(8L, "Rony", "T", "Front End Developer"));

		TeacherRepo studentRepo = run.getBean(TeacherRepo.class);
		studentRepo.saveAll(students);
		studentRepo.flush();
	}

}
