package main;
import java.util.*;

public class HotelWorldClockSystem {
    private ArrayList<CityClock> cityclocks= new ArrayList<CityClock>();
	public void attach(CityClock cityClock) {
		this.cityclocks.add(cityClock);
	}
	public ArrayList<CityClock> getClocks() {
		return this.cityclocks;
	}
}
