package functional;

import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		Comparator<Integer> cp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		int val = cp.compare(40, 20);
		System.out.println(val);

		System.out.println("=============================================");

		Comparator<Integer> cp2 = (o1, o2) -> o1 - o2;
		int val2 = cp2.compare(50, 20);
		System.out.println(val2);
	}
}
