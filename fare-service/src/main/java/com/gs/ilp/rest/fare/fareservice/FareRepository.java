package com.gs.ilp.rest.fare.fareservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FareRepository extends JpaRepository<Fare, Long> {

	public Fare findByFlightNumber(String flightNumber);
}
