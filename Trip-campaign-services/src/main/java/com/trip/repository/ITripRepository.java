package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.model.Trip;
@Repository
public interface ITripRepository extends JpaRepository<Trip, Integer> {
	

}
