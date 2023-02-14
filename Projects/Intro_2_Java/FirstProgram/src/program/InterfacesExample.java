package program;

public class InterfacesExample {

	public static void main(String[] args) {
		
		Domesticated domesticatedThing = new Canine();
		
		domesticatedThing.doWork(); 
	}
}

interface Domesticated {
	public void doWork();
}


class Beast {
	public void eat() {
		System.out.println("I eat food.");
	}
}

class Wolf extends Beast {
	public void eat() {
		System.out.println("I eat fresh meat!");
	}
}

class Canine extends Beast implements Domesticated {
	public void eat() {
		System.out.println("I eat widdo kibbles . . . and my own pooh.");
	}
	
	public void doWork() {
		System.out.println("My tail wags me.");
	}
}