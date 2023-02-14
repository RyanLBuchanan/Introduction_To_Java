package program;

public class Simulator {
	
	public static void main(String[] args) {
		OverridingMethods a = new OverridingMethods();
		a.talk();
		
		OverridenMethods b = new OverridenMethods();
		b.talk();
		
		OverridingMethods ab = new OverridenMethods();
		ab.talk();
		
	}
}
