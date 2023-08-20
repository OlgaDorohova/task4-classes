package my.home.programming4.composition.task2;

public class Wheel {
	private String brand;
	private int width;
	private int radius;
	private Season season;
	
	private int range;
	
	public enum Season {
		WINTER, SUMMER, ALL
	};

	public Wheel(String brand, int width, int radius, Season season) {
		// TODO Auto-generated constructor stub
		this.brand = brand;
		this.width = width;
		this.radius = radius;
		this.season = season;
	}
	
	public Season getSeason() {
		return season;
	}
	
	public void setSeason(Season season) {
		this.season = season;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	@ Override
	public String toString() {
		return "[brand " + brand + ", width " + width + ", radius" + radius  + ", season " + season + "]";
	}
	

}
