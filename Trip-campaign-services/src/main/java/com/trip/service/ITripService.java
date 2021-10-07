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
	List<Trip> getByTripName(String tripName);
	List<Trip> getByTripOwner(String tripType);
	List<Trip> getByTripstartDate(LocalDate trip_startdate);
	List<Trip> getByTripendDate(LocalDate trip_enddate);
//	List<Trip> getByTripNameAndProjectName(String tripname,String projectname);

}


//private String projectName;
//@Column(length = 30)
//private String projectOwner;
//private LocalDate projectStartDate;
//private LocalDate projectEndDate;
//@Enumerated(EnumType.STRING)
//private Priority projectPriority;
//@Column(length = 30)
//@Enumerated(EnumType.STRING)
//private Status projectStatus;