package main;

public abstract class Clock {
	protected int utcOffset;//0..24,��utcʱ��ƫ��
	public abstract int getTime();

}
