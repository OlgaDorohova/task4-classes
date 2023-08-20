package my.home.programming4.composition.task3;

import java.util.ArrayList;

public class State {
	private String stateName;
	private City capital;
	private double area;
	private ArrayList<Region> regions;

	public State(String stateName, City capital, double area) {
		this.stateName = stateName;
		this.capital = capital;
		this.area = area;
		regions = new ArrayList<>();
	}

	public double getArea() {
		return area;
	}

	public void showCapital() {
		System.out.println("Capital of " + stateName + " is " + capital.getName());
	}

	public void addRegion(Region region) {
		regions.add(region);
	}

	public void showRegionNums() {
		System.out.println(stateName + " has " + regions.size() + " regions");
	}

	public void showArea() {
		System.out.println(stateName + " area: " + area);
	}

	public void showRegionCenters() {
		System.out.println("Region centers: ");
		for (Region reg : regions) {
			reg.showRegionCenter();
		}
	}

	@Override
	public String toString() {
		return "state " + stateName + "; capital " + capital + "; area " + area + "; districts: " + regions.size();
	}

}
