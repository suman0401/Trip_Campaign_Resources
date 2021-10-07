package com.resources.controllers;

import java.time.LocalDateTime;
import java.util.List;

import javax.websocket.server.PathParam;

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
	Workers addResources(@RequestBody Workers workers) {
		return workersService.addResources(workers);

	}

	@PutMapping("/workers")
	void updateResources(@RequestBody Workers workers) {
		workersService.updateResources(workers);
	}

	@DeleteMapping("/workers/workersId/{workersId}")
	void deleteResources(@PathVariable("workersId") int workersId) {
		workersService.deleteResources(workersId);
	}

	@GetMapping("/workers")
	List<Workers> getallResources() {
		return workersService.getallResources();

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
	List<Workers> getByWorkersAvailableFrom(@PathVariable("availablefrom") LocalDateTime workers_availablefrom) {
		return workersService.getByWorkersAvailableFrom(workers_availablefrom);

	}

	@GetMapping("/workers/workersavailableto/{availableto}")
	List<Workers> getByWorkersAvailableTo(@PathVariable("availableto") LocalDateTime workers_availableto) {
		return workersService.getByWorkersAvailableTo(workers_availableto);

	}

}