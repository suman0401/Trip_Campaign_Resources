package com.resources.service;

import java.time.LocalDateTime;
import java.util.List;

import com.resources.model.Workers;


public interface IWorkersService {
	
	Workers addResources(Workers workers);
	void updateResources(Workers workers);
	void deleteResources(int workersId);
	
	List<Workers> getallResources();
	List<Workers> getByWorkersName(String workersName);
	List<Workers> getByWorkersType(String workersType);
	List<Workers> getByWorkersAvailableFrom(LocalDateTime workers_availablefrom);
	List<Workers> getByWorkersAvailableTo(LocalDateTime workers_availableto);

}
