package program;

public class GenericsTester {

	public static void main(String[] args) {
		
		GenericsTest<String> generics = new GenericsTest<>();
		
		generics.put("This string is in my Fancy lil generics Box, Bitches!");
		
		System.out.println(generics.get());
	}
}
