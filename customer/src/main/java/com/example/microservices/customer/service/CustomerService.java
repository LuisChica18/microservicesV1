package com.example.microservices.customer.service;

import com.example.microservices.customer.entities.Customer;
import com.example.microservices.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        log.info("save customer start CustomerService");
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Long customerId) {
        log.info("findCustomerById start CustomerService");
        return customerRepository.findByCustomerId(customerId);
    }
}
