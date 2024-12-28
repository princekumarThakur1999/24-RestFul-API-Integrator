package com.paypal.base.service;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.paypal.base.swiggy.response.SwiggyOrderResponse;

@Service
public class PaymentInitiatorService {
	
	//creating business logic to get data from swiggy application 
	public SwiggyOrderResponse getSwiggyOrderDetails() {
		
		//Put Producer application end point URL to connect the application
		String URL = "http://localhost:8082/22-Swiggy-app/order/fetch";
		
		//We can pass Http request header attribute
		HttpHeaders headers = new HttpHeaders();
		headers.add("Security-token", "akjdkn323k03=-@sdk#0232");
		
		//Directly we cann't assign header to resttemplate, we have to use HttpEntity 
		HttpEntity<String> entity = new HttpEntity<>(headers); //just passing http header
		
		//Create RestTemplate 
		RestTemplate resttemplate = new RestTemplate();
		ResponseEntity<SwiggyOrderResponse> response = resttemplate.exchange(URL, HttpMethod.GET, entity, SwiggyOrderResponse.class);
		
		//return swiggyorderResponse object
		return response.getBody();
	}
}
