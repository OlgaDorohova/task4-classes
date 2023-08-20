package my.home.programming4.simple.task7;

/*
Class describing the coordinates of the vertices of a triangle 
*/
import java.text.DecimalFormat;

public class Points {
	private double x;
	private double y;
	
	public Points(double x, double y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + new DecimalFormat("#0.00").format(x) + "; y = " + new DecimalFormat("#0.00").format(y);
	}

}
