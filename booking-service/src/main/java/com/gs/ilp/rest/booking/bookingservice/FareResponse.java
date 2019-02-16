package com.gs.ilp.rest.booking.bookingservice;

public class FareResponse {
	
	private String flightNumber;
	private long fare;
	private String fareServicePort;
	
	
	public FareResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FareResponse(String flightNumber, long fare) {
		super();
		this.flightNumber = flightNumber;
		this.fare = fare;
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
