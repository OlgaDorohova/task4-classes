package my.home.programming4.composition.task4;

public class BankAccount  {
	private String accountNumber;
	private double balance = 0;
	private boolean blocked = false;

	public BankAccount(String accountNumber) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
	}

	public double getCash() {
		return balance;
	}

	public void increaseBalance(double balance) {
		if(accountNumber.equals("-1")) {
			System.out.println("accountNumber not defined");
			return;
		}
		if (!blocked) {
			this.balance += balance;
		} 
	}
	
	public void decreaseBalance(double balance) {
		if(accountNumber.equals("-1")) {
			System.out.println("accountNumber not defined");
		}
		if (!blocked) {
			this.balance -= balance;
		}

	}

	public boolean getBlock() {
		return blocked;
	}

	public void setBlock(boolean isBlocked) {
		this.blocked = isBlocked;
	}

	public String getAccount() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "[" + "accontNumber " + accountNumber + "; balance " + balance + "; blocked: " + blocked + "]";
	}

	
}
