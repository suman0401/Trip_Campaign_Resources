package com.resources.service;

import java.time.LocalDate;
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
	public Workers addWorkers(Workers workers) {
		return workersRepository.save(workers);
	}

	@Override
	public void updateWorkers(Workers workers) {
		workersRepository.save(workers);
	}

	@Override
	public void deleteWorkers(int workersId) {
		workersRepository.deleteById(workersId);
	}

	@Override
	public List<Workers> getallWorkers() {
		return workersRepository.findAll();
	}

	@Override
	public Workers getById(int workersId) {
		return workersRepository.getById(workersId);
	}

	@Override
	public List<Workers> getByWorkersName(String workersName) {
		return workersRepository.findByWorkersName(workersName);
	}

	@Override
	public List<Workers> getByWorkersType(String workersType) {
		return workersRepository.findByWorkersType(workersType);
	}

	@Override
	public List<Workers> getByWorkersAvailableFrom(LocalDate workersavailablefrom) {
		return workersRepository.findByWorkersavailablefrom(workersavailablefrom);
	}

	@Override
	public List<Workers> getByWorkersAvailableTo(LocalDate workersavailableto) {
		return workersRepository.findByWorkersavailableto(workersavailableto);
	}

}
