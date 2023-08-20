package my.home.programming4.composition.task2;

public class Car {
	private Engine engine;
	private Wheel[] wheels = new Wheel[4];
	private long mileage = 0;
	private int fuelTankVolume = 50;
	private double fuelVolume = fuelTankVolume;


	private String brand;

	public Car(String brand, Wheel wheel, Engine engine) {
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.engine = engine;

		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = wheel;
		}
	}

	public long getMileage() {
		return mileage;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel wheel) {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = wheel;
		}
	}

	@Override
	public String toString() {
		return "[brand: " + brand + ", engine: " + getEngine() + ", mileage " + mileage + ", fuel volume "+ fuelVolume;
	}

	public void showCar() {
		System.out.println("Brand: " + brand + "; engine " + engine.getCapacity() + " L");
	}

	public void ride(int kilometer) {
		
		double fuelConsumption = kilometer * 0.08;
		if(fuelVolume - fuelConsumption <= 0) {
			System.out.println("You need to refuel");
			mileage += (fuelVolume * 100 / 8);
			fuelVolume = 0;
			return;
		}
		mileage += kilometer;
		fuelVolume -= fuelConsumption;
		
		System.out.println("The car has arrived");
	}

	public void refuel() {
		fuelVolume = fuelTankVolume;
		System.out.println("The car has been refueled");
	}

	public void changeWheel(Wheel wheel, int number) {
		if (number > 0 && number <= 4) {
			wheels[number - 1] = wheel;
			System.out.println("The wheel has been changed");
		} else {
			System.out.println("Wrong wheel number");
		}

	}

	public void showWheels() {
		for (Wheel wheel : getWheels()) {
			System.out.println(wheel);
		}
	}

}
