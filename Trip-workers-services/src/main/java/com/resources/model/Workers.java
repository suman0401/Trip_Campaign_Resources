package com.resources.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
public class Workers {
	@Id
	@GeneratedValue(generator = "resources_gene", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "resources_gene", sequenceName = "workers_seq", allocationSize = 1, initialValue = 1)
	private Integer workersId;
	@Column(length = 40)
	private String workersName;
	@Column(length = 40)
	private String workersType;
	private LocalDate workers_availablefrom;
	private LocalDate workers_availableto;
	@Enumerated(EnumType.STRING)
	private Available availability;
	
	public Workers(String workersName, String workersType, LocalDate workers_availablefrom,
			LocalDate workers_availableto, Available availability) {
		super();
		this.workersName = workersName;
		this.workersType = workersType;
		this.workers_availablefrom = workers_availablefrom;
		this.workers_availableto = workers_availableto;
		this.availability = availability;
	}








}
