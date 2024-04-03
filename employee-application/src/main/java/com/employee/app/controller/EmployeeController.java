package com.employee.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.app.response.AddressResponse;
import com.employee.app.response.EmployeeResponse;
import com.employee.app.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@ResponseBody
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeDetails(@PathVariable("id") Integer id) {

		// Db Call
		EmployeeResponse employeDetails = service.getEmployeDetails(id);
		
		AddressResponse forObject = restTemplate.getForObject("http://address-application/beetleTesting/api/address/"+id, AddressResponse.class);
		employeDetails.setAddressResponse(forObject);
		return ResponseEntity.status(HttpStatus.OK).body(employeDetails);
	}
}
