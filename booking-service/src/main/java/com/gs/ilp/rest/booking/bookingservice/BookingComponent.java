package com.gs.ilp.rest.booking.bookingservice;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class BookingComponent {

	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private InventoryRepository inventoryRepository;
	@Autowired
	private FareServiceProxy fareServiceProxy;
	@Autowired
	private Environment env;
	

	public List<BookingRecord> getAllBookingWithFare(String from, String to, String journeyDate) {

		List<BookingRecord> flights = bookingRepository.findBySourceAndDestAndJourneyDate(from, to, journeyDate);

		Iterator<BookingRecord> iterator = flights.iterator();
		while (iterator.hasNext()) {
			BookingRecord flight = iterator.next();
			Inventory inventory = inventoryRepository.findByFlightNumber(flight.getFlightNumber());
			if (inventory.getNumberOfTicketsAvailable() == 0) {
				iterator.remove();
			}
		}

		for (BookingRecord flight : flights) {
			// call fare service to get fares
			FareResponse fare = fareServiceProxy.getFareByFlightNumber(flight.getFlightNumber());
			flight.setFare(fare.getFare());
			flight.setFareServicePort(fare.getFareServicePort());
			flight.setBookingServicePort(env.getProperty("server.port"));
		}

		return flights;
	}

}
