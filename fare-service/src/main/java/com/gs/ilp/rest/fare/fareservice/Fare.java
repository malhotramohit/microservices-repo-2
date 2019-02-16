package com.gs.ilp.rest.fare.fareservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Fare {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seq;
	private String flightNumber;
	private long fare;
	
	@Transient
	private String fareServicePort;
	

	public Fare(long seq, String flightNumber, long fare) {
		super();
		this.seq = seq;
		this.flightNumber = flightNumber;
		this.fare = fare;
	}
	

	public Fare(String flightNumber, long fare) {
		super();
		this.flightNumber = flightNumber;
		this.fare = fare;
	}


	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public long getFare() {
		return fare;
	}

	public void setFare(long fare) {
		this.fare = fare;
	}


	public String getFareServicePort() {
		return fareServicePort;
	}


	public void setFareServicePort(String fareServicePort) {
		this.fareServicePort = fareServicePort;
	}

}
