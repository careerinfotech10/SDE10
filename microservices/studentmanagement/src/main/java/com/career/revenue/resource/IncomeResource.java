package com.career.revenue.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.career.revenue.entity.Income;
import com.career.revenue.service.IncomeService;

@RestController
@RequestMapping("/revenue")
public class IncomeResource {

	@Autowired
	private IncomeService incomeService;

	@GetMapping()
	public List<Income> getIncome() {
		return incomeService.getIncomes();
	}

}
