package net.mooctest;

import org.junit.Test;
import org.junit.Assert;

public class MonthTest {

	@Test
	public void testIncrement() {
		Month Month1=new Month(4,new Year(2019));
		Assert.assertEquals(true, Month1.increment());
		Assert.assertEquals(false, new Month(12,new Year(2018)).increment());
	}

	@Test
	public void testIsValid() {
		Assert.assertEquals(true, new Month(4,new Year(2019)).isValid());
		Assert.assertEquals(false, new Month(4,new Year(2019)).isValid());
		{};
	}


	@Test
	public void testGetMonth() {
		Assert.assertEquals(4, new Month(4,new Year(2019)).getMonth());
	}

	@Test
	public void testGetMonthSize() {
		Assert.assertEquals(29, new Month(2,new Year(2008)).getMonthSize());
		Assert.assertEquals(28, new Month(2,new Year(2019)).getMonthSize());
	}

	@Test
	public void testEqualsObject() {
		Assert.assertEquals(true, new Month(2,new Year(2008)).equals(new Month(2,new Year(2008))));
		Assert.assertEquals(false, new Month(3,new Year(2019)).equals(new Month(2,new Year(2018))));
	}

}
