package com.capgi;

import java.util.Scanner;

public class Fibonac {

	
	public int a=1;
	public int b=1;
	public  void calculation(int n) {
		int c=0;
		for(int i=2;i<n;i++)
		{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
		
		
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Fibonac fi=new Fibonac();
		System.out.println(fi.a);
		System.out.println(fi.b);
		fi.calculation(n);
		

	}

}
