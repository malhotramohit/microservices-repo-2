package com.gs.ilp.rest.search.searchservice;

public class SearchFlightResponse {
	private long bookingId;
	private String source;
	private String dest;
	private String journeyDate;
	private String flightNumber;
	private double fare;
	private String fareServicePort;
	private String bookingServicePort;

	public SearchFlightResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchFlightResponse(long bookingId, String source, String dest, String journeyDate, String flightNumber,
			double fare, String port) {
		super();
		this.bookingId = bookingId;
		this.source = source;
		this.dest = dest;
		this.journeyDate = journeyDate;
		this.flightNumber = flightNumber;
		this.fare = fare;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}


	public String getFareServicePort() {
		return fareServicePort;
	}

	public void setFareServicePort(String fareServicePort) {
		this.fareServicePort = fareServicePort;
	}

	public String getBookingServicePort() {
		return bookingServicePort;
	}

	public void setBookingServicePort(String bookingServicePort) {
		this.bookingServicePort = bookingServicePort;
	}

}
