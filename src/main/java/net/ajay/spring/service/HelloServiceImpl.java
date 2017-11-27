package net.ajay.spring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

	/* (non-Javadoc)
	 * @see net.ajay.spring.service.HelloService#getMessage(java.lang.String)
	 */
	@Override
	public String getMessage(String name) {
		// TODO Auto-generated method stub
		return "Hello who is this!!! "+name ;
	}

	
	
}
