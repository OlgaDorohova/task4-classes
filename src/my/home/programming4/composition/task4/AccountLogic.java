package my.home.programming4.composition.task4;

public class AccountLogic {
	public Client client;
	AccountComparator comparator = new AccountComparator();
	ReverceAccountCompator revCompator = new ReverceAccountCompator();

	AccountLogic(Client client) {
		this.client = client;
	}

	public BankAccount getAccount(String number) {
		for (BankAccount acc : client.getAccountNumbers()) {
			if (acc.getAccount().equals(number)) {
				return acc;
			}

		}
		return new BankAccount("-1");
	}
	
	public void sortAccount() {
		client.getAccountNumbers().sort(comparator);
	}
	
	public void reverseSortAccount() {
		client.getAccountNumbers().sort(revCompator);
	}

	public void showAccounts() {
		System.out.println(client.getFirstName() + " " + client.getLastName());
		for (BankAccount acc : client.getAccountNumbers()) {
			if (acc.getBlock()) {
				System.out.println(acc.getAccount() + "; balance: " + acc.getCash() + "\tBLOCKED");
			} else {
				System.out.println(acc.getAccount() + "; balance: " + acc.getCash());
			}
		}
	}

	public void blockAccount(BankAccount account) {
		for (BankAccount acc : client.getAccountNumbers()) {
			if (acc.getAccount().equals(account.getAccount())) {
				acc.setBlock(true);
			}
		}
	}

	public void unblockAccount(BankAccount account) {
		for (BankAccount acc : client.getAccountNumbers()) {
			if (acc.getAccount().equals(account.getAccount())) {
				acc.setBlock(false);
			}
		}
	}
	
	public void totalBalanceAll() {
		double total = 0;
		for (BankAccount acc : client.getAccountNumbers()) {
			total += acc.getCash();
		}
		System.out.println(client.getFirstName() + " " + client.getLastName() + " total balance: " + total);
	}
	
	public void totalBalancePositive() {
		double total = 0;
		for (BankAccount acc : client.getAccountNumbers()) {
			if(acc.getCash() > 0) {
				total += acc.getCash();
			}
			
		}
		System.out.println(client.getFirstName() + " " + client.getLastName() + " total positive balance: " + total);
	}
	
	public void totalBalanceNegative() {
		double total = 0;
		for (BankAccount acc : client.getAccountNumbers()) {
			if(acc.getCash() < 0) {
				total += acc.getCash();
			}
			
		}
		System.out.println(client.getFirstName() + " " + client.getLastName() + " total vegetive balance: " + total);
	}

}
