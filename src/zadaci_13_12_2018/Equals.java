package zadaci_13_12_2018;

import java.util.Scanner;

public class Equals {
	public static boolean equals(int[] niz1, int[] niz2) {
		boolean equals = true;
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {
				equals = false;
			}
		}
		return equals;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers in 1. array: ");
		int niz1[] = new int[5];
		for (int i = 0; i < 5; i++) {
			niz1[i] = input.nextInt();
		}
		System.out.println("Enter numbers in 2. array: ");
		int niz2[] = new int[5];
		for (int i = 0; i < 5; i++) {
			niz2[i] = input.nextInt();
		}
		if (equals(niz1, niz2)) {
			System.out.println("Arrays are equals.");
		} else {
			System.out.println("Arrays aren't equals.");
		}

		input.close();
	}

}
