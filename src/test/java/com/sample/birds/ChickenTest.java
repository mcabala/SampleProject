package com.sample.birds;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.birds.Chicken;

/**
 * Test class for Chicken.
 * 
 * @author Bala
 *
 */
public class ChickenTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * test method for fly and sing.
	 */
	@Test
	public void test() {
		Chicken chicken = new Chicken();
		chicken.fly();
		chicken.sing();
	}
}