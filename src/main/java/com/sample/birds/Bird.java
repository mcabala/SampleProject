
package com.sample.birds;

import com.sample.animal.Animal;

public class Bird extends Animal {

	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("I am singing");
	}

	/**
	 * Provide information to REST API
	 * 
	 * @return
	 */

	public String birdInfo() {

		return "Most of Birds are flying and singing";

	}
}