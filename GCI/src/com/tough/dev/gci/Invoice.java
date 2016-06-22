package com.tough.dev.gci;

import java.util.Date;

public class Invoice {
	
	private double amount;
	private Date dueDate;
	private String id;
	private boolean paid;
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Invoice(double amount, Date dueDate, String id, boolean paid) {
		this.amount = amount;
		this.dueDate = dueDate;
		this.id = id;
		this.paid = paid;
	}

}
