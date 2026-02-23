package collectpractice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ItrTest {

	public void iteratorTest() {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public void ListIteratorTest() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		ListIterator<Integer> litr = al.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("-----------------------------------");

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

	public void enumerationTest() {
		Vector<String> v = new Vector<String>();
		v.add("joshna");
		v.add("adam");
		v.add("kumari");

		Enumeration<String> en = v.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

	public static void main(String[] args) {
		ItrTest it = new ItrTest();
		// it.iteratorTest();
		//it.ListIteratorTest();
		it.enumerationTest();
	}
}
