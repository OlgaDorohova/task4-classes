package my.home.programming4.simple.task9;

import java.util.ArrayList;
import java.util.Arrays;

public class LogicBook {
	private ArrayList<Book> books;

	LogicBook() {
		// TODO Auto-generated constructor stub
		books = new ArrayList<>();
	}

	public void setBook(Book book) {
		books.add(book);
	}

	public void showAuthor(String author) {
		boolean isEqual = false;
		for (Book b : books) {
			for (String s : b.getAuthor()) {
				String[] temp = s.split(" ");
				for (String str : temp) {
					if (str.equalsIgnoreCase(author)) {
						isEqual = true;
						showBook(b);
					}
				}
			}
		}
		if (!isEqual) {
			System.out.println("Author is not found: " + author);
		}
	}

	public void showPublishOfice(String office) {
		boolean isEqual = false;
		for (Book b : books) {
			String[] temp = b.getPublishingOffice().split(" ");
			for (String str : temp) {
				if (str.equalsIgnoreCase(office)) {
					isEqual = true;
					showBook(b);;
				}
			}
		}
		if (!isEqual) {
			System.out.println("Publishing office is not found: " + office);
		}
	}

	public void showYear(int year) {
		boolean isEqual = false;
		for (Book b : books) {
			if (b.getYear() > year) {
				isEqual = true;
				showBook(b);
			}
		}
		if (!isEqual) {
			System.out.println("Books published after " + year + " are not found: ");
		}
	}

	public void showBook(Book book) {
		System.out.println("Author " + Arrays.toString(book.getAuthor()) + ", \npublish office \"" + book.getPublishingOffice() +
				"\", year " + book.getYear() +  ", \ncover " + book.getCoverType() + ", price "
				+  book.getPrice() + "\n");
		
	}

}
