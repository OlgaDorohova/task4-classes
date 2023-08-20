package my.home.programming4.composition.task5;

public class Voucher {
	private Type type;
	private int day;
	private Feeding feeding;
	private double price;
	private Transport transport;
	private String countiry;

	public enum Feeding {
		NO, ONE, TWO, ALL
	}

	public enum Type {
		RESORT, MEDICINE, SHOPPING, EXCURSION, CRUISE, RELIGION
	}

	public enum Transport {
		AIR, TRAIN, BUS
	}

	Voucher(Type type, String country, Feeding feeding, int day, Transport transport, double price) {
		this.type = type;
		this.countiry = country;
		this.feeding = feeding;
		this.day = day;
		this.price = price;
		this.transport = transport;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Feeding getFeeding() {
		return feeding;
	}

	public void setFeeding(Feeding feeding) {
		this.feeding = feeding;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	

	public String getCountiry() {
		return countiry;
	}

	public void setCountiry(String countiry) {
		this.countiry = countiry;
	}

	@Override
	public String toString() {
		return "type: " + type + "; country: "+ countiry + "; feeding: " + feeding + "; day: " + day + 
				"; transport: " + transport + "; price " + price;
	}
}
