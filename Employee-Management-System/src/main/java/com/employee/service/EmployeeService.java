package com.employee.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.emoloyee.Employee;

@Component
public class EmployeeService implements EmployeeInterface{

	public Employee saveEmployee(Employee employee) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("Select e from Employee e where e.email=:em");
		query.setParameter("em", employee.getEmail());

		Employee employee2 = null;
		try {
			employee2 = (Employee) query.list().get(0);
			System.out.println(employee2);

		}catch(Exception e){
			
			employee2=null;
			
		}
		
		System.out.println(employee2);
	
		if(employee2 == null) {
			session.save(employee);	
			employee2 = employee;
		}else {
			employee2=null;
		}
		
		
		transaction.commit();
		session.close();
		factory.close();
		return employee2;
	
	}

	public List<Employee> getAllEmployees() {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		try {
			System.out.println("inside getAll ---------");
			Query query = session.createQuery("Select e from Employee e");
			
			List<Employee> employees= (List<Employee>) query.list();
			System.out.println(employees);
			System.out.println("inside service");
			transaction.commit();

			session.close();
			factory.close();
			
			return employees;

		}catch(Exception e){
			
			session.close();
			factory.close();
			return null;
		}
		
		
	}
	

}
