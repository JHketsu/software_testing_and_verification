package main;

public class PhoneClock extends Clock{
	private int time;
	private HotelWorldClockSystem hwcs;
	public PhoneClock(int utcOffset) {
		super.utcOffset = utcOffset;
	}
	public void setTime(int time) {//根据输入手机的时钟调整其他时钟
		this.time = time;
		if (this.hwcs == null) {
			return;
		}
		for(CityClock cc : hwcs.getClocks()) {
			cc.setUtcZeroTime(time-super.utcOffset);//
		}
	}
	public void setHotelWorldClockSystem(HotelWorldClockSystem hwcs) {
		this.hwcs = hwcs;
	}
		
	public int getTime() {
		return this.time;
	}
	
	

}
