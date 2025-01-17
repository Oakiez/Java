package Lab05;

public class Project {
	private String pName;
	private int dur;
	private Person[] person;
	
	public Project() {}
	public Project(String pName, int dur, Person[] person) {
		this.pName = pName;
		this.dur = dur;
		this.person = person;
	}
	
	public String getPname() {
		return this.pName;
	}
	public int getDur() {
		return this.dur;
	}
	public Person[] getPerson() {
		return this.person;
	}
	
	public void setPname(String pName) {
		this.pName = pName;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}
	public void setPerson(Person[] person) {
		this.person = person;
	}
}
