package com.employee.app.response;

import java.io.Serializable;

public class EmployeeResponse implements Serializable{
	
	
	/**
	 * @author devesh.khandekar
	 */
	
	private static final long serialVersionUID = 1574346137057108078L;

	private int id;

	private String name;

	private String address;

	private String department;

	private AddressResponse addressResponse;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public AddressResponse getAddressResponse() {
		return addressResponse;
	}

	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}

	
}
