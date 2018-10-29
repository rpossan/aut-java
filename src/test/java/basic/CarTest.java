package basic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cucumber.deps.com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter;

public class CarTest {
	
	public Car testCar;

	@Before
	public void setUp() throws Exception {
		this.testCar = new Car();
		this.testCar.refuel();
	}

	@Test
	public void carIsACar() {
		assertEquals(this.testCar.getClass(), Car.class);
	}

	@Test
	public void fuelIs45() {
		assertEquals(this.testCar.getFuel(), 45);
	}

	@Test
	public void testAcelerationAndFuel() {
		this.testCar.accelerate();
		assertEquals(this.testCar.getSpeed(), 10);
		assertEquals(this.testCar.getFuel(), 42);
	}

	@Test
	public void testRefueling(){
		assertTrue(this.testCar.refuel());
		assertFalse(this.testCar.refuel());
	}

	@Test
	public void testMaxSpeedy(){
		int resultSpeed = acelerateUntil(this.testCar, 20);
		assertTrue(resultSpeed <= Car.MAXSPEED);
	}
	
	public int acelerateUntil(Car car, int loops){
		for(int i = 0; i < loops; i++){
			if(car.getFuel() < 3){
				car.refuel();
			}
			car.accelerate();
		}
		return car.getSpeed();
	}
	
}
