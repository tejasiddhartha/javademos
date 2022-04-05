package abstractClass;

public class testAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog("doggy");
		animal.eat();
		animal.breathe();
		
		Bird parrot = new Parrot("Parrot");
		parrot.eat();
		parrot.fly();

	}

}
