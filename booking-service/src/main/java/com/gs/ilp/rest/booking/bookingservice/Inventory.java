package com.gs.ilp.rest.booking.bookingservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seq;
	private String flightNumber;
	private int numberOfTicketsAvailable;

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(long seq, String flightNumber, int numberOfTicketsAvailable) {
		super();
		this.seq = seq;
		this.flightNumber = flightNumber;
		this.numberOfTicketsAvailable = numberOfTicketsAvailable;
	}
	
	public Inventory(String flightNumber, int numberOfTicketsAvailable) {
		super();
		this.flightNumber = flightNumber;
		this.numberOfTicketsAvailable = numberOfTicketsAvailable;
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

	public int getNumberOfTicketsAvailable() {
		return numberOfTicketsAvailable;
	}

	public void setNumberOfTicketsAvailable(int numberOfTicketsAvailable) {
		this.numberOfTicketsAvailable = numberOfTicketsAvailable;
	}

}
