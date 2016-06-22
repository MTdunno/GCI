package com.tough.dev.gci;

public class Service {

	/* columns of the Contract box */
	private String site = "site x";
	private String serviceName = "100 Mbps MPLS";
	private double monthlyPrice = 0.01;
	
	/*getters and setters*/
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public double getMonthlyPrice() {
		return monthlyPrice;
	}
	public void setMonthlyPrice(double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	
	public Invoice generateInvoice(){
		//TODO add invoice logic
		return new Invoice(0.0,null,"X",false);
	}
	public Service(String site, String serviceName, double monthlyPrice) {
		this.site = site;
		this.serviceName = serviceName;
		this.monthlyPrice = monthlyPrice;
	}
	
}
