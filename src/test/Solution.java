package test;

import java.util.Scanner;

class Student {
	int id;
	String name;
	String city;
	double marks;

	public Student(int id, String name, String city, double marks) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}

public class Solution {

	public static Student[] getStudentsWithCityAndMarks(Student[] students, String city, double marks) {

		Student s[] = new Student[students.length];
		Student t = new Student(0, "", "", 0.0);
		Student temp;
		for (int i = 0; i < students.length; i++) {

			for (int j = 0; j < students.length - 1; j++) {
//				if (students[j].id > students[j + 1].id) {
//					t.id = students[j].id;
//					t.name = students[j].name;
//					t.city = students[j].city;
//					t.marks = students[j].marks;
//
//					students[j].id = students[j + 1].id;
//					students[j].name = students[j + 1].name;
//					students[j].city = students[j + 1].city;
//					students[j].marks = students[j + 1].marks;
				
//					students[j + 1].id = t.id;
//					students[j + 1].name = t.name;
//					students[j + 1].city = t.city;
//					students[j + 1].marks = t.marks;
//				}
//			}
				if (students[j].id > students[j + 1].id) {
					temp = students[j];
					students[j] = students[j+1];
					students[j+1] = temp;
				}
			}
				
		}
		int c = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].city.equalsIgnoreCase(city) && students[i].marks == marks) {
				c++;
			}
		}
		System.out.println(c);
		for (int i = 0; i < students.length; i++) {
			if (students[i].city.equalsIgnoreCase(city) && students[i].marks == marks) {
				System.out.println(
						students[i].id + " " + students[i].name + " " + students[i].city + " " + students[i].marks);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		int n, id1;

		String city1, name1;

		double marks1;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		Student st[] = new Student[n];
		for (int i = 0; i < n; i++) {
			id1 = sc.nextInt();
			name1 = sc.next();
			city1 = sc.next();
			marks1 = sc.nextDouble();
			st[i] = new Student(id1, name1, city1, marks1);
		}

		String c = sc.next();
		double m = sc.nextDouble();

		Student s[] = getStudentsWithCityAndMarks(st, c, m);
	}
}
