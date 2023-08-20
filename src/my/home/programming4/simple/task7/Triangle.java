package my.home.programming4.simple.task7;

/*
Описать класс, представляющий треугольник. 
Предусмотреть методы для создания объектов, 
вычисления площади, периметра и точки пересечения медиан.
*/

public class Triangle {
	private Points a;
	private Points b;
	private Points c;

	public Triangle(Points a, Points b, Points c) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getSide(Points p1, Points p2) {
		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	}

	public double perimeter() {
		return getSide(a, b) + getSide(a, c) + getSide(b, c);
	}

	public double square() {
		return Math.abs(
				((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY())) / 2);
	}

	public Points medianIntersectionPoint() {
		double medX = (a.getX() + b.getX() + c.getX()) / 3;
		double medY = (a.getY() + b.getY() + c.getY()) / 3;
		
		return new Points(medX, medY); 

	}
}
