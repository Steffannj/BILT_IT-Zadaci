package zadaci_14_02_2018;

import java.util.Scanner;

public class StedniRacun {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double mjesecnaStopa = 0.00417;
		System.out.println("Unesite mjeseèni iznos štednje: ");
		double iznos = input.nextDouble();
		System.out
				.println("Unesite broj mjeseci nakon kojih bi željeli saznati iznos na vašem raèunu: ");
		int mjeseci = input.nextInt();
		double noviIznos = 0;
		for (int i = 0; i < mjeseci; i++) {
			noviIznos = (iznos+noviIznos) * (1 + mjesecnaStopa);
		}
		System.out.println("Nakon " + mjeseci
				+ " mjeseci iznos na vašem raèunu æe biti: " + noviIznos);
		input.close();
	}

}
