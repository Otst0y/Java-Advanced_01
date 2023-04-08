package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import lesson_24.Days;
import lesson_24.Movie;
import lesson_24.Session;
import lesson_24.Time;

public class SessionTest {

	Session session;
	Movie movie;
	Days day;
	Time startTime;
	Time endTime;

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
		movie = new Movie(null, 0, 0);
		day = Days.FRIDAY;
		startTime = new Time(0, 0);
		session = new Session(movie, day, startTime);
	}

	@After
	public void afterTest() {
		movie = null;
		day = null;
		startTime = null;
	}
	
	@Test
	public void sessionTest() {
		movie = new Movie("Matrix", 2, 30);
		startTime = new Time(14, 30);
		endTime = new Time(17, 0);
		day = Days.FRIDAY;
		session = new Session(movie, day, startTime);
		assertEquals(movie, session.getMovie());
		assertEquals(day, session.getDay());
		assertEquals(startTime, session.getStartTime());
	}

}
