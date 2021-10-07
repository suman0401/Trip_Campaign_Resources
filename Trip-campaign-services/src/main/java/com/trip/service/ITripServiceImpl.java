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
	ITripRepository workersRepository;

	@Override
	public Trip addTrip(Trip trip) {
		return workersRepository.save(trip);
	}

	@Override
	public void updateTrip(Trip trip) {
		workersRepository.save(trip);
	}

	@Override
	public void deleteTrip(int tripId) {
		workersRepository.deleteById(tripId);
	}

	@Override
	public List<Trip> getallTrip() {
		return workersRepository.findAll();
	}

	@Override
	public List<Trip> getByTripName(String tripName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trip> getByTripOwner(String tripType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trip> getByTripstartDate(LocalDate trip_startdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trip> getByTripendDate(LocalDate trip_enddate) {
		// TODO Auto-generated method stub
		return null;
	}





}
