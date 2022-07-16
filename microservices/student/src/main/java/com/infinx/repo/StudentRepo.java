package com.infinx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinx.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
