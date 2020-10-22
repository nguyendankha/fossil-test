package base;

public class Cars extends Vehicles implements Runnable {
	static int numThread = 1;
    static int threadAllowedToRun = 1;
	public int PRINT_NUMBERS_UPTO = 10;
	int myThreadID;
	int number = 1;
	static Object myLock = new Object();

	private String name;

	public Cars(String name, int maxSpeed) {
		this.myThreadID = numThread++;
        System.out.println("Thread ID:" + myThreadID);
		setName(name);
		setWheels(4);
		setDoors(4);
		setSeats(5);
		setMaxSpeed(maxSpeed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public synchronized String printRun() {
		return "Max speed " + getName() + " at the " + number + " starting: " + getMaxSpeed();
	}

	@Override
	public void run() {
		while (number <= PRINT_NUMBERS_UPTO) {
			System.out.println(printRun());
			number++;
			}
	}

	public void info() {
		System.out.println("\nCars: " + getName() + "\n[wheels=" + getWheels() + ", doors=" + getDoors() + ", seats="
				+ getSeats() + ", max speed=" + getMaxSpeed() + "]\n");
	}

}
