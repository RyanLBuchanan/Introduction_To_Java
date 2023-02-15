package program;
		
public class ObjectTest {
	public static String print(Object o) {
		return o.toString();
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("Spock");
		
		System.out.println(print(person));
	}
}
