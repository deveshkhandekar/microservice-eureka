package com.employee.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.employee.app.entity.Employee;

@Service
//@EntityScan("com.employee.entity")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
