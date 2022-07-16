package com.career;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.career.students.entity.Student;
import com.career.students.repo.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

		Student student = new Student(1L, "santosh", "tureraosantosh@gmail.com", "tureraosantosh@gmail.com", 250000L,
				false, LocalDateTime.now(), LocalDateTime.now(), true, "MSMC", new Date());
		List<Student> students = Arrays.asList(student);
		StudentRepo studentRepo = run.getBean(StudentRepo.class);
		studentRepo.saveAll(students);
		studentRepo.flush();
	}
}
