package except;

public class ExceptionTest1 {

	public void Arithmetic() {

		// something value/zero - Arithmetic exception
		System.out.println("Arithmetic start...");
		try {
			int i = 100;
			int j = 0;
			int k = i / j;
			System.out.println(k);
		} catch (ArithmeticException e) {
			e.printStackTrace();// it prints the exception
		}

		System.out.println("Arithmetic end.....");
	}

	public void Arrayindex() {
		System.out.println("Array index start...");

		try {
			int arr[] = new int[4];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			// arr[4] = 50;

			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		System.out.println("Array index end.....");
	}

	public void Nullpointer() {
		System.out.println("Null pointer start...");

		try {
			Integer i = null;
			int j = 20;
			int k = i + j;
			System.out.println(k);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println("Null pointer end.....");
	}

	public void Numberformat() {
		System.out.println("Number format start...");

		try {
			String s = "123abc";
			Integer val = Integer.valueOf(s);
			System.out.println(val);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("Number format end.....");
	}

	public void interrupted() {
		System.out.println("interrupted start...");

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("interrupted end.....");
	}

	public void interrupted2() throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(3000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ExceptionTest1 et1 = new ExceptionTest1();
		// et1.Arithmetic();
		// et1.Arrayindex();
		// et1.Nullpointer();
		// et1.Numberformat();
		// et1.interrupted();
		et1.interrupted2();
	}
}