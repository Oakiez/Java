package Lab04;

public class Main {

	public static void main(String[] args) {
		//---- สร้าง Array of Book's object
		Book[] myBooks = new Book[4]; // 0-3
		myBooks[0] = new Book("AI for All",560);
		myBooks[1] = new Book("Easy ML",330);
		myBooks[2] = new Book("Funny Calculus",199);
		myBooks[3] = new Book("SQL 101",290);
		
		for ( Book book: myBooks ) {
			System.out.println(book.getName()+" "+book.getPrice());
		}
		
		System.out.println("");
		
		for (int i=0;i<myBooks.length;i++) {
			System.out.println(myBooks[i].getName()+" "+myBooks[i].getPrice());
		}
		
		System.out.println();
		
		System.out.println("Price: "+getBookPrice(myBooks));
	}
	
	public static int getBookPrice(Book[] books) {
		int total = 0;
		for(int i = 0;i<books.length;i++) {
			total += books[i].getPrice();
		}
		return total;
	}
	
}

	
