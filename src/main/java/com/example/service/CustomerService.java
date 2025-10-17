package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.exception.CustomerNotFoundException;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public Customer getCustomer(Integer id) {
        return repo.findById(id)
                   .orElseThrow(() -> new CustomerNotFoundException(" Customer not found: " + id));
    }

    public Customer saveData(Customer cust) {
        return repo.save(cust);
    }
}
