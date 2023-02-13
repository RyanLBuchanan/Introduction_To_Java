package program;

public class ContinueStatements {

	public static void main(String[] args) {
		// Skip when the number is divisible by 5
		for (int i = 0; i < 20; i++) {
			
			if (i % 5 == 0) {
				continue; // Skip this number
			}
			
			System.out.println(i);
		}
	}
}
