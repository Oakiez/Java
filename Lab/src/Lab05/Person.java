package Lab05;

public class Person {
	private String name;
	private String email;
	
	public Person() {}
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
