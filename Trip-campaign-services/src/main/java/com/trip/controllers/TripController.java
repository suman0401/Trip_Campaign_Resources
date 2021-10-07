package com.trip.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trip.model.Trip;
import com.trip.service.ITripService;

@RestController
@RequestMapping("/trip-service")
public class TripController {
	@Autowired
	ITripService tripService;

	@PostMapping("/trip")
	Trip addTrip(@RequestBody Trip trip) {
		return tripService.addTrip(trip);

	}

	@PutMapping("/trip")
	void updateTrip(@RequestBody Trip trip) {
		tripService.updateTrip(trip);
	}

	@DeleteMapping("/trip/tripId/{tripId}")
	void deleteTrip(@PathVariable("tripId") int tripId) {
		tripService.deleteTrip(tripId);
	}

	@GetMapping("/trip")
	List<Trip> getallTrip() {
		return tripService.getallTrip();

	}

	@GetMapping("/trip/tripname/{tripname}")
	List<Trip> getBytripName(@PathVariable("tripname") String tripName) {
		return tripService.getByTripName(tripName);

	}

	@GetMapping("/trip/tripowner/{tripowner}")
	List<Trip> getBytripOwner(@PathVariable("/tripowner") String tripType) {
		return tripService.getByTripOwner(tripType);

	}

	@GetMapping("/trip/tripavailablefrom/{availablefrom}")
	List<Trip> getBytripAvailableFrom(@PathVariable("availablefrom") LocalDate trip_availablefrom) {
		return tripService.getByTripstartDate(trip_availablefrom);

	}

	@GetMapping("/trip/tripavailableto/{availableto}")
	List<Trip> getBytripAvailableTo(@PathVariable("availableto") LocalDate trip_availableto) {
		return tripService.getByTripendDate(trip_availableto);

	}

}
