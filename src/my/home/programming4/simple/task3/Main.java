package my.home.programming4.simple.task3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		int[] goodMark = { 9, 10, 10, 9, 10 };
		int[] badMark = { 9, 8, 7, 10, 12 };

		Student[] students = new Student[10];
		students[0] = new Student("Ivanov P. A.", 1);
		students[1] = new Student("Petrov R. P.", 2);
		students[2] = new Student("Kovaleva O. B.", 1);
		students[3] = new Student("Sydorov S. V.", 1);
		students[4] = new Student("Popov F. K.", 1);
		students[5] = new Student("Kozlov V. V.", 2);
		students[6] = new Student("Romanova V. F.", 1);
		students[7] = new Student("Serov B. N.", 1);
		students[8] = new Student("Chernova M. M.", 2);
		students[9] = new Student("Zukova D. B.", 2);

		students[0].setGrades(goodMark);
		students[1].setGrades(badMark);
		students[2].setGrades(goodMark);
		students[3].setGrades(badMark);
		students[4].setGrades(goodMark);
		students[5].setGrades(badMark);
		students[6].setGrades(goodMark);
		students[7].setGrades(badMark);
		students[8].setGrades(goodMark);
		students[9].setGrades(badMark);

		s.printStudentGoodGrades(students);
	}

}
