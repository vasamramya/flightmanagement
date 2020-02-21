package com.capgi.Thread;

public class Admission implements Runnable{
	
	int seats=1
			;//instance variable
	
	

	@Override
	public  synchronized void run() {
		if(seats>0) {
			System.out.println("seat is allocated to "+Thread.currentThread().getName());
		}
		else
		{
			System.err.println("try next year");
		}
	seats--;
	System.out.println("no.of seats after allocation"+seats);
		
	}

	public static void main(String[] args) {
		
		Admission obj=new Admission();
		Thread thread1 = new Thread(obj,"mahesh");
		Thread thread2 = new Thread(obj,"shaurya");//thread1  and thread2 are two different objects both are accessing same obj
		System.out.println("no.of seats before"+obj.seats);
		thread1.start();
		thread2.start();
		
	}

}
