package com.tough.dev.gci;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractImpl extends Contract{
	
	private List<Service> services = new ArrayList<Service>();
	private double monthlyRate;
	
	public double getMonthlyRate() {
		return monthlyRate;
	}

	public void setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public int getNumberOfServices() {
		return services.size();
	}
	
	public void addService(Service service){
		services.add(service);
	}

	public ContractImpl(String id, Date startDate, Date endDate, String duration, double monthlyRate, List<Service> services){
		super(id,startDate,endDate,duration);
		this.monthlyRate = monthlyRate;
		this.services = services;
	}
	
	public Invoice generateAllServicesInvoice(){
		//TODO add invoice logic
		return new Invoice(0.0,null,"X",false);
	}

}
