package main;

public class CityClock extends Clock{
	private int utcZeroTime;//0..24,utcʱ��
	
	public CityClock(int utcOffset) {
		super.utcOffset = utcOffset;
	}
	public int getTime() {
		int result_time;
		result_time = (super.utcOffset+this.utcZeroTime+24)%24;
		return result_time;
	}
    public void setUtcZeroTime(int utcZeroTime) {
    	this.utcZeroTime = utcZeroTime;
    }
}
