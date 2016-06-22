package com.tough.dev.gci.demotest;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.tough.dev.gci.Contract;
import com.tough.dev.gci.ContractHomeResource;
import com.tough.dev.gci.ContractImpl;
import com.tough.dev.gci.Service;

public class BasicTest {

	public static void main(String[] args) {
		
		ContractHomeResource resource = new ContractHomeResource();
		
		System.out.println("Contracts");
		System.out.println(resource.getContracts());
		System.out.println();
		
		System.out.println("Number of Contracts");
		System.out.println(resource.getNumContracts());
		System.out.println();
		
		System.out.println("Search");
		System.out.println(resource.search("This"));
		System.out.println(resource.search("That"));
		System.out.println();
		
		System.out.println("Number of Sites");
		System.out.println(resource.getNumSites());
		System.out.println();
		
		System.out.println("Invoices");
		System.out.println(resource.getInvoices());
		System.out.println();
		
		System.out.println("Billed Per Month");
		System.out.println(resource.getBilledPerMonth());
		System.out.println();
		
		

	}

}
