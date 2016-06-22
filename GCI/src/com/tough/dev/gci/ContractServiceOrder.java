package com.tough.dev.gci;

import java.util.Date;

public class ContractServiceOrder extends Contract {
	
	private double monthlyRate;
	private double oneTimeCost;
	private String recurringCostDescription;
	private String ontTimeCostDescription;

	public double getMonthlyRate() {
		return monthlyRate;
	}

	public void setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public double getOneTimeCost() {
		return oneTimeCost;
	}

	public void setOneTimeCost(double oneTimeCost) {
		this.oneTimeCost = oneTimeCost;
	}

	public String getRecurringCostDescription() {
		return recurringCostDescription;
	}

	public void setRecurringCostDescription(String recurringCostDescription) {
		this.recurringCostDescription = recurringCostDescription;
	}

	public String getOntTimeCostDescription() {
		return ontTimeCostDescription;
	}

	public void setOntTimeCostDescription(String ontTimeCostDescription) {
		this.ontTimeCostDescription = ontTimeCostDescription;
	}

	public ContractServiceOrder(String id, Date startDate, Date endDate,
			String duration, double oneTimeCost, String oneTimeCostDescription, double monthlyRate, String recurringCostDescription) {
		super(id, startDate, endDate, duration);
		this.oneTimeCost = oneTimeCost;
		this.ontTimeCostDescription = oneTimeCostDescription;
		this.monthlyRate = monthlyRate;
		this.recurringCostDescription = recurringCostDescription;
	}
	
	public Invoice generateOneTimeCostInvoice(){
		//TODO add invoice logic
		return new Invoice(0.0,null,"X",false);
	}
	
	public Invoice generateRecurringCostInvoice(){
		//TODO add invoice logic
		return new Invoice(0.0,null,"X",false);
	}

}
