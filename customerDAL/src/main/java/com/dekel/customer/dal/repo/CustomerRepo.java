package com.dekel.customer.dal.repo;

import org.springframework.data.repository.CrudRepository;

import com.dekel.customer.dal.entities.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
