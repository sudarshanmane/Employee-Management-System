package com.emoloyee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String lastName;
	private String department;
	private String mobile;
	private String email;
	private String address;
	private Integer salary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Employee() {
		super();
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(Integer id, String name, String lastName, String department, String mobile, String email,
			String address, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.department = department;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}
	public Employee(String name, String lastName, String department, String mobile, String email, String address,
			Integer salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.department = department;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}
	
	
	
	

}
