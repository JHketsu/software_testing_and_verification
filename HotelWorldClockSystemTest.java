package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import main.*;

class HotelWorldClockSystemTest {

	private HotelWorldClockSystem hwcs = new HotelWorldClockSystem();;
	private PhoneClock phoneClock = new PhoneClock(8);;

	@Test
	void the_time_of_the_Beijing_CLock_should_be_13_after_the_phone_time_is_set_to_13_Beijing_time() {
		//Arrange
		CityClock beijingClock = new CityClock(8);
		hwcs.attach(beijingClock);
		//Act
		phoneClock.setHotelWorldClockSystem(hwcs);
		phoneClock.setTime(13);
		//Assert
		assertEquals(13,beijingClock.getTime());
	}
	
	@Test
	void the_time_of_the_London_CLock_should_be_5_after_the_phone_time_is_set_to_13_Beijing_time() {
		//Arrange
		CityClock londonClock = new CityClock(0);
		hwcs.attach(londonClock);
		//Act
		phoneClock.setHotelWorldClockSystem(hwcs);
		phoneClock.setTime(13);
		//Assert
		assertEquals(5,londonClock.getTime());
	}
	
	@Test
	void the_time_of_the_Moscow_CLock_should_be_9_after_the_phone_time_is_set_to_13_Beijing_time() {
		//Arrange
		CityClock moscowClock = new CityClock(4);
		hwcs.attach(moscowClock);
		//Act
		phoneClock.setHotelWorldClockSystem(hwcs);
		phoneClock.setTime(13);
		//Assert
		assertEquals(9,moscowClock.getTime());
	}
	@Test
	void the_time_of_the_Sydney_CLock_should_be_15_after_the_phone_time_is_set_to_13_Beijing_time() {
		//Arrange
		CityClock sydneyClock = new CityClock(10);
		hwcs.attach(sydneyClock);
		//Act
		phoneClock.setHotelWorldClockSystem(hwcs);
		phoneClock.setTime(13);
		//Assert
		assertEquals(15,sydneyClock.getTime());
	}
	@Test
	void the_time_of_the_NewYork_CLock_should_be_0_after_the_phone_time_is_set_to_13_Beijing_time() {
		//Arrange
		CityClock newyorkClock = new CityClock(-5);
		hwcs.attach(newyorkClock);
		//Act
		phoneClock.setHotelWorldClockSystem(hwcs);
		phoneClock.setTime(13);
		//Assert
		assertEquals(0,newyorkClock.getTime());
	}

}
