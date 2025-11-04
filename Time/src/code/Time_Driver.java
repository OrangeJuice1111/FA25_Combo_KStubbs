package code;

public class Time_Driver {

	public static void main(String[] args) {
		Time time = new Time();
		Time time2 = new Time(9, 50, 37.2);
		time.setHour(13);
		time.setMinutes(45);
		time.setSeconds(40.2);
		time.printTime(time);
		System.out.println(time2);
		System.out.println(time2.equals(time2));
		Time.printTime(time);
		
		

	}

}
