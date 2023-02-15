package program;

public class Person {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Greetings Earthling, I am " + this.name + "."; 
	}
}