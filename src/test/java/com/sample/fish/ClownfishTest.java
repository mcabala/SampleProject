package com.sample.fish;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.fish.Clownfish;

/**
 * Test class for Clownfish.
 */
public class ClownfishTest {

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
		Clownfish clownfish = new Clownfish();
		clownfish.color();
		clownfish.size();
	}
}