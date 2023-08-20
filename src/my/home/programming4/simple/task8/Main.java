package my.home.programming4.simple.task8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerArray array = new CustomerArray();
	
		array.setCustomers(new Customer("Ivanov", "Ivan", "Ivanovich", "11112222", "1011111101"));
		array.setCustomers(new Customer("Petrov", "Peter", "Petrovich", "22223333", "5426587878"));
		array.setCustomers(new Customer("Sidorov", "Sidor", "Sidorovich", "33334444", "2345568978"));
		array.setCustomers(new Customer("Alekseev","Aleksey", "Alekseevich", "44445555", "5689784523"));
		array.setCustomers(new Customer("Andreev", "Andrey", "Andreevich", "11115555", "7895421364"));
		array.setCustomers(new Customer("Alekseev","Pavel", "Alekseevich", "22226666", "4589623545"));
		array.setCustomers(new Customer("Andreev", "Andrey", "Sergeevich", "11568955", "7653221364"));
		
		System.out.println("Unsorted customersArray");
		array.showCustomerArray();
		
		System.out.println("\nSorted by alphabet customersArray");
		array.showAlphabetSort();
		
		System.out.println("\nShow customers whose credit card is included in the range");
		array.showCustomersCardRange("22220000", "55555555");


	}

}
