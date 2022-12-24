package com.axacolpatria.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.axacolpatria.output.CustomersResponseBean;
import com.axacolpatria.output.CutomersDetailBean;
import com.axacolpatria.service2.ICustomerService;

@Service("CustomerServiceImpl")
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	public RestTemplate template;
	
	String ROOT_URI = "https://8e7c6b8a-fc46-4674-a529-4ebec57295d3.mock.pstmn.io/customers/";
	
	@Override
	public CustomersResponseBean findByName(String nameValue) {
		
		ROOT_URI = ROOT_URI.replace("{age}", nameValue);
		System.out.println("La url del servicio es:"+ROOT_URI);
		
		ResponseEntity<CustomersResponseBean[]> response;
		response = template.getForEntity(ROOT_URI,CustomersResponseBean[].class);
		
		System.out.println("EL estado del servicio es:"+ response.getStatusCodeValue());
		
		CustomersResponseBean[] customersResponseBeansArray = response.getBody();
		
		for (CustomersResponseBean customersResponseBean : customersResponseBeansArray) {
			List<CutomersDetailBean> cutomersDetailBean = customersResponseBean.getCutomersDetailBean();
			
			for (CutomersDetailBean cusDetailBean : cutomersDetailBean) {
				System.out.println("valores:"+cusDetailBean.getName());
				System.out.println("valores:"+cusDetailBean.getAge());
				System.out.println("valores:"+cusDetailBean.getPhoneNumber());
				System.out.println("valores:"+cusDetailBean.getAddress());
			}
		}
		
		return customersResponseBeansArray[0];
	}



}
