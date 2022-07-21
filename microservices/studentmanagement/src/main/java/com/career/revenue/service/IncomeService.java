package com.career.revenue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.career.revenue.entity.Income;
import com.career.revenue.repo.IncomeRepo;

@Service
public class IncomeService {

	@Autowired
	private IncomeRepo incomeRepo;
	public List<Income> getIncomes() {
		// TODO Auto-generated method stub
		return incomeRepo.findAll();
	}

}
