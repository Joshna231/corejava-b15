package collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListTest {

	public void Arraylist() {
		// <> - Generic
		// <E> - element type(use only classes in objective data types)
		// type - Integer, String, Double, Employee,Customer

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(3, 29);
		al.remove(2);

		System.out.println(al.get(0));
		System.out.println("----------------------------------");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("==========================================");

		for (Integer val : al) {
			System.out.println(val);
		}
	}

	public void LinkedListTest() {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(1, 25);
		ll.remove(2);

		System.out.println(ll.get(3));
		System.out.println("--------------------------");

		for (Integer val : ll) {
			System.out.println(val);
		}
	}

	public void VectorTest() {
		Vector<String> v = new Vector<String>();
		v.add("joshna");
		v.add("adam");
		v.add("kumari");
		v.add("bhaskar");
		v.add("lavanya");
		v.add(0, "byula");
		v.remove(0);

		System.out.println(v.get(0));
		System.out.println("-----------------------------");

		for (String str : v) {
			System.out.println(str);
		}

	}

	public void StackTest() {

		Stack<String> s = new Stack<String>();
		s.push("joshna");
		s.push("adam");
		s.push("kumari");
		s.push("lavanya");
		s.push("bhaskar");
		s.pop();

		System.out.println("peek element:" + s.peek());
		System.out.println("=======================================");

		for (String str : s) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		// lt.Arraylist();
		// lt.LinkedListTest();
		// lt.VectorTest();
		lt.StackTest();
	}
}
