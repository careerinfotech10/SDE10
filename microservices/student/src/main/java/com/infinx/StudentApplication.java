package com.infinx;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infinx.entities.Student;
import com.infinx.repo.StudentRepo;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(StudentApplication.class, args);

		List<Student> students = Arrays.asList(new Student(1L, "Ashwini", "Bhute", "Front Development"),
				new Student(2L, "Ashwini", "Kokane", "Front Development"),
				new Student(3L, "Komal", "Gaikwad", "Front Development"),
				new Student(4L, "Jayshree", "Kadu", "Front Development"),
				new Student(5L, "Smita", "Patil", "Front Development"),
				new Student(6L, "Mahendra", "Bhagat", "Front Development"),
				new Student(7L, "Pratap", "Patil", "Front Development"),
				new Student(8L, "Nikita", "Khatal", "Front Development"));

		StudentRepo studentRepo = run.getBean(StudentRepo.class);
		studentRepo.saveAll(students);
		studentRepo.flush();
	}

}
