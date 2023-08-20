package my.home.programming4.simple.task4;

/*
Создайте класс Train, содержащий поля: 
название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, 
добавьте возможность сортировки элементов массива по номерам поездов. 
Добавьте возможность вывода информации о поезде, 
номер которого введен пользователем. 
Добавьте возможность сортировки массив по пункту назначения, 
причем поезда с одинаковыми пунктами назначения должны быть 
упорядочены по времени отправления. 
*/

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Train {
	private String destination;
	private int trainNumber;
	private LocalTime departureTime;
	private DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

	public Train() {

	}

	public Train(int trainNumber, String destination, String date) {
		// TODO Auto-generated constructor stub
		this.trainNumber = trainNumber;
		this.destination = destination;
		departureTime = LocalTime.parse(date, formatter);
	}

	public void printTrain(Train[] trains) {
		for (Train t : trains) {
			System.out.println(t.trainNumber + " to " + t.destination + ", departue time: " + t.departureTime);
		}
	}

	public void swap(Train[] trains, int index) {
		Train tempTrain = trains[index];
		trains[index] = trains[index + 1];
		trains[index + 1] = tempTrain;
	}

	public void sortByNums(Train[] trains) {
		boolean isChange = true;

		while (isChange) {
			isChange = false;

			for (int i = 0; i < trains.length - 1; i++) {
				if (trains[i].trainNumber > trains[i + 1].trainNumber) {
					swap(trains, i);
					isChange = true;
				}
			}
		}

	}

	public void printByCustomNumber(String message, Train[] trains) {

		System.out.println(message + "\n" + "For exit press \"q\"");
		int readNumber = 0;

		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {

				String scBuffer = sc.next();
				if (scBuffer.equalsIgnoreCase("q")) {
					return;
				}
				try {
					readNumber = Integer.valueOf(scBuffer);
					int count = trains.length;
					for (Train t : trains) {
						if (t.trainNumber == readNumber) {
							count--;
							System.out.println(
									t.trainNumber + " to " + t.destination + ", departue time: " + t.departureTime);
						}
					}
					if (count == trains.length) {
						System.out.println("There are any trains with this number");
					}
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Wrong train number");
				}
				System.out.println("\n" + message);

			}
		} catch (Exception ex) {
			System.out.println("In consoleRead block " + ex);
		}

	}

	public void sortByDestination(Train[] trains) {
		boolean isChanged = true;
		while(isChanged) {
			isChanged = false;
			
			for(int i = 0; i < trains.length - 1; i++) {
				if(trains[i]
						.destination
						.compareToIgnoreCase(trains[i+1].destination) > 0) {
					isChanged = true;
					swap(trains, i);
				}
				if(trains[i]
						.destination
						.compareToIgnoreCase(trains[i+1].destination) == 0) {
					
					if(trains[i].departureTime.compareTo( trains[i+1].departureTime) > 0) {
						isChanged = true;
						swap(trains, i);
					}
					
				}
			}
		}

	}

}
