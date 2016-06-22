package com.tough.dev.gci.demotest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.tough.dev.gci.Contract;
import com.tough.dev.gci.ContractImpl;
import com.tough.dev.gci.ContractServiceAgreement;
import com.tough.dev.gci.ContractServiceOrder;
import com.tough.dev.gci.Invoice;
import com.tough.dev.gci.Service;

public class ContractDatastoreSingleton {

	/* This was my hack/solution to not really having a database, but accessing it might look somewhat similar to querying  
	 * a database of some kind. It loads some hard-coded data and serves it up.*/
	
	
	static final ContractDatastoreSingleton cds = new ContractDatastoreSingleton();
	static private ArrayList<Contract> contracts;
	static private ArrayList<Invoice> invoices;
	static private int numSites = 18;
	static private double billedPerMonth = 52745.00;
	
	public double getBilledPerMonth() {
		return billedPerMonth;
	}

	public int getNumSites() {
		return numSites;
	}

	private ContractDatastoreSingleton(){
		initialize();
	}
	
	public ArrayList<Invoice> getInvoices() {
		return invoices;
	}

	public static ContractDatastoreSingleton getCds() {
		return cds;
	}

	public ArrayList<Contract> getContracts(){
		return contracts;
	}
	
	public int getNumContracts(){
		return contracts.size();
	}
	
	public static void initialize(){
		contracts = new ArrayList<Contract>();
		invoices = new ArrayList<Invoice>();
		
		/*--start first contract--*/
		
		ArrayList<Service> servicesC1 = new ArrayList<Service>();
		servicesC1.add(new Service("Site 1","100 Mbps MPLS", 7422.00));
		servicesC1.add(new Service("Site 2","100 Mbps MPLS", 245.00));
		servicesC1.add(new Service("Site 3","100 Mbps MPLS", 3325.00));
		servicesC1.add(new Service("Site 4","100 Mbps MPLS", 3618.00));
		servicesC1.add(new Service("Site 5","100 Mbps MPLS", 4093.00));
		
		Date startDateC1 = new Date(2014,2,1);
		Date endDateC1 = new Date(2016,2,30);
		
		ContractImpl c1 = new ContractImpl("#HB-134", startDateC1, endDateC1, "2-Year Term", 52470.00, servicesC1);
		
		contracts.add(c1);
		
		/*--end first contract--*/
		
		/*--start second contract--*/
		
		Date startDateC2 = new Date(2015,11,24);
		
		ContractServiceOrder c2 = new ContractServiceOrder("", startDateC2, null, "3-Year Term", 3485.00, "Configuration and Testing of Equipment", 275.00, "Remote Site VPN");
		
		contracts.add(c2);
		
		/*--end second contract--*/
		
		/*--start third contract--*/
		
		Date startDateC3 = new Date(2015,6,18);
		
		ContractServiceAgreement c3 = new ContractServiceAgreement("#SA-432", startDateC3, null, "1-Year Term(up to 160 hours)", 125.00, "Project Summary ...");
		
		contracts.add(c3);
		
		/*--end third contract--*/
		
		/*--start invoices--*/
		Date dueDate;
		dueDate = new Date(2016, 1, 28);
		invoices.add(new Invoice(275.00, dueDate, "#335783", false));
		dueDate = new Date(2015, 12, 30);
		invoices.add(new Invoice(51155.00, dueDate, "#312236", false));
		dueDate = new Date(2015, 11, 26);
		invoices.add(new Invoice(275.00, dueDate, "#301389", true));
		dueDate = new Date(2015, 11, 25);
		invoices.add(new Invoice(51155.00, dueDate, "#288193", true));
		dueDate = new Date(2015, 8, 27);
		invoices.add(new Invoice(49390.00, dueDate, "#279192", true));
		dueDate = new Date(2015, 7, 28);
		invoices.add(new Invoice(51155.00, dueDate, "#268381", true));
		dueDate = new Date(2015, 6, 24);
		invoices.add(new Invoice(51155.00, dueDate, "#257181", true));
		dueDate = new Date(2015, 5, 21);
		invoices.add(new Invoice(51155.00, dueDate, "#248184", true));
		
		/*--end invoices--*/
	}

	
	
	
	
}
