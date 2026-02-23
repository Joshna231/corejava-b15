package collect;

public class CompareTest {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Integer c = 10;

		System.out.println(a.compareTo(b)); // less than = -1
		System.out.println(b.compareTo(a)); // greater than = +1
		System.out.println(c.compareTo(a)); // equals = 0
	}
}
