package my.home.programming4.simple;

/*
Создайте класс Test1 двумя переменными.
Добавьте метод вывода на экран и методы изменения этих переменных. 
Добавьте метод, который находит сумму значений этих переменных, 
и метод, который находит наибольшее значение из этих двух переменных.
*/

public class Test1 {
	private int first;
	private int second;

	public void setFirst(int num) {
		first = num;
	}

	public void setSecond(int num) {
		second = num;
	}

	public void printNum() {
		System.out.println("First number is " + first + "\nSecond number is " + second);
	}

	public int sum() {
		return first + second;
	}

	public int max() {
		return (first > second) ? first : second;
	}


}
