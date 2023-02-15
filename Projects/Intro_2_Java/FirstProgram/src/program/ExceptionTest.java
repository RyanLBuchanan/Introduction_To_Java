package program;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			System.out.println("1 / 0 = " + (1 / 0));
		} catch (ArithmeticException e) {
			System.out.println("Caught an arithmetic exception.");
			
			// Print the stack trace programmatically
			e.printStackTrace();
		} finally {
			System.out.println("Optional \"finally\" block.");
		}
		
		System.out.println("Code has continued as normal.");
	}
}
