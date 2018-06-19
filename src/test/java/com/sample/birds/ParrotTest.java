package com.sample.birds;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.birds.Bird;
import com.sample.birds.ParrotWithCat;
import com.sample.birds.ParrotWithDog;
import com.sample.birds.ParrotWithRooster;

/**
 * Test class for Parrot.
 * 
 * @author Bala
 *
 */
public class ParrotTest {

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
		Bird b1 = new ParrotWithDog();
		b1.sing();
		b1 = new ParrotWithCat();
		b1.sing();
		b1 = new ParrotWithRooster();
		b1.sing();
	}
}