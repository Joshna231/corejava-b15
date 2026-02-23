package functional;

import java.util.function.Function;

public class FunctionTest {
	
	// it takes input and return the value
	// it have apply(T t);
	public static void main(String[] args) {
		Function<String, Integer> f1 = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		Integer val = f1.apply("Joshna");
		System.out.println(val);

		System.out.println("===========================================");

		Function<String, Integer> f2 = t -> t.length();

		Integer val2 = f2.apply("Lavanya");
		System.out.println(val2);
	}
}
