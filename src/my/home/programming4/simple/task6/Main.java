package my.home.programming4.simple.task6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTime times = new MyTime(-30, 80, 30);
		
		System.out.println("From constructor");
		times.print();
		
		times.setHours(12);
		times.setMinutes(20);
		times.setSeconds(45);
		
		System.out.println("After setters");
		times.print();
		
		System.out.println("Increasing hours");
		times.increaseHours(14);
		times.print();
		
		times.increaseHours(11);
		times.print();
		
		System.out.println("Decreasing hours");
		times.decreaseHours(5);
		times.print();
		
		System.out.println("Increasing minutes");
		times.increaseMinutes(100);
		times.print();
		
		System.out.println("Decreasing minutes");
		times.decreaseMinutes(21);
		times.print();
		
		System.out.println("Increasing seconds");
		times.increaseSeconds(3650);
		times.print();
		
		System.out.println("Decreasing seconds");
		times.decreaseSeconds(3650);
		times.print();
		}

}
