package ArrayOfObjects;

import java.util.*;

public class StudentSolution {
	static int studentCountWithSameCityAndAge(Student s1, Student s2, Student s3) {
		if ((s1.city).equals(s2.city) && (s1.city).equals(s3.city) && s1.age == s2.age && s1.age == s3.age)
			return 3;
		else if (((s1.city).equals(s2.city) && (s1.age == s2.age)) || ((s2.city).equals(s3.city) && (s2.age == s3.age))
				|| ((s1.city).equals(s3.city) && (s1.age == s3.age))) {
			return 2;
		} else
			return 0;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Arrays of Objects
		Student s[] = new Student[3];
		
		for (int i = 0; i < 3; i++) {
			String name = sc.nextLine();
			int age = sc.nextInt();
			sc.nextLine();
			String city = sc.nextLine();

			s[i] = new Student(name, age, city);
		}

		System.out.println(studentCountWithSameCityAndAge(s[0], s[1], s[2]));
	}
}
