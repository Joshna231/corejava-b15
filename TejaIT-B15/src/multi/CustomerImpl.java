package multi;

public class CustomerImpl {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					c1.withdraw(15000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				c1.deposit(20000);

			}
		});
		t2.start();
	}
}