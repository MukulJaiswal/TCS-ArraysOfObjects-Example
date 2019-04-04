package test;

import java.util.Arrays;

public class Test {
	int id;
	String name ;
	double age ;
	
	Test(int id,String name, double age ){
		this.id = id ;
		this.name = name ;
		this.age = age;
	}
	public static void main(String[] args) {
		
		Test e1 = new Test(6, "aaa", 22);
		Test e2 = new Test(3, "bbb", 33);
		Test e3 = new Test(7, "ccc", 55);
		Test e4 = new Test(2, "ddd", 44);
		
		Test arr[]= {e1,e2,e3,e4};
		
		Arrays.sort(arr);
		
		for(Test i : arr) {
			System.out.println(i.id + " " +i.name+ " "+ i.age);
		}
	}
}
