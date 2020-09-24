package com.devapp.payment.model;

/**
 * Payment Details DTO class
 * 
 * @author 91984 Sarita
 *
 */
public class PaymentDetails {

	/**
	 * This is packingSlip for payment.
	 */
	private String packingSlip;

	/**
	 * This is type of payment.
	 */
	private String type;

	/**
	 * This is message for payment
	 */
	private String message;

	/**
	 * Getter of packingSlip
	 * 
	 * @return packingSlip
	 */
	public String getPackingSlip() {
		return packingSlip;
	}

	/**
	 * Setter of packingSlip
	 * 
	 * @param packingSlip - packingSlip
	 */
	public void setPackingSlip(String packingSlip) {
		this.packingSlip = packingSlip;
	}

	/**
	 * Getter of type
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter of type
	 * 
	 * @param type - type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter of message
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Setter of message
	 * 
	 * @param message - message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
