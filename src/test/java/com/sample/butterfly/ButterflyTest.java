package com.sample.butterfly;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.butterfly.Butterfly;

/**
 * Test class for Butterfly.
 * 
 * @author Bala
 *
 */
public class ButterflyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * test method for sing and fly.
	 */
	@Test
	public void test() {
		Butterfly butterfly = new Butterfly();
		butterfly.sing();
		butterfly.fly();
	}
}