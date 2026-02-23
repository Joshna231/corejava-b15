package multipractice;

import multipractice.Airtel;

public class Airtel extends Thread { // we can extend Thread class

	@Override // we can override the run method
	public void run() {
		System.out.println("run method");
	}

	public static void main(String[] args) {
		Airtel a1 = new Airtel(); // we have to create our custom class object
		// a1.run();

		Thread t1 = new Thread(a1); // we have to create Thread class object
									// we are passed our custom object reference into Thread class object
		t1.start(); // to start the thread, we are used the start(); method from thread class.
					// then thread will start and call the run method
	}
}