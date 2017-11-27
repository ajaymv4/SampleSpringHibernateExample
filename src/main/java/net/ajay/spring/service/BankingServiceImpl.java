package net.ajay.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ajay.spring.dao.CustomerDetailsDao;
import net.ajay.spring.dto.CustomerDetails;

@Service
public class BankingServiceImpl implements BankingService {

	@Autowired
	private CustomerDetailsDao customerDetailsDao;
	
	@Override
	public boolean saveCustomerDetails(CustomerDetails customer) {
		return customerDetailsDao.saveCustomerDetails(customer);
		
	}

	@Override
	public CustomerDetails getCustomerDetails(int id) {
		return customerDetailsDao.getCustomerDetails(id);
		
	}
	
	@Override
	public List<CustomerDetails> getAllCustomerDetails() {
		return customerDetailsDao.getAllCustomerDetails();
		
	}
	
	
}
