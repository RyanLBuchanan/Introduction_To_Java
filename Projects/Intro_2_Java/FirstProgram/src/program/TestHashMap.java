package program;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "T' Pol");
		hashMap.put(2, "Seven of Nine");
		hashMap.put(3, "Deanna Troy");
		
		System.out.println("The Star Trek feminatrix stored under key 3 is:  " + hashMap.get(3) + ".");
	}
}
