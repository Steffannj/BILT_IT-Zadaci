package com.zadaci12_02_2018;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static int gcd(int n1, int n2) {
		if (n1 == 0)
			return n2;

		while (n2 != 0) {
			if (n1 > n2)
				n1 = n1 - n2;
			else
				n2 = n2 - n1;
		}

		return n1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter firts integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter second integer: ");
		int n2 = input.nextInt();
		System.out.println("GCD is: " + gcd(n1, n2));
		input.close();

	}

}
