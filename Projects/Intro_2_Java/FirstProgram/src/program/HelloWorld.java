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
		
		// These instantiate arrays
		int[] intArray = new int[10];
		
		int[] intArray1 = {2, 4, 6};
		
		
		System.out.println("2 + 3 = " + (myByte + myShort));
		
		myBoolean = myInt < 6;
		
		System.out.println("Is myInt < 6? " + myBoolean);
		
		System.out.print("Here's some floating point division (myDouble / myFloat): ");
		
		System.out.println(myDouble / myFloat);
		
		System.out.print("Bowbeber, vas happened ven vee divides zee integers, hmmm? 5 / 2 = ");
		
		System.out.println(myInt / myByte);
		
		System.out.println("Zere's nien decimal, ya, und nix of ze remainder!  Macht snell!");
		
		System.out.print("My integer arrays are below\nintArray at the second index: ");
		System.out.println(intArray[2]);
		System.out.print("...with a length of: ");
		System.out.println(intArray.length);
		System.out.print("Und\nintArray1 at the second index: ");
		System.out.println(intArray1[2]);
		System.out.print("...with a length of: ");
		System.out.println(intArray1.length);
		System.out.println();
	}
}
