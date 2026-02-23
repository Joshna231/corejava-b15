package functional;

public class RunnableTest {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("t1 is programming");

			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		System.out.println("=================================================");

		Runnable r2 = () -> System.out.println("t2 is programming");
		Thread t2 = new Thread(r2);
		t2.start();

	}
}
