package InheritanceDemo;

public class Animal {

	public void eat() {
		System.out.println("animal is eating");
	}
	}

class Dog extends Animal{
	
	public void bark() {
		System.out.println("dog is barking");
	}
}

class Cat extends Dog{
	public void run() {
		System.out.println("cat is running");
	}
}
