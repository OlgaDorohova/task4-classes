package my.home.programming4.simple.task9;

import java.util.Arrays;

/*
Создать класс Book, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Book, 
с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль. 
Book: id, название, автор(ы), издательство, год издания, 
количество страниц, цена, тип переплета. 
Найти и вывести: 
	a) список книг заданного автора; 
	b) список книг, выпущенных заданным издательством; 
	c) список книг, выпущенных после заданного года. 
*/

public class Book {
	private int id;
	private String title;
	private String[] author;
	private String publishingOffice;
	private int year;
	private int pages;
	private double price;
	private String coverType;

	private static int count = 1;

	public Book(String title, String[] author, String publishingOffice, int year, int pages, double price,
			String coverType) {
		// TODO Auto-generated constructor stub

		this.title = title;
		this.author = author;
		this.publishingOffice = publishingOffice;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.coverType = coverType;
		setId();
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId() {
		id = count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	public String getPublishingOffice() {
		return publishingOffice;
	}

	public void setPublishingOffice(String publishingOffice) {
		this.publishingOffice = publishingOffice;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	@Override
	public String toString() {
		return "ID " + getId() + ", author " + Arrays.toString(author) + ", \npublish office \"" + getPublishingOffice() 
				+ "\"" + ", year " + getYear() + ", pages " + getPages() + ", \ncover " + getCoverType() + ", price "
				+ getPrice();
	}

}
