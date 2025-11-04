package UnitTest;

import static org.junit.Assert.*;

import code.Time;

import org.junit.Test;

public class minuteTest {

	@Test
	public void test() {
		Time time = new Time(6,45,30);
		
		int minute = time.getMinutes();
		
		assertEquals(45, minute);
		
	}

}
