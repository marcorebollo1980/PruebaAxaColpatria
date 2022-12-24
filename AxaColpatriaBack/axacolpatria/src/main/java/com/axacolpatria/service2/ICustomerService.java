package com.axacolpatria.service2;



import com.axacolpatria.output.CustomersResponseBean;


public interface ICustomerService {
	
	public CustomersResponseBean findByName(String name);
	

}
