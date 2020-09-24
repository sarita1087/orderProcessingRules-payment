package com.devapp.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devapp.payment.model.PaymentDetails;
import com.devapp.payment.service.PaymentService;

@RestController
public class paymentController {

	@Autowired
	private PaymentService paymentService;

	@RequestMapping(value = "/generatePaymentSlip", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PaymentDetails> getQuestions(@RequestBody PaymentDetails paymentDetails) {

		PaymentDetails returnValue = paymentService.applyRulesAfterPayment(paymentDetails);
		
		return new ResponseEntity<PaymentDetails>(returnValue, HttpStatus.OK);
	}

}
