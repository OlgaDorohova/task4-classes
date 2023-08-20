package my.home.programming4.composition.task3;

public class City {
	private String cityName;
	private double area;
	
	public City(String name, double area) {
		// TODO Auto-generated constructor stub
		this.cityName = name;
		this.area = area;
	}
	
	public String getName() {
		return cityName;
	}
	
	public double getArea() {
		return area;
	}
	
	public void showArea() {
		System.out.println(cityName + " area: " + area);
	}

	@Override
	public String toString() {
		return cityName;
	}

}
