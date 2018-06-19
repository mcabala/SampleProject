package com.sample.birds;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import com.sample.birds.Rooster;

/**
 * Test class for Rooster.
 * 
 * @author Bala
 *
 */
public class RoosterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for sing.
	 */
	@Test
	public void test() {
		Rooster rooster = new Rooster();
		rooster.sing();
	}
}