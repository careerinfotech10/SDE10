package com.infinx;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infinx.entity.Employee;
import com.infinx.repo.EmployeeRepo;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(EmployeeApplication.class, args);

		List<Employee> asList = Arrays.asList(new Employee(1L, "santosh", "turerao", 122200L),
				new Employee(1L, "santosh", "turerao", 122200L), new Employee(2L, "Rahul", "C", 112200L),
				new Employee(3L, "Milind", "turerao", 92200L), new Employee(4L, "Prajkta", "C", 622200L),
				new Employee(5L, "NIKIA", "S", 122200L), new Employee(6L, "RAJ", "S", 122200L),
				new Employee(7L, "Vyanktesh", "C", 122200L));

		EmployeeRepo bean = run.getBean(EmployeeRepo.class);
		bean.saveAll(asList);
		bean.flush();

	}

}
