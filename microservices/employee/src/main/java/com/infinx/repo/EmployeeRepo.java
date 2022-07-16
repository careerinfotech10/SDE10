package com.infinx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinx.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
