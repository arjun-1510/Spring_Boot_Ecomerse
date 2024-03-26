package com.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.DAO.FlipKartDAO;
import com.flipkart.DTA.Customer;

@Service
public class FlipkartService {
	
	int otp;
	String email2;
	
	
	@Autowired
	FlipKartDAO dao;
	
	
	public Customer save(Customer c) {
		
		
		return dao.save(c);
	}
	
	
	public String login(String email , long phone) {
		
		Customer cus = dao.login(email);
		
		if ( cus != null ) {
		
		if(cus.getPhone()==phone) {
			
			return "Login sucessfully";
		}
		
		return "Invalid Phone Number";
	}
		return "Invalid Email Id";
		
	
		
	}
	
public String Forgotpassword(String email , long phone) {
		
		Customer cus = dao.ForgotPassword(email);
		
		if ( cus != null ) {
		
		if(cus.getPhone()==phone) {
			
			 otp = otp();
			 
			 email2 = cus.getEmail();
			
			return "OTP is  sucessfully generated " + otp;
		}
		
		return "Invalid Phone Number";
	}
		return "Invalid Email Id";
		
	
		
	}


public String ForgotUpdate(int userOtp,String newPassord,long id) {
	
	if(otp == userOtp) {
		Customer cus2 = dao.ForgotPassword(email2);
		cus2.setPassword(newPassord);
		cus2.setId(id);
		
		dao.save(cus2);
		
		return "Password Update Sucessfully";
	}else {
		return "Invalid Otp";
	}
	
	
	
	
}


public int otp() {
	
	return (int)( Math.random() * 1000 + 1000);
}


	

}
