package zadaci_15_02_2018;

import java.util.Scanner;

public class DuzinaPiste {
	public static double duzinaPiste(double a, double v) {
		return v * v / (2 * a);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ubrzanje aviona(a): ");
		double a = input.nextDouble();
		System.out.println("Unesite brzinu aviona(v): ");
		double v = input.nextDouble();
		double duzinaPiste = duzinaPiste(a, v);
		System.out.println("Minimalna duzina piste je: " + duzinaPiste);
		input.close();
	}

}
