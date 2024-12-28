package com.paypal.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.base.service.PaymentInitiatorService;
import com.paypal.base.swiggy.response.SwiggyOrderResponse;

@RestController
@RequestMapping("/payment")
public class PaymentInitiator {
	
	@Autowired
	PaymentInitiatorService paymentService;
	
	@GetMapping("/info")
	public String getPaymentInfo() {
		
		return "Welcome to Paypal Payment world to Connect Bank and Make Payment." ;
	}
	
	//Get Swiggy details from paypal application : Using RestAPI
	//http://localhost:8082/22-Swiggy-app/order/fetch
	//Get - Method call
	@GetMapping("/swiggy/order/info")
	public SwiggyOrderResponse getSwiggyOrderDetails() {
		
		//calling is happening from controller layer to service layer
		//get data from service layer
		SwiggyOrderResponse response = paymentService.getSwiggyOrderDetails();
		
		return response;
	}
		
}
