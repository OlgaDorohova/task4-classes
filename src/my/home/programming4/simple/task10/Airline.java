package my.home.programming4.simple.task10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
Создать класс Airline, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий массив типа Airline, 
с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль. 
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. 
Найти и вывести: 
	a) список рейсов для заданного пункта назначения; 
	b) список рейсов для заданного дня недели; 
	c) список рейсов для заданного дня недели, 
	время вылета для которых больше заданного.
*/

public class Airline {
	private int flightNumber;
	private String destination;
	private String planeType;
	private LocalTime departureTime;
	private LocalDate departureDate;

	private static int count = 1;
	private DateTimeFormatter formatterTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	private DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	Airline(int flightNumber, String destination, String plainType, String time, String date) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.planeType = plainType;
		this.departureTime = LocalTime.parse(time, formatterTime);
		this.departureDate = LocalDate.parse(date, formatterDate);
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber() {
		flightNumber = 3 * count + 11 * (count++);
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	@Override
	public String toString() {
		return "Flight number " + getFlightNumber() + " to " + getDestination() + 
				", plane type " + getPlaneType() + ","
				+ " at " + getDepartureTime() + " " + getDepartureDate();
	}

}
