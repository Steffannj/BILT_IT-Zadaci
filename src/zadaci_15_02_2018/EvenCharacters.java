package zadaci_15_02_2018;

import java.util.Scanner;

public class EvenCharacters {
	public static String evenChars(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i += 2) {
			s1 += s.charAt(i);
		}
		return s1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = input.nextLine();
		String s1 = evenChars(s);
		System.out.println(s1);
		input.close();
	}

}
