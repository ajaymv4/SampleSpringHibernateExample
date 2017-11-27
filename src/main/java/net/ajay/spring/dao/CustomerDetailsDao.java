package net.ajay.spring.dao;

import java.util.List;

import net.ajay.spring.dto.CustomerDetails;

public interface CustomerDetailsDao {

	public boolean saveCustomerDetails(CustomerDetails customer);
	
	public CustomerDetails getCustomerDetails(int id);
	
	public List<CustomerDetails> getAllCustomerDetails();
	
}
