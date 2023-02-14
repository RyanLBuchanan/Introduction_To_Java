package program;

public class OverridenMethods extends OverridingMethods{
	
	// Below is the @ annotation
	@Override
	public void talk() {
//		super.talk();
		System.out.println("This is overriding!!!");
	}

}
