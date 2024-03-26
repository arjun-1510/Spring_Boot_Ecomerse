package com.flipkart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.DTA.Customer;

public interface FlipKartRepository extends JpaRepository<Customer, Long> {
	
	public Customer findByEmail(String email);

}
