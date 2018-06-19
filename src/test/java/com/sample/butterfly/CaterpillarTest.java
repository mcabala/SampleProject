package com.sample.butterfly;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sample.butterfly.Caterpillar;

/**
 * Test class for Caterpillar.
 * 
 * @author Bala
 *
 */
public class CaterpillarTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * test method for fly and walk.
	 */
	@Test
	public void test() {
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.fly();
		caterpillar.walk();
	}
}