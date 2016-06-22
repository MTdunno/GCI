package com.tough.dev.gci;

import java.util.Date;

public class ContractServiceAgreement extends Contract {

	
	public ContractServiceAgreement(String id, Date startDate, Date endDate,
			String duration, double hourlyRate, String summary) {
		super(id, startDate, endDate, duration);
		this.hourlyRate = hourlyRate;
		this.summary = summary;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	private double hourlyRate;
	private String summary;
	
}
