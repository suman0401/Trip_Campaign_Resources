package com.trip.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trip.model.Trip;
import com.trip.repository.ITripRepository;

@Service
public class ITripServiceImpl implements ITripService {
	@Autowired
	ITripRepository tripRepository;

	@Override
	public Trip addTrip(Trip trip) {
		return tripRepository.save(trip);
	}

	@Override
	public void updateTrip(Trip trip) {
		tripRepository.save(trip);
	}

	@Override
	public void deleteTrip(int tripId) {
		tripRepository.deleteById(tripId);
	}

	@Override
	public List<Trip> getallTrip() {
		return tripRepository.findAll();
	}

	@Override
	public List<Trip> getByTripName(String tripName) {
		return tripRepository.findByTripName(tripName);
	}

	@Override
	public List<Trip> getByTripOwner(String tripowner) {
		return tripRepository.findByTripOwner(tripowner);
	}

	@Override
	public List<Trip> getByTripstartDate(LocalDate tripstartdate) {
		return tripRepository.findByTripStartDate(tripstartdate);
	}

	@Override
	public List<Trip> getByTripendDate(LocalDate tripenddate) {
		return tripRepository.findByTripEndDate(tripenddate);
	}

	@Override
	public Trip getById(int tripId) {
		return tripRepository.getById(tripId);
	}

	@Override
	public List<Trip> getByTripNameAndMaintenanceMaintenenceName(String tripname, String maintenencename) {
		return tripRepository.findByTripNameAndMaintenanceMaintenenceName(tripname, maintenencename);
	}

}
