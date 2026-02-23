package functional;

import java.util.function.Predicate;

public class PredicateTest {

	// it is functional interface
	// it returns boolean values
	// it takes input
	// it have test(T t);

	public static void main(String[] args) {
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length()==6;
			}
		};

		boolean result = p1.test("joshna");
		System.out.println(result);

		System.out.println("======================================");

		Predicate<String> p2 = t -> t.length() == 6;

		boolean result2 = p2.test("Joshna");
		System.out.println(result2);
	}
}
