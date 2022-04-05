package oops;

public class Car{
	public static String someProperty;

	private String fuelType;
	private int noofWheels;
	private String gearType;
	private String colour;
	
	public Car() {
		
	}
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getNoofWheels() {
		return noofWheels;
	}
	public void setNoofWheels(int noofWheels) {
		this.noofWheels = noofWheels;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public static void printSomething() {
		System.out.println("Printing Something");
	}

	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + ", noofWheels=" + noofWheels + ", gearType=" + gearType + ", colour="
				+ colour + "]";
	}
}
