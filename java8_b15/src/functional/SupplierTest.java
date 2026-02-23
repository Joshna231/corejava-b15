package functional;

import java.util.function.Supplier;

public class SupplierTest {

	// it is functional interface
	// it doesn't takes input but it return some value
	// it have get();

	public static void main(String[] args) {
		Supplier<Integer> s1 = new Supplier<Integer>() {

			@Override
			public Integer get() {
				return 5 * 5;
			}
		};
		System.out.println(s1.get());

		System.out.println("=============================================");

		Supplier<Integer> s2 = () -> 8 * 8;

		System.out.println(s2.get());
	}
}
