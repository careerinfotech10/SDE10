package com.career.revenue.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Income {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long incomeId;
	private Long studentId;
	private Long amount;
	private Long categoryId;
	
	// audit columns
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	private String createdBy;
	private String updatedBy;
	private boolean active;


}
