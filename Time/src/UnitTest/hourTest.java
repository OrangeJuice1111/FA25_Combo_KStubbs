package UnitTest;

import static org.junit.Assert.*;
import code.Time;
import org.junit.Test;

public class hourTest {

	@Test
	public void test() {
		Time time = new Time(6,45,30);
		
		int hour = time.getHour();
		
		assertEquals(6, hour);//first thing inside () is what you expect and the second is what you want
	}

}
