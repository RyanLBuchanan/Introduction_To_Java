package program;

public class SwitchStatements {
	public static void main(String[] args) {
		int value = 1;
		
		switch(value) {
		case 1:
			System.out.println("Case 1");
//			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		case 69:
			System.out.println("Case of bananas");
			break;
		default: 
			System.out.println("Default case");
		}
	}
}
