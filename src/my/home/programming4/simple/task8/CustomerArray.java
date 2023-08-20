package my.home.programming4.simple.task8;

import java.util.ArrayList;

public class CustomerArray {
	private ArrayList<Customer> customers;

	CustomerArray() {
		customers = new ArrayList<>();
	}

	public void setCustomers(Customer customer) {
		customers.add(customer);
	}

	public void showCustomerArray() {
		for (Customer c : customers) {
			System.out.println(c);
		}
	}

	public void showAlphabetSort() {
		boolean isChanged = true;
		while (isChanged) {
			isChanged = false;
			for (int i = 0; i < customers.size() - 1; i++) {
				int compareCustomersLastName = customers.get(i).getLastName().compareTo(customers.get(i + 1).getLastName());
				if (compareCustomersLastName > 0) {
					swap(i);
					isChanged = true;
				}
				if (compareCustomersLastName == 0) {
					int compareCustomersName = customers.get(i).getFirstName().compareTo(customers.get(i + 1).getFirstName());
					if (compareCustomersName > 0) {
						swap(i);
						isChanged = true;
					}
					if (compareCustomersName == 0) {
						if (customers.get(i).getPatronymicName()
								.compareTo(customers.get(i + 1).getPatronymicName()) > 0) {
							swap(i);
							isChanged = true;
						}
					}
				}
			}
		}
		showCustomerArray();
	}

	public void swap(int i) {
		Customer temp;
		temp = customers.get(i);
		customers.set(i, customers.get(i + 1));
		customers.set(i + 1, temp);
	}

	public void showCustomersCardRange(String low, String high) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getCreditCardNumber().compareTo(low) >= 0
					&& customers.get(i).getCreditCardNumber().compareTo(high) <= 0) {
				System.out.println(customers.get(i));
			}
		}
	}

}
