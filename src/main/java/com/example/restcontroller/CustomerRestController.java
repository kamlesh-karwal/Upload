package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerRestController {

    @Autowired
    private CustomerService cService;

    @GetMapping("/get/{id}")
    public ResponseEntity<Customer> getById(@PathVariable("id") Integer id) {
        Customer customer = cService.getCustomer(id);
        return ResponseEntity.ok(customer);
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> saveData(@RequestBody Customer cust) {
        Customer saved = cService.saveData(cust);
        return ResponseEntity.ok(saved);
    }
}
