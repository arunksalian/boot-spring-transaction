package com.slin.app.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.slin.app.entity.Employee;


@Repository
public class EmployeeDao extends AbstractDao implements IEmployeeDao{

	
	@Override
	@Transactional(transactionManager="getTransactionManagerSlave")
	public Employee save(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

}
