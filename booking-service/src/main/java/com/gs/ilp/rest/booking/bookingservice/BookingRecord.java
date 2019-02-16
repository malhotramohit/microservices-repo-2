package com.gs.ilp.rest.booking.bookingservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class BookingRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingId;
	private String source;
	private String dest;
	private String journeyDate;
	private String flightNumber;
	@Transient
	private double fare;
	@Transient
	private String fareServicePort;
	@Transient
	private String bookingServicePort;

	
	
	public BookingRecord(String source, String dest, String journeyDate, String flightNumber) {
		super();
		this.source = source;
		this.dest = dest;
		this.journeyDate = journeyDate;
		this.flightNumber = flightNumber;
	}

	public BookingRecord() {
		super();
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

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
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
