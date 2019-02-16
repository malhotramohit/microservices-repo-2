package com.gs.ilp.rest.booking.bookingservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	Inventory findByFlightNumber(String flightNumber);

}
