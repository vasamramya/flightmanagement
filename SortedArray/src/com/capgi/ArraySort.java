package com.capgi;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static int getSorted(int arr[]) {
		int n = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] );
		}
		Arrays.sort(arr);

		return arr[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		ArraySort.getSorted(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
