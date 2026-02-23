package except;

public class ThrowsTest {

	// throws declaration will pass the exception to the caller method
	public void m1() throws InterruptedException {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);

			Thread.sleep(1000);
		}
	}

	public void m2() throws InterruptedException {
		m1();
	}

	public void m3() throws InterruptedException {
		m2();
	}

	public void m4() throws InterruptedException {
		m3();
	}

	public static void main(String[] args) throws InterruptedException {
		ThrowsTest tt = new ThrowsTest();
		tt.m1();
	}
}