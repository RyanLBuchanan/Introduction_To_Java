package program;

public class GenericsTest <T> {
	
	private T contents;
	
	public GenericsTest() {}
	
	public GenericsTest(T in) {
		this.contents = in;
	}
	
	public void put(T in) {
		this.contents = in;
	}
	
	public T get() {
		return contents;
	}

}
