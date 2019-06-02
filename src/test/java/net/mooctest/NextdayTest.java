/**
 * 
 */
package net.mooctest;

import org.junit.Test;
import org.junit.Assert;

public class NextdayTest {

	@Test
	public void testNextDay() {
		Date Date1=new Date(6,1,2019);
		Date result=Nextday.nextDay(Date1);
		Assert.assertEquals(new Date(6,2,2019), result);
	}

	@Test
	public void test() {
		Nextday today=new Nextday();
		{};
	}
}
