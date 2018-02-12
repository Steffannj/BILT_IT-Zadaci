package com.zadaci12_02_2018;

import java.util.Scanner;

public class NumberOfVowers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfVowels = 0;
		int spaces = 0;
		System.out.println("Enter String: ");
		String s = input.nextLine();
		s = s.toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
					|| s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				numberOfVowels++;
			}
			if(s.charAt(i) == ' '){
				spaces++;
			}
		}
		
		System.out.println("Number of vowels: " + numberOfVowels
				+ "\nNumber of consonants: " + (s.length() - numberOfVowels - spaces));
		input.close();

	}

}
