package multipractice;

import multipractice.Jio;

public class Jio implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread id - " + Thread.currentThread().getId());
		}
	}

	public static void main(String[] args) {
		Jio j = new Jio();
		Thread t1 = new Thread(j); // Thread id=20
		t1.start();

		Thread t2 = new Thread(j); // Thread id=21
		t2.start();

		Thread t3 = new Thread(j); // Thread id=22
		t3.start();

		Thread t4 = new Thread(j);
		t4.start();
	}

}