package com.resources.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resources.model.Workers;
@Repository
public interface IWorkersRepository extends JpaRepository<Workers, Integer> {
	
//derived queries
	List<Workers> findByWorkersName(String workersName);
	List<Workers> findByWorkersType(String workersType);
	List<Workers> findByWorkersavailablefrom(LocalDate availableFrom);
	List<Workers> findByWorkersavailableto(LocalDate availableTo);

}
