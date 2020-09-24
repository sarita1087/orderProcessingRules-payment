package com.devapp.payment;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * This OrderProcessingPaymentApp Spring boot application class to start the
 * application.
 * 
 * @author 91984 Sarita
 *
 */
@SpringBootApplication
public class OrderProcessingPaymentApp {

	/**
	 * Run the Spring Application.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(OrderProcessingPaymentApp.class, args);

	}

	/**
	 * Initializing the KieContainer.
	 * 
	 * @return KieContainer
	 */
	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}
}
