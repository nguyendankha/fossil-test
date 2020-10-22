package test;

import base.Cars;

public class testQuestion3 {

	public static void main(String[] args) {
		Cars toyota = new Cars("Toyota", 100);
		Cars bmw = new Cars("BMW", 200);
		
		/**
         * Question 3
         */
		Thread toyotaThread = new Thread(toyota, "toyotaThread");
		Thread bmwThread = new Thread(bmw, "bmwThread");
		toyotaThread.start();
		try {
			toyotaThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bmwThread.start();
	}

}
