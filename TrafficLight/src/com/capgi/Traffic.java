package com.capgi;

import java.util.Scanner;

public class Traffic {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1.red");
		System.out.println("2.yellow");
		System.out.println("3.green");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("stop");
			break;
		case 2:
			System.out.println("ready");
			break;
		case 3:
			System.out.println("go");
			break;
			default:
				System.out.println("invalid");
				break;
		}

	}

}
