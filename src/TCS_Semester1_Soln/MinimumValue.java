package TCS_Semester1_Soln;

import java.util.Scanner;

/***
 * "Write main method in Solution class.
The method will read a String value and print the minimum valued character (as per alphabet and ASCII sequence). 
Consider below sample input and output:
Input:

HellO
Output:
H
Important: Answer is not 'e' since 'H' has lower ASCII value then 'e'
"
 */
public class MinimumValue {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		int  min =Integer.MAX_VALUE;
		char ch1 = 0 ;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((int)ch < min) {
				min = ch;
				ch1 = (char)ch;
			}
		}
		System.out.println(ch1);
		
	}

}
