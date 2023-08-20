package my.home.programming4.composition.task3;

import java.util.ArrayList;

public class Region {
	private String regionName;
	private City regionCenter;
	private double area;

	private ArrayList<District> districts;

	public Region(String regionName, City regionCenter, double area) {
		this.regionName = regionName;
		this.regionCenter = regionCenter;
		this.area = area;
		districts = new ArrayList<>();
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void addDisirict(District district) {
		districts.add(district);
	}

	public City getRegoinCenter() {
		return regionCenter;
	}

	public String getRegionName() {
		return regionName;
	}

	public void showRegionCenter() {
		System.out.println(regionCenter.getName());
	}

	public void showArea() {
		System.out.println(regionName + " area: " + area);
	}

}
