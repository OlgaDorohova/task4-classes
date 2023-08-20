package my.home.programming4.simple.task4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train tr = new Train();
		
		Train[] trains = new Train[5];
		trains[0] = new Train(5, "Odessa", "12:15");
		trains[1] = new Train(2, "Kiev", "13:16");
		trains[2] = new Train(8, "Kanev", "22:20");
		trains[3] = new Train(14, "Kanev", "03:17");
		trains[4] = new Train(7, "Lvov", "06:08");
		
		

		tr.printTrain(trains);
		System.out.println();
		
		tr.sortByNums(trains);	
		tr.printTrain(trains);
		System.out.println();
		
		
		tr.printByCustomNumber("Enter the train number", trains);
		
		tr.printTrain(trains);
		System.out.println();
		
		tr.sortByDestination(trains);
		tr.printTrain(trains);
		System.out.println();
		
		
	}

}
