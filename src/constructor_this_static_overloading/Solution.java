package constructor_this_static_overloading;

public class Solution {

	static Employee employeeWithSecondLowestAge(Employee e1[]) {
		double temp;
		for (int i = 0; i < e1.length; i++) {
			for (int j = 0; j < e1.length - 1; j++) {
				if (e1[j].age > e1[j + 1].age) {
					temp = e1[j].age;
					e1[j].age = e1[j + 1].age;
					e1[j + 1].age = temp;
				}
			}
		}
		return e1[1];
	}

	public static void main(String args[]) {
		Employee e1 = new Employee(1, "aaa", 22);
		Employee e2 = new Employee(2, "bbb", 33);
		Employee e3 = new Employee(3, "ccc", 55);
		Employee e4 = new Employee(4, "ddd", 44);
		Employee em[] = { e1, e2, e3, e4 };
		Employee result = employeeWithSecondLowestAge(em);
		System.out.println(result.id + " " + result.name + " " + result.age);
	}
}
