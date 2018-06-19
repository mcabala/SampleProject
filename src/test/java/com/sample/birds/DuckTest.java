package com.sample.birds;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.birds.Duck;

/**
 * Test class for Duck.
 * 
 * @author Bala
 *
 */
public class DuckTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for swim and sing.
	 */
	@Test
	public void sing() {
		Duck duck = new Duck();
		duck.swim();
		duck.sing();
	}
}