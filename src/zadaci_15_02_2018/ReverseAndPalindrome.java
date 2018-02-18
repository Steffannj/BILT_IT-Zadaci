package zadaci_15_02_2018;

import java.util.Scanner;

public class ReverseAndPalindrome {
	public static int reverse(int number) {
		int reversed = 0;
		while (number != 0) {
			reversed = reversed * 10 + number % 10;
			number /= 10;
		}
		return reversed;
	}

	public static boolean isPalindrome(int number) {
		if (reverse(number) == number) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = input.nextInt();
		if (isPalindrome(num)) {
			System.out.println(num + " is palindrome.");
		} else {
			System.out.println(num + " isn't palindrome.");
		}
		input.close();
	}

}
