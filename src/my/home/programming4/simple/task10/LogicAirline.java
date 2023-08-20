package my.home.programming4.simple.task10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class LogicAirline {
	private ArrayList<Airline> airlines;

	LogicAirline() {
		airlines = new ArrayList<Airline>();
	}

	public void setAirline(Airline airline) {
		airlines.add(airline);
	}

	public void showByDestination(String destination) {
		int count = 0;
		for (Airline a : airlines) {
			if (a.getDestination().equalsIgnoreCase(destination)) {
				System.out.println(a);
				count++;
			}
		}

		if (count == 0) {
			System.out.println("The flight is not found");
		}
	}

	public void showByDay(String date) {
		int count = 0;
		try {
			LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			for (Airline a : airlines) {
				if (a.getDepartureDate().equals(localDate)) {
					System.out.println(a);
					count++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("wrong date format");
		}

		if (count == 0) {
			System.out.println("The flight is not found");
		}
	}

	public void showByDay(String date, String time) {
		int count = 0;
		try {
			LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
			for (Airline a : airlines) {
				if (a.getDepartureDate().equals(localDate) && a.getDepartureTime().compareTo(localTime) > 0) {
					System.out.println(a);
					count++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("wrong date format");
		}

		if (count == 0) {
			System.out.println("The flight is not found");
		}
	}
}
