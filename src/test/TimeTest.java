package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import lesson_24.Time;

public class TimeTest {

	Time time;

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		protected void failed(Throwable e, org.junit.runner.Description description) {
			System.out.println();
			System.out.println("FAILED--> " + description.getMethodName());
		};

		protected void succeeded(org.junit.runner.Description description) {
			System.out.println();
			System.out.println("SUCCEED--> " + description.getMethodName());
		};
	};
	
	@Before
	public void beforeTest() {
		time = new Time(0, 0);
	}

	@After
	public void afterTest() {
		time = null;
	}
	
	@Test
	public void timeTest() {
		int hour = 10;
		int min = 30;
		time = new Time(hour, min);
		assertEquals(hour, time.getHour());
		assertEquals(min, time.getMin());
	}

}
