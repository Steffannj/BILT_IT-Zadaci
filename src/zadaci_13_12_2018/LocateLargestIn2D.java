package zadaci_13_12_2018;

import java.util.Scanner;

public class LocateLargestIn2D {
	public static int[] locateLargest(double[][] a) {
		int[] location = new int[2];
		double max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2D array: ");
		double[][] a = new double[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Location of the largest element in 2D arrayy is: ");
		for (int i = 0; i < 2; i++) {
			System.out.print(locateLargest(a)[i]);
		}
		input.close();
	}

}
