package Lab05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] myPerson = {
				new Person("Oak","Oak@email"),
				new Person("Mark","Mark@email"),
				new Person("Garfield","Garfield@email")
		};
		
		Project myProject = new Project("Yamete",3,myPerson);
		
		for ( Person person : myPerson ) {
			System.out.println("Person name: "+ person.getName());
			System.out.println("Email: "+ person.getEmail());
		}
		System.out.println("Project name: "+ myProject.getPname());
		System.out.println("Duration: "+ myProject.getDur() + " Months");
		
		
		
	}

}