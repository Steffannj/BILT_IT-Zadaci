package com.zadaci12_02_2018;

public class Random_0to9 {

	public static void main(String[] args) {
		int[] array = new int[10];

		for (int i = 0; i < 100; i++) {
			int number = (int) (Math.random() * 10);
			array[number]++;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " appeared " + array[i] + " times.");
		}

	}

}
