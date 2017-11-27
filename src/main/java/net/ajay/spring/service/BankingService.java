package net.ajay.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.ajay.spring.dto.CustomerDetails;

@Service
public interface BankingService {
	
	public boolean saveCustomerDetails(CustomerDetails customer);
	
	public CustomerDetails getCustomerDetails(int id);
	
	public List<CustomerDetails> getAllCustomerDetails();

}
