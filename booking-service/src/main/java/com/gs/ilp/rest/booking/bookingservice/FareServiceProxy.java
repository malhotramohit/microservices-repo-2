package com.gs.ilp.rest.booking.bookingservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "flight-fare-service")
@RibbonClient(name = "flight-fare-service")
public interface FareServiceProxy {

	@GetMapping("fare/{flightNumber}")
	public FareResponse getFareByFlightNumber(@PathVariable("flightNumber") String flightNumber);
}
