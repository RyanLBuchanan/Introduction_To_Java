package program;

public class InheritanceExample {

	public static void makeItTalk(Animal input) {
		input.speak();
	}
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		System.out.println("Make the Animal object speak:");
		makeItTalk(animal);
		
		System.out.println("Make the Dog object speak:");
		makeItTalk(dog);
	}
}

class Animal {
	public void speak() {
		System.out.println("Widdo animal noisers!");
	}
}

class Dog extends Animal {
	public void speak() {
		System.out.println("Barky times!");
	}
}
