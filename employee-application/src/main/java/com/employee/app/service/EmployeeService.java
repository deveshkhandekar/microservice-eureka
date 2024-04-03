package com.employee.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.app.entity.Employee;
import com.employee.app.repository.EmployeeRepository;
import com.employee.app.response.EmployeeResponse;

@Repository
public class EmployeeService {
	
	@Autowired
    public ModelMapper modelMapper;
	
	@Autowired
	private EmployeeRepository repository;

	public EmployeeResponse getEmployeDetails(Integer id) {

		// Db Call
		Employee employee = repository.findById(id).get();
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

		return employeeResponse;
	}
}
