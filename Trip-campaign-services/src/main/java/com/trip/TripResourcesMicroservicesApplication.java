package com.trip;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trip.model.*;
import com.trip.service.ITripService;

@SpringBootApplication
public class TripResourcesMicroservicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TripResourcesMicroservicesApplication.class, args);
	}

	@Autowired
	ITripService tripService;

	@Override
	public void run(String... args) throws Exception {

		Trip trip = new Trip("Ladakh", "Suman", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 25), Priority.HIGH,Status.INPROGRESS, null);
		tripService.addTrip(trip);
		

	}

}
