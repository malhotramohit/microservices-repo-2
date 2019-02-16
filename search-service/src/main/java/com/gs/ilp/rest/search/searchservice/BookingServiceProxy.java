package com.gs.ilp.rest.search.searchservice;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "flight-booking-service")
@RibbonClient(name = "flight-booking-service")
public interface BookingServiceProxy {
	
	//book/from/{source}/to/{dest}/date
	@GetMapping("book/from/{source}/to/{dest}/{date}")
	public List<SearchFlightResponse> getAllflightsFromBookingService(
			@PathVariable("source") String from, @PathVariable("dest") String 
			to,@PathVariable("date") String journeyDate);
}
