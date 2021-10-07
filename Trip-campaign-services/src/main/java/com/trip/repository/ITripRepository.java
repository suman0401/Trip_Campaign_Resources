package com.trip.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.model.Trip;
@Repository
public interface ITripRepository extends JpaRepository<Trip, Integer> {
//derived queries	
	List<Trip> findByTripName(String tripName);
	List<Trip> findByTripOwner(String tripType);
	List<Trip> findByTripStartDate(LocalDate tripstartdate);
	List<Trip> findByTripEndDate(LocalDate tripenddate);
	
	List<Trip> findByTripNameAndMaintenanceMaintenenceName(String tripname,String maintenencename);


}
