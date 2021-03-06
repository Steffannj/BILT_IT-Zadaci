package com.zadaci12_02_2018;

import java.util.ArrayList;

public class MaxArrayList {

	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			return null;
		} else {
			int max = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) > max) {
					max = list.get(i);
				}
			}
			return max;
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(1);
		list.add(5);
		System.out.println(max(list));
	}

}
