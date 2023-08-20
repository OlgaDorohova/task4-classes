package my.home.programming4.composition.task5;

import my.home.programming4.composition.task5.Voucher.Feeding;
import my.home.programming4.composition.task5.Voucher.Transport;
import my.home.programming4.composition.task5.Voucher.Type;

/*. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicVoucher logicVoucher = new LogicVoucher();
		LogicVoucher lvType = new LogicVoucher();
		LogicVoucher lvPrice = new LogicVoucher();
		LogicVoucher lvFeed = new LogicVoucher();
		
		logicVoucher.addVoucherList(new Voucher(Type.MEDICINE, "German", Feeding.TWO, 7, Transport.BUS, 580));
		logicVoucher.addVoucherList(new Voucher(Type.RESORT, "Egipt", Feeding.ALL, 14, Transport.AIR, 1500));
		logicVoucher.addVoucherList(new Voucher(Type.RELIGION, "Israel", Feeding.ONE, 3, Transport.AIR, 390));
		logicVoucher.addVoucherList(new Voucher(Type.RESORT, "Turkey", Feeding.ALL, 5, Transport.AIR, 800));
		logicVoucher.addVoucherList(new Voucher(Type.EXCURSION, "Russia", Feeding.NO, 2, Transport.BUS, 180));
		logicVoucher.addVoucherList(new Voucher(Type.EXCURSION, "Hungary", Feeding.NO, 2, Transport.BUS, 300));
		
		System.out.println("Chosen by voucher type");
		lvType = logicVoucher.choiceVoucher(Type.EXCURSION);
		lvType.sortByPrice();
		lvType.showVoucherList();
		System.out.println();
		
		System.out.println("Chosen by voucher price");
		lvPrice = logicVoucher.choiceVoucher(300, 1000);
		lvPrice.sortByCountry();
		lvPrice.showVoucherList();
		System.out.println();
		
		System.out.println("Chosen by voucher feeding");
		lvFeed = logicVoucher.choiceVoucher(Feeding.ALL);
		lvFeed.sortByDays();
		lvFeed.showVoucherList();
		

	}

}
