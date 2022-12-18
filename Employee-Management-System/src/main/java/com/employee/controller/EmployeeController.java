package com.employee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emoloyee.Employee;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeDao;
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("message","Welcome to the Employee Management System");
		return "index";		
	}
	
	@RequestMapping("/getForm")
	public String showForm(Model view) {
		view.addAttribute("header","Employee Registration form");
		return "getForm";
	}
	
//   save Employee
	@RequestMapping( path ="/processform", method=RequestMethod.POST )
	public String saveEmp(@ModelAttribute Employee employee ,Model model) {
		
	try {		
		Integer integer = employee.getSalary();
		
		int length = employee.getMobile().length();
		
		if(length == 10) {
			
			if((employee.getName().isEmpty() &&
				employee.getLastName().isEmpty() &&
				employee.getDepartment().isEmpty() &&
				employee.getEmail().isEmpty() &&
				employee.getAddress().isEmpty()) == false ){
				
				Employee employee1 = employeeDao.saveEmployee(employee);

				if(employee1 != null) {
					
					model.addAttribute("message","Employee Registration Successfull.");
					return "saveResult";
					
					}else {
						model.addAttribute("message","Employee Already Registered.");
						return "saveResult";							
						}
			
			}else{
				model.addAttribute("message","Employee registration unsuccessfull. Please Make Sure That You Fill All of the Details.");
				return "saveResult";
			}
			
		}else {
			
			model.addAttribute("message","Employee registration unsuccessfull. Please Make Sure that You Have Filled Right Mobile Number.");
			return "saveResult";
		}
	}catch (Exception e) {
			model.addAttribute("message","Employee Registration Unsuccessfull Please Enter Valid Salary");
			return "saveResult";		
		}
	  }
	
	@RequestMapping( path ="/getAllEmployees", method=RequestMethod.GET )
	public String getAllEmployees(Model model) {
		
		List<Employee> employees =  employeeDao.getAllEmployees();
		if(employees != null) {
			
			model.addAttribute("employees",employees);
			model.addAttribute("employee",new Employee());

			System.out.println("-----" + employees + "------");
			return "getAllEmployees";
		}else {
			model.addAttribute("message","No Employee is  Registered");
			return "saveResult";
		}

	}
		
	
	
	
	
	
}
