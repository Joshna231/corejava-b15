package multipractice;

public class DeadLock {

	public static void main(String[] args) {
		String lock1 = "joshna";
		String lock2 = "krishna";

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock1) {
					System.out.println("t1 thread acquired " + lock1);
					synchronized (lock2) {
						System.out.println("t1 thread acquired " + lock2);

					}

				}

			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (lock2) {
					System.out.println("t2 thread acquired " + lock2);
					synchronized (lock1) {
						System.out.println("t2 thread acquired " + lock1);

					}

				}

			}
		});
		t2.start();
	}
}