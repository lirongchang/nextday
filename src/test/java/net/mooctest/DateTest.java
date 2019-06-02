package net.mooctest;

import org.junit.Assert;
import org.junit.Test;

public class DateTest {

	@Test
	public void testIncrement() {
		Date date=new Date(6,1,2019);
		date.increment();
		Date Date2=new Date(5,31,2019);
		Date2.increment();
		Date date3=new Date(12,31,2018);
		date3.increment();
	}

	@Test
	public void testPrintDate() {
		Date date=new Date(6,1,2019);
		date.printDate();
		{};
	}

	@Test
	public void testGetDay() {
		Assert.assertEquals(new Day(1,new Month(6,new Year(2019))),new Date(6,1,2019).getDay());
	}

	@Test
	public void testGetMonth() {
		Date date=new Date(6,1,2019);
		Month month=date.getMonth();
		Assert.assertEquals(new Month(6,new Year(2019)),month);
	}

	@Test
	public void testGetYear() {
		Date date=new Date(6,1,2019);
		Year year=date.getYear();
		Assert.assertEquals(new Year(2019),year);
	}

	@Test
	public void testEqualsObject() {
		Date today=new Date(6,1,2019);
		Date tomorrow=new Date(6,2,2019);
		boolean result=today.equals(tomorrow);
		Assert.assertEquals(false, result);
		result=today.equals(today);
		Assert.assertEquals(true, result);
		Day day=new Day(1,new Month(6,new Year(2019)));
		result=today.equals(day);
		Assert.assertEquals(false, result);
	}

	@Test
	public void testToString() {
		Date date=new Date(6,1,2019);
		String result=date.toString();
		Assert.assertEquals("6/1/2019", result);
	}

}
