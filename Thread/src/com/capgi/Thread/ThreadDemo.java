package com.capgi.Thread;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub

		// System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		ThreadDemo td1 = new ThreadDemo();
		td1.setName("ramya");
		ThreadDemo td2 = new ThreadDemo();

		td2.setName("shalini");
		td1.start();
		td2.start();

		// System.out.println(td1);

	}

}
