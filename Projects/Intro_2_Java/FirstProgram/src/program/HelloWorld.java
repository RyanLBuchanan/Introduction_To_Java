package program;

public class HelloWorld {

	public static void main(String[] args) {

		// These are primitives
		boolean myBoolean = false;
		
		byte myByte = 2;
		
		short myShort = 3;
		
		char myChar = 'b';
		
		int myInt = 5;
		
		float myFloat = 0.25f;
		
		long myLong = 999999999999L;
		
		double myDouble = 5.999d;
		
		// This is a reference variable
		String myString = new String("This is a bloody String object, Mate!  It's created with a sodding constructor, ya?!");
		
		System.out.println("2 + 3 = " + (myByte + myShort));
		
		myBoolean = myInt < 6;
		
		System.out.println("Is myInt < 6? " + myBoolean);
		
		System.out.print("Here's some floating point division (myDouble / myFloat): ");
		
		System.out.println(myDouble / myFloat);
		
		System.out.print("Bowbeber, vas happened ven vee divides zee integers, hmmm? 5 / 2 = ");
		
		System.out.println(myInt / myByte);
		
		System.out.println("Zere's nien decimal, ya, und nix of ze remainder!  Macht snell!");
	}
}
