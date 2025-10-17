package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@SpringBootApplication
public class DemoFirst2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoFirst2Application.class, args);
	
		EmployeeService ems = context.getBean(EmployeeService.class);
		//Employee em = new Employee(5,"MEE","Radha",300000.00);
		ems.delete();
		
		
		
		
		
	}

}
