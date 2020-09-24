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

/**
 * This PaymentController is rest controller class that will generate payment
 * slip based on the business rule.
 * 
 * @author 91984 Sarita
 *
 */
@RestController
public class PaymentController {

	/**
	 * paymentService is reference of PaymentService
	 */
	@Autowired
	private PaymentService paymentService;

	/**
	 * This generatePaymentSlip() is http post method to generate payment slip based
	 * on the business rule by passing the json input payment type as video or
	 * physical product .
	 * 
	 * @param paymentDetails - PaymentDetails
	 * @return ResponseEntity - PaymentDetails
	 */
	@RequestMapping(value = "/generatePaymentSlip", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PaymentDetails> generatePaymentSlip(@RequestBody PaymentDetails paymentDetails) {

		PaymentDetails returnValue = paymentService.applyRulesAfterPayment(paymentDetails);

		return new ResponseEntity<PaymentDetails>(returnValue, HttpStatus.OK);
	}

}
