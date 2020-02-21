package com.capgi;

import java.util.Scanner;

public class Cubes {
	
	public static int sumOfCubes(int n) {
		int rev=0;
		int sum=0;
		
		while(n>0) {
			rev=n%10;
			sum=sum+rev*rev*rev;
			n=n/10;
		}
		return sum ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Cubes.sumOfCubes(n));

	}

}
