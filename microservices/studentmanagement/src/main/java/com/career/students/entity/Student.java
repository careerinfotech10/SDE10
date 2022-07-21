package com.career.students.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;

	private boolean isContractSent = true;
	@CreationTimestamp
	private LocalDateTime createdOn = LocalDateTime.now();
	@UpdateTimestamp
	private LocalDateTime updateOn = LocalDateTime.now();
	private boolean active = true;
	private String education;
	private String passingYear;
	private String mentor;
	private boolean isMentorOpted=false;
	private Long incomeId;
	private Long basePackage;

}
