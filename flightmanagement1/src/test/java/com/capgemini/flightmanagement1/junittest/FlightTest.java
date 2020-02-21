package com.capgemini.flightmanagement1.junittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.capgemini.flightmanagement1.Exception.FlightException;
import com.capgemini.flightmanagement1.beans.Flight;
import com.capgemini.flightmanagement1.dao.FlightDao;
import com.capgemini.flightmanagement1.dao.FlightDaoImpl;

class FlightTest {
	FlightDao dao=null;
	
	
	
@Before
void addFlight(){
	 dao=new FlightDaoImpl();
	
}

	@Test
	 void testAddFlight() throws FlightException{
		Flight flight = new Flight();
		
		int num=dao.addFlight(flight);
				
				
		List<Flight> l =dao.viewFlight();
		assertEquals(1,l.size());
		
	 
	}
//	@Test
//	public void testDeleteFlight() {
//		
//	}
	
	

}
