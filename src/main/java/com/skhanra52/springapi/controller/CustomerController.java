package com.skhanra52.springapi.controller;

import com.skhanra52.springapi.entity.Customer;
import com.skhanra52.springapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public String addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return "Customer added successfully";
    }

    @GetMapping("/{cid}")
    public Customer getCustomer(@PathVariable int cid){
        return customerService.getCustomer(cid);
    }

    @GetMapping
    public Iterable<Customer> getAllCustomer(){
        return customerService.getAllCustomers();
    }
}
