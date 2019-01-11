package com.slin.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slin.app.dao.IEmployeeDao;
import com.slin.app.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private IEmployeeDao employeeDao;
	
	public Employee save (Employee employee) {
		return employeeDao.save(employee);
	}
}
