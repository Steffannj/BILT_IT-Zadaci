package zadaci_15_02_2018;

import java.util.Scanner;

public class PrestupneGodine {
	public static void prestupneGodine(int god1, int god2) {
		int counter = 0;
		for (int i = god1; i <= god2; i++) {
			if (i != 0 && (i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetnu godinu: ");
		int god1 = input.nextInt();
		System.out.println("Unesite krajnju godinu: ");
		int god2 = input.nextInt();
		prestupneGodine(god1, god2);
		input.close();
	}

}
