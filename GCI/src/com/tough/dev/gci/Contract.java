package com.tough.dev.gci;

import java.util.Date;

public abstract class Contract {

	private Date startDate;
	private Date endDate;
	private String duration;
	private String id;
	
	protected Contract(String id, Date startDate, Date endDate, String duration){
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
