package functional;

import java.util.concurrent.Callable;

public class CallableTest {
	public static void main(String[] args) throws Exception {
		Callable<Integer> c1 = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				return 10 * 5;
			}
		};
		Integer val = c1.call();
		System.out.println(val);

		System.out.println("========================================");

		Callable<Integer> c2 = () -> 10 * 10;
		Integer val2 = c2.call();
		System.out.println(val2);
	}
}
