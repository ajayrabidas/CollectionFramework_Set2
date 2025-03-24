package com.example.string;

import java.util.Arrays;

public class SecondLowestElementFromArray {

// Question: Find the second lowest element efficiently
// Check edge cases

	public static void main(String[] args) {
		SecondLowestElementFromArray t = new SecondLowestElementFromArray();

		// scenario 1 method 1
		int[] arr = { 5, 7, 1, 9, 6, 8, 4 };
		System.out.println("Second Lowest: " + t.method1(arr));

//		// scenario 2 method 1
//		t.method1();
//
//		// scenario 3 method 1
//		t.method1();
//
//		// scenario 4 method 2
//		t.method2();
//
//		// scenario 5 method 2
//		t.method2();
//
//		// scenario 6 method 2
//		t.method2();

	}

	// solution1: sort and find second lowest
	public int method1(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	// solution2:
	public int method2(int[] arr) {
		int lowest = arr[0];
		int secLowest = arr[1];

		for (int i = 0; i < arr.length - 2; i++) {
			if (lowest > secLowest) {
				lowest = lowest + secLowest;
				secLowest = lowest - secLowest;
				lowest = lowest - secLowest;
			}

			if (arr[i + 2] < lowest && arr[i + 2] < secLowest) {
				lowest = arr[i + 2];
				secLowest = lowest;
			}

			if (arr[i + 2] >= lowest && arr[i + 2] < secLowest) {
				lowest = arr[i + 2];
				secLowest = lowest;
			}

		}

		return 0;
	}

}
