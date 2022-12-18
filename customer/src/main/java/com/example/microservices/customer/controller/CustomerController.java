package com.example.microservices.customer.controller;

import com.example.microservices.customer.entities.Customer;
import com.example.microservices.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@Valid @RequestBody Customer customer){
        log.info("save customer start CustomerController");
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable("id") Long customerId){
        log.info("findCustomerById start CustomerController");
        return customerService.findCustomerById(customerId);
    }
}
