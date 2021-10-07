package com.trip.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.trip.model.Priority;
import com.trip.model.Status;
import com.trip.model.Trip;


public interface ITripService {
	
	Trip addTrip(Trip trip);
	void updateTrip(Trip trip);
	void deleteTrip(int tripId);
	
	List<Trip> getallTrip();
	Trip getById(int tripId);
	List<Trip> getByTripName(String tripName);
	List<Trip> getByTripOwner(String tripowner);
	List<Trip> getByTripstartDate(LocalDate tripstartdate);
	List<Trip> getByTripendDate(LocalDate tripenddate);
	List<Trip> getByTripNameAndMaintenanceMaintenenceName(String tripname,String maintenencename);

}


