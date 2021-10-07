package com.resources.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resources.model.Workers;
import com.resources.repository.IWorkersRepository;

@Service
public class IWorkersServiceImpl implements IWorkersService {
	@Autowired
	IWorkersRepository workersRepository;

	@Override
	public Workers addResources(Workers workers) {
		return workersRepository.save(workers);
	}

	@Override
	public void updateResources(Workers workers) {
		workersRepository.save(workers);
	}

	@Override
	public void deleteResources(int workersId) {
		workersRepository.deleteById(workersId);
	}

	@Override
	public List<Workers> getallResources() {
		return workersRepository.findAll();
	}

	@Override
	public List<Workers> getByWorkersName(String workersName) {
		return  null;
	}

	@Override
	public List<Workers> getByWorkersType(String workersType) {
		return null;
	}

	@Override
	public List<Workers> getByWorkersAvailableFrom(LocalDateTime workers_availablefrom) {
		return  null;
	}

	@Override
	public List<Workers> getByWorkersAvailableTo(LocalDateTime workers_availableto) {
		return  null;
	}

}