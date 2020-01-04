package com.dekel.customer.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dekel.customer.dal.entities.Customer;
import com.dekel.customer.dal.repo.CustomerRepo;

@SpringBootTest
class CustomerDalApplicationTests {

	@Autowired
	private CustomerRepo customerRepo;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Raz");
		customer.setEmail("raz@gmail.com");
		customerRepo.save(customer);
	}

	@Test
	public void testFindCustomerById() {
		Optional<Customer> customer = customerRepo.findById(1);
		System.out.println(customer);
	}

	@Test
	public void testUpdateCustomer() {
		Optional<Customer> optionalCustomer = customerRepo.findById(1);
		if (optionalCustomer.isPresent()) {
			Customer customer = optionalCustomer.get();
			customer.setEmail("raztz@gmail.com");
			customerRepo.save(customer);
		}

	}

	@Test
	public void testDeleteCustomer() {
		customerRepo.deleteById(1);
	}

}
