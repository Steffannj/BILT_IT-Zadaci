package zadaci_14_02_2018;

import java.util.Scanner;

public class CountLetters {
	public static int countLetters(String s) {
		int numOfLetters = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				numOfLetters++;
			}
		}
		return numOfLetters;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = input.nextLine();
		int numOfLetters = countLetters(s);
		System.out.println("String have " + numOfLetters + " letters.");
		input.close();

	}

}
