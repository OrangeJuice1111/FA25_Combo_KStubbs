package code;

public class Time {
	private int hour;
	private int minutes;
	private double seconds;
	//default constructor
	public Time()//constructor needs to be the same name as the class
	{
		
		this.hour = 0;
		this.minutes = 0;
		this.seconds = 0.0;
	}
	//values constructor
	public Time(int hour, int minutes, double seconds) {
		super();
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public double getSeconds() {
		return seconds;
	}
	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}
	public static void printTime(Time t)
	{
		System.out.printf("%02d:%02d:%04.1f \n", t.hour, t.minutes, t.seconds);
		
	}
	
	public boolean equals(Time that) 
	{
		final double DELTA = 0.001;
		return this.hour == that.hour && this.minutes == that.minutes && Math.abs(this.seconds-that.seconds)< DELTA;
	}
	public Time add(Time that)
	{
		Time sum = new Time();
		sum.hour = this.hour + that.hour;
		sum.minutes = this.minutes+that.minutes;
		sum.seconds = this.seconds+that.seconds;
		
		if(sum.seconds >= 60.0)
		{
			sum.seconds-=60.0;
			sum.minutes += 1;
		}
		if(sum.minutes >= 60)
		{
			sum.minutes -=60;
			sum.hour +=1;
		}
		if(sum.hour >= 24)
		{
			sum.hour-=24;
			
		}
		return sum;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:04.1f/n",hour,minutes,seconds);
	}
	
}
