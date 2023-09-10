package sw1;

public class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍!");
	}
}
class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹!");
	}
}
class Chicken extends Animal {
	@Override
	public void sound() {
		System.out.println("꼬꼬댁!");
	}
}
