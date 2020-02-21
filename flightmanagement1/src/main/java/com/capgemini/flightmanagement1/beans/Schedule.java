package com.capgemini.flightmanagement1.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Schedule {
	private String sourceAirport;
	private String destinationAirport;
	private LocalDateTime arrivalTime;
	private LocalDateTime depatureTime;

	public Schedule(String sourceAirport, String destinationAirport, LocalDateTime arrivalTime,
			LocalDateTime depatureTime) {
		super();
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.depatureTime = depatureTime;
	}

	public Schedule() {
		super();
	}

	public String getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDateTime getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(LocalDateTime depatureTime) {
		this.depatureTime = depatureTime;
	}

	@Override
	public String toString() {
		return "Schedule [sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport
				+ ", arrivalTime=" + arrivalTime + ", depatureTime=" + depatureTime + "]";
	}


}
