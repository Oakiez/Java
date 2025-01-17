package Lab04;

public class Book {
	//---- Attributes
	private String name;
	private int price;
	
	//---- Constructors
	public Book() {}
	public Book(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	//---- Methods
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
