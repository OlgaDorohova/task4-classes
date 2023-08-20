package my.home.programming4.composition.task4;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client1 = new Client("Ivan", "Ivanov");
		client1.addAccountNumber(new BankAccount("123456"));
		client1.addAccountNumber(new BankAccount("123458"));
		client1.addAccountNumber(new BankAccount("123456"));
		client1.addAccountNumber(new BankAccount("456789"));
		client1.addAccountNumber(new BankAccount("489785"));

		AccountLogic al = new AccountLogic(client1);
		al.showAccounts();

		al.blockAccount(new BankAccount("123456"));

		al.getAccount("123458").increaseBalance(1200);
		al.getAccount("123456").increaseBalance(1100);
		al.getAccount("456789").increaseBalance(1300);
		al.getAccount("489785").increaseBalance(1400);

		al.showAccounts();
		al.totalBalanceAll();
		al.unblockAccount(new BankAccount("123456"));

		al.getAccount("123456").decreaseBalance(100);
		al.getAccount("123458").decreaseBalance(100);
		al.getAccount("456789").decreaseBalance(100);
		al.getAccount("489785").decreaseBalance(100);

		al.showAccounts();
		al.totalBalancePositive();
		al.totalBalanceNegative();
		
		al.sortAccount();
		al.showAccounts();
		
		al.reverseSortAccount();
		al.showAccounts();

//		

	}

}
