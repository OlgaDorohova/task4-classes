package my.home.programming4.simple.task10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicAirline airlines = new LogicAirline();
		airlines.setAirline(new Airline(1617, "Paris", "airbus", "17:15", "17-05-2023"));
		airlines.setAirline(new Airline(1476, "London", "boing", "13:15", "18-05-2023"));
		airlines.setAirline(new Airline(1578, "Minsk", "airbus", "20:22", "18-05-2023"));
		airlines.setAirline(new Airline(1100, "Boston", "boing", "18:00", "17-05-2023"));
		airlines.setAirline(new Airline(1213, "London", "boing", "16:16", "18-05-2023"));
		airlines.setAirline(new Airline(1114, "Paris", "airbus", "21:01", "18-05-2023"));
		
		String cityString = "paris";
		System.out.println("Shown all flights to " + cityString);
		airlines.showByDestination(cityString);
		
		System.out.println("\nShown flights at a date ");
		airlines.showByDay("17-05-2023");
		
		System.out.println("\nShown flights on a date after a specified time ");
		airlines.showByDay("18-05-2023", "16:00");

	}

}
