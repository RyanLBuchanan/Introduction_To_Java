package program;

public class KVPTester {

	public static void main(String[] args) {
		
		KeyValuePair<Integer, String> pairOne = new KeyValuePair<>();
		KeyValuePair<Integer, String> pairTwo = new KeyValuePair<>();
		
		pairOne.put(1, "T' Pol");
		pairTwo.put(2, "Seven of Nine");
		
		System.out.println("Are pairOne and pairTwo equal in sassiness? " + KVPUtilities.equality(pairOne, pairTwo));
		
		pairOne.put(2, "Seven of Nine");
		
		System.out.println("How about now? " + KVPUtilities.equality(pairOne, pairTwo));
	}
}
