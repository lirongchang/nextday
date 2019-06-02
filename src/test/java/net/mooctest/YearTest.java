package net.mooctest;

import org.junit.Test;
import org.junit.Assert;

public class YearTest {

	@Test
	public void testIncrement() {
		Year Year1=new Year(2019);
		Assert.assertEquals(true, Year1.increment());
		Year year2=new Year(-1);
		Assert.assertEquals(true, year2.increment());
	}

	@Test
	public void testIsValid() {
		Year year1=new Year(2019);
		Assert.assertEquals(true, year1.isValid());
		Assert.assertEquals(false, year1.isValid());
		{};
	}

	@Test
	public void testGetYear() {
		Assert.assertEquals(2019, new Year(2019).getYear());
	}

	@Test
	public void testIsLeap() {
		Assert.assertEquals(true, new Year(2008).isLeap());
		Assert.assertEquals(false, new Year(2009).isLeap());
		Assert.assertEquals(true, new Year(2000).isLeap());
		Assert.assertEquals(true, new Year(-2001).isLeap());
	}

	@Test
	public void testEqualsObject() {
		Assert.assertEquals(false, new Year(2019).equals(new Year(2018)));
		Assert.assertEquals(true, new Year(2019).equals(new Year(2019)));
	}

}
