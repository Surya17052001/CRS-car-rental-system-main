package com.carrentalsystem.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int paymentId;
	private String paymentType;
	private double paymentPrice;
@OneToOne
private Customer customer;
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}
public double getPaymentPrice() {
	return paymentPrice;
}
public void setPaymentPrice(double paymentPrice) {
	this.paymentPrice = paymentPrice;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
