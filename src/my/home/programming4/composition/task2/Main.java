package my.home.programming4.composition.task2;

import my.home.programming4.composition.task2.Engine.FuelType;
import my.home.programming4.composition.task2.Wheel.Season;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
*/
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wheel wheel1 = new Wheel("michelin", 6, 17, Season.WINTER);
		Wheel wheel2 = new Wheel("marshal", 7, 18, Season.ALL);
		Wheel wheel3 = new Wheel("kleber", 5, 17, Season.SUMMER);
		
		Engine engine1 = new Engine("BMV", 5, 300, FuelType.GAS);
		Engine engine2 = new Engine("Peugeot", 1.5, 130, FuelType.DIESEL);
		Engine engine3 = new Engine("Volkswagen", 2.8, 174, FuelType.GAS);
	
		Car car1 = new Car("BMV", wheel2, engine1);
		System.out.println(car1);
		
		car1.ride(50);
		System.out.println(car1);
		car1.ride(800);
		System.out.println(car1);
		
		car1.refuel();
		System.out.println(car1);
		
		car1.ride(100);
		System.out.println(car1);

		
		car1.showCar();
		
		car1.showWheels();
		
		car1.changeWheel(wheel1, 2);
		car1.showWheels();
		
		

		
		

	}

}
