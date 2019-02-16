package com.gs.ilp.rest.fare.fareservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FareController {

	@Autowired
	private FareRepository fareRepository;
	@Autowired
	private Environment env;

	@GetMapping("fare/{flightNumber}")
	public Fare getFareByFlightNumber(@PathVariable("flightNumber") String flightNumber) {
		Fare fare = fareRepository.findByFlightNumber(flightNumber);
		fare.setFareServicePort(env.getProperty("server.port"));
		return fare;
	}
}
