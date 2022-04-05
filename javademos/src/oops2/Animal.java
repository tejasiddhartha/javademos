package oops2;

public class Animal {
	private String name;
	private int size;
	private int weight;
	protected String foodType;
	
	public Animal(String name, int size, int weight) {
		this.name = name;
		this.size = size;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("Animal.eat() called");
	}
	
	public void move(int speed) {
		System.out.println("Animal.move() called. Animal moving at " + speed);
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}

	public String getFoodType() {
		return foodType;
	}	
}
