package my.home.programming4.simple.task5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecCount count = new DecCount();
		DecCount count2 = new DecCount(-20, -10);
		DecCount count3 = new DecCount(-20, 20, -19);
		
		System.out.println(count);
		System.out.println(count2);
		System.out.println(count3);
		
		System.out.println("Increase");
	
		count.increaseCount();
		System.out.println(count);
		
		count2.decreaseCount();
		System.out.println(count2);
		
		count3.decreaseCount();
		System.out.println(count3.getCurrentState());
		count3.decreaseCount();
		System.out.println(count3.getCurrentState());
	}

}
