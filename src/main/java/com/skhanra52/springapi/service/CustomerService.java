package com.skhanra52.springapi.service;

import com.skhanra52.springapi.entity.Customer;
import com.skhanra52.springapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public Customer getCustomer(int cid){
        return customerRepository.findById(cid).orElse(null);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    // Custom method.
    public Customer searchCustomerByName(String name){
        return customerRepository.findByCustomerName(name);
    }
}
