package com.axacolpatria.controller;

import java.net.URI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.axacolpatria.output.CustomersResponseBean;
import com.axacolpatria.output.CutomersDetailBean;
import com.axacolpatria.service2.ICustomerService;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomersDetailController {
	
	@Autowired
    private ICustomerService customerService;
	
	@Autowired
	public RestTemplate template;

	@RequestMapping("/getCustomers")
	public ResponseEntity<?> getCustomers(){
		 try {
		        String uri="https://8e7c6b8a-fc46-4674-a529-4ebec57295d3.mock.pstmn.io/customers";
		        RestTemplate restTemplate = new RestTemplate();
		        String result = restTemplate.getForObject(uri, String.class);
		        return new ResponseEntity<>(result, HttpStatus.OK);
		    }catch (Exception e){
		        e.printStackTrace();
		        return new ResponseEntity<>("Error!, Por favor intentelo mas tarde", HttpStatus.INTERNAL_SERVER_ERROR);
		    }
	}
	
	
	@GetMapping("/age/{age}")
	public CustomersResponseBean getCustomerByName(@PathVariable("age") String age) {
		
		CustomersResponseBean bean;
		
		bean = customerService.findByName(age);
		
		return bean;
		
	}
	
	
	@PostMapping("/customers")
	public ResponseEntity<?> createAirlineRest(@RequestBody CutomersDetailBean body) {
	    try {

	        String uri="https://8e7c6b8a-fc46-4674-a529-4ebec57295d3.mock.pstmn.io/customers";

	        ResponseEntity<String> result = template.postForEntity(uri, body, String.class);

	        return new ResponseEntity<>( result.getStatusCodeValue() == 200 ? "Peticion procesada correctamente" : "Peticion no procesada correctamente", HttpStatus.OK);
	    }catch (Exception e){
	        e.printStackTrace();
	        return new ResponseEntity<>("Error!, intertarde nuevo", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	

	
}
