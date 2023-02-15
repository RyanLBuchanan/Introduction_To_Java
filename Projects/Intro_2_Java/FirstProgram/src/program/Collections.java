package program;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("T' Pol");
		arrayList.add(" ");
		arrayList.add("Seven of Nine");
		arrayList.add(3, "Nurse Chapel");
		
		String[] feminatrices = {"T' Pol", "Seven of Nine", "Nurse Chapel"};
		
		System.out.println("The Star Trek feminatrix at index 2: " + arrayList.get(2));
		System.out.println(arrayList);
		System.out.println(arrayList.toString()); // toString unnecessary
		
		for (int i = 0; i <= arrayList.size(); i++) {
			System.out.println(feminatrices[i]);
		}
		
		System.out.println();
		
		
	}
}
