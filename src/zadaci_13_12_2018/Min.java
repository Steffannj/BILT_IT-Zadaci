package zadaci_13_12_2018;

import java.util.Scanner;

public class Min {
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] array = new double[10];
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}

		System.out.println(min(array));
		input.close();

	}

}
