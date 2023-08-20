package my.home.programming4.composition.task4;

import java.util.ArrayList;

public class Client {
	private String firstName;
	private String lastName;
	private ArrayList <BankAccount> accountNumbers;

	
	public Client(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		accountNumbers = new ArrayList<>();
	}
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void addAccountNumber(BankAccount number) {
		
		for(int i = 0; i < accountNumbers.size(); i++) {
			if(accountNumbers.get(i).getAccount().equals(number.getAccount())) {
				System.out.println("This account already added " + number.getAccount());
				return;
			}
		}
		accountNumbers.add(number);
	}
	
	public ArrayList<BankAccount> getAccountNumbers(){
		return accountNumbers;
	}
	
	@Override
	public String toString() {
		return "[" + firstName + " " + lastName + "]";
	}

}
