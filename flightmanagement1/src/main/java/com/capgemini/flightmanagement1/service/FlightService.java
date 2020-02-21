package com.capgemini.flightmanagement1.service;

import java.math.BigInteger;
import java.util.List;

import com.capgemini.flightmanagement1.Exception.FlightException;
import com.capgemini.flightmanagement1.beans.Flight;
import com.capgemini.flightmanagement1.beans.ScheduledFlight;

public interface FlightService {
	
	
	
	
	

	public void validateFlight(Flight flight);
	public int addFlight(Flight flight) throws FlightException;
	public Flight modifyFlight(Flight flight) throws FlightException;
	public void deleteFlight(int flightNumber) throws FlightException;
	public Flight viewFlight(int flightNumber) throws FlightException;
	public List<Flight > viewFlight() throws FlightException;
}
