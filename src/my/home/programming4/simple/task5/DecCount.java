package my.home.programming4.simple.task5;

/*
Опишите класс, реализующий десятичный счетчик, 
который может увеличивать или уменьшать свое значение на единицу 
в заданном диапазоне. 
Предусмотрите инициализацию счетчика значениями по умолчанию 
и произвольными значениями. 
Счетчик имеет методы увеличения и уменьшения состояния, 
и метод позволяющее получить его текущее состояние. 
Написать код, демонстрирующий все возможности класса.
*/

public class DecCount {
	private int low;
	private int high;
	private int currentState;
		
	DecCount(){
		low = 1;
		high = 10;
		currentState = (low + high) / 2;
	}
	
	DecCount(int low, int high){
		this.low = low;
		this.high = high;
		currentState = (this.low + this.high) / 2;
	}
	
	DecCount(int low, int high, int currentState){
		this.low = low;
		this.high = high;
		this.currentState = (currentState >= low && currentState <= high) ? 
							currentState :
							(this.low + this.high) / 2;
	}
	
	public int getLow() {
		return low;
	}
	
	public int getHigh() {
		return high;
	}
	
	public int getCurrentState() {
		return currentState;
	}
	
	public void increaseCount() {
		if(currentState >= low && currentState < high) {
			currentState++;
		} else {
			System.out.println("Current state = high value");
		}
	}
	
	public void decreaseCount() {
		if(currentState > low && currentState <= high) {
			currentState--;
		}else {
			System.out.println("Current state = low value");
		}
	}
	
	@Override
	public String toString() {
		return "Low value : " + getLow() + ", high value: " + getHigh() + 
				", current state: " + getCurrentState();
	}
	
}
