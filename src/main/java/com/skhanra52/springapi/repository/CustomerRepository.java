package com.skhanra52.springapi.repository;

import com.skhanra52.springapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Here the "Customer" is the entity class
    // and Integer is the type of primary key, which is ID.

    // Here we can define our custom method as well which will be added with
    // CustomerRepository.
    // Example given below -
    Customer findByCustomerName(String name);
}
