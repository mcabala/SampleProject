package com.sample.fish;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.fish.Shark;

/**
 * Test class for Shark.
 * 
 * @author Bala
 *
 */
public class SharkTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for color and size.
	 */
	@Test
	public void test() {
		Shark shark = new Shark();
		shark.color();
		shark.size();
	}
}