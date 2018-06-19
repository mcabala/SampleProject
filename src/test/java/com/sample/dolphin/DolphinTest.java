package com.sample.dolphin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.dolphin.Dolphin;

/**
 * Test class for Dolphin.
 * 
 * @author Bala
 *
 */
public class DolphinTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * test method for swim.
	 */
	@Test
	public void test() {
		Dolphin dolphin = new Dolphin();
		// dolphin.color();
		dolphin.swim();
	}
}