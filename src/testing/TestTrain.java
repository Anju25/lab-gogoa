package testing;

// Uncomment the below code to test your application

import model.Train;
import java.time.LocalDate;
import static org.junit.Assert.*;  
import org.junit.Test;

public class TestTrain {
	LocalDate ld = LocalDate.of(2020, 02, 03);
	Train train = new Train(2,1500,"nonac",ld);
	
	@Test
	public void testGetNoOfPersonMethod() {
		train.setNoOfPersons(5);
		assertEquals(5,train.getNoOfPersons());
		train.setNoOfPersons(1);
		assertEquals(1,train.getNoOfPersons());
		try {
			train.setNoOfPersons(0);
			train.setNoOfPersons(-5);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testGetRateMethod() {
		train.setRate(12000);
		assertEquals(12000,train.getRate());
		train.setRate(8000);
		assertEquals(8000,train.getRate());
		try {
			train.setRate(0);
			train.setRate(-500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testGetBerth() {
		train.setBerth("ac1");
		assertEquals("ac1",train.getBerth());
		try {
			train.setBerth(null);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetDate() {
		try {
			train.setDate(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


