package com.capgi.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {

	public static void main(String[] args) {

		
		ExecutorService service = Executors.newSingleThreadExecutor();
		//ExecutorService service = Executors.newFixedThreadPool();
		for (int i = 0; i < 10; i++) {

			service.execute(new Task());
		}

	}

}

class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());

	}
}
