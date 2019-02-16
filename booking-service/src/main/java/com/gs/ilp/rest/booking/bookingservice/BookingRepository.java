package com.gs.ilp.rest.booking.bookingservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingRecord, Long> {

	public List<BookingRecord> findBySourceAndDestAndJourneyDate(String from, String to, String journeyDate);

}
