package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.example.repository.EmployeeRepository;
import com.example.entity.Employee;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {
	 @Autowired
	    private EmployeeRepository repository; 
	
	public void delete() {

repository.deleteAll();
		//System.out.println(l);
	}
}
