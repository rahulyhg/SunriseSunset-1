/*
 The MIT License (MIT)

 Copyright (c) <year> <copyright holders>

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import main.java.SunriseSunset;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The {@link SunriseSunsetTest} tests the implementation of the
 * {@link SunriseSunset} class
 * 
 * @version 1.0
 */
public class SunriseSunsetTest extends BaseTestCase {
	private SunriseSunset calc;

	/**
	 * Setup of the {@link SunriseSunsetTest}
	 */
	@Before
	public void setup() {
		// November 1, 2008
		super.setup(10, 1, 2008);
		calc = new SunriseSunset("America/New_York", "39.9937", "-75.7850");
	}

	/**
	 * Tear down of the {@link SunriseSunsetTest}
	 */
	@After
	public void tearDown() {
		super.tearDown();
	}

	/**
	 * {@link main.java.SunriseSunset#getAstronomicalSunrise(Calendar)}
	 */
	@Test
	public void testComputeAstronomicalSunrise() {
		assertTimeEquals("06:01", calc.getAstronomicalSunrise(eventDate),
				eventDate.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getAstronomicalSunriseCalendar(Calendar)}
	 */
	@Test
	public void testComputeAstronomicalSunriseCalendar() {
		GregorianCalendar astronomicalSunrise = (GregorianCalendar) calc
				.getAstronomicalSunriseCalendar(eventDate);
		assertNotNull(astronomicalSunrise);
		assertEquals("Sat Nov 01 10:01:00 UTC 2008", astronomicalSunrise
				.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getAstronomicalSunset(Calendar)}
	 */
	@Test
	public void testComputeAstronomicalSunset() {
		assertTimeEquals("19:32", calc.getAstronomicalSunset(eventDate),
				eventDate.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getAstronomicalSunsetCalendar(Calendar)}
	 */
	@Test
	public void testComputeAstronomicalSunsetCalendar() {
		GregorianCalendar astronomicalSunset = (GregorianCalendar) calc
				.getAstronomicalSunsetCalendar(eventDate);
		assertNotNull(astronomicalSunset);
		assertEquals("Sat Nov 01 23:32:00 UTC 2008", astronomicalSunset
				.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getNauticalSunrise(Calendar)}
	 */
	@Test
	public void testComputeNauticalSunrise() {
		assertTimeEquals("06:33", calc.getNauticalSunrise(eventDate), eventDate
				.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getNauticalSunriseCalendar(Calendar)}
	 */
	@Test
	public void testComputeNauticalSunriseCalendar() {
		GregorianCalendar nauticalSunrise = (GregorianCalendar) calc
				.getNauticalSunriseCalendar(eventDate);
		assertNotNull(nauticalSunrise);
		assertEquals("Sat Nov 01 10:33:00 UTC 2008", nauticalSunrise.getTime()
				.toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getNauticalSunset(Calendar)}
	 */
	@Test
	public void testComputeNauticalSunset() {
		assertTimeEquals("19:00", calc.getNauticalSunset(eventDate), eventDate
				.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getNauticalSunsetCalendar(Calendar)}
	 */
	@Test
	public void testComputeNauticalSunsetCalendar() {
		GregorianCalendar nauticalSunset = (GregorianCalendar) calc
				.getNauticalSunsetCalendar(eventDate);
		assertNotNull(nauticalSunset);
		assertEquals("Sat Nov 01 23:00:00 UTC 2008", nauticalSunset.getTime()
				.toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getCivilSunrise(Calendar)}
	 */
	@Test
	public void testComputeCivilSunrise() {
		assertTimeEquals("07:05", calc.getCivilSunrise(eventDate), eventDate
				.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getCivilSunriseCalendar(Calendar)}
	 */
	@Test
	public void testComputeCivilSunriseCalendar() {
		GregorianCalendar civilSunrise = (GregorianCalendar) calc
				.getCivilSunriseCalendar(eventDate);
		assertNotNull(civilSunrise);
		assertEquals("Sat Nov 01 11:05:00 UTC 2008", civilSunrise.getTime()
				.toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getCivilSunset(Calendar)}
	 */
	@Test
	public void testComputeCivilSunset() {
		assertTimeEquals("18:28", calc.getCivilSunset(eventDate), eventDate
				.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getCivilSunsetCalendar(Calendar)}
	 */
	@Test
	public void testComputeCivilSunsetCalendar() {
		GregorianCalendar civilSunset = (GregorianCalendar) calc
				.getCivilSunsetCalendar(eventDate);
		assertNotNull(civilSunset);
		assertEquals("Sat Nov 01 22:28:00 UTC 2008", civilSunset.getTime()
				.toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getOfficialSunrise(Calendar)}
	 */
	@Test
	public void testComputeOfficialSunrise() {
		assertTimeEquals("07:33", calc.getOfficialSunrise(eventDate), eventDate
				.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getOfficialSunriseCalendar(Calendar)}
	 */
	@Test
	public void testComputeOfficialSunriseCalendar() {
		GregorianCalendar officialSunrise = (GregorianCalendar) calc
				.getOfficialSunriseCalendar(eventDate);
		assertNotNull(officialSunrise);
		assertEquals("Sat Nov 01 11:33:00 UTC 2008", officialSunrise.getTime()
				.toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getOfficialSunrise(Calendar)}
	 */
	@Test
	public void testComputeOfficialSunset() {
		assertTimeEquals("18:00", calc.getOfficialSunset(eventDate), eventDate
				.getTime().toString());
	}

	/**
	 * {@link main.java.SunriseSunset#getOfficialSunsetCalendar(Calendar)}
	 */
	@Test
	public void testComputeOfficialSunsetCalendar() {
		GregorianCalendar officialSunset = (GregorianCalendar) calc
				.getOfficialSunsetCalendar(eventDate);
		assertNotNull(officialSunset);
		assertEquals("Sat Nov 01 22:00:00 UTC 2008", officialSunset.getTime()
				.toString());
	}

	/**
	 * Tests specific location with a different {@link TimeZone}
	 */
	@Test
	public void testSpecificDateLocationAndTimezone() {
		SunriseSunset calculator = new SunriseSunset("GMT", "55.03", "82.91");

		Calendar calendar = Calendar.getInstance();
		calendar.set(2012, 4, 7);

		String officialSunriseForDate = calculator.getOfficialSunrise(calendar);
		assertEquals("22:35", officialSunriseForDate);

		Calendar officialSunriseCalendarForDate = calculator
				.getOfficialSunriseCalendar(calendar);
		assertEquals(22,
				officialSunriseCalendarForDate.get(Calendar.HOUR_OF_DAY));
		assertEquals(35, officialSunriseCalendarForDate.get(Calendar.MINUTE));
		assertEquals(6,
				officialSunriseCalendarForDate.get(Calendar.DAY_OF_MONTH));
	}

	/**
	 * Tests a {@link TimeZone} offset
	 */
	@Test
	public void testNonIntegerTimezoneOffset() {
		SunriseSunset calculator = new SunriseSunset("Asia/Kolkata", "22.56",
				"88.36");

		Calendar calendar = Calendar.getInstance();
		calendar.set(2014, 12, 15);

		String officialSunriseForDate = calculator.getOfficialSunrise(calendar);
		assertEquals("06:19", officialSunriseForDate);
	}
	
	/**
	 * Example test
	 */
	@Test
	public void testLondon() {
		SunriseSunset london = new SunriseSunset("Europe/London", 51.507351, -0.127758);
		
		Calendar date = Calendar.getInstance();
		date.set(2015, 5, 9);
		String sunrise = london.getOfficialSunrise(date);
		String sunset = london.getOfficialSunset(date);
		
		System.out.println(sunrise);
		System.out.println(sunset);
	}
}
