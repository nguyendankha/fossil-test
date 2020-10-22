package test;

import base.Cars;

public class testQuestion2And4 {
	public static void main(String[] args) {
		Cars toyota = new Cars("Toyota", 100);
		Cars bmw = new Cars("BMW", 200);
		
		/**
		 * Question 2 + 4
		 */
		Thread toyotaThread = new Thread(toyota, "toyotaThread");
		Thread bmwThread = new Thread(bmw, "bmwThread");
		toyotaThread.start();
		bmwThread.start();
	}

}
