package my.home.programming4.composition.task3;

/*Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city1 = new City("Kiev", 839);
		City city2 = new City("Kharkov", 350);
		City city3 = new City("Odessa", 162.4);

		District khDistrict = new District("Kharkovskiy", 3222);
		khDistrict.addCity(city2);
		khDistrict.addCity(new City("Chuguev", 12.8));
		khDistrict.addCity(new City("Izum", 41));

		District lozDistrict = new District("Lozovskoy", 4032);
		lozDistrict.addCity(new City("Lozovaya", 18.1));
		lozDistrict.addCity(new City("Pervomayskiy", 30.8));
		lozDistrict.addCity(new City("Bliznetsi", 3.8));

		Region khRegion = new Region("Kharkovskaya", city2, 31415);
		khRegion.addDisirict(khDistrict);
		khRegion.addDisirict(lozDistrict);

		Region kievRegion = new Region("Kievskaya", city1, 28121);

		Region odRegion = new Region("Odesskaya", city3, 33314);

		State ukrState = new State("Ukraine", city1, 603700);
		ukrState.addRegion(odRegion);
		ukrState.addRegion(kievRegion);
		ukrState.addRegion(khRegion);

		ukrState.showCapital();
		ukrState.showRegionNums();
		ukrState.showArea();
		
		ukrState.showRegionCenters();

	}

}
