package com.capgi;

import java.util.Scanner;

public class StringArray {

	public static String[] stri(String array[]) {
		int n = array.length;
		int mid = 0;
		if (n % 2 == 0) {
			mid = n / 2;
		} else {
			mid = (n + 1) / 2;

		}
		for (int i = 0; i < mid; i++) {
			array[i] = array[i].toUpperCase();
		}
		for (int i = mid; i < n; i++) {
			array[i] = array[i].toLowerCase();
		}

		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String array[] = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.next();
		}
		String arr[] = StringArray.stri(array);
		for (int i = 0; i < n; i++) {

			System.out.println(arr[i]);

		}

	}
}
