package my.home.programming4.simple.task7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle abc = new Triangle(new Points(4, 5), new Points(8, 3), new Points(1, 1));
		
		System.out.printf("Perimeter = %.2f\n",abc.perimeter());
		System.out.printf("Square = %.2f\n",abc.square());
		System.out.println("Madian intersection point: "+ abc.medianIntersectionPoint());
	}

} 
