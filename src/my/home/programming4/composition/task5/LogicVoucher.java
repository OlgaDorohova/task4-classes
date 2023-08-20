package my.home.programming4.composition.task5;

import java.util.ArrayList;
import java.util.Comparator;

import my.home.programming4.composition.task5.Voucher.Feeding;
import my.home.programming4.composition.task5.Voucher.Type;

public class LogicVoucher {

	private ArrayList<Voucher> voucherList;

	public LogicVoucher() {
		voucherList = new ArrayList<>();
	}

	public void addVoucherList(Voucher voucher) {
		voucherList.add(voucher);
	}

	public void showVoucherList() {
		for (Voucher v : voucherList) {
			System.out.println(v.getCountiry() + "; voucher type :" + v.getType() + "; feeding: " + v.getFeeding()
					+ "; for " + v.getDay() + " days" + "; by " + v.getTransport() + "; price: " + v.getPrice());
		}
	}

	public LogicVoucher choiceVoucher(Type type) {
		LogicVoucher sortVoucherList = new LogicVoucher();
		for (Voucher v : voucherList) {
			if (v.getType().equals(type)) {
				sortVoucherList.addVoucherList(v);
				;
			}
		}
		return sortVoucherList;
	}

	public LogicVoucher choiceVoucher(String country) {
		LogicVoucher sortVoucherList = new LogicVoucher();
		for (Voucher v : voucherList) {
			if (v.getCountiry().equals(country)) {
				sortVoucherList.addVoucherList(v);
				;
			}
		}
		return sortVoucherList;
	}

	public LogicVoucher choiceVoucher(Feeding feeding) {
		LogicVoucher sortVoucherList = new LogicVoucher();
		for (Voucher v : voucherList) {
			if (v.getFeeding().equals(feeding)) {
				sortVoucherList.addVoucherList(v);
				;
			}
		}
		return sortVoucherList;
	}

	public LogicVoucher choiceVoucher(double lowPrice, double highPrice) {
		LogicVoucher sortVoucherList = new LogicVoucher();
		for (Voucher v : voucherList) {
			if (v.getPrice() >= lowPrice && v.getPrice() <= highPrice) {
				sortVoucherList.addVoucherList(v);
				;
			}
		}
		return sortVoucherList;
	}

	public void sortByPrice() {
		voucherList.sort(new Comparator<Voucher>() {
			public int compare(Voucher v1, Voucher v2) {
				return (int) (v1.getPrice() - v2.getPrice());
			}
		});
	}

	public void sortByDays() {
		voucherList.sort(new Comparator<Voucher>() {
			public int compare(Voucher v1, Voucher v2) {
				return v1.getDay() - v2.getDay();
			}
		});
	}

	public void sortByCountry() {
		voucherList.sort(new Comparator<Voucher>() {
			public int compare(Voucher v1, Voucher v2) {
				return v1.getCountiry().compareToIgnoreCase(v2.getCountiry());
			}
		});
	}

}
