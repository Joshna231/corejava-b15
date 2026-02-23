package except;

public class ErrorTest {
	// StackOverflowError - if in case server will run continuously running, till fill the stack memory
	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		m1();
	}

	public static void main(String[] args) {
		ErrorTest et = new ErrorTest();
		et.m1();
	}
}
