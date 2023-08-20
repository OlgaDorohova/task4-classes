package my.home.programming4.composition.task2;

public class Engine {
	private String brand;
	private FuelType fuelType;
	private double capacity;
	private int power;

	public enum FuelType {
		GAS, DIESEL
	};

	Engine(String brand, double capacity, int power, FuelType fuelType) {
		this.brand = brand;
		this.capacity = capacity;
		this.power = power;
		this.fuelType = fuelType;
	}

	public String getBrand() {
		return brand;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "[brand: " + brand + ", fueltype: " + fuelType + ", capacity: " + capacity + ", power: " + power + "]";
	}

}
