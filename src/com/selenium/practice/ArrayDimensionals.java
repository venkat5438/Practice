package com.selenium.practice;

public class ArrayDimensionals {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 }; // single dimensional array indexes starts
									// from 0 1 2 3...etc
		System.out.println(a[1]);
		// ------------ROW---------Column-------below
		int[][] b = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } }; // 2 dimensional
														// array..draw diagram u
														// will get it

		System.out.println(b[0][2]);// 3
		System.out.println(b[1][3]);// 8

	}
}
