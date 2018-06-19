
package com.sample.fish;

import com.sample.animal.Animal;

public class Fish extends Animal {

	public void sing() {
		System.out.println("I am not singing");
	}

	public void walk() {
		System.out.println("I am not walking");
	}

	public void swim() {
		System.out.println("I am swimming");
	}

	/**
	 * Provide information to REST API
	 * 
	 * @return
	 */

	public String fishInfo() {

		return "All Fish are swimming";

	}
}