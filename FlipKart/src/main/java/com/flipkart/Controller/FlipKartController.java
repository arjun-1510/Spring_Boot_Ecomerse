package com.flipkart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.DTA.Customer;
import com.flipkart.service.FlipkartService;

@RestController
public class FlipKartController {
	
	
	
	@Autowired
	
	FlipkartService service;
	
	
	@PostMapping("/api/FlipKart/sigup")
	public Customer save(@RequestBody Customer c) {
		
		return service.save(c);
	}
	
	@GetMapping("/api/FlipKart/login/")
	
	public String login(@RequestParam(value = "email") String email, @RequestParam(value = "phone") Long phone) {
		
		
		
		return service.login(email,phone );
	}
	
@GetMapping("/api/FlipKart/Forgotpassword/")
	
	public String Forgotpassword(@RequestParam(value = "email") String email, @RequestParam(value = "phone") Long phone) {
		
		
		
		return service.Forgotpassword(email,phone );
	}
	


@PutMapping("/api/FlipKart/Forgotpassword/update")

public String Forgotpassword(@RequestParam(value = "otp") int otp, @RequestParam(value = "newPassword") String pass,@RequestParam(value = "id") long id) {
	
	
	
	return service.ForgotUpdate(otp, pass, id);
}

	
	
	
	
	
	
	
	
	

}
