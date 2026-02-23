package multi;

public class Ola extends Thread {

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i < 10; i++) {
				System.out.println("Thread id:-  " + Thread.currentThread().getId() + "  i::" + i);
			}
		}
		for (int j = 11; j < 20; j++) {
			System.out.println("Thread id:- " + Thread.currentThread().getId() + "  J::" + j);
		}
	}

	public static void main(String[] args) {
		Ola o1 = new Ola();
		Thread t1 = new Thread(o1);
		t1.start();

		Thread t2 = new Thread(o1);
		t2.start();
	}
}