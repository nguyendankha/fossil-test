package base;

public class Vehicles {
	/**
	 * VEHICLES CHARACTERISTICS
	 */
	private int wheels;
	private int doors;
	private int seats;
	private int maxSpeed;
	
	/**
	 * Constructor for vehicle with 4 parameters
	 * @param wheels
	 * @param doors
	 * @param seats
	 * @param maxSpeed
	 */
//	public Vehicles(int wheels, int doors, int seats, int maxSpeed) {
//		this.wheels = wheels;
//		this.doors = doors;
//		this.seats = seats;
//		this.maxSpeed = maxSpeed;
//	}
	
	/**
	 * Getters & Setters
	 */
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
