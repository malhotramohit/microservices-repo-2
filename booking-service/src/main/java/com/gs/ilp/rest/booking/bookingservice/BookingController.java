package com.gs.ilp.rest.booking.bookingservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

	@Autowired
	private BookingComponent bookingComponent;
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("book/from/{source}/to/{dest}/{date}")
	public List<BookingRecord> getAllBookingWithFare(@PathVariable("source") String from,
			@PathVariable("dest") String to, @PathVariable("date") String journeyDate) {

		List<BookingRecord> flights = bookingComponent.getAllBookingWithFare(from, to, journeyDate);

		return flights;
	}
}
