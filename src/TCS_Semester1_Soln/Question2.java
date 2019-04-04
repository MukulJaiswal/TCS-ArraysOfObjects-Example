package TCS_Semester1_Soln;

import java.util.Scanner;

/**
 * "Define main method in Solution class to read a number (without digits). 
 * The program should display the answer which is addition of those digits. 
Sample input:
123
Output
6

 */
public class Question2 {
	public static void main(String[] args) {
		Scanner  sc= new Scanner(System.in);
		int num= sc.nextInt();
		int result =0;
		while(num != 0)
		{
			int rem = num %10;
			result = result + rem;
			num = num/10;
		}
		System.out.println(result);
	}
}
