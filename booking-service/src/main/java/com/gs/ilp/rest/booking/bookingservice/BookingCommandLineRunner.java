package com.gs.ilp.rest.booking.bookingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookingCommandLineRunner implements CommandLineRunner {

	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private InventoryRepository inventoryRepository;

	@Override
	public void run(String... args) throws Exception {
		BookingRecord record1 = new BookingRecord("Delhi", "Mumbai", "16-02-2019", "DL1133M");
		BookingRecord record2 = new BookingRecord("Delhi", "Goa", "17-02-2019", "DL1133G");
		BookingRecord record3 = new BookingRecord("Punjab", "Jaipur", "18-02-2019", "PB4433JA");
		BookingRecord record4 = new BookingRecord("Bengal", "Assam", "16-02-2019", "BE9888AS");

		BookingRecord record5 = new BookingRecord("Delhi", "Mumbai", "16-02-2019", "DL9988M");
		bookingRepository.save(record1);
		bookingRepository.save(record2);
		bookingRepository.save(record3);
		bookingRepository.save(record4);
		bookingRepository.save(record5);

		Inventory inv1 = new Inventory("DL1133M", 34);
		Inventory inv2 = new Inventory("DL1133G", 0);
		Inventory inv3 = new Inventory("PB4433JA", 23);
		Inventory inv4 = new Inventory("BE9888AS", 65);

		Inventory inv5 = new Inventory("DL9988M", 12);

		inventoryRepository.save(inv1);
		inventoryRepository.save(inv2);
		inventoryRepository.save(inv3);
		inventoryRepository.save(inv4);
		inventoryRepository.save(inv5);

	}

}
