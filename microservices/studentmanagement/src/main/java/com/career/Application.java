package com.career;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

//		Student student = new Student(1L, "Santosh", "Turerao", "tureraosantosh@gmail.com", 500000L,
//				false, LocalDateTime.now(), LocalDateTime.now(), true, "MSMC", LocalDate.now());
//		List<Student> students = Arrays.asList(student);
//		StudentRepo studentRepo = run.getBean(StudentRepo.class);
//		studentRepo.saveAll(students);
//		studentRepo.flush();
	}
}
