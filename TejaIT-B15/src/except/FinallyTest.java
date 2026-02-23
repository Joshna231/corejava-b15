package except;

public class FinallyTest {

	public void m1() {

		// either exception is getting or not, always finally block will execute
		try {
			int i = 100;
			int j = 10;
			int k = i / j;
			System.out.println(k);
			System.out.println("try block");

		} catch (ArithmeticException e) {
			System.out.println("catch block");
			e.printStackTrace();

		} finally {
			// connections, sessions, files
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) {
		FinallyTest ft = new FinallyTest();
		ft.m1();
	}
}