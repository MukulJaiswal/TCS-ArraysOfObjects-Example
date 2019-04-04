/**
 * Check number is prime or not from n given number and if the number is prime then
 * check its reverse is also prime.
 * print all number in ascending order
 * 
 * 7
	11
	12
	23
	19
	7
	113
	101
	output
	7
	11
	101
	113

 */
package test;

import java.util.*;

public class Solution1 {

	static boolean reverse(int n) {

		int rem = 0, rev = 0;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (isPrime(rev)) {
			return true;
		} else
			return false;
	}

	static boolean isPrime(int x) {

		int count = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0)
				count = count + 1;
		}
		if (count == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		Set<Integer> lists = new TreeSet<Integer>();
		int p = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {

			if (isPrime(a[i])) {

				if (reverse(a[i])) {
					lists.add(a[i]);
				}
			}
		}
		for (int list : lists) {
			System.out.println(list);
		}
	}
}
