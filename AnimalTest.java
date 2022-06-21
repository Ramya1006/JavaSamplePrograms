package InheritanceDemo;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();

		Cat c= new Cat();
		c.run();
		c.bark();
		c.eat();
	}

}
