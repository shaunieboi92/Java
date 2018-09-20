package Car;

public class Vehicle {
	private String name;
	private String size;
	
	private int currentVelocity;
	private int currentDirections;
	
	//create constructor
	public Vehicle(String name, String size) {
		this.name=name;
		this.size=size;
		
		this.currentVelocity=0;
		this.currentDirections = 0;
	}
	public void steer(int direction) {
		this.currentDirections += direction;
		System.out.println("vehicle steer at " + currentDirections);
	}//allows for changing of velocity and direction
	
	public void move (int velocity, int direction) {
		currentVelocity = velocity;
		currentDirections=direction;
		System.out.println("vehicle move at " + currentVelocity + " in direction " + currentDirections);
	}
	
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	
	public void stop() {
		this.currentVelocity=0;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public int getCurrentDirection() {
		return currentDirections;
	}
}
