package my.home.programming4.composition.task4;

import java.util.Comparator;

public class ReverceAccountCompator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		return -o1.getAccount().compareTo(o2.getAccount());
	}

}
