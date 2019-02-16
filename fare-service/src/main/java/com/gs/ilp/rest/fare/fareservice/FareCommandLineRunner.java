package com.gs.ilp.rest.fare.fareservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FareCommandLineRunner implements CommandLineRunner {

	@Autowired
	private FareRepository fareRepository;

	@Override
	public void run(String... args) throws Exception {

		Fare fare1 = new Fare("DL1133M", 67000);
		Fare fare2 = new Fare("DL1133G", 70000);
		Fare fare3 = new Fare("PB4433JA", 34000);
		Fare fare4 = new Fare("BE9888AS", 23000);
		
		Fare fare5 = new Fare("DL9988M", 25000);

		
		fareRepository.save(fare1);
		fareRepository.save(fare2);
		fareRepository.save(fare3);
		fareRepository.save(fare4);
		fareRepository.save(fare5);

	}

}
