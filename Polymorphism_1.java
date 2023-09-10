package sw1;


public class Polymorphism_1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal = new Cat();
		animal .sound();
		
		animal = new Dog();
		animal .sound();
		
		animal = new Chicken();
		animal .sound();
		
	}

}


