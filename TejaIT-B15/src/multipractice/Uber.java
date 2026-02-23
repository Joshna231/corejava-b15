package multipractice;

import multipractice.Uber;

public class Uber extends Thread {

	@Override
	public void run() {
		data();
	}

	// by adding static keyword, it holds the class level lock - ub
	public static synchronized void data() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread id:- " + Thread.currentThread().getId() + "  " + i);
		}

		// by using two object locks, data consistency will not executed.
		// by using class level lock, data consistency will executed.
	}

	public static void main(String[] args) {
		Uber u1 = new Uber(); // object lock - u1
		Thread t1 = new Thread(u1); // t1-21
		t1.start();

		Thread t2 = new Thread(u1); // t2-22
		t2.start();

// by creating other object, the thread data will execute parallel because both locks are executed at a time

		Uber u2 = new Uber(); // object lock - u2
		Thread t3 = new Thread(u2); // t3-24
		t3.start();

		Thread t4 = new Thread(u2); // t4-25
		t4.start();
	}
}