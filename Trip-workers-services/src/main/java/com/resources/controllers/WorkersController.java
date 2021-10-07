package com.resources.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resources.model.Workers;
import com.resources.service.IWorkersService;

@RestController
@RequestMapping("/workers-service")
public class WorkersController {
	@Autowired
	IWorkersService workersService;

	@PostMapping("/workers")
	Workers addWorkers(@RequestBody Workers workers) {
		return workersService.addWorkers(workers);

	}

	@PutMapping("/workers")
	void updateWorkers(@RequestBody Workers workers) {
		workersService.updateWorkers(workers);
	}

	@DeleteMapping("/workers/workersId/{workersId}")
	void deleteWorkers(@PathVariable("workersId") int workersId) {
		workersService.deleteWorkers(workersId);
	}

	@GetMapping("/workers")
	List<Workers> getallWorkers() {
		return workersService.getallWorkers();

	}

	@GetMapping("/workers/workersId/{workersId}")
	Workers getById(@PathVariable("workersId") int workersId) {
		return workersService.getById(workersId);

	}

	@GetMapping("/workers/workersname/{workersname}")
	List<Workers> getByWorkersName(@PathVariable("workersname") String workersName) {
		return workersService.getByWorkersName(workersName);

	}

	@GetMapping("/workers/workerstype/{workerstype}")
	List<Workers> getByWorkersType(@PathVariable("/workerstype") String workersType) {
		return workersService.getByWorkersType(workersType);

	}

	@GetMapping("/workers/workersavailablefrom/{availablefrom}")
	List<Workers> getByWorkersAvailableFrom(@PathVariable("availablefrom") LocalDate workersavailablefrom) {
		return workersService.getByWorkersAvailableFrom(workersavailablefrom);

	}

	@GetMapping("/workers/workersavailableto/{availableto}")
	List<Workers> getByWorkersAvailableTo(@PathVariable("availableto") LocalDate workersavailableto) {
		return workersService.getByWorkersAvailableTo(workersavailableto);

	}

}
