package my.home.programming4.simple;

/*
Создйте класс Test2 двумя переменными. 
Добавьте конструктор с входными параметрами. 
Добавьте конструктор, инициализирующий члены класса по умолчанию. 
Добавьте set- и get- методы для полей экземпляра класса.
*/

public class Test2 {
	private int first;
	private int second;

	public Test2() {
		first = 0;
		second = 0;
	}

	public Test2(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}
}
