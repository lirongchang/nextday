package net.mooctest;

import org.junit.Test;
import org.junit.Assert;

public class DayTest {

	@Test
	public void testIncrement() {
		Day Day1=new Day(29,new Month(4,new Year(2019)));
		Assert.assertEquals(true, Day1.increment());
		Assert.assertEquals(false, new Day(30,new Month(4,new Year(2019))).increment());
	}

	@Test
	public void testIsValid() {
		Assert.assertEquals(true, new Day(29,new Month(4,new Year(2019))).isValid());
		{};
	}

	@Test
	public void testGetDay() {
		Assert.assertEquals(29, new Day(29,new Month(4,new Year(2019))).getDay());
	}

	@Test
	public void testEqualsObject() {
		Assert.assertEquals(true, new Day(29,new Month(4,new Year(2019))).equals(new Day(29,new Month(4,new Year(2019)))));
		Assert.assertEquals(false, new Day(29,new Month(4,new Year(2019))).equals(new Day(1,new Month(6,new Year(2019)))));
	}

}
