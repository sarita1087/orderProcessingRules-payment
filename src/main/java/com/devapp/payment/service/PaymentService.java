package com.devapp.payment.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devapp.payment.model.PaymentDetails;

/**
 * This PaymentService class is service class that will execute droops rules
 * (business rules for Payment slip.).
 * 
 * @author 91984 Sarita.
 *
 */
@Service
public class PaymentService {

	/**
	 * KieContainer reference of kieContainer.
	 */
	private final KieContainer kieContainer;

	/**
	 * Constructor based autowire the kieContainer
	 * 
	 * @param kieContainer - KieContainer
	 */
	@Autowired
	public PaymentService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	/**
	 * This method used to apply rules after payment from droops rules(business
	 * rules)
	 * 
	 * @param paymentDetails - PaymentDetails
	 * @return paymentDetails.
	 */
	public PaymentDetails applyRulesAfterPayment(PaymentDetails paymentDetails) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(paymentDetails);
		kieSession.fireAllRules();
		kieSession.dispose();
		return paymentDetails;
	}
}
