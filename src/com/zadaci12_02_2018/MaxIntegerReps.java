package com.zadaci12_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxIntegerReps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxInteger = 0;
		int numberOfMax = 0;

		System.out.println("Enter Integers, 0 breaks input: ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = input.nextInt();
		while (n != 0) {
			list.add(n);
			n = input.nextInt();
		}

		maxInteger = MaxArrayList.max(list); // method used from another class
												// in this package to find
												// biggest number

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == maxInteger) {
				numberOfMax++;
			}
		}
		System.out
				.println("Biggest entered Integer is: " + maxInteger + " and "
						+ maxInteger + " repeated " + numberOfMax + " times.");
		input.close();

	}

}
