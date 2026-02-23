package collectpractice;

import java.util.ArrayList;

public class ListTest {

	public void Arraylist() {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(1, 25);
		al.remove(2);

		System.out.println(al.get(4));
		System.out.println("--------------------------");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("===============================");

		for (Integer val : al) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.Arraylist();
	}
}
