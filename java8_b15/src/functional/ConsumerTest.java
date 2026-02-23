package functional;

import java.util.function.Consumer;

public class ConsumerTest {

	// it is functional interface
	// it takes input but it doesn't return any value (return type is void)
	// it have Accept(T t);

	public static void main(String[] args) {
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};

		con.accept("Joshna");

		System.out.println("============================================");

		Consumer<String> con2 = t -> System.out.println(t);

		con2.accept("Lavanya");
	}
}
