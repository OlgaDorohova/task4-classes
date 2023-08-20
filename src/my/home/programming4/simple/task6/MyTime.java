package my.home.programming4.simple.task6;

/*
Составьте описание класса для представления времени. 
Предусмотрте возможности установки времени и изменения его отдельных полей 
(час, минута, секунда) с проверкой допустимости вводимых значений. 
В случае недопустимых значений полей поле устанавливается в значение 0. 
Создать методы изменения времени на заданное количество часов, минут и секунд. 
*/

public class MyTime {
	private int hours;
	private int minutes;
	private int seconds;

	MyTime(int hours, int minutes, int seconds) {
		this.hours = (hours >= 0 && hours < 24) ? hours : 0;
		this.minutes = (minutes >= 0 && minutes < 60) ? minutes : 0;
		this.seconds = (seconds >= 0 && seconds < 60) ? seconds : 0;
	}

	public void setHours(int hours) {
		this.hours = (hours >= 0 && hours < 24) ? hours : 0;
	}

	public void setMinutes(int minutes) {
		this.minutes = (minutes >= 0 && minutes < 60) ? minutes : 0;
	}

	public void setSeconds(int seconds) {
		this.seconds = (seconds >= 0 && seconds < 60) ? seconds : 0;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void increaseHours(int value) {
		int temp;
		temp = (value < 24) ? value : (value % 24);
		hours = (hours + temp < 24) ? 
				(hours + temp) : ((hours + temp) % 24);
	}

	public void decreaseHours(int value) {
		int temp;
		temp = (value < 24) ? value : (value % 24);
		hours = (hours - temp >= 0) ? 
				(hours - temp) : (24 - (temp - hours));
	}

	public void increaseMinutes(int value) {
		int tempMin;

		if (value < 60) {
			tempMin = value;
		} else {
			tempMin = value % 60;
			increaseHours(value / 60);
		}

		if (minutes + tempMin < 60) {
			minutes += tempMin;
		} else {
			minutes = (minutes + tempMin) % 60;
			increaseHours((minutes + tempMin) / 60);
		}
	}

	public void decreaseMinutes(int value) {
		int tempMin;

		if (value < 60) {
			tempMin = value;
		} else {
			tempMin = value % 60;
			decreaseHours(value / 60);
		}

		if (minutes - tempMin >= 0) {
			minutes -= tempMin;
		} else {
			minutes = 60 - (tempMin - minutes);
			hours--;
		}
	}

	public void increaseSeconds(int value) {
		int tempSec;

		if (value < 60) {
			tempSec = value;
		} else {
			tempSec = value % 60;
			increaseMinutes(value / 60);
		}

		if (seconds + tempSec < 60) {
			seconds += tempSec;
		} else {
			seconds = (seconds + tempSec) % 60;
			increaseMinutes((seconds + tempSec) / 60);
		}

	}

	public void decreaseSeconds(int value) {
		int tempSec;

		if (value < 60) {
			tempSec = value;
		} else {
			tempSec = value % 60;
			decreaseMinutes(value / 60);
		}

		if (seconds - tempSec >= 0) {
			seconds -= tempSec;
		} else {
			seconds = 60 - (tempSec - seconds);
			minutes--;
		}

	}

	public void print() {
		System.out.printf("%02d:%02d:%02d\n", getHours(), getMinutes(), getSeconds());
	}

}
