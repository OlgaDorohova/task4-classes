package my.home.programming4.composition.task3;

import java.util.ArrayList;

public class District {
	private String districtName;
	private ArrayList<City> cityes;
	private double area;

	public double getArea() {
		return area;
	}

	public District(String districtName, double area) {
		// TODO Auto-generated constructor stub
		this.districtName = districtName;
		this.area = area;
		cityes = new ArrayList<>();
	}

	public void addCity(City city) {
		cityes.add(city);
	}

	public String getDistrictName() {
		return districtName;
	}

	public void showArea() {
		System.out.println(districtName + " area: " + area);
	}

	@Override
	public String toString() {
		return getDistrictName();
	}

}
