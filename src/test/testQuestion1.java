package test;

import base.Cars;

public class testQuestion1 {

	public static void main(String[] args) {
		Cars toyota = new Cars("Toyota", 100);
		Cars bmw = new Cars("BMW", 200);
		/**
		 * Question 1
		 */
		toyota.info();
		toyota.run();
		bmw.info();
		bmw.run();
	}

}
