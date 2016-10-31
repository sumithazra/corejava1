package inheritance;

class Animal {
	// If you change the method as a static ..it will change behaviour
	public void eat() {
		System.out.println("animal is eating...");
	}

}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog is eating...");
	}

}

public class InhTest {

	public static void main(String[] args) {

		Animal a = new Dog();
		a.eat();

		/*if (a instanceof Dog) {
			Dog d = (Dog) a;// downcasting
			System.out.println("ok downcasting performed");
		}*/

		Dog d = (Dog) new Animal();
		if (d instanceof Animal) {
			d.eat();
		}
	}

}
