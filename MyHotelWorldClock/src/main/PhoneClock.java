package main;

public class PhoneClock extends Clock{
	private int time;
	private HotelWorldClockSystem hwcs;
	public PhoneClock(int utcOffset) {
		super.utcOffset = utcOffset;
	}
	public void setTime(int time) {//���������ֻ���ʱ�ӵ�������ʱ��
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
