package my.home.programming4.simple.task3;

import java.util.Arrays;

/*
Создайте класс с именем Student, 
содержащий поля: фамилия и инициалы, номер группы, 
успеваемость (массив из пяти элементов). 
Создайте массив из десяти элементов такого типа. 
Добавьте возможность вывода фамилий и номеров групп студентов, 
имеющих оценки, равные только 9 или 10. 
*/

public class Student {
	private String name;
	private int group;
	private int[] grades = new int[5];
	
	public Student() {
	}

	public Student(String name, int group) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.group = group;
	}
	
	public void setGrades(int [] array) {
		for(int i = 0; i < array.length; i++) {
			grades[i] = array[i];
		}
	}


	public void printStudentGoodGrades(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				int count = 0;
				for (int j = 0; j < students[i].grades.length; j++) {
					if (students[i].grades[j] == 9 || students[i].grades[j] == 10) {
						count++;
					}
				}
				if (count == grades.length) {
					System.out.println(students[i].name + "; group " + students[i].group);
				}

			}
		}
	}
	
	@Override
	public String toString() {
		return "[name: " + name + ", group: " + group+ ", grades: " + Arrays.toString(grades) +"]";
	}

}
