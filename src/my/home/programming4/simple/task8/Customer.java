package my.home.programming4.simple.task8;

/*
Создать класс Customer, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Customer, 
с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль. 
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, 
номер банковского счета. 
Найти и вывести: 
	a) список покупателей в алфавитном порядке; 
	b) список покупателей, у которых номер кредитной карточки находится 
	в заданном интервале.
*/

public class Customer {
	
	private int id;
	private String lastName;
	private String firstName;
	private String patronymicName;
	private String creditCardNumber;
	private String bankAccauntNumber;
	private static int count = 1;
	
	Customer(String lastName, String firstName, String patronymicName, String creditCard, String bankAccaunt){
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymicName = patronymicName;
		creditCardNumber = creditCard;
		bankAccauntNumber = bankAccaunt;
		setId();
	}
	
	public int getId() {
		return id;
	}
	public void setId() {
		id = count++;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPatronymicName() {
		return patronymicName;
	}
	public void setPatronymicName(String patronymicName) {
		this.patronymicName = patronymicName;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getBankAccauntNumber() {
		return bankAccauntNumber;
	}
	public void setBankAccauntNumber(String bankAccauntNumber) {
		this.bankAccauntNumber = bankAccauntNumber;
	}
	
	
	public String toString() {
		return "ID " + getId() + ", " + getLastName() + " " + 
				getFirstName() + " " + getPatronymicName() + 
				", credit card " + getCreditCardNumber() +
				", bank accaunt " + getBankAccauntNumber();
	}
	
}
