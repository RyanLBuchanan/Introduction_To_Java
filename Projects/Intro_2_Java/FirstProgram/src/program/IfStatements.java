package program;

public class IfStatements {
	
	public static void main(String[] args) {
//		if (true) {
//			System.out.println("Inside the if-statement");
//		}
		
		String trek = "Strange New Worlds";
		
//		String trek = "Fury Road";
		
//		String pigs = "Are not flying";
		
		String pigs = "Flying";
		
		if (trek == "Strange New Worlds" && pigs == "Are not flying")
		{
			System.out.println("Long live Pike!!!");
		} 
		else if (trek == "Strange New Worlds") {
			System.out.println("Oh Captain, my Captain!");
		} 
		else {
			System.out.println("Welcome to the Thunderdome, Bitch!");
		}
	}
}
