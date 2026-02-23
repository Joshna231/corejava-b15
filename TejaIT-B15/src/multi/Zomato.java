package multi;

public class Zomato extends Thread {

	@Override
	public void run() { // Running - execution of run method
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread id:: " + Thread.currentThread().getId() + "  " + i);

			try {
				Thread.sleep(3000); // waiting state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Dead - completion of run method execution
	}

	public static void main(String[] args) {
		Zomato z = new Zomato();

		Thread t1 = new Thread(z); // Born or New - creating thread object
		t1.start(); // Runnable - Starting a Thread
		t1.start(); // IllegalThreadStateException
	}
}