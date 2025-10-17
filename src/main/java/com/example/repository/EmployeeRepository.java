package com.example.repository;

import org.springframework.data.repository.CrudRepository; // Importing Spring's CrudRepository
import com.example.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    // You can define custom query methods here
}
