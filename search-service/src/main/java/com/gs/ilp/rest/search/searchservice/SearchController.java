package com.gs.ilp.rest.search.searchservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

	@Autowired
	private BookingServiceProxy bookingServiceProxy;

	// search/from/to/date
	@GetMapping("search/{from}/{to}/{date}")
	public List<SearchFlightResponse> getRequiredFlights(@PathVariable("from") String from,
			@PathVariable("to") String to, @PathVariable("date") String journeyDate) {

		return bookingServiceProxy.getAllflightsFromBookingService(from, to, journeyDate);
	}
}
