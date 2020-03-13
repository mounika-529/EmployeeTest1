package com.Employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Employee.Domain.EmployeePojo;
import com.Employee.Repository.EmployeeRepository;
@Service

public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Transactional
	public void createEmployee(EmployeePojo employee) {
		employeeRepository.save(employee);
	}
	public EmployeePojo getEmployeePojoById(int employeeId) {
		return employeeRepository.getOne(employeeId);
	}
}
