package com.sample.birds;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.birds.Bird;

/*
 * Test class for BirdSing.
 * 
 */
public class BirdSingTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * test method for Sing.
	 */
	@Test
	public void test() {
		Bird bird = new Bird();
		bird.sing();
	}
}