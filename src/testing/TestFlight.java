package testing;

/* Uncomment the below code to test your application*/

import model.Flight;
import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestFlight {
	LocalDate ld = LocalDate.of(2020, 02, 03);
	LocalDate ld1 = LocalDate.of(2020, 02, 05);
	Flight flight = new Flight(2, "economy", 10000, ld, ld1,"one-way");

	@Test
	public void testGetNoOfPersonMethod() {
		flight.setNoOfPersons(5);
		assertEquals(5, flight.getNoOfPersons());
		flight.setNoOfPersons(1);
		assertEquals(1, flight.getNoOfPersons());
		try {
			flight.setNoOfPersons(0);
			flight.setNoOfPersons(-5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void testGetRateMethod() {
		flight.setRate(12000);
		assertEquals(12000, flight.getRate());
		flight.setRate(8000);
		assertEquals(8000, flight.getRate());
		try {
			flight.setRate(0);
			flight.setRate(-500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void testGetClassType() {
		flight.setClassType("economy");
		assertEquals("economy", flight.getClassType());
		try {
			flight.setClassType(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void testSetDate() {
		try {
			flight.setFrom(null);
			flight.setTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


