package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReference {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 9, 7, 4, 18, 15, 17, 20, 13, 10);

		list.stream().filter(x -> x % 2 == 0).map(x -> x + 2).sorted().forEach(System.out::println);

		System.out.println("==============using static methods====================");

		list.stream()
			.filter(x -> Reference.even(x))
			.map(x -> Reference.addition(x))
			.sorted()
			.forEach(System.out::println);

		list.stream()
			.filter(Reference::even)		// classname::methodname
			.map(Reference::addition)
			.sorted()
			.forEach(System.out::println);

		System.out.println("=================using instance methods=================");

		Reference ref = new Reference();

		list.stream()
			.filter(x -> ref.odd(x))
			.map(x -> ref.multiply(x))
			.sorted()
			.forEach(System.out::println);

		list.stream()
			.filter(ref::odd)			// ref.name::Methodname
			.map(ref::multiply)
			.sorted()
			.forEach(System.out::println);

		System.out.println("=================using arbitory methods=====================");

		List<String> list2 = Arrays.asList("joshna", "krishna", "nageena", "bharath", "lavanya", "kumari");
		
		list2.stream()
			.filter(x -> x.contains("n"))
			.map(x -> x.toUpperCase())
			.forEach(System.out::println);

		list2.stream()
			.filter(x -> x.contains("h"))		// without creating object we can access by using classname.
			.map(String::toLowerCase)			// Classname::Methodname
			.forEach(System.out::println);

		System.out.println("================new object================================");

		// Function<Integer, Student> fun = t -> new Student(t);

		Function<Integer, Student> fun = Student::new;		// Constructor::new keyword.

		Student stu = fun.apply(101);
		System.out.println(stu);
	}

}
