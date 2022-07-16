package com.infinx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infinx.entities.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
