package com.flipkart.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.DTA.Customer;
import com.flipkart.Repository.FlipKartRepository;

@Repository
public class FlipKartDAO {
	
	
	@Autowired
	FlipKartRepository repo;
	
	
	
	
	public Customer save(Customer c) {
		
		
		return repo.save(c);
	}
	
	public Customer login(String email) {
		
		return repo.findByEmail(email);
	}
	
public Customer ForgotPassword(String email) {
		
		return repo.findByEmail(email);
	}

public Customer validEmail(String email) {
	
	return repo.findByEmail(email);
}
	
	

}
