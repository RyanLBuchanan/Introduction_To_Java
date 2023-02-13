package program;

public class StringTest {

	public static void main(String[] args) {
		
		String stringA = "Jolene Blalock";
		String stringB = new String("Jolene Blalock");
		String stringC = "Jolene Blalock";
		
		System.out.println("String A: " + stringA);
		System.out.println("String B: " + stringB);
		System.out.println("String C: " + stringC);
		
		if (stringA == stringB) {
			System.out.println("stringA and stringB point to the same object");
		} 
		else
		{
			System.out.println("stringA and stringB do NOT point to the same object");
		}
		
		if (stringA == stringC) {
			System.out.println("stringA and stringC point to the same object");
		} 
		else
		{
			System.out.println("stringA and stringC do NOT point to the same object");
		}
	}
}
