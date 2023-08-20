package my.home.programming4.simple.task9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicBook books = new LogicBook();

		/*
		 * public Book(String title, String [] author, String publishOffice, int year,
		 * int pages, double price, String coverType);
		 */

		books.setBook(new Book("Head First Java", new String[] { "Kathy Sierra", "Bert Bates" }, "O'Reilly Media", 2003,
				656, 22.76, "paperback"));
		books.setBook(new Book("Java: A Beginner’s Guide", new String[] { "Herbert Schildt" }, "McGraw Hill", 2018, 720,
				25.00, "paperback"));
		books.setBook(new Book("Java for Dummies", new String[] { "Barry A. Burd" }, "For Dummies", 2015, 434, 198.96,
				"hardcover"));
		books.setBook(new Book("Effective Java ", new String[] { "Joshua Bloch" }, "Addison-Wesley Professional", 2017,
				416, 47.95, "paperback"));
		books.setBook(new Book(
				"Head First Design Patterns: Building Extensible and Maintainable Object-Oriented Software",
				new String[] { "Eric Freeman", "Elisabeth Robson" }, "O'Reilly Media", 2021, 669, 31.98, "paperback"));
		
	books.showAuthor("Bloc");
	
	books.showPublishOfice("Media");
		
		books.showYear(2015);

	}

}
