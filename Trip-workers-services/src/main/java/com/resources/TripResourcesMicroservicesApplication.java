package com.resources;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.convert.JodaTimeConverters.LocalDateTimeToDateConverter;

import com.resources.model.Available;
import com.resources.model.Task;
import com.resources.model.Workers;
import com.resources.service.IWorkersService;

@SpringBootApplication
public class TripResourcesMicroservicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TripResourcesMicroservicesApplication.class, args);
	}

	@Autowired
	IWorkersService workersService;

	@Override
	public void run(String... args) throws Exception {
		Workers worker = new Workers("suman", "technician",LocalDate.of(2021, 3, 15),LocalDate.of(2021, 3, 18), Available.STANDARD);
		workersService.addWorkers(worker);
		

	}

}
