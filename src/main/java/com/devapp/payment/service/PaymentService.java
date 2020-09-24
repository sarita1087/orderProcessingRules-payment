package com.devapp.payment.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devapp.payment.model.PaymentDetails;

@Service
public class PaymentService {
	private final KieContainer kieContainer;

	@Autowired
	public PaymentService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public PaymentDetails applyRulesAfterPayment(PaymentDetails paymentDetails) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(paymentDetails);
		kieSession.fireAllRules();
		kieSession.dispose();
		return paymentDetails;
	}
}
