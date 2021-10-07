package com.resources.service;

import java.time.LocalDate;
import java.util.List;

import com.resources.model.Workers;


public interface IWorkersService {
	
	Workers addWorkers(Workers workers);
	void updateWorkers(Workers workers);
	void deleteWorkers(int workersId);
	
	List<Workers> getallWorkers();
	Workers getById(int workersId);
	List<Workers> getByWorkersName(String workersName);
	List<Workers> getByWorkersType(String workersType);
	List<Workers> getByWorkersAvailableFrom(LocalDate workersavailablefrom);
	List<Workers> getByWorkersAvailableTo(LocalDate workersavailableto);

}
