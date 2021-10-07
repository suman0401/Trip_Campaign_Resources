package com.trip.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Trip {

	@Id
	@GeneratedValue(generator = "trip_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "trip_gen", sequenceName = "trip_seq", initialValue = 1, allocationSize = 1)
	private Integer tripId;
	@Column(length = 40)
	private String tripName;
	@Column(length = 40)
	private String tripOwner;
	private LocalDate trip_StartDate;
	private LocalDate trip_EndDate;
	@Column(length = 40)
	@Enumerated(EnumType.STRING)
	private Priority tripPriority;
	@Column(length = 40)
	@Enumerated(EnumType.STRING)
	private Status tripStatus;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "trip")
	private Set<Maintenence> mainteneceList;
	public Trip(String tripName, String tripOwner, LocalDate trip_StartDate, LocalDate trip_EndDate,
			Priority tripPriority, Status tripStatus, Set<Maintenence> mainteneceList) {
		super();
		this.tripName = tripName;
		this.tripOwner = tripOwner;
		this.trip_StartDate = trip_StartDate;
		this.trip_EndDate = trip_EndDate;
		this.tripPriority = tripPriority;
		this.tripStatus = tripStatus;
		this.mainteneceList = mainteneceList;
	}
	

	

}
