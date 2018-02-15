package zadaci_14_02_2018;

import java.util.Scanner;

public class ReversedNumbers {
	public static double[] reverse(double row[]) {
		double row1[] = new double[10];
		for (int i = row.length - 1, j = 0; i >= 0; i--, j++) {
			row1[j] = row[i];
		}
		return row1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double row[] = new double[10];
		for (int i = 0; i < 10; i++) {
			row[i] = input.nextDouble();
		}
		double row1[] = reverse(row);
		for (int i = 0; i < 10; i++) {
			System.out.print(row1[i] + " ");
		}
		input.close();

	}

}
