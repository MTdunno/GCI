package com.tough.dev.gci;
import java.io.IOException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;

import com.tough.dev.gci.demotest.ContractDatastoreSingleton;

@Path("/contracts")
public class ContractHomeResource {
	
	static ObjectMapper objectMapper = new ObjectMapper();
	static ContractDatastoreSingleton data = ContractDatastoreSingleton.getCds();
	
	/* This end-point grabs the JSON containing all of the current contracts*/
	@GET
	@Path("/contracts/list")
	@Produces(MediaType.APPLICATION_JSON)
	public String getContracts(){	
		try {
			String jsonString = objectMapper.writeValueAsString(data.getContracts());
			return jsonString;
		} catch (IOException e) {
			e.printStackTrace();
			return "Helpful Error Message";
		}
	}
	
	/* This end-point is for searching*/
	@POST
	@Path("/contracts/search/{query}")
	@Produces(MediaType.APPLICATION_JSON)
	public String search(@FormParam("query") String query){
		//TODO magic search stuff
		
		String jsonString = "{ \"query\" : " + query + " }";
		return jsonString;
		
	}
	
	/* This end-point grabs the number of outstanding contracts*/
	@GET
	@Path("/contracts/num")
	@Produces(MediaType.APPLICATION_JSON)
	public String getNumContracts(){
		
			String jsonString = "{ \"numContracts\" : " + data.getNumContracts() + " }";
			return jsonString;

	}
	
	/* This end-point grabs the number of current sites*/
	@GET
	@Path("/contracts/num")
	@Produces(MediaType.APPLICATION_JSON)
	public String getNumSites(){
		
			String jsonString = "{ \"numSites\" : " + data.getNumSites() + " }";
			return jsonString;

	}
	
	/* This end-point grabs the number of current sites*/
	@GET
	@Path("/contracts/num")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBilledPerMonth(){
		
			String jsonString = "{ \"billedPerMonth\" : " + data.getBilledPerMonth() + " }";
			return jsonString;

	}
	
	/* This end-point grabs the JSON containing the most current invoices*/
	@GET
	@Path("/contracts/invoices/list")
	@Produces(MediaType.APPLICATION_JSON)
	public String getInvoices(){
		try {
			String jsonString = objectMapper.writeValueAsString(data.getInvoices());
			return jsonString;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Helpful Error Message";
		}
	}

}
