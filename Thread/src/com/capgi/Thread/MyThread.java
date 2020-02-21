package com.capgi.Thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("child thread executed");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MyThread mt= new  MyThread();
		 Thread thread = new  Thread(mt);
		 thread.setName("mahesh");
		 thread.setPriority(10);
		 
		 
				 System.out.println(thread);
				 System.out.println(thread.getName());
		thread.start();
		System.out.println("main thread is created");

	}

}
